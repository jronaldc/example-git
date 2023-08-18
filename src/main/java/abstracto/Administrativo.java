package abstracto;

public class Administrativo extends Persona{
    @Override
    public void conectarse() {
        System.out.println("Administrativo conectándose");
    }
}
