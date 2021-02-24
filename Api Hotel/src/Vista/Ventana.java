package Vista;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public final class Ventana extends javax.swing.JFrame {

    private VistaHome vistaHome;
    private VistaMenu vistaMenu;
    private VistaReservas vistaReservas;
    private VistaUbicacion vistaUbicacion;
    private VistaContacto vistaContacto;
    private VistaFormulario vistaFormulario;
    private VistaRecibo vistaRecibo;
    private VistaCancelacion vistaCancelacion;
    private VistaInicioSesion vistaLogin;
    private VistaMenuAdmin vistaMenuAdmin;
    private VistaAdministrador vistaAdmin;
    private VistaAdminRes vistaAdminRes;

    public Ventana() { //Constructor
        initComponents();
        iniciarVistas();
        this.setTitle("VASSA Hotel");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
        apagarVistas();
        mostrarVistaHome();
    }

    public void iniciarVistas() {
        vistaHome = new VistaHome();
        vistaMenu = new VistaMenu();
        vistaReservas = new VistaReservas();
        vistaUbicacion = new VistaUbicacion();
        vistaContacto = new VistaContacto();
        vistaFormulario = new VistaFormulario();
        vistaRecibo = new VistaRecibo();
        vistaCancelacion = new VistaCancelacion();
        vistaLogin = new VistaInicioSesion();
        vistaAdmin = new VistaAdministrador();
        vistaMenuAdmin = new VistaMenuAdmin();
        vistaAdminRes = new VistaAdminRes();
    }

    public void apagarVistas() {
        vistaHome.setVisible(false);
        vistaMenu.setVisible(false);
        vistaReservas.setVisible(false);
        vistaUbicacion.setVisible(false);
        vistaContacto.setVisible(false);
        vistaFormulario.setVisible(false);
        vistaCancelacion.setVisible(false);
        vistaAdmin.setVisible(false);
        vistaMenuAdmin.setVisible(false);
        vistaAdminRes.setVisible(false);
    }

    public VistaAdminRes getVistaAdminRes() {
        return vistaAdminRes;
    }

    public void mostrarVistaAdminRes() {
        vistaAdmin.getPanelGeneral().add(vistaAdminRes);
        vistaAdminRes.setVisible(true);
    }

    public void mostrarVistaAdmin() {
        vistaAdmin.setVisible(true);
        mostrarVistaAdminRes();
    }

    public void mostrarVistaMenuAdmin() {
        vistaAdmin.getPanelMenu().add(vistaMenuAdmin);
        vistaMenuAdmin.setVisible(true);
    }

    public void ocultarVistaMenuAdmin() {
        vistaMenuAdmin.setVisible(false);
    }

    public void mostrarVistaMenu() {
        panelMenu.add(vistaMenu);
        vistaMenu.setVisible(true);
    }

    public void ocultarVistaMenu() {
        vistaMenu.setVisible(false);
    }

    public void mostrarVistaHome() {
        panelPrincipal.add(vistaHome);
        vistaHome.setVisible(true);
        //vistaHome.getFondoHome().setVisible(true);
    }

    public void mostrarVentana() {
        this.setVisible(true);
        mostrarVistaHome();
    }

    public VistaAdministrador getVistaAdmin() {
        return vistaAdmin;
    }

    public VistaMenuAdmin getVistaMenuAdmin() {
        return vistaMenuAdmin;
    }

    public void ocultarVentana() {
        this.setVisible(false);
    }

    public void mostrarVistaFormularioReserva() {
        vistaFormulario.setVisible(true);
    }

    public void ocultarVistaFormulario() {
        vistaFormulario.dispose();
    }

    public void mostrarVistaCancelacion() {
        vistaCancelacion.setVisible(true);
    }

    public void ocultarVistaCancelacion() {
        vistaCancelacion.dispose();
    }

    public void mostrarVistaRecibo() {
        JOptionPane.showMessageDialog(null, vistaRecibo, "Reserva Realizada", JOptionPane.PLAIN_MESSAGE);
        vistaRecibo = null;
    }

    public void mostrarErrorDatosIngresados() {
        JOptionPane.showMessageDialog(null, "Compruebe que los datos que ingresó sean válidos", "Error", JOptionPane.WARNING_MESSAGE);
    }

    public void mostrarErrorFatal() {
        JOptionPane.showMessageDialog(null, "Ocurrió un error inesperado, por favor vuelva a intentarlo", "Error", JOptionPane.WARNING_MESSAGE);
    }

    public void mostrarVistaReservas() {
        panelPrincipal.add(vistaReservas);
        vistaReservas.setVisible(true);
        vistaReservas.getFondoReserva().setVisible(true);
    }

    public void mostrarVistaUbicacion() {
        panelPrincipal.add(vistaUbicacion);
        vistaUbicacion.setVisible(true);
    }

    public void mostrarVistaContacto() {
        panelPrincipal.add(vistaContacto);
        vistaContacto.setVisible(true);
    }

    public void mostrarVistaLogin() {
        vistaLogin.setVisible(true);
    }

    public void ocultarVistaLogin() {
        vistaLogin.setVisible(false);
        vistaLogin.dispose();
    }

    public VistaHome getVistaHome() {
        return vistaHome;
    }

    public VistaRecibo getVistaRecibo() {
        return vistaRecibo;
    }

    public VistaInicioSesion getVistaLogin() {
        return vistaLogin;
    }

    public VistaCancelacion getVistaCancelacion() {
        return vistaCancelacion;
    }

    public VistaFormulario getVistaFormulario() {
        return vistaFormulario;
    }

    public VistaMenu getVistaMenu() {
        return vistaMenu;
    }

    public VistaReservas getVistaReservas() {
        return vistaReservas;
    }

    public VistaUbicacion getVistaUbicacion() {
        return vistaUbicacion;
    }

    public VistaContacto getVistaContacto() {
        return vistaContacto;
    }

    public JButton getBotonReservas() {
        return botonReservas;
    }

    public JButton getBotonContacto() {
        return botonContacto;
    }

    public JButton getBotonUbicacion() {
        return botonUbicacion;
    }

    public JButton getBotonInicio() {
        return botonInicio;
    }

    public JButton getBotonMenu() {
        return botonMenu;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        panelPrincipal = new javax.swing.JPanel();
        panelBarra = new javax.swing.JPanel();
        iconoHome = new javax.swing.JLabel();
        botonMenu = new javax.swing.JButton();
        botonContacto = new javax.swing.JButton();
        botonInicio = new javax.swing.JButton();
        botonReservas = new javax.swing.JButton();
        botonUbicacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 576));

        panelMenu.setBackground(new java.awt.Color(255, 102, 102));
        panelMenu.setOpaque(false);
        panelMenu.setLayout(new javax.swing.OverlayLayout(panelMenu));

        panelPrincipal.setFocusable(false);
        panelPrincipal.setOpaque(false);
        panelPrincipal.setLayout(new javax.swing.OverlayLayout(panelPrincipal));

        panelBarra.setBackground(new java.awt.Color(255, 255, 255));
        panelBarra.setForeground(new java.awt.Color(255, 255, 255));
        panelBarra.setFocusable(false);
        panelBarra.setPreferredSize(new java.awt.Dimension(1024, 80));

        iconoHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Icono_Home.png"))); // NOI18N
        iconoHome.setToolTipText("");

        botonMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Icono_Menu.png"))); // NOI18N
        botonMenu.setBorderPainted(false);
        botonMenu.setContentAreaFilled(false);
        botonMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMenu.setFocusPainted(false);
        botonMenu.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Icono_Menu_Hover.png"))); // NOI18N
        botonMenu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Icono_Menu_Hover.png"))); // NOI18N

        botonContacto.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        botonContacto.setForeground(new java.awt.Color(204, 204, 204));
        botonContacto.setText("Contacto");
        botonContacto.setBorderPainted(false);
        botonContacto.setContentAreaFilled(false);
        botonContacto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonContacto.setFocusPainted(false);

        botonInicio.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        botonInicio.setForeground(new java.awt.Color(204, 204, 204));
        botonInicio.setText("Inicio");
        botonInicio.setBorderPainted(false);
        botonInicio.setContentAreaFilled(false);
        botonInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonInicio.setFocusPainted(false);

        botonReservas.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        botonReservas.setForeground(new java.awt.Color(204, 204, 204));
        botonReservas.setText("Reservas");
        botonReservas.setBorderPainted(false);
        botonReservas.setContentAreaFilled(false);
        botonReservas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonReservas.setFocusPainted(false);

        botonUbicacion.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        botonUbicacion.setForeground(new java.awt.Color(204, 204, 204));
        botonUbicacion.setText("Ubicación");
        botonUbicacion.setBorderPainted(false);
        botonUbicacion.setContentAreaFilled(false);
        botonUbicacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonUbicacion.setFocusPainted(false);
        botonUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonUbicacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBarraLayout = new javax.swing.GroupLayout(panelBarra);
        panelBarra.setLayout(panelBarraLayout);
        panelBarraLayout.setHorizontalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarraLayout.createSequentialGroup()
                .addComponent(iconoHome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonReservas, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonUbicacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addComponent(botonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        panelBarraLayout.setVerticalGroup(
            panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarraLayout.createSequentialGroup()
                .addComponent(iconoHome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBarraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBarraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonContacto)
                        .addComponent(botonInicio)
                        .addComponent(botonReservas)
                        .addComponent(botonUbicacion)))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(774, 774, 774)
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBarra, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonUbicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonUbicacionActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonContacto;
    private javax.swing.JButton botonInicio;
    private javax.swing.JButton botonMenu;
    private javax.swing.JButton botonReservas;
    private javax.swing.JButton botonUbicacion;
    private javax.swing.JLabel iconoHome;
    private javax.swing.JPanel panelBarra;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
