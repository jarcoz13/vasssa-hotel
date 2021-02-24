package Vista;

import javax.swing.JLabel;

public class VistaRecibo extends javax.swing.JPanel {

    public VistaRecibo() {
        initComponents();
    } 

    public JLabel getCiudad() {
        return ciudad;
    }

    public JLabel getDireccion() {
        return direccion;
    }

    public JLabel getFechaNacimiento() {
        return fechaNacimiento;
    }

    public JLabel getNombre() {
        return nombre;
    }

    public JLabel getNumDoc() {
        return numDoc;
    }

    public JLabel getNumHabDobles() {
        return numHabDobles;
    }

    public JLabel getNumHabSencillas() {
        return numHabSencillas;
    }

    public JLabel getNumPersonas() {
        return numReserva9;
    }

    public JLabel getNumReserva() {
        return numReserva;
    }

    public JLabel getTelefono() {
        return telefono;
    }

    public JLabel getValorReserva() {
        return valorReserva;
    }

    public JLabel getTipoDoc() {
        return tipoDoc;
    }

    public JLabel getFechaFinal() {
        return fechaFinal;
    }

    public JLabel getFechaInicial() {
        return fechaInicial;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fechaNacimiento = new javax.swing.JLabel();
        JLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel23 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        javax.swing.JLabel jLabel13 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel15 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel17 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel18 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel20 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel21 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        numReserva = new javax.swing.JLabel();
        tipoDoc = new javax.swing.JLabel();
        numDoc = new javax.swing.JLabel();
        telefono = new javax.swing.JLabel();
        direccion = new javax.swing.JLabel();
        ciudad = new javax.swing.JLabel();
        numHabSencillas = new javax.swing.JLabel();
        numReserva9 = new javax.swing.JLabel();
        numHabDobles = new javax.swing.JLabel();
        valorReserva = new javax.swing.JLabel();
        javax.swing.JLabel jLabel24 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel26 = new javax.swing.JLabel();
        fechaInicial = new javax.swing.JLabel();
        fechaFinal = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(467, 348));
        setMinimumSize(new java.awt.Dimension(467, 348));

        fechaNacimiento.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        fechaNacimiento.setText("0000000");

        JLabel1.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        JLabel1.setText("Reserva #");

        jLabel23.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel23.setText("Por un valor de:");

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel1.setText("No.");

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel2.setText("A nombre de:");

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel3.setText("Teléfono:");

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel4.setText("Dirección:");

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel5.setText("Ciudad:");

        jLabel6.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel6.setText("Identifiación:");

        nombre.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        nombre.setText("0000000");

        jLabel13.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel13.setText("Se reserva");

        jLabel15.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel15.setText("habitaciones dobles");

        jLabel17.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel17.setText("para");

        jLabel18.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel18.setText("habitaciones sencillas");

        jLabel20.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel20.setText("personas");

        jLabel21.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel21.setText("Fecha de Nacimiento:");

        jLabel25.setFont(new java.awt.Font("MV Boli", 0, 18)); // NOI18N
        jLabel25.setText("¡Gracias por tu reservación!");

        numReserva.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        numReserva.setText("0000000");

        tipoDoc.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        tipoDoc.setText("cédula de ciudadania");

        numDoc.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        numDoc.setText("0000000");

        telefono.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        telefono.setText("0000000");

        direccion.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        direccion.setText("0000000");

        ciudad.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        ciudad.setText("0000000");

        numHabSencillas.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        numHabSencillas.setText("00");

        numReserva9.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        numReserva9.setText("00");

        numHabDobles.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        numHabDobles.setText("00");

        valorReserva.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        valorReserva.setText("$0000");

        jLabel24.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel24.setText("Hasta:");

        jLabel26.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jLabel26.setText("Desde:");

        fechaInicial.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        fechaInicial.setText("00000");

        fechaFinal.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        fechaFinal.setText("00000");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(JLabel1)
                        .addGap(6, 6, 6)
                        .addComponent(numReserva))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombre))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tipoDoc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numDoc))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(numHabSencillas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addGap(73, 73, 73)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorReserva))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(numHabDobles)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(telefono))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(direccion))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ciudad))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel13)))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fechaNacimiento))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fechaFinal))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fechaInicial)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(numReserva9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabel1)
                    .addComponent(numReserva))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombre))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tipoDoc)
                    .addComponent(jLabel1)
                    .addComponent(numDoc))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(telefono))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21)
                        .addComponent(fechaNacimiento)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(direccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(ciudad))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel26)
                        .addComponent(fechaInicial)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel18)
                                .addComponent(numHabSencillas))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel23)
                                .addComponent(valorReserva)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(numHabDobles))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(numReserva9)
                            .addComponent(jLabel20)
                            .addComponent(jLabel25)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(fechaFinal))))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel1;
    private javax.swing.JLabel ciudad;
    private javax.swing.JLabel direccion;
    private javax.swing.JLabel fechaFinal;
    private javax.swing.JLabel fechaInicial;
    private javax.swing.JLabel fechaNacimiento;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel numDoc;
    private javax.swing.JLabel numHabDobles;
    private javax.swing.JLabel numHabSencillas;
    private javax.swing.JLabel numReserva;
    private javax.swing.JLabel numReserva9;
    private javax.swing.JLabel telefono;
    private javax.swing.JLabel tipoDoc;
    private javax.swing.JLabel valorReserva;
    // End of variables declaration//GEN-END:variables
}
