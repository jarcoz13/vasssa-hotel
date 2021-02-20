package components.masNovedades;

import javax.swing.*;
import java.awt.*;

public class masNovedadesTemplate extends JPanel {

    private masNovedadesComponent masNovedadesComponent;

    public masNovedadesTemplate(masNovedadesComponent mnovc) {
        masNovedadesComponent = mnovc;

        this.setSize(1000,600);
        this.setBackground(Color.black);
        this.setLayout(null);
        this.setVisible(true);
    }
}
