package example;

public class Empleado extends Persona {
    private int diasTrabajados;
    private float sueldo;

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public float calcularSueldo(){
        float sueldoGanado = diasTrabajados * sueldo;
        return sueldoGanado;
    }
}
