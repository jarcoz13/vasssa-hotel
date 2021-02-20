package cliente.Login;

import cliente.vistaPrincipal.vistaPrincipalComponent;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginComponent implements ActionListener {

    private LoginTemplate loginTemplate;
    private vistaPrincipalComponent vpComponent;

    public LoginComponent() {
        loginTemplate = new LoginTemplate(this);
    }

    public LoginTemplate getLoginTemplate() { return loginTemplate; }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(loginTemplate.getbEntrar())) {
            mostrarDatos();
            entrar();
        }
        if (e.getSource().equals(loginTemplate.getbRegistrar()))
            JOptionPane.showMessageDialog(null,"Boton Registrarse","Advertencia",1);
        if (e.getSource().equals(loginTemplate.getbCerrar()))
            System.exit(0);
    }

    public void mostrarDatos() {
        String nombreUsuario = loginTemplate.gettNameUser().getText();
        String claveUsuario = new String(loginTemplate.gettPassword().getPassword());
        String idioma = (String) loginTemplate.getCbIdiomaa().getSelectedItem();

        JOptionPane.showMessageDialog(
                null,
                "Nombre: "  + nombreUsuario  + "\n" +
                        "Clave: "   + claveUsuario   + "\n" +
                        "Idioma: "  +
                        idioma.replaceAll("<html><b>","").replaceAll("</b></html>",""),
                "Datos", 2
        );
    }

    public void entrar() {
        if (vpComponent == null)
            vpComponent = new vistaPrincipalComponent();
        else
            vpComponent.getVistaPrincipalTemplate().setVisible(true);
        loginTemplate.setVisible(false);
    }
}
