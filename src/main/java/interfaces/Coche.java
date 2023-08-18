package interfaces;

public class Coche implements Vehiculo{
    private int velocidadActual;
    @Override
    public void Acelerar(int velocidad) {
        velocidadActual = velocidadActual + velocidad;
        //velocidadActual += velocidad;
        System.out.println("El coche ha acelerado a " + velocidadActual + "Km/h");
    }

    @Override
    public void Frenar() {
        //velocidadActual = velocidadActual -10;
        velocidadActual -= 10;
        System.out.println("El coche ha frenado. Velocidad actual: " + velocidadActual + "Km/h");


    }
}
