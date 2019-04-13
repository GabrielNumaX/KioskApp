package kioskapp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="cuenta_corriente")
public class CuentaCorriente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Temporal(TemporalType.DATE)
	private Date fecha_apertura;
	@Temporal(TemporalType.DATE)
	private Date fecha_cierre;
	@Column
	private float saldo;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="numero_cuenta")
	private Cliente numero_cuenta;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="nCuenta_proveedor")
	private Proveedor cuenta_proveedor;
	@Column
	private TipoCuenta tipoCuenta;
	
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
	public float getSaldo(){
		return saldo;
	}
	public void setSaldo(float saldo){
		this.saldo = saldo;
	}

}
