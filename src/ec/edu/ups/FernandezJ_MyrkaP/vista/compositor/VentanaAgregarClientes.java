package ec.edu.ups.FernandezJ_MyrkaP.vista.compositor;

import ec.edu.ups.FernandezJ_MyrkaP.controlador.ControladorPersona;
import java.util.Locale;
import javax.swing.JOptionPane;
import ec.edu.ups.FernandezJ_MyrkaP.modelo.Cantante;
import ec.edu.ups.FernandezJ_MyrkaP.modelo.Compositor;

public class VentanaAgregarClientes extends javax.swing.JInternalFrame {
    
    private ControladorPersona controladorPersona;
    private Cantante auxCantante;
    private Compositor auxCompositor;
    
    public VentanaAgregarClientes(ControladorPersona controladorPersona) {
        initComponents();
        this.controladorPersona = controladorPersona;
        auxCantante = null;
        auxCompositor = null;
    }

    public void cambiarIdioma(Locale localizacion){
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("vista/compositor/Bundle", localizacion); // NOI18N
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("VentanaAgregarClientes.jPanel1.border.title"))); // NOI18N

        jLabel9.setText(bundle.getString("VentanaAgregarClientes.jLabel9.text")); // NOI18N

        jLabel5.setText(bundle.getString("VentanaAgregarClientes.jLabel5.text")); // NOI18N

        jLabel10.setText(bundle.getString("VentanaAgregarClientes.jLabel10.text")); // NOI18N

        jLabel2.setText(bundle.getString("VentanaAgregarClientes.jLabel2.text")); // NOI18N

        jLabel11.setText(bundle.getString("VentanaAgregarClientes.jLabel11.text")); // NOI18N

        jLabel12.setText(bundle.getString("VentanaAgregarClientes.jLabel12.text")); // NOI18N

        jLabel13.setText(bundle.getString("VentanaAgregarClientes.jLabel13.text")); // NOI18N

        btnBuscarCompositor.setText(bundle.getString("VentanaAgregarClientes.btnBuscarCompositor.text")); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("VentanaAgregarClientes.jPanel2.border.title"))); // NOI18N

        jLabel14.setText(bundle.getString("VentanaAgregarClientes.jLabel14.text")); // NOI18N

        jLabel6.setText(bundle.getString("VentanaAgregarClientes.jLabel6.text")); // NOI18N

        jLabel15.setText(bundle.getString("VentanaAgregarClientes.jLabel15.text")); // NOI18N

        jLabel16.setText(bundle.getString("VentanaAgregarClientes.jLabel16.text")); // NOI18N

        jLabel17.setText(bundle.getString("VentanaAgregarClientes.jLabel17.text")); // NOI18N

        jLabel18.setText(bundle.getString("VentanaAgregarClientes.jLabel18.text")); // NOI18N

        jLabel1.setText(bundle.getString("VentanaAgregarClientes.jLabel1.text")); // NOI18N

        jLabel3.setText(bundle.getString("VentanaAgregarClientes.jLabel3.text")); // NOI18N

        jLabel4.setText(bundle.getString("VentanaAgregarClientes.jLabel4.text")); // NOI18N

        jLabel7.setText(bundle.getString("VentanaAgregarClientes.jLabel7.text")); // NOI18N

        brnBuscarCliente.setText(bundle.getString("VentanaAgregarClientes.brnBuscarCliente.text")); // NOI18N

        btnAgregarCliente.setText(bundle.getString("VentanaAgregarClientes.btnAgregarCliente.text")); // NOI18N

        btnCancelar.setText(bundle.getString("VentanaAgregarClientes.btnCancelar.text")); // NOI18N

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtApellidoCompositor = new javax.swing.JTextField();
        txtNombreCompositor = new javax.swing.JTextField();
        spnCodigoCompositor = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        spnNumComposiciones = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        spnEdadCompositor = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNacionalidadCompositor = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtSalarioCompositor = new javax.swing.JTextField();
        btnBuscarCompositor = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        spnCodigoCliente = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtApellidoCliente = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        spnEdadCliente = new javax.swing.JSpinner();
        jLabel17 = new javax.swing.JLabel();
        txtNacionalidadCliente = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtSalarioCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNombreArtistico = new javax.swing.JTextField();
        txtGeneroMusical = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        spnNumSencillos = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        spnNumGiras = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        brnBuscarCliente = new javax.swing.JButton();
        btnAgregarCliente = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("ec/edu/ups/FernandezJ_MyrkaP/vista/compositor/Bundle"); // NOI18N
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("VentanaAgregarClientes.jPanel1.border.title"))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtApellidoCompositor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 160, -1));
        jPanel1.add(txtNombreCompositor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 160, -1));
        jPanel1.add(spnCodigoCompositor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 90, -1));

        jLabel9.setText(bundle.getString("VentanaAgregarClientes.jLabel9.text")); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel5.setText(bundle.getString("VentanaAgregarClientes.jLabel5.text")); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jLabel10.setText(bundle.getString("VentanaAgregarClientes.jLabel10.text")); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));
        jPanel1.add(spnNumComposiciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 80, -1));

        jLabel2.setText(bundle.getString("VentanaAgregarClientes.jLabel2.text")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));
        jPanel1.add(spnEdadCompositor, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 80, -1));

        jLabel11.setText(bundle.getString("VentanaAgregarClientes.jLabel11.text")); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        jLabel12.setText(bundle.getString("VentanaAgregarClientes.jLabel12.text")); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));
        jPanel1.add(txtNacionalidadCompositor, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 160, -1));

        jLabel13.setText(bundle.getString("VentanaAgregarClientes.jLabel13.text")); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, -1, -1));
        jPanel1.add(txtSalarioCompositor, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 160, -1));

        btnBuscarCompositor.setText(bundle.getString("VentanaAgregarClientes.btnBuscarCompositor.text")); // NOI18N
        btnBuscarCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCompositorActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscarCompositor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("VentanaAgregarClientes.jPanel2.border.title"))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(spnCodigoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 80, -1));

        jLabel14.setText(bundle.getString("VentanaAgregarClientes.jLabel14.text")); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel6.setText(bundle.getString("VentanaAgregarClientes.jLabel6.text")); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));
        jPanel2.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 160, -1));

        jLabel15.setText(bundle.getString("VentanaAgregarClientes.jLabel15.text")); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));
        jPanel2.add(txtApellidoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 160, -1));

        jLabel16.setText(bundle.getString("VentanaAgregarClientes.jLabel16.text")); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));
        jPanel2.add(spnEdadCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 80, -1));

        jLabel17.setText(bundle.getString("VentanaAgregarClientes.jLabel17.text")); // NOI18N
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 120, -1, -1));
        jPanel2.add(txtNacionalidadCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 160, -1));

        jLabel18.setText(bundle.getString("VentanaAgregarClientes.jLabel18.text")); // NOI18N
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, -1, -1));
        jPanel2.add(txtSalarioCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 160, -1));

        jLabel1.setText(bundle.getString("VentanaAgregarClientes.jLabel1.text")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, -1));
        jPanel2.add(txtNombreArtistico, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 200, -1));
        jPanel2.add(txtGeneroMusical, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 200, -1));

        jLabel3.setText(bundle.getString("VentanaAgregarClientes.jLabel3.text")); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));
        jPanel2.add(spnNumSencillos, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 80, -1));

        jLabel4.setText(bundle.getString("VentanaAgregarClientes.jLabel4.text")); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));
        jPanel2.add(spnNumGiras, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 70, 80, -1));

        jLabel7.setText(bundle.getString("VentanaAgregarClientes.jLabel7.text")); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        brnBuscarCliente.setText(bundle.getString("VentanaAgregarClientes.brnBuscarCliente.text")); // NOI18N
        brnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brnBuscarClienteActionPerformed(evt);
            }
        });
        jPanel2.add(brnBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        btnAgregarCliente.setText(bundle.getString("VentanaAgregarClientes.btnAgregarCliente.text")); // NOI18N
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, -1, -1));

        btnCancelar.setText(bundle.getString("VentanaAgregarClientes.btnCancelar.text")); // NOI18N
        jPanel2.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 945, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        if(auxCantante!=null && auxCompositor!=null){
            controladorPersona.agregarCliente(auxCompositor, auxCantante);
            JOptionPane.showMessageDialog(this, "Cliente agregado con exito! :)");
            borrarCampos();
        }else{
            JOptionPane.showMessageDialog(this, "Error, primero debe buscar un compositor y un cliente.");
        }
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    public void borrarCampos(){
        spnCodigoCliente.setValue(0);
        spnCodigoCompositor.setValue(0);
        spnEdadCliente.setValue(0);
        spnEdadCompositor.setValue(0);
        spnNumComposiciones.setValue(0);
        spnNumGiras.setValue(0);
        spnNumSencillos.setValue(0);
        
        txtApellidoCliente.setText("");
        txtApellidoCompositor.setText("");
        txtGeneroMusical.setText("");
        txtNacionalidadCliente.setText("");
        txtNacionalidadCompositor.setText("");
        txtNombreArtistico.setText("");
        txtNombreCliente.setText("");
        txtNombreCompositor.setText("");
        txtSalarioCliente.setText("");
        txtSalarioCompositor.setText("");

    }
    
    private void btnBuscarCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCompositorActionPerformed
        int cod = (int) spnCodigoCompositor.getValue();
        
        auxCompositor = (Compositor) controladorPersona.buscarPorCodigo(cod);
        txtNombreCompositor.setText(auxCompositor.getNombre());
        txtApellidoCompositor.setText(auxCompositor.getApellido());
        spnNumComposiciones.setValue(auxCompositor.getNumeroDeComposiciones());
        spnEdadCompositor.setValue(auxCompositor.getEdad());
        txtNacionalidadCompositor.setText(auxCompositor.getNacionalidad());
        txtSalarioCompositor.setText(auxCompositor.getSalario()+"");
    }//GEN-LAST:event_btnBuscarCompositorActionPerformed

    private void brnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brnBuscarClienteActionPerformed
        int cod = (int) spnCodigoCliente.getValue();
        
        auxCantante = (Cantante) controladorPersona.buscarPorCodigo(cod);
        txtNombreCliente.setText(auxCantante.getNombre());
        txtApellidoCliente.setText(auxCantante.getApellido());
        spnEdadCliente.setValue(auxCantante.getEdad());
        txtNacionalidadCliente.setText(auxCantante.getNacionalidad());
        txtSalarioCliente.setText(auxCantante.getSalario()+"");
        spnNumGiras.setValue(auxCantante.getNumeroDeGiras());
        spnNumSencillos.setValue(auxCantante.getNumeroDeSencillos());
        txtGeneroMusical.setText(auxCantante.getGeneroMusical());
        txtNombreArtistico.setText(auxCantante.getNombreArtistico());
        
    }//GEN-LAST:event_brnBuscarClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnBuscarCliente;
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnBuscarCompositor;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner spnCodigoCliente;
    private javax.swing.JSpinner spnCodigoCompositor;
    private javax.swing.JSpinner spnEdadCliente;
    private javax.swing.JSpinner spnEdadCompositor;
    private javax.swing.JSpinner spnNumComposiciones;
    private javax.swing.JSpinner spnNumGiras;
    private javax.swing.JSpinner spnNumSencillos;
    private javax.swing.JTextField txtApellidoCliente;
    private javax.swing.JTextField txtApellidoCompositor;
    private javax.swing.JTextField txtGeneroMusical;
    private javax.swing.JTextField txtNacionalidadCliente;
    private javax.swing.JTextField txtNacionalidadCompositor;
    private javax.swing.JTextField txtNombreArtistico;
    private javax.swing.JTextField txtNombreCliente;
    private javax.swing.JTextField txtNombreCompositor;
    private javax.swing.JTextField txtSalarioCliente;
    private javax.swing.JTextField txtSalarioCompositor;
    // End of variables declaration//GEN-END:variables
}
