package ec.edu.ups.FernandezJ_MyrkaP.vista.cantante;

import ec.edu.ups.FernandezJ_MyrkaP.controlador.ControladorPersona;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ec.edu.ups.FernandezJ_MyrkaP.modelo.Cantante;
import ec.edu.ups.FernandezJ_MyrkaP.modelo.Disco;
import ec.edu.ups.FernandezJ_MyrkaP.modelo.Persona;

public class VentanaBuscarCantante extends javax.swing.JInternalFrame {

    private ControladorPersona controladorPersona;
    
    public VentanaBuscarCantante(ControladorPersona controladorPersona) {
        initComponents();
        this.controladorPersona = controladorPersona;
    }

    public void cambiarIdioma(Locale localizacion){
        ResourceBundle bundle = ResourceBundle.getBundle("vista.cantante/Bundle", localizacion); // NOI18N
        
        jLabel1.setText(bundle.getString("VentanaBuscarCantante.jLabel1.text")); // NOI18N

        jLabel2.setText(bundle.getString("VentanaBuscarCantante.jLabel2.text")); // NOI18N

        jLabel3.setText(bundle.getString("VentanaBuscarCantante.jLabel3.text")); // NOI18N

        jLabel4.setText(bundle.getString("VentanaBuscarCantante.jLabel4.text")); // NOI18N

        jLabel5.setText(bundle.getString("VentanaBuscarCantante.jLabel5.text")); // NOI18N

        btnBuscar.setText(bundle.getString("VentanaBuscarCantante.btnBuscar.text")); // NOI18N

        jLabel6.setText(bundle.getString("VentanaBuscarCantante.jLabel6.text")); // NOI18N
        
        jLabel7.setText(bundle.getString("VentanaBuscarCantante.jLabel7.text")); // NOI18N

        jLabel9.setText(bundle.getString("VentanaBuscarCantante.jLabel9.text")); // NOI18N

        jLabel10.setText(bundle.getString("VentanaBuscarCantante.jLabel10.text")); // NOI18N

        jLabel11.setText(bundle.getString("VentanaBuscarCantante.jLabel11.text")); // NOI18N

        jLabel12.setText(bundle.getString("VentanaBuscarCantante.jLabel12.text")); // NOI18N

        jLabel13.setText(bundle.getString("VentanaBuscarCantante.jLabel13.text")); // NOI18N

        btnCancelar.setText(bundle.getString("VentanaBuscarCantante.btnCancelar.text")); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("VentanaCrearCantante.jPanel1.border.title"))); // NOI18N
        
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("VentanaCrearCantante.jPanel3.border.title"))); // NOI18N


    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNomDisco = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        spnNumSencillos = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        spnNumGiras = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        txtNomArtistico = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDiscografia = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
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
        btnCancelar = new javax.swing.JButton();

        setClosable(true);

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("ec/edu/ups/FernandezJ_MyrkaP/vista/cantante/Bundle"); // NOI18N
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("VentanaBuscarCantante.jPanel1.border.title"))); // NOI18N

        jLabel1.setText(bundle.getString("VentanaBuscarCantante.jLabel1.text")); // NOI18N

        jLabel2.setText(bundle.getString("VentanaBuscarCantante.jLabel2.text")); // NOI18N

        jLabel3.setText(bundle.getString("VentanaBuscarCantante.jLabel3.text")); // NOI18N

        jLabel4.setText(bundle.getString("VentanaBuscarCantante.jLabel4.text")); // NOI18N

        jLabel5.setText(bundle.getString("VentanaBuscarCantante.jLabel5.text")); // NOI18N

        btnBuscar.setText(bundle.getString("VentanaBuscarCantante.btnBuscar.text")); // NOI18N
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel6.setText(bundle.getString("VentanaBuscarCantante.jLabel6.text")); // NOI18N

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNomDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnBuscar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(129, 129, 129)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNomArtistico, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(108, 108, 108)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(spnNumSencillos, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154)
                        .addComponent(spnNumGiras, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomDisco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomArtistico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spnNumSencillos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnNumGiras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("VentanaBuscarCantante.jPanel3.border.title"))); // NOI18N
        jPanel3.setToolTipText(bundle.getString("VentanaBuscarCantante.jPanel3.toolTipText")); // NOI18N

        jLabel7.setText(bundle.getString("VentanaBuscarCantante.jLabel7.text")); // NOI18N

        jLabel9.setText(bundle.getString("VentanaBuscarCantante.jLabel9.text")); // NOI18N

        jLabel10.setText(bundle.getString("VentanaBuscarCantante.jLabel10.text")); // NOI18N

        jLabel11.setText(bundle.getString("VentanaBuscarCantante.jLabel11.text")); // NOI18N

        jLabel12.setText(bundle.getString("VentanaBuscarCantante.jLabel12.text")); // NOI18N

        jLabel13.setText(bundle.getString("VentanaBuscarCantante.jLabel13.text")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(spnEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel9)
                .addGap(4, 4, 4)
                .addComponent(spnCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(4, 4, 4)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel10)
                .addGap(4, 4, 4)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel11)
                .addGap(4, 4, 4)
                .addComponent(spnEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel12)
                .addGap(4, 4, 4)
                .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel13)
                .addGap(4, 4, 4)
                .addComponent(txtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        btnCancelar.setText(bundle.getString("VentanaBuscarCantante.btnCancelar.text")); // NOI18N
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCancelar)
                .addGap(396, 396, 396))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String nombreDisco = txtNomDisco.getText();
        Cantante aux = controladorPersona.buscarPorNombreDeDisco(nombreDisco);
        if (aux != null) {
            spnCodigo.setValue(aux.getCodigo());
            txtNombre.setText(aux.getNombre());
            txtApellido.setText(aux.getApellido());
            spnEdad.setValue(aux.getEdad());
            txtNacionalidad.setText(aux.getNacionalidad());
            txtSalario.setText(aux.getSalario()+"");
            
            txtNomArtistico.setText(aux.getNombreArtistico());
            txtGenero.setText(aux.getGeneroMusical());
            spnNumSencillos.setValue(aux.getNumeroDeSencillos());
            spnNumGiras.setValue(aux.getNumeroDeGiras());
            cargarDatosTabla(aux.getDiscografia());
        } else {
            JOptionPane.showMessageDialog(this, "Ningún cantante tiene un disco llamado" + nombreDisco);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed


    private void cargarDatosTabla(List<Disco> discografia) {
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
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner spnCodigo;
    private javax.swing.JSpinner spnEdad;
    private javax.swing.JSpinner spnNumGiras;
    private javax.swing.JSpinner spnNumSencillos;
    private javax.swing.JTable tblDiscografia;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNomArtistico;
    private javax.swing.JTextField txtNomDisco;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSalario;
    // End of variables declaration//GEN-END:variables
}
