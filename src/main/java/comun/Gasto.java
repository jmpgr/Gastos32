package comun;

public interface Gasto {
	default Usuario  getUsuarioAutorizado(){
		return null;
	}
	
	boolean getAutorizado();

}
