package Vista;

import javax.swing.JButton;

public class VistaMenuAdmin extends javax.swing.JPanel {

    public VistaMenuAdmin() {
        initComponents();
    }

    public JButton getBotonCerrarSesion() {
        return botonCerrarSesion;
    }

    public JButton getBotonSalir() {
        return botonSalir;
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonSalir = new javax.swing.JButton();
        botonCerrarSesion = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(250, 300));
        setMinimumSize(new java.awt.Dimension(250, 300));
        setPreferredSize(new java.awt.Dimension(250, 300));
        setLayout(null);

        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Boton_Salir1.png"))); // NOI18N
        botonSalir.setBorderPainted(false);
        botonSalir.setContentAreaFilled(false);
        botonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonSalir.setFocusPainted(false);
        botonSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Boton_Salir1_Hover.png"))); // NOI18N
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        add(botonSalir);
        botonSalir.setBounds(0, 150, 250, 100);

        botonCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Boton_CerrarS.png"))); // NOI18N
        botonCerrarSesion.setBorderPainted(false);
        botonCerrarSesion.setContentAreaFilled(false);
        botonCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCerrarSesion.setFocusPainted(false);
        botonCerrarSesion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Boton_CerrarS_Hover.png"))); // NOI18N
        add(botonCerrarSesion);
        botonCerrarSesion.setBounds(0, 40, 250, 100);
    }// </editor-fold>//GEN-END:initComponents

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrarSesion;
    private javax.swing.JButton botonSalir;
    // End of variables declaration//GEN-END:variables
}
