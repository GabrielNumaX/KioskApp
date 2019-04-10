package kioskapp.model;

public class Cliente {
	
	private String nombre;
	private String apellido;
	private String telefono;
	private String numero_cuenta;
	private int deuda;
	
	public Cliente(String nombre, String apellido, String telefono, String numero_cuenta){
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.numero_cuenta = numero_cuenta;
		
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
	
	
	
}
