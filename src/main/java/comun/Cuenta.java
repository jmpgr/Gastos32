package comun;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Cuenta {
	private String iban;
	private List<Movimiento> movimientos = new ArrayList<>();
	
	public Cuenta() {
		super();
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public List<Movimiento> getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(List<Movimiento> movimientos) {
		this.movimientos = movimientos;
	}

	public void addMovimiento(Movimiento movimiento){
		movimientos.add(movimiento);
	}

	public static List<MovimientoImpl> cargarMovimientos(File datos){
		return FicheroUtils.leer(datos);
	}



}
