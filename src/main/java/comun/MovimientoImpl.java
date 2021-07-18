package comun;

import java.time.LocalDate;
import java.util.List;

public class MovimientoImpl implements Movimiento {
	
	
	private String idMovimiento;
	private LocalDate fecha;
	private String concepto;
	private double importe;
	private Categoria categoria;

	
	
	public MovimientoImpl() {
		super();
	}
	public String getIdMovimiento() {
		return idMovimiento;
	}


	public void setIdMovimiento(String idMovimiento) {
		this.idMovimiento = idMovimiento;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getConcepto() {
		return concepto;
	}
	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}
	public double getImporte() {
		return importe;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
