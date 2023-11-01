import java.sql.Date;

import javax.xml.crypto.Data;

public class Alquiler{
    private Cliente cliente;
    private Date fechaInicio;
    private Date fechaFinal;
    private int posicionamientoAmarre;
    private Barco barco;
    public Alquiler(Cliente cliente, Date fechaInicio, Date fechaFinal, int posicionAmarre, Barco barco) {
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.posicionamientoAmarre = posicionAmarre;
        this.barco = barco;
    }

    public double calcularCosto() {
        // Calcular el número de días de ocupación (incluyendo días inicial y final)
        long diff = fechaFinal.getTime() - fechaInicio.getTime();
        int numDias = (int) (diff / (24 * 60 * 60 * 1000)) + 1;

        // Calcular el costo del alquiler
        double costo = numDias * (barco.calcularModulo() * 1200);
        return costo;
    }
}
