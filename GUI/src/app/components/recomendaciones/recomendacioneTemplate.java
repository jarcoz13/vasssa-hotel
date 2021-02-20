package components.recomendaciones;

import javax.swing.*;
import java.awt.*;

public class recomendacioneTemplate extends JPanel {

    private recomendacionesComponent recomendacionesComponent;

    public recomendacioneTemplate(recomendacionesComponent recc){
        recomendacionesComponent = recc;

        this.setSize(1000,600);
        this.setBackground(Color.ORANGE);
        this.setLayout(null);
        this.setVisible(true);
    }
}
