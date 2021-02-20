package components.soporte;

import javax.swing.*;
import java.awt.*;

public class soporteTemplate extends JPanel {

    private soporteComponent soporteComponent;

    public soporteTemplate(soporteComponent sc) {
        soporteComponent = sc;

        this.setSize(1000,600);
        this.setBackground(Color.RED);
        this.setVisible(true);
        this.setLayout(null);
    }
}
