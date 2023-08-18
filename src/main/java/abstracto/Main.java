package abstracto;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona() {
            @Override
            public void conectarse() {
                Registrar("Ronald");
            }
        };
    }
}
