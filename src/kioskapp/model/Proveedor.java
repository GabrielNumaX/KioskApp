package kioskapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Proveedor{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_proveedor;
	@Column
	private String nombre_proveedor;
	@Column
	private String direccion_proveedor;
	@Column
	private String ciudad_proveedor;
	@Column
	private String tel_proveedor;
	@Column
	private float saldo_proveedor;
	@Column
	private String cuenta_proveedor;
	
	
	public int getIdProveedor() {
		return id_proveedor;
	}
	public void setIdProveedor(int id_proveedor) {
		this.id_proveedor=id_proveedor;
	}
	
	public String getNombreProveedor(){
		return nombre_proveedor;
	}
	public void setNombreProveedor(String nombre_proveedor){
		this.nombre_proveedor = nombre_proveedor;
	}
	public String getDirProveedor() {
		return direccion_proveedor;
	}
	public void setDirProveedor(String direccion_proveedor) {
		this.direccion_proveedor=direccion_proveedor;
	}
	public String getCiudadProveedor() {
		return ciudad_proveedor;
	}
	public void setCiudadPreoveedor(String ciudad_proveedor) {
		this.ciudad_proveedor=ciudad_proveedor;
	}
	public String getTelProveedor() {
		return tel_proveedor;
	}
	public void setTelProveedor(String tel_proveedor) {
		this.tel_proveedor=tel_proveedor;
	}
	public float getSaldoProveedor(){
		return saldo_proveedor;
	}
	public void setSaldoProveedor(float saldo_proveedor){
		this.saldo_proveedor = saldo_proveedor;
	}
	public String getCuentaProveedor(){
		return cuenta_proveedor;
	}
	public void setCuentaProveedor(String cuenta_proveedor){
		this.cuenta_proveedor = cuenta_proveedor;
	}

}
