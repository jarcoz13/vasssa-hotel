package components.navegacionUsuario;

import cliente.vistaPrincipal.vistaPrincipalComponent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class navegacionUsuarioComponent implements ActionListener {

    private navegacionUsuarioTemplate navegacionUsuarioTemplate;
    private vistaPrincipalComponent vpComponent;

    public navegacionUsuarioComponent(vistaPrincipalComponent vpc) {
        navegacionUsuarioTemplate = new navegacionUsuarioTemplate(this);
        this.vpComponent = vpc;
    }

    public navegacionUsuarioTemplate getNavegacionUsuarioTemplate() {
        return navegacionUsuarioTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        vpComponent.mostrarComponent(e.getActionCommand().replaceAll(
                "<html><b>","").replaceAll("</b></html>","")
        );
    }
}
