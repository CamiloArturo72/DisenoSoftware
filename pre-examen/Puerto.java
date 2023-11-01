import java.util.ArrayList;
import java.util.List;

public class Puerto {
    private List<Alquiler> alquileres = new ArrayList<>();

    public void agregarAlquiler(Alquiler alquiler) {
        alquileres.add(alquiler);
    }

    public double calcularIngresosTotales() {
        double totalIngresos = 0;
        for (Alquiler alquiler : alquileres) {
            totalIngresos += alquiler.calcularCosto();
        }
        return totalIngresos;
    }
}
