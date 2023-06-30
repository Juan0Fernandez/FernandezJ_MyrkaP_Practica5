package ec.edu.ups.FernandezJ_MyrkaP.vista.compositor;

import ec.edu.ups.FernandezJ_MyrkaP.controlador.ControladorPersona;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ec.edu.ups.FernandezJ_MyrkaP.modelo.Cancion;
import ec.edu.ups.FernandezJ_MyrkaP.modelo.Cantante;
import ec.edu.ups.FernandezJ_MyrkaP.modelo.Compositor;

public class VentanaCrearCompositor extends javax.swing.JInternalFrame {

    private ControladorPersona controladorPersona;
    
    private Cantante aux;
    
    private List<Cancion> canciones;
    private List<Cantante> clientes;
    
    public VentanaCrearCompositor(ControladorPersona controladorPersona) {
        initComponents();
        this.controladorPersona = controladorPersona;
        
        canciones = new ArrayList<>();
        clientes = new ArrayList<>();
    }
    
    public void cambiarIdioma(Locale localizacion){
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("vista/compositor/Bundle", localizacion); // NOI18N
        
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("VentanaCrearCompositor.jPanel3.border.title"))); // NOI18N

        jLabel7.setText(bundle.getString("VentanaCrearCompositor.jLabel7.text")); // NOI18N

        jLabel10.setText(bundle.getString("VentanaCrearCompositor.jLabel10.text")); // NOI18N

        jLabel11.setText(bundle.getString("VentanaCrearCompositor.jLabel11.text")); // NOI18N

        jLabel12.setText(bundle.getString("VentanaCrearCompositor.jLabel12.text")); // NOI18N

        jLabel13.setText(bundle.getString("VentanaCrearCompositor.jLabel13.text")); // NOI18N

        jLabel14.setText(bundle.getString("VentanaCrearCompositor.jLabel14.text")); // NOI18N
        
        jLabel1.setText(bundle.getString("VentanaCrearCompositor.jLabel1.text")); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("VentanaCrearCompositor.jPanel2.border.title"))); // NOI18N

        btnBuscar.setText(bundle.getString("VentanaCrearCompositor.btnBuscar.text")); // NOI18N

        btnAgregarCliente.setText(bundle.getString("VentanaCrearCompositor.btnAgregarCliente.text")); // NOI18N

        btnEliminarCliente.setText(bundle.getString("VentanaCrearCompositor.btnEliminarCliente.text")); // NOI18N

        jLabel5.setText(bundle.getString("VentanaCrearCompositor.jLabel5.text")); // NOI18N

        jLabel6.setText(bundle.getString("VentanaCrearCompositor.jLabel6.text")); // NOI18N

        jLabel8.setText(bundle.getString("VentanaCrearCompositor.jLabel8.text")); // NOI18N

        jLabel15.setText(bundle.getString("VentanaCrearCompositor.jLabel15.text")); // NOI18N

        jLabel16.setText(bundle.getString("VentanaCrearCompositor.jLabel16.text")); // NOI18N

        jLabel18.setText(bundle.getString("VentanaCrearCompositor.jLabel18.text")); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("VentanaCrearCompositor.jPanel4.border.title"))); // NOI18N

        jLabel2.setText(bundle.getString("VentanaCrearCompositor.jLabel2.text")); // NOI18N

        jLabel3.setText(bundle.getString("VentanaCrearCompositor.jLabel3.text")); // NOI18N

        jLabel4.setText(bundle.getString("VentanaCrearCompositor.jLabel4.text")); // NOI18N

        jLabel9.setText(bundle.getString("VentanaCrearCompositor.jLabel9.text")); // NOI18N

        jLabel17.setText(bundle.getString("VentanaCrearCompositor.jLabel17.text")); // NOI18N

        btnAgregarCancion.setText(bundle.getString("VentanaCrearCompositor.btnAgregarCancion.text")); // NOI18N

        btnEliminarCancion.setText(bundle.getString("VentanaCrearCompositor.btnEliminarCancion.text")); // NOI18N

        btnAceptar.setText(bundle.getString("VentanaCrearCompositor.btnAceptar.text")); // NOI18N


        btnCancelar.setText(bundle.getString("VentanaCrearCompositor.btnCancelar.text")); // NOI18N


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        spnEdad = new javax.swing.JSpinner();
        txtNacionalidad = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        spnCodigo = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        spnNumComposiciones = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        btnAgregarCliente = new javax.swing.JButton();
        btnEliminarCliente = new javax.swing.JButton();
        spnCodCliente = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtNomCliente = new javax.swing.JTextField();
        txtApeCliente = new javax.swing.JTextField();
        txtNomArtistico = new javax.swing.JTextField();
        txtSalarioCli = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        spnCodigoCancion = new javax.swing.JSpinner();
        txtTitulo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtLetra = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCanciones = new javax.swing.JTable();
        btnAgregarCancion = new javax.swing.JButton();
        btnEliminarCancion = new javax.swing.JButton();
        txtDuracion = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setClosable(true);

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("ec/edu/ups/FernandezJ_MyrkaP/vista/compositor/Bundle"); // NOI18N
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("VentanaCrearCompositor.jPanel3.border.title"))); // NOI18N
        jPanel3.setToolTipText(bundle.getString("VentanaCrearCompositor.jPanel3.toolTipText")); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setText(bundle.getString("VentanaCrearCompositor.jLabel7.text")); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel10.setText(bundle.getString("VentanaCrearCompositor.jLabel10.text")); // NOI18N
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel11.setText(bundle.getString("VentanaCrearCompositor.jLabel11.text")); // NOI18N
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel12.setText(bundle.getString("VentanaCrearCompositor.jLabel12.text")); // NOI18N
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel13.setText(bundle.getString("VentanaCrearCompositor.jLabel13.text")); // NOI18N
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));
        jPanel3.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 160, -1));
        jPanel3.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 160, -1));
        jPanel3.add(spnEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 80, -1));
        jPanel3.add(txtNacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 160, -1));
        jPanel3.add(txtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 160, -1));

        jLabel14.setText(bundle.getString("VentanaCrearCompositor.jLabel14.text")); // NOI18N
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        jPanel3.add(spnCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 80, -1));

        jLabel1.setText(bundle.getString("VentanaCrearCompositor.jLabel1.text")); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));
        jPanel3.add(spnNumComposiciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 80, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("VentanaCrearCompositor.jPanel2.border.title"))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscar.setText(bundle.getString("VentanaCrearCompositor.btnBuscar.text")); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        btnAgregarCliente.setText(bundle.getString("VentanaCrearCompositor.btnAgregarCliente.text")); // NOI18N
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        btnEliminarCliente.setText(bundle.getString("VentanaCrearCompositor.btnEliminarCliente.text")); // NOI18N
        btnEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarClienteActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));
        jPanel2.add(spnCodCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 80, -1));

        jLabel5.setText(bundle.getString("VentanaCrearCompositor.jLabel5.text")); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel6.setText(bundle.getString("VentanaCrearCompositor.jLabel6.text")); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel8.setText(bundle.getString("VentanaCrearCompositor.jLabel8.text")); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        jLabel15.setText(bundle.getString("VentanaCrearCompositor.jLabel15.text")); // NOI18N
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        jLabel16.setText(bundle.getString("VentanaCrearCompositor.jLabel16.text")); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));
        jPanel2.add(txtNomCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 170, -1));
        jPanel2.add(txtApeCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 170, -1));
        jPanel2.add(txtNomArtistico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 170, -1));
        jPanel2.add(txtSalarioCli, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 170, -1));

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Nom. Artístico"
            }
        ));
        jScrollPane3.setViewportView(tblClientes);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 380, 210));

        jLabel18.setText(bundle.getString("VentanaCrearCompositor.jLabel18.text")); // NOI18N
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("VentanaCrearCompositor.jPanel4.border.title"))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText(bundle.getString("VentanaCrearCompositor.jLabel2.text")); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel3.setText(bundle.getString("VentanaCrearCompositor.jLabel3.text")); // NOI18N
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel4.setText(bundle.getString("VentanaCrearCompositor.jLabel4.text")); // NOI18N
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel9.setText(bundle.getString("VentanaCrearCompositor.jLabel9.text")); // NOI18N
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));
        jPanel4.add(spnCodigoCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 80, -1));
        jPanel4.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 180, -1));

        txtLetra.setColumns(20);
        txtLetra.setRows(5);
        jScrollPane1.setViewportView(txtLetra);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 230, -1));

        jLabel17.setText(bundle.getString("VentanaCrearCompositor.jLabel17.text")); // NOI18N
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        tblCanciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Título", "Tiempo (min)"
            }
        ));
        jScrollPane2.setViewportView(tblCanciones);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 310, 170));

        btnAgregarCancion.setText(bundle.getString("VentanaCrearCompositor.btnAgregarCancion.text")); // NOI18N
        btnAgregarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCancionActionPerformed(evt);
            }
        });
        jPanel4.add(btnAgregarCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        btnEliminarCancion.setText(bundle.getString("VentanaCrearCompositor.btnEliminarCancion.text")); // NOI18N
        btnEliminarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCancionActionPerformed(evt);
            }
        });
        jPanel4.add(btnEliminarCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));
        jPanel4.add(txtDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 110, -1));

        btnAceptar.setText(bundle.getString("VentanaCrearCompositor.btnAceptar.text")); // NOI18N
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText(bundle.getString("VentanaCrearCompositor.btnCancelar.text")); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(btnAceptar)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        int codigo = (int) spnCodigo.getValue();
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        int edad = (int) spnEdad.getValue();
        String nacionalidad = txtNacionalidad.getText();
        double salario = Double.parseDouble(txtSalario.getText());
        
        int numeroDeComposiciones = (int) spnNumComposiciones.getValue();
        
        Compositor aux = new Compositor(numeroDeComposiciones, codigo, nombre, apellido, edad, 
                nacionalidad, salario, canciones, clientes);
        
        controladorPersona.crear(aux);
        
        JOptionPane.showMessageDialog(this, "Se ha creado un compositor exitosamente! :)");

        this.borrarDatos();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnAgregarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCancionActionPerformed
        int codigo = (int) spnCodigoCancion.getValue();
        String titulo = txtTitulo.getText();
        String letra = txtLetra.getText();
        double tiempoEnMinutos = Double.parseDouble(txtDuracion.getText());
        
        Cancion aux = new Cancion(codigo, titulo, letra, tiempoEnMinutos);
        
        canciones.add(aux);
        
        borrarDatosCanciones();
    }//GEN-LAST:event_btnAgregarCancionActionPerformed

    private void btnEliminarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCancionActionPerformed
        int pos = tblCanciones.getSelectedRow();
        if(pos!=-1){
            canciones.remove(pos);
            cargarTablaCanciones();
        }else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar una canción para eliminarla.");
        }
    }//GEN-LAST:event_btnEliminarCancionActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        aux = (Cantante) controladorPersona.buscarPorCodigo((int) spnCodCliente.getValue());
        if(aux==null){
            JOptionPane.showMessageDialog(this, "No se encontró ningún cantante con el código "+(int) spnCodCliente.getValue());
        }else{
            txtNomCliente.setText(aux.getNombre());
            txtApeCliente.setText(aux.getApellido());
            txtNomArtistico.setText(aux.getNombreArtistico());
            txtSalarioCli.setText(aux.getSalario()+"");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        if(aux==null){
            JOptionPane.showMessageDialog(this, "Debe buscar cantantes validos para añadirlos como clientes");
        }else{
            clientes.add(aux);
            cargarTablaClientes();
            borrarDatosCliente();
        }
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

    private void btnEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarClienteActionPerformed
        int pos = tblClientes.getSelectedRow();
        if(pos!=-1){
           clientes.remove(pos);
           cargarTablaClientes();
        }else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar a alguien de la tabla para eliminarlo.");
        }
    }//GEN-LAST:event_btnEliminarClienteActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed


    public void borrarDatos(){
        spnCodigo.setValue(0);
        txtNombre.setText("");
        txtApellido.setText("");
        spnEdad.setValue(0);
        txtNacionalidad.setText("");
        txtSalario.setText("");
        
        spnNumComposiciones.setValue(0);
        
        canciones = new ArrayList<>();
        clientes = new ArrayList<>();
        
        borrarDatosCanciones();
        
        borrarDatosCliente();
    }
    
    public void borrarDatosCanciones(){
        spnCodigoCancion.setValue(0);
        txtTitulo.setText("");
        txtLetra.setText("");
        txtDuracion.setText("");
        
        cargarTablaCanciones();
    }
    
    public void borrarDatosCliente(){
        spnCodCliente.setValue(0);
        txtNomCliente.setText("");
        txtApeCliente.setText("");
        txtNomArtistico.setText("");
        txtSalario.setText("");
        
        cargarTablaClientes();
        
    }
    
    private void cargarTablaCanciones() {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Código","Titulo","Duración"}, 0);
        for (Cancion c:  canciones) {
            int codigo = c.getCodigo();
            String nombre = c.getTitulo();
            double tiempo = c.getTiempoEnMinutos();
            Object[] rowData = {codigo, nombre, tiempo};
            modelo.addRow(rowData);
        }
        this.tblCanciones.setModel(modelo);
    }
    
    private void cargarTablaClientes() {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Nombre","Apellido","Nom. Artístico"}, 0);
        for (Cantante c:  clientes) {
            String artistico = c.getNombreArtistico();
            String nombre = c.getNombre();
            String apellido = c.getApellido();
            Object[] rowData = {nombre, apellido, artistico};
            modelo.addRow(rowData);
        }
        this.tblClientes.setModel(modelo);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAgregarCancion;
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminarCancion;
    private javax.swing.JButton btnEliminarCliente;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner spnCodCliente;
    private javax.swing.JSpinner spnCodigo;
    private javax.swing.JSpinner spnCodigoCancion;
    private javax.swing.JSpinner spnEdad;
    private javax.swing.JSpinner spnNumComposiciones;
    private javax.swing.JTable tblCanciones;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtApeCliente;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextArea txtLetra;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNomArtistico;
    private javax.swing.JTextField txtNomCliente;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtSalarioCli;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
