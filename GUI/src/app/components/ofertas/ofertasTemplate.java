package components.ofertas;

import javax.swing.*;
import java.awt.*;

public class ofertasTemplate extends JPanel {

    private ofertasComponent ofertasComponent;

    public ofertasTemplate(ofertasComponent ofc) {
        ofertasComponent = ofc;

        this.setSize(1000,600);
        this.setBackground(Color.red);
        this.setLayout(null);
        this.setVisible(true);
    }
}
