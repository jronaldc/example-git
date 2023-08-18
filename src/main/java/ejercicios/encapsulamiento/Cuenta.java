package ejercicios.encapsulamiento;

public class Cuenta {
    public String titular;
    public double cantidad;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(double cantidad){
        if (cantidad > 0) {
            this.cantidad = this.cantidad + cantidad;
            System.out.println("La cantidad ingresada es: " + cantidad);
        }
        System.out.println("Cantidad actual es: " + this.cantidad);
    }

    public void retirar(double cantidad){
        this.cantidad = this.cantidad - cantidad;
        if (this.cantidad < 0 ) {
            this.cantidad = 0;
        }
        System.out.println("La cantidad actual es: " + this.cantidad);
    }
}
