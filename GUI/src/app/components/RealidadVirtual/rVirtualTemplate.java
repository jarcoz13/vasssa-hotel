package components.RealidadVirtual;

import javax.swing.*;
import java.awt.*;

public class rVirtualTemplate extends JPanel {

    private rVirtualComponent rVirtualComponent;

    public rVirtualTemplate(rVirtualComponent rvc) {
        rVirtualComponent = rvc;

        this.setSize(1000,600);
        this.setBackground(Color.blue);
        this.setLayout(null);
        this.setVisible(true);
    }
}
