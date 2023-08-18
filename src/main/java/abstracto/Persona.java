package abstracto;

public abstract class Persona {
    private String nombre;

    public abstract void conectarse();

    public void Registrar(String nombre){
        System.out.println(nombre + " Registrado");
    }
}
