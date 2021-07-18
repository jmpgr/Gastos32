package comun;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FicheroUtils {

    public static MovimientoImpl deserializar (String movimientoLinea) {
        String[] campos = movimientoLinea.split(";");
        MovimientoImpl m ;
        List<Categoria> categorias = new ArrayList<>();
        if(campos[0].equals("G")){
            GastoImpl gasto = new GastoImpl();
            gasto.setConcepto(campos[1]);
            gasto.setFecha(LocalDate.parse(campos[2]));
            gasto.setImporte(Double.parseDouble(campos[3]));
            gasto.setIdMovimiento(campos[4]);
            final Categoria categoria = new Categoria();
            categoria.setNombreCategoria(campos[5]);
            gasto.setCategoria(categoria);
            gasto.setAutorizado(true);
            return gasto;
        } else {
            IngresoImpl ingreso = new IngresoImpl();
            ingreso.setConcepto(campos[1]);
            ingreso.setFecha(LocalDate.parse(campos[2]));
            ingreso.setImporte(Double.parseDouble(campos[3]));
            ingreso.setIdMovimiento(campos[4]);
            final Categoria categoria = new Categoria();
            categoria.setNombreCategoria(campos[5]);
            ingreso.setCategoria(categoria);
            ingreso.setCompartido(true);
            return ingreso;
        }

    }

    public static List<MovimientoImpl> leer (File file) {
        List<MovimientoImpl> lista = new ArrayList<>();

        try (BufferedReader buffer = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(file), "UTF-8"))) {
            String linea;
            while((linea = buffer.readLine()) != null) {
                MovimientoImpl m = deserializar(linea);
                lista.add(m);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lista;
    }
}
