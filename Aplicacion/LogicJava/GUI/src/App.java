// import vistaPrincipal.vistaPrincipalTemplate;
import cliente.Login.LoginComponent;
import javax.swing.SwingUtilities;



public class App {
    public static void main(String[] args) {
        // hilo ejecutado fuera del main
        Runnable runAplication = new Runnable() {
            @Override
            public void run() {
                LoginComponent login = new LoginComponent(); // declaracion de la clase
            }
        };
        SwingUtilities.invokeLater(runAplication);
    }
}
