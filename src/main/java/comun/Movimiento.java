package comun;

import java.time.LocalDate;
import java.util.List;

public interface Movimiento {

    LocalDate getFecha();
    String getConcepto();
    double getImporte();
    Categoria getCategoria();
    //Cuenta getCuenta();
    String getIdMovimiento();
}
