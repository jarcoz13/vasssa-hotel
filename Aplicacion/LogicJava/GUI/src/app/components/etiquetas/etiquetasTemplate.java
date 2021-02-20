package components.etiquetas;

import javax.swing.*;
import java.awt.*;

public class etiquetasTemplate extends JPanel {

    private etiquetasComponent etiquetasComponent;

    public etiquetasTemplate(etiquetasComponent eqc){
        etiquetasComponent = eqc;

        this.setSize(1000,600);
        this.setBackground(Color.ORANGE);
        this.setLayout(null);
        this.setVisible(true);
    }
}
