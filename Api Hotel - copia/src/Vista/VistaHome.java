package Vista;

import javax.swing.JLabel;

public class VistaHome extends javax.swing.JPanel {

    public VistaHome() {
        initComponents();
    }

    public JLabel getFondoHome() {
        return fondoHome;
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fondoHome = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Date un descanso en estas vacaciones y animate a explorar algo nuevo");
        add(jLabel2);
        jLabel2.setBounds(110, 410, 890, 50);

        jLabel1.setFont(new java.awt.Font("MV Boli", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setText("¡Una bienvenida legendaria en cada ocación!");
        add(jLabel1);
        jLabel1.setBounds(100, 350, 820, 90);

        fondoHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Fondo_Home.png"))); // NOI18N
        fondoHome.setFocusable(false);
        fondoHome.setOpaque(true);
        add(fondoHome);
        fondoHome.setBounds(0, 0, 1024, 366);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondoHome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
