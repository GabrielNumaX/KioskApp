package kioskapp.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cliente")
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
	private float saldo_cliente;
	private ConexionBDD conexion;
	
	
	public Cliente(){}
	
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
	public float getSaldoCliente(){
		return saldo_cliente;
	}
	public void setSaldoCliente(float saldo_cliente){
		this.saldo_cliente=saldo_cliente;
	}
	
	//Crud Cliente
	public void guardarCliente(Cliente cliente){
		conexion.openCurrentSessionwithTransaction();
		conexion.getCurrentSession().save(cliente);
		conexion.closeCurrentSessionwithTransaction();	
	}
	public void borrarCliente(Cliente cliente){
		conexion.openCurrentSessionwithTransaction();
		conexion.getCurrentSession().delete(cliente);
		conexion.closeCurrentSessionwithTransaction();
	}
	@SuppressWarnings("unchecked")
	public List<Cliente> buscarTodos(){
		conexion.openCurrentSession();
		List<Cliente> lista_clientes = conexion.getCurrentSession().createQuery("SELECT * FROM cliente").list();
		return lista_clientes;
	}
	public void actualizarCliente(Cliente cliente){
		conexion.openCurrentSessionwithTransaction();
		conexion.getCurrentSession().update(cliente);
		conexion.closeCurrentSessionwithTransaction();
	}
	public Cliente buscarId(Serializable id){
		conexion.openCurrentSessionwithTransaction();
		Cliente cliente = conexion.getCurrentSession().get(Cliente.class, id);
		conexion.closeCurrentSessionwithTransaction();
		return cliente;
	}
	
	
}
