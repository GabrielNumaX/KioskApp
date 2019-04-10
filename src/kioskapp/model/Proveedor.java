package kioskapp.model;

public class Proveedor {
	//Implementar mas atributos si hace falta
	private String nombre_proveedor;
	private int deuda_proveedor;
	
	public String getNombreProveedor(){
		return nombre_proveedor;
	}
	public void setNombreProveedor(String nombre_proveedor){
		this.nombre_proveedor = nombre_proveedor;
	}
	public int getDeudaProveedor(){
		return deuda_proveedor;
	}
	public void setDeudaProveedor(int deuda_proveedor){
		this.deuda_proveedor = deuda_proveedor;
	}

}
