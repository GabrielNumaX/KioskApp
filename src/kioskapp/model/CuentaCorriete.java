package kioskapp.model;

import java.util.Date;

public class CuentaCorriete {
	
	private Date fecha_apertura;
	private Date fecha_cierre;
	private int saldo;
	private Cliente numero_cuenta;
	
	public Date getFechaApertura(){
		return fecha_apertura;
	}
	public void setFechaApertura(Date fecha_apertura){
		this.fecha_apertura = fecha_apertura;
	}
	public Date getFechaCierre(){
		return fecha_cierre;
	}
	public void setFechaCierre(Date fecha_cierre){
		this.fecha_cierre = fecha_cierre;
	}
	public int getSaldo(){
		return saldo;
	}
	public void setSaldo(int saldo){
		this.saldo = saldo;
	}

}
