package components.Tienda;

import javax.swing.*;
import java.awt.*;

public class tiendaTemplate extends JPanel {

    private tiendaComponent tiendaComponent;

    public tiendaTemplate(tiendaComponent tc) {
        tiendaComponent = tc;

        this.setSize(1000,600);
        this.setBackground(Color.BLACK);
        this.setVisible(true);
        this.setLayout(null);
    }
}
