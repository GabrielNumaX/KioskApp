package entity;

public class Cliente {
	//Aca se linkean las cosas con Scene Builder 
	private String nombre;
	private String apellido;
	private String direccion;
	private String dni;
	private String numero_cuenta;
	private int deuda;
	
	public void SetNombre(String nombre){
		this.nombre = nombre;
	}
	public void SetApellido(String apellido) {
		this.apellido = apellido;
	}
	public void SetDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void SetDni(String dni) {
		this.dni = dni;
	}
	public void SetNumeroCuenta(String numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}
	public void SetDeuda(int deuda) {
		this.deuda = deuda;
		
	}
	public String GetNombre() {
		return nombre;
	}
	public String GetApellido() {
		return apellido;
	}
	public String GetDireccion() {
		return direccion;
	}
	public String GetDni() {
		return dni;
	}
	public String GetNumeroCuenta() {
		return numero_cuenta;
	}
	public int GetDeuda() {
		return deuda;
	}

}	
