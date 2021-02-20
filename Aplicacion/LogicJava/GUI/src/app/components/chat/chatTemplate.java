package components.chat;

import javax.swing.*;
import java.awt.*;

public class chatTemplate extends JPanel {

    private chatComponent chatComponent;

    public chatTemplate(chatComponent chc) {
        chatComponent = chc;

        this.setSize(1000,600);
        this.setBackground(Color.DARK_GRAY);
        this.setVisible(true);
        this.setLayout(null);
    }
}
