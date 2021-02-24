package Vista;

import javax.swing.JButton;
import javax.swing.JPanel;

public class VistaAdministrador extends javax.swing.JFrame {

    public VistaAdministrador() {
        initComponents();
        this.setTitle("VASSA Hotel");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public JButton getBotonEmpleados() {
        return botonEmpleados;
    }

    public JButton getBotonHabitaciones() {
        return botonHabitaciones;
    }

    public JButton getBotonHuespeds() {
        return botonHuespeds;
    }

    public JButton getBotonMenu() {
        return botonMenu;
    }

    public JButton getBotonReservas() {
        return botonReservas;
    }

    public JPanel getPanelGeneral() {
        return panelGeneral;
    }

    public JPanel getPanelMenu() {
        return panelMenu;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        panelGeneral = new javax.swing.JPanel();
        panelBarra = new javax.swing.JPanel();
        botonMenu = new javax.swing.JButton();
        iconoMenu = new javax.swing.JLabel();
        botonEmpleados = new javax.swing.JButton();
        botonReservas = new javax.swing.JButton();
        botonHabitaciones = new javax.swing.JButton();
        botonHuespeds = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        panelMenu.setOpaque(false);
        panelMenu.setPreferredSize(new java.awt.Dimension(250, 300));
        panelMenu.setLayout(new javax.swing.OverlayLayout(panelMenu));
        getContentPane().add(panelMenu);
        panelMenu.setBounds(550, 100, 250, 300);

        panelGeneral.setMaximumSize(new java.awt.Dimension(800, 500));
        panelGeneral.setMinimumSize(new java.awt.Dimension(800, 500));
        panelGeneral.setPreferredSize(new java.awt.Dimension(800, 500));

        javax.swing.GroupLayout panelGeneralLayout = new javax.swing.GroupLayout(panelGeneral);
        panelGeneral.setLayout(panelGeneralLayout);
        panelGeneralLayout.setHorizontalGroup(
            panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        panelGeneralLayout.setVerticalGroup(
            panelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        getContentPane().add(panelGeneral);
        panelGeneral.setBounds(0, 100, 800, 500);

        panelBarra.setBackground(new java.awt.Color(255, 255, 255));
        panelBarra.setMinimumSize(new java.awt.Dimension(800, 100));
        panelBarra.setPreferredSize(new java.awt.Dimension(800, 100));

        botonMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Icono_Menu.png"))); // NOI18N
        botonMenu.setBorderPainted(false);
        botonMenu.setContentAreaFilled(false);
        botonMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMenu.setFocusPainted(false);
        botonMenu.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Icono_Menu_Hover.png"))); // NOI18N
        botonMenu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Icono_Menu_Hover.png"))); // NOI18N

        iconoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Icono_Home.png"))); // NOI18N

        botonEmpleados.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        botonEmpleados.setForeground(new java.awt.Color(204, 204, 204));
        botonEmpleados.setText("Empleados");
        botonEmpleados.setBorderPainted(false);
        botonEmpleados.setContentAreaFilled(false);
        botonEmpleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonEmpleados.setFocusPainted(false);
        botonEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEmpleadosActionPerformed(evt);
            }
        });

        botonReservas.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        botonReservas.setForeground(new java.awt.Color(204, 204, 204));
        botonReservas.setText("Reservas");
        botonReservas.setBorderPainted(false);
        botonReservas.setContentAreaFilled(false);
        botonReservas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonReservas.setFocusPainted(false);
        botonReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReservasActionPerformed(evt);
            }
        });

        botonHabitaciones.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        botonHabitaciones.setForeground(new java.awt.Color(204, 204, 204));
        botonHabitaciones.setText("Habitaciones");
        botonHabitaciones.setBorderPainted(false);
        botonHabitaciones.setContentAreaFilled(false);
        botonHabitaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonHabitaciones.setFocusPainted(false);

        botonHuespeds.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        botonHuespeds.setForeground(new java.awt.Color(204, 204, 204));
        botonHuespeds.setText("Huespedes");
        botonHuespeds.setBorderPainted(false);
        botonHuespeds.setContentAreaFilled(false);
        botonHuespeds.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonHuespeds.setFocusPainted(false);

        javax.swing.GroupLayout panelBarraLayout = new javax.swing.GroupLayout(panelBarra);
        panelBarra.setLayout(panelBarraLayout);
        panelBarraLayout.setHorizontalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarraLayout.createSequentialGroup()
                .addComponent(iconoMenu)
                .addGap(0, 0, 0)
                .addComponent(botonReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(botonHuespeds, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonEmpleados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonHabitaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonMenu)
                .addContainerGap())
        );
        panelBarraLayout.setVerticalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(iconoMenu)
            .addGroup(panelBarraLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(botonReservas))
            .addGroup(panelBarraLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonHuespeds)
                    .addComponent(botonEmpleados)
                    .addComponent(botonHabitaciones)))
            .addGroup(panelBarraLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(botonMenu))
        );

        getContentPane().add(panelBarra);
        panelBarra.setBounds(0, 0, 800, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReservasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonReservasActionPerformed

    private void botonEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEmpleadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEmpleadosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEmpleados;
    private javax.swing.JButton botonHabitaciones;
    private javax.swing.JButton botonHuespeds;
    private javax.swing.JButton botonMenu;
    private javax.swing.JButton botonReservas;
    private javax.swing.JLabel iconoMenu;
    private javax.swing.JPanel panelBarra;
    private javax.swing.JPanel panelGeneral;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}
