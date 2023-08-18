package org.example;

public class EstructuraCondicion {
    public static void main(String[] args) {
        int hor;
        double min;
        int precio;
        double pago;

        hor = 1;
        min = 40;
        precio = 1500;

        if (hor > 0){
            if (min>0){
                pago = precio*hor + precio*(min/60);
                System.out.println("El pago es:");
                System.out.println(pago);
            }
        } else {
            pago = precio * hor;
            System.out.println("Segundo else");
            System.out.println("El pago es:");
            System.out.println(pago);
        }
    }
}
