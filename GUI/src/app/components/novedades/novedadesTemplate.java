package components.novedades;

import javax.swing.*;
import java.awt.*;

public class novedadesTemplate extends JPanel {

    private novedadesComponent novedadesComponent;

    public novedadesTemplate(novedadesComponent novc){
        novedadesComponent = novc;

        this.setSize(1000,600);
        this.setBackground(Color.pink);
        this.setLayout(null);
        this.setVisible(true);
    }
}
