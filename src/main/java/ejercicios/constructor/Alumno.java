package ejercicios.constructor;

public class Alumno {
    public String nombre;
    public double[] calificaciones = new double[5];

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCalificaciones() {
        return calificaciones.length;
    }

    public void setCalificaciones(double[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    public void ingresarCalificacion(int index, int calificacion){
            calificaciones[index] = calificacion;
            System.out.println("La calificación es: " + index + " " + calificaciones[index]);
    }

    public double calcularPromedio(){
        double promedio;
        double suma = 0;
        for (int i = 0; i < calificaciones.length; i++) {
            suma = suma + calificaciones[i];
        }
        promedio = suma/ calificaciones.length;
        return promedio;

    }
}
