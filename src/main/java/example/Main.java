package example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresar Nombres: ");
        String nombres = scan.next();
        System.out.println("Ingresar Apellidos: ");
        String apellidos = scan.next();
        System.out.println("Ingresar Documento: ");
        String documento = scan.next();
        System.out.println("Ingresar días trabajados: ");
        int diasTrabajados = scan.nextInt();
        System.out.println("Ingresar el Sueldo: ");
        float sueldo = scan.nextFloat();

        Empleado empleado1 = new Empleado();
        empleado1.setNombres(nombres);
        empleado1.setApellidos(apellidos);
        empleado1.setDocumento(documento);
        empleado1.setDiasTrabajados(diasTrabajados);
        empleado1.setSueldo(sueldo);

        System.out.println("El empleado " + empleado1.getNombres() + " " + empleado1.getApellidos() + "con DNI " +
                empleado1.getDocumento() + " Tiene un sueldo de: " + empleado1.calcularSueldo());

    }
}
