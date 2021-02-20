package components.comunidad;

import javax.swing.*;
import java.awt.*;

public class comunidadTemplate extends JPanel {

    private comunidadComponent comunidadComponent;

    public comunidadTemplate(comunidadComponent coc) {
        comunidadComponent = coc;

        this.setSize(1000,600);
        this.setBackground(Color.BLUE);
        this.setVisible(true);
        this.setLayout(null);
    }
}
