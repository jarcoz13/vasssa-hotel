package components.ventas;

import javax.swing.*;
import java.awt.*;

public class ventasTemplate extends JPanel {

    private ventasComponent ventasComponent;

    public ventasTemplate(ventasComponent venc) {
        ventasComponent = venc;

        this.setSize(1000,600);
        this.setBackground(Color.cyan);
        this.setLayout(null);
        this.setVisible(true);
    }
}
