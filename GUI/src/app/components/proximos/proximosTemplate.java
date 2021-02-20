package components.proximos;

import javax.swing.*;
import java.awt.*;

public class proximosTemplate extends JPanel {

    private proximosComponent proximosComponent;

    public proximosTemplate(proximosComponent prxc) {
        proximosComponent = prxc;

        this.setSize(1000,600);
        this.setBackground(Color.white);
        this.setLayout(null);
        this.setVisible(true);
    }
}
