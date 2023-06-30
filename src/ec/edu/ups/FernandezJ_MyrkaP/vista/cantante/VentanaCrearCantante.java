package ec.edu.ups.FernandezJ_MyrkaP.vista.cantante;

import ec.edu.ups.FernandezJ_MyrkaP.controlador.ControladorPersona;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ec.edu.ups.FernandezJ_MyrkaP.modelo.Cantante;
import ec.edu.ups.FernandezJ_MyrkaP.modelo.Disco;

public class VentanaCrearCantante extends javax.swing.JInternalFrame {

    private ControladorPersona controladorPersona;
    
    private List<Disco> discografia;
    
    public VentanaCrearCantante(ControladorPersona controladorPersona) {
        initComponents();
        this.controladorPersona = controladorPersona;
        discografia = new ArrayList<>();
    }
    
    public void cambiarIdioma(Locale localizacion){
        ResourceBundle bundle = ResourceBundle.getBundle("vista/cantante/Bundle", localizacion); // NOI18N

        jLabel1.setText(bundle.getString("VentanaCrearCantante.jLabel1.text")); // NOI18N

        jLabel2.setText(bundle.getString("VentanaCrearCantante.jLabel2.text")); // NOI18N

        jLabel3.setText(bundle.getString("VentanaCrearCantante.jLabel3.text")); // NOI18N

        jLabel4.setText(bundle.getString("VentanaCrearCantante.jLabel4.text")); // NOI18N

        lblConciertos.setText(bundle.getString("VentanaCrearCantante.lblConciertos.text")); // NOI18N


        jLabel6.setText(bundle.getString("VentanaCrearCantante.jLabel6.text")); // NOI18N

        jLabel7.setText(bundle.getString("VentanaCrearCantante.jLabel7.text")); // NOI18N

        jLabel8.setText(bundle.getString("VentanaCrearCantante.jLabel8.text")); // NOI18N

        btnAgregar.setText(bundle.getString("VentanaCrearCantante.btnAgregar.text")); // NOI18N

        btnEliminar.setText(bundle.getString("VentanaCrearCantante.btnEliminar.text")); // NOI18N

        jLabel14.setText(bundle.getString("VentanaCrearCantante.jLabel14.text")); // NOI18N



        jButton3.setText(bundle.getString("VentanaCrearCantante.jButton3.text")); // NOI18N

        jButton4.setText(bundle.getString("VentanaCrearCantante.jButton4.text")); // NOI18N

        jLabel5.setText(bundle.getString("VentanaCrearCantante.jLabel5.text")); // NOI18N

        jLabel9.setText(bundle.getString("VentanaCrearCantante.jLabel9.text")); // NOI18N

        jLabel10.setText(bundle.getString("VentanaCrearCantante.jLabel10.text")); // NOI18N

        jLabel11.setText(bundle.getString("VentanaCrearCantante.jLabel11.text")); // NOI18N

        jLabel12.setText(bundle.getString("VentanaCrearCantante.jLabel12.text")); // NOI18N

        jLabel13.setText(bundle.getString("VentanaCrearCantante.jLabel13.text")); // NOI18N
        
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("VentanaCrearCantante.jPanel1.border.title"))); // NOI18N
        
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("VentanaCrearCantante.jPanel2.border.title"))); // NOI18N
       
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("VentanaCrearCantante.jPanel3.border.title"))); // NOI18N
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreArtistico = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtGeneroMusical = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        spnNumSencillos = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        spnNumGiras = new javax.swing.JSpinner();
        lblConciertos = new javax.swing.JLabel();
        spnNumConciertos = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtNomDisco = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        spnCodDisco = new javax.swing.JSpinner();
        txtAnioLanzamiento = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDiscografia = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        spnCodigo = new javax.swing.JSpinner();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        spnEdad = new javax.swing.JSpinner();
        txtNacionalidad = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();

        setClosable(true);

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("ec/edu/ups/FernandezJ_MyrkaP/vista/cantante/Bundle"); // NOI18N
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("VentanaCrearCantante.jPanel1.border.title"))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText(bundle.getString("VentanaCrearCantante.jLabel1.text")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));
        jPanel1.add(txtNombreArtistico, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 200, -1));

        jLabel2.setText(bundle.getString("VentanaCrearCantante.jLabel2.text")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));
        jPanel1.add(txtGeneroMusical, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 200, -1));

        jLabel3.setText(bundle.getString("VentanaCrearCantante.jLabel3.text")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, -1, -1));
        jPanel1.add(spnNumSencillos, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 80, -1));

        jLabel4.setText(bundle.getString("VentanaCrearCantante.jLabel4.text")); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));
        jPanel1.add(spnNumGiras, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 80, -1));

        lblConciertos.setText(bundle.getString("VentanaCrearCantante.lblConciertos.text")); // NOI18N
        jPanel1.add(lblConciertos, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, -1, -1));
        jPanel1.add(spnNumConciertos, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 80, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("VentanaCrearCantante.jPanel2.border.title"))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setText(bundle.getString("VentanaCrearCantante.jLabel6.text")); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));
        jPanel2.add(txtNomDisco, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 200, -1));

        jLabel7.setText(bundle.getString("VentanaCrearCantante.jLabel7.text")); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

        jLabel8.setText(bundle.getString("VentanaCrearCantante.jLabel8.text")); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));
        jPanel2.add(spnCodDisco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 80, -1));
        jPanel2.add(txtAnioLanzamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 200, -1));

        btnAgregar.setText(bundle.getString("VentanaCrearCantante.btnAgregar.text")); // NOI18N
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        btnEliminar.setText(bundle.getString("VentanaCrearCantante.btnEliminar.text")); // NOI18N
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, -1, -1));

        jLabel14.setText(bundle.getString("VentanaCrearCantante.jLabel14.text")); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        tblDiscografia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblDiscografia);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 580, 170));

        jButton3.setText(bundle.getString("VentanaCrearCantante.jButton3.text")); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText(bundle.getString("VentanaCrearCantante.jButton4.text")); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("VentanaCrearCantante.jPanel3.border.title"))); // NOI18N
        jPanel3.setToolTipText(bundle.getString("VentanaCrearCantante.jPanel3.toolTipText")); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText(bundle.getString("VentanaCrearCantante.jLabel5.text")); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel9.setText(bundle.getString("VentanaCrearCantante.jLabel9.text")); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel10.setText(bundle.getString("VentanaCrearCantante.jLabel10.text")); // NOI18N
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel11.setText(bundle.getString("VentanaCrearCantante.jLabel11.text")); // NOI18N
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel12.setText(bundle.getString("VentanaCrearCantante.jLabel12.text")); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel13.setText(bundle.getString("VentanaCrearCantante.jLabel13.text")); // NOI18N
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));
        jPanel3.add(spnCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 90, -1));
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 160, -1));
        jPanel3.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 160, -1));
        jPanel3.add(spnEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 100, -1));
        jPanel3.add(txtNacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 160, -1));
        jPanel3.add(txtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(jButton3)
                        .addGap(42, 42, 42)
                        .addComponent(jButton4)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int codigo = (int) spnCodDisco.getValue();
        String nombre = txtNomDisco.getText();
        int anioLanzamiento = (int) Integer.parseInt(txtAnioLanzamiento.getText());
        
        Disco auxDisco = new Disco(codigo, nombre, anioLanzamiento);
        discografia.add(auxDisco);
        
        cargarDatosTabla();
        System.out.println("hola");
        borrarDatosDisco();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        borrarDatos();
        setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int codigo = (int) spnCodigo.getValue();
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        int edad = (int) spnEdad.getValue();
        String nacionalidad = txtNacionalidad.getText();
        double salario = Double.parseDouble(txtSalario.getText());
        
        String nombreArtistico = txtNombreArtistico.getText();
        String generoMusical = txtGeneroMusical.getText();
        int numeroDeSencillos = (int) spnNumSencillos.getValue();
        int numeroDeConciertos = (int) spnNumConciertos.getValue();
        int numeroDeGiras = (int) spnNumGiras.getValue();
        List<Disco> discografia = this.discografia;
        
        Cantante aux = new Cantante(nombreArtistico, generoMusical, numeroDeSencillos, 
                numeroDeConciertos, numeroDeGiras, codigo, nombre, apellido, edad, nacionalidad, salario, discografia);
        
        controladorPersona.crear(aux);
        
        JOptionPane.showMessageDialog(this, "Se ha creado un cantante exitosamente! :)");

        this.borrarDatos();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void cargarDatosTabla() {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Código","Nombre","Año de lanzamiento"}, 0);
        for (Disco d:  discografia) {
            int codigo = d.getCodigo();
            String nombre = d.getNombre();
            int anio = d.getAnioDeLanzamiento();
            Object[] rowData = {codigo, nombre, anio};
            modelo.addRow(rowData);
        }
        this.tblDiscografia.setModel(modelo);
    }
    
    public void borrarDatos(){
        spnCodigo.setValue(0);
        txtNombre.setText("");
        txtApellido.setText("");
        spnEdad.setValue(0);
        txtNacionalidad.setText("");
        txtSalario.setText("");
        
        txtNombreArtistico.setText("");
        txtGeneroMusical.setText("");
        spnNumSencillos.setValue(0);
        spnNumConciertos.setValue(0);
        spnNumGiras.setValue(0);
        
        borrarDatosDisco();
        
        discografia = new ArrayList<>();
        
        cargarDatosTabla();
    }
    
    public void borrarDatosDisco(){
        spnCodDisco.setValue(0);
        txtNomDisco.setText("");
        txtAnioLanzamiento.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblConciertos;
    private javax.swing.JSpinner spnCodDisco;
    private javax.swing.JSpinner spnCodigo;
    private javax.swing.JSpinner spnEdad;
    private javax.swing.JSpinner spnNumConciertos;
    private javax.swing.JSpinner spnNumGiras;
    private javax.swing.JSpinner spnNumSencillos;
    private javax.swing.JTable tblDiscografia;
    private javax.swing.JTextField txtAnioLanzamiento;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtGeneroMusical;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNomDisco;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreArtistico;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
