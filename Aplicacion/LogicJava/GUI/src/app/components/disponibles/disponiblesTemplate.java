package components.disponibles;

import javax.swing.*;
import java.awt.*;

public class disponiblesTemplate extends JPanel {

    private disponiblesComponent disponiblesComponent;

    public disponiblesTemplate(disponiblesComponent dsc) {
        disponiblesComponent = dsc;

        this.setSize(1000,600);
        this.setBackground(Color.GRAY);
        this.setLayout(null);
        this.setVisible(true);
    }
}
