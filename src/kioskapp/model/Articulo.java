package kioskapp.model;

public class Articulo {

	private int id_art;
	
	private String nombre_art;
	
	private String descrip_art;
	
	private float precio_art;

	
	public int getId_art() {
		return id_art;
	}

	public void setId_art(int id_art) {
		this.id_art = id_art;
	}

	public String getNombre_art() {
		return nombre_art;
	}

	public void setNombre_art(String nombre_art) {
		this.nombre_art = nombre_art;
	}

	public String getDescrip_art() {
		return descrip_art;
	}

	public void setDescrip_art(String descrip_art) {
		this.descrip_art = descrip_art;
	}

	public float getPrecio_art() {
		return precio_art;
	}

	public void setPrecio_art(float precio_art) {
		this.precio_art = precio_art;
	}
	
	

}
