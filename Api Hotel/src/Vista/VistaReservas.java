package Vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import org.jdatepicker.JDatePicker;

public class VistaReservas extends javax.swing.JPanel {

    public VistaReservas() {
        initComponents();
    }

    public JLabel getFondoReserva() {
        return fondoReserva;
    }

    public JButton getBotonConsultar() {
        return botonConsultar;
    }
    
    public JButton getBotonReservar(){
        return botonReservar;
    }
    
    public JDatePicker getFechaFinRes() {
        return fechaFinRes;
    }

    public JDatePicker getFechaInicioRes() {
        return fechaInicioRes;
    }

    public JComboBox<String> getNumHabitaciones() {
        return numHabitaciones;
    }

    public JComboBox<String> getNumPersonas() {
        return numPersonas;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botonReservar1 = new javax.swing.JButton();
        botonReservar = new javax.swing.JButton();
        botonConsultar = new javax.swing.JButton();
        numPersonas = new javax.swing.JComboBox<>();
        numHabitaciones = new javax.swing.JComboBox<>();
        fechaInicioRes = new org.jdatepicker.JDatePicker();
        fechaFinRes = new org.jdatepicker.JDatePicker();
        fondoReserva = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 51, 51));
        setMaximumSize(new java.awt.Dimension(1024, 476));
        setMinimumSize(new java.awt.Dimension(1024, 476));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¡Quédate con nosotros!");
        add(jLabel1);
        jLabel1.setBounds(40, 30, 430, 50);

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Comprobar Disponibilidad de Habitaciones");
        add(jLabel2);
        jLabel2.setBounds(40, 100, 360, 30);

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Personas");
        add(jLabel4);
        jLabel4.setBounds(330, 250, 120, 20);

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Consultar");
        add(jLabel6);
        jLabel6.setBounds(50, 250, 60, 20);

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hasta");
        add(jLabel5);
        jLabel5.setBounds(50, 200, 40, 20);

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Habitaciones, para");
        add(jLabel7);
        jLabel7.setBounds(160, 250, 120, 20);

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Desde");
        add(jLabel3);
        jLabel3.setBounds(50, 160, 40, 20);

        botonReservar1.setBackground(new java.awt.Color(255, 255, 255));
        botonReservar1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        botonReservar1.setForeground(new java.awt.Color(51, 51, 51));
        botonReservar1.setText("CANCELAR RESERVA");
        botonReservar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        botonReservar1.setBorderPainted(false);
        botonReservar1.setContentAreaFilled(false);
        botonReservar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonReservar1.setFocusPainted(false);
        botonReservar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReservar1ActionPerformed(evt);
            }
        });
        add(botonReservar1);
        botonReservar1.setBounds(760, 390, 250, 50);

        botonReservar.setBackground(new java.awt.Color(255, 255, 255));
        botonReservar.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        botonReservar.setForeground(new java.awt.Color(255, 255, 255));
        botonReservar.setText("RESERVAR");
        botonReservar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        botonReservar.setBorderPainted(false);
        botonReservar.setContentAreaFilled(false);
        botonReservar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonReservar.setFocusPainted(false);
        botonReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReservarActionPerformed(evt);
            }
        });
        add(botonReservar);
        botonReservar.setBounds(250, 380, 150, 50);

        botonConsultar.setBackground(new java.awt.Color(255, 255, 255));
        botonConsultar.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        botonConsultar.setForeground(new java.awt.Color(255, 255, 255));
        botonConsultar.setText("CONSULTAR");
        botonConsultar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        botonConsultar.setBorderPainted(false);
        botonConsultar.setContentAreaFilled(false);
        botonConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonConsultar.setFocusPainted(false);
        add(botonConsultar);
        botonConsultar.setBounds(50, 380, 150, 50);

        numPersonas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8" }));
        add(numPersonas);
        numPersonas.setBounds(290, 250, 32, 20);

        numHabitaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        add(numHabitaciones);
        numHabitaciones.setBounds(120, 250, 32, 20);
        add(fechaInicioRes);
        fechaInicioRes.setBounds(100, 160, 202, 21);
        add(fechaFinRes);
        fechaFinRes.setBounds(100, 200, 202, 21);

        fondoReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Fondo_Reserva.png"))); // NOI18N
        fondoReserva.setOpaque(true);
        add(fondoReserva);
        fondoReserva.setBounds(0, 0, 1024, 576);
    }// </editor-fold>//GEN-END:initComponents

    private void botonReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReservarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonReservarActionPerformed

    private void botonReservar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReservar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonReservar1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonConsultar;
    private javax.swing.JButton botonReservar;
    private javax.swing.JButton botonReservar1;
    private org.jdatepicker.JDatePicker fechaFinRes;
    private org.jdatepicker.JDatePicker fechaInicioRes;
    private javax.swing.JLabel fondoReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> numHabitaciones;
    private javax.swing.JComboBox<String> numPersonas;
    // End of variables declaration//GEN-END:variables
}
