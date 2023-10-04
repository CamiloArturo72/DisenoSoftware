public class Cuenta {
    private String titular;
    private double cantidad;

    // Constructor con titular obligatorio y cantidad opcional
    public Cuenta(String titular) {
        this.titular = titular;
        this.cantidad = 0; // Inicialmente la cantidad es 0
    }

    public Cuenta(String titular, double cantidadInicial) {
        this.titular = titular;
        if (cantidadInicial >= 0) {
            this.cantidad = cantidadInicial;
        } else {
            this.cantidad = 0; // Si la cantidad inicial es negativa, se establece en 0
        }
    }

    // Getter para obtener el titular
    public String getTitular() {
        return titular;
    }

    // Getter para obtener la cantidad
    public double getCantidad() {
        return cantidad;
    }

    // Setter para establecer la cantidad
    public void setCantidad(double cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        }
    }

    // Método para ingresar una cantidad a la cuenta
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    // Método para retirar una cantidad de la cuenta
    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (this.cantidad - cantidad >= 0) {
                this.cantidad -= cantidad;
            } else {
                this.cantidad = 0; // Si la cantidad a retirar es mayor que la actual, se establece en 0
            }
        }
    }

    // Método toString para obtener una representación en cadena de la cuenta

    public String toString() {
        return "Titular: " + titular + ", Cantidad: " + cantidad;
    }
}
