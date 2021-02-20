package components.barraTitulo;

import cliente.vistaPrincipal.vistaPrincipalComponent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class barraTituloComponent implements ActionListener {

    private barraTituloTemplate barraTituloTemplate;
    private vistaPrincipalComponent vpComponent;

    public barraTituloComponent(vistaPrincipalComponent vpc) {

        this.vpComponent = vpc;
        this.barraTituloTemplate = new barraTituloTemplate(this);
    }

    public barraTituloTemplate getBarraTituloTemplate() {
        return barraTituloTemplate;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        vpComponent.mostrarComponent(e.getActionCommand());
        if (e.getSource().equals(barraTituloTemplate.getbCerrar()))
            vpComponent.cerrar();
        if (e.getSource().equals(barraTituloTemplate.getbMinimizar()))
            vpComponent.minimizar();
    }
}
