package Vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import org.jdatepicker.JDatePicker;

public class VistaAdminRes extends javax.swing.JPanel {

    public VistaAdminRes() {
        initComponents();
    }

    public JButton getBotonActualizar() {
        return botonActualizar;
    }

    public JButton getBotonInsertar() {
        return botonInsertar;
    }

    public JButton getBotonEliminar() {
        return botonEliminar;
    }

    public JTextField getCampoDir() {
        return campoDir;
    }

    public JDatePicker getCampoFechaFin() {
        return campoFechaFin;
    }

    public JDatePicker getCampoFechaIni() {
        return campoFechaIni;
    }

    public JDatePicker getCampoFechaNa() {
        return campoFechaNa;
    }

    public JTextField getCampoHDob() {
        return campoHDob;
    }

    public JTextField getCampoHSen() {
        return campoHSen;
    }

    public JTextField getCampoID() {
        return campoID;
    }

    public JTextField getCampoNombre() {
        return campoNombre;
    }

    public JTextField getCampoNumId() {
        return campoNumId;
    }

    public JTextField getCampoPer() {
        return campoPer;
    }

    public JTextField getCampoTelefono() {
        return campoTelefono;
    }

    public JComboBox<String> getComboTipoDoc() {
        return comboTipoDoc;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        campoID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoHSen = new javax.swing.JTextField();
        comboTipoDoc = new javax.swing.JComboBox<>();
        campoNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        campoHDob = new javax.swing.JTextField();
        campoFechaFin = new org.jdatepicker.JDatePicker();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        campoDir = new javax.swing.JTextField();
        campoFechaIni = new org.jdatepicker.JDatePicker();
        campoFechaNa = new org.jdatepicker.JDatePicker();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        campoPer = new javax.swing.JTextField();
        campoNumId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        botonActualizar = new javax.swing.JButton();
        campoTelefono = new javax.swing.JTextField();
        botonEliminar = new javax.swing.JButton();
        jTextPane1 = new javax.swing.JTextPane();
        botonInsertar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Reservaciones");
        add(jLabel3);
        jLabel3.setBounds(450, 20, 130, 20);
        add(campoID);
        campoID.setBounds(280, 80, 100, 20);

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        jLabel4.setText("Tipo Documento");
        add(jLabel4);
        jLabel4.setBounds(400, 80, 100, 15);

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        jLabel5.setText("H Sencillas");
        add(jLabel5);
        jLabel5.setBounds(420, 230, 90, 15);

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        jLabel6.setText("ID");
        add(jLabel6);
        jLabel6.setBounds(250, 80, 34, 15);
        add(campoHSen);
        campoHSen.setBounds(490, 230, 130, 20);

        comboTipoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula de ciudadania", "Pasaporte", "Cedula de extranjeria" }));
        add(comboTipoDoc);
        comboTipoDoc.setBounds(490, 80, 130, 20);
        add(campoNombre);
        campoNombre.setBounds(280, 110, 100, 20);

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        jLabel7.setText("H Dobles");
        add(jLabel7);
        jLabel7.setBounds(230, 230, 60, 15);
        add(campoHDob);
        campoHDob.setBounds(280, 230, 100, 20);

        campoFechaFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoFechaFinActionPerformed(evt);
            }
        });
        add(campoFechaFin);
        campoFechaFin.setBounds(490, 200, 130, 21);

        jLabel10.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        jLabel10.setText("Número de ID");
        add(jLabel10);
        jLabel10.setBounds(410, 110, 80, 15);

        jLabel12.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        jLabel12.setText("Fecha Inicial");
        add(jLabel12);
        jLabel12.setBounds(420, 170, 90, 15);

        jLabel9.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        jLabel9.setText("Nombre");
        add(jLabel9);
        jLabel9.setBounds(230, 110, 50, 15);

        jLabel15.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        jLabel15.setText("Dirección");
        add(jLabel15);
        jLabel15.setBounds(230, 170, 50, 15);

        jLabel11.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        jLabel11.setText("Fecha Nacimiento");
        add(jLabel11);
        jLabel11.setBounds(400, 140, 90, 15);
        add(campoDir);
        campoDir.setBounds(280, 170, 100, 20);
        add(campoFechaIni);
        campoFechaIni.setBounds(490, 170, 130, 21);
        add(campoFechaNa);
        campoFechaNa.setBounds(490, 140, 130, 21);

        jLabel8.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        jLabel8.setText("Telefono");
        add(jLabel8);
        jLabel8.setBounds(230, 140, 50, 15);

        jLabel16.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        jLabel16.setText("Personas");
        add(jLabel16);
        jLabel16.setBounds(230, 200, 50, 15);

        jLabel17.setFont(new java.awt.Font("Nirmala UI", 0, 11)); // NOI18N
        jLabel17.setText("Fecha Final");
        add(jLabel17);
        jLabel17.setBounds(420, 200, 90, 15);
        add(campoPer);
        campoPer.setBounds(280, 200, 100, 20);
        add(campoNumId);
        campoNumId.setBounds(490, 110, 130, 20);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "NOMBRE", "APELLIDO", "TIPO DOCUMENTO", "DOCUMENTO", "TELEFONO", "DIRECCIÓN", "CIUDAD", "FECHA NACIMIENTO", "FECHA INICIO", "FECHA FIN", "NUM PERSONAS", "HAB DOBLES", "HAB SENCILLAS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable1.setEnabled(false);
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(240, 260, 520, 210);
        add(jLabel14);
        jLabel14.setBounds(280, 40, 350, 0);

        botonActualizar.setText("Actualizar Reserva");
        add(botonActualizar);
        botonActualizar.setBounds(40, 160, 140, 50);
        add(campoTelefono);
        campoTelefono.setBounds(280, 140, 100, 20);

        botonEliminar.setText("Eliminar Reserva");
        add(botonEliminar);
        botonEliminar.setBounds(40, 270, 140, 50);

        jTextPane1.setEditable(false);
        jTextPane1.setFont(new java.awt.Font("Nirmala UI", 0, 10)); // NOI18N
        jTextPane1.setText("- Para actualizar un registro, rellene los campos y presiones actualizar.\n- Para borrar un registro, ingrese el ID del registro y presione borrar.\n- Para insertar un registro, rellene los campos y presione insertar.");
        jTextPane1.setOpaque(false);
        add(jTextPane1);
        jTextPane1.setBounds(640, 80, 130, 160);

        botonInsertar.setText("Insertar Reserva");
        add(botonInsertar);
        botonInsertar.setBounds(40, 50, 140, 50);

        jLabel1.setBackground(new java.awt.Color(0, 51, 204));
        jLabel1.setOpaque(true);
        add(jLabel1);
        jLabel1.setBounds(10, 11, 198, 478);

        jLabel2.setBackground(new java.awt.Color(242, 242, 242));
        jLabel2.setOpaque(true);
        add(jLabel2);
        jLabel2.setBounds(218, 11, 572, 478);
    }// </editor-fold>//GEN-END:initComponents

    private void campoFechaFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoFechaFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoFechaFinActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JTextField campoDir;
    private org.jdatepicker.JDatePicker campoFechaFin;
    private org.jdatepicker.JDatePicker campoFechaIni;
    private org.jdatepicker.JDatePicker campoFechaNa;
    private javax.swing.JTextField campoHDob;
    private javax.swing.JTextField campoHSen;
    private javax.swing.JTextField campoID;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoNumId;
    private javax.swing.JTextField campoPer;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JComboBox<String> comboTipoDoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
