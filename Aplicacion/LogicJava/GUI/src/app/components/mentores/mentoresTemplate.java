package components.mentores;

import javax.swing.*;
import java.awt.*;

public class mentoresTemplate extends JPanel {

    private mentoresComponent mentoresComponent;

    public mentoresTemplate(mentoresComponent menc) {
        mentoresComponent = menc;

        this.setSize(1000,600);
        this.setBackground(Color.MAGENTA);
        this.setLayout(null);
        this.setVisible(true);
    }
}
