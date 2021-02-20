package components.usuario;

import javax.swing.*;
import java.awt.*;

public class usuarioTemplate extends JPanel {

    private usuarioComponent usuarioComponent;

    public usuarioTemplate(usuarioComponent uc) {
        usuarioComponent = uc;

        this.setSize(1000,600);
        this.setBackground(Color.CYAN);
        this.setVisible(true);
        this.setLayout(null);
    }
}
