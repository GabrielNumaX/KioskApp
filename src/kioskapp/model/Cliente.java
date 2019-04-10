package kioskapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Cliente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column
	private String nombre;
	@Column
	private String apellido;
	@Column
	private String telefono;
	@Column
	private String numero_cuenta;
	@Column
	private int deuda;
	private ConexionBDD conexion;
	
	public Cliente(String nombre, String apellido, String telefono, String numero_cuenta){
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.numero_cuenta = numero_cuenta;
	}
	public int getId(){
		return id;
	}
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	public String getApellido(){
		return apellido;
	}
	public void setApellido(String apellido){
		this.apellido = apellido;
	}
	public String getTelefono(){
		return telefono;
	}
	public void setTelefono(String telefono){
		this.telefono = telefono;
	}
	public String getNumeroCuenta(){
		return numero_cuenta;
	}
	public void setNumeroCuenta(String numero_cuenta){
		this.numero_cuenta = numero_cuenta;
	}
	public int getDeuda(){
		return deuda;
	}
	public void setDeuda(int deuda){
		this.deuda = deuda;
	}
	
	//Crud Cliente
	public void guardarCliente(Cliente cliente) throws Exception{
		try {
			conexion.openCurrentSessionwithTransaction();
			conexion.getCurrentSession().save(cliente);
			conexion.closeCurrentSessionwithTransaction();
		}catch(Exception e){
			System.out.println("El error es: "+e);
			
		}
	}
	
	
	//Hasta aca
	
	
	
}
