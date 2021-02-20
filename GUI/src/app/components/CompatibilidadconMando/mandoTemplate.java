package components.CompatibilidadconMando;

import javax.swing.*;
import java.awt.*;

public class mandoTemplate extends JPanel {

    private mandoComponent mandoComponent;

    public mandoTemplate(mandoComponent mandoc) {
        mandoComponent = mandoc;

        this.setSize(1000,600);
        this.setBackground(Color.DARK_GRAY);
        this.setLayout(null);
        this.setVisible(true);
    }
}
