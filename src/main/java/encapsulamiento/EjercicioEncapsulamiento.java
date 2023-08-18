package encapsulamiento;

import encapsulamiento2.ClaseConDatoProtected2;
import encapsulamiento2.ClaseConDatoPublic;

public class EjercicioEncapsulamiento {
    public static void main(String[] args) {
        ClaseConDatoPublic clasePublic1 = new ClaseConDatoPublic();
        clasePublic1.dato = "dato public puede ser obtenido cuando es public";

        ClaseConDatoProtected claseProtected1 = new ClaseConDatoProtected();
        claseProtected1.dato = "dato protected puede ser obtenido cuando se llama del mismo paquete";

        /*ClaseConDatoProtected2 claseProtected2 = new ClaseConDatoProtected2();
        claseProtected2.dato = "dato protected no puede ser obtenido cuando se llama del mismo paquete";*/

    }
}
