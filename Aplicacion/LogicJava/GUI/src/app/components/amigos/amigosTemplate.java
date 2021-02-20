package components.amigos;

import javax.swing.*;
import java.awt.*;

public class amigosTemplate extends JPanel {

    private amigosComponent amigosComponent;

    public amigosTemplate(amigosComponent amc) {
        amigosComponent = amc;

        this.setSize(1000,600);
        this.setBackground(Color.GREEN);
        this.setLayout(null);
        this.setVisible(true);
    }
}
