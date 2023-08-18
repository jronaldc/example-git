package ejercicios.encapsulamiento;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        cuenta.setTitular("Ronald");
        cuenta.setCantidad(200.00);

        System.out.println("Titular de la cuenta: " + cuenta.getTitular());
        System.out.println("Cantidad inicial es de: " + cuenta.getCantidad());

        System.out.println("==============================");
        cuenta.ingresar(45.50);
        cuenta.ingresar(-100.00);
        cuenta.retirar(130.00);

    }
}
