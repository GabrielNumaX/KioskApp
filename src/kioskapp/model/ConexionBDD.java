package kioskapp.model;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.reflections.Reflections;

public class ConexionBDD {
	
	private Session currentSession;
	private Transaction currentTransaction;
	private static StandardServiceRegistry registry;
	private static SessionFactory sessionFactory;

	public Session openCurrentSession() {
		if(currentSession == null || !currentSession.isOpen()){
			currentSession = getSessionFactory().openSession();
		}
		return currentSession;
	}

	public Session openCurrentSessionwithTransaction() {
		openCurrentSession();
		if(currentTransaction == null || !currentTransaction.isActive()){
			currentTransaction = currentSession.beginTransaction();
		}
		return currentSession;
	}

	public void closeCurrentSession() {
		currentSession.close();
	}

	public void closeCurrentSessionwithTransaction() {
		currentTransaction.commit();
		currentSession.close();
	}
	
	private static SessionFactory getSessionFactory(){
		Configuration configuration = new Configuration();
		configuration.configure("kioskapp/hibernate.cfg.xml");
		registry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();;
		sessionFactory = configuration.buildSessionFactory(registry);
		return sessionFactory;
		
	}
	
	/*private static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			try {
				Configuration configuration = new Configuration();
					configuration.configure("hibernate.cfg.xml");
				/*Reflections reflections = new Reflections("kioskapp.model");
				Set<Class<?>> classes = reflections.getTypesAnnotatedWith(javax.persistence.Entity.class);
				for(Class<?> clazz : classes){
				    configuration.addAnnotatedClass(clazz);
				}
				registry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();
				return configuration.buildSessionFactory(registry);
			} 
			catch (Exception e) {
				if (registry != null) {
					StandardServiceRegistryBuilder.destroy(registry);
				}

				e.printStackTrace();
				System.exit(-1);
			}
		}
		return sessionFactory;
	}*/

	public Session getCurrentSession() {
		openCurrentSession();
		return currentSession;
	}

	public void setCurrentSession(Session currentSession) {
		this.currentSession = currentSession;
	}

	public Transaction getCurrentTransaction() {
		return currentTransaction;
	}

	public void setCurrentTransaction(Transaction currentTransaction) {
		this.currentTransaction = currentTransaction;
	}
	

}
