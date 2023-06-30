package ec.edu.ups.FernandezJ_MyrkaP.vista.opciones;

import ec.edu.ups.FernandezJ_MyrkaP.controlador.ControladorPersona;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.table.DefaultTableModel;
import ec.edu.ups.FernandezJ_MyrkaP.modelo.Cancion;
import ec.edu.ups.FernandezJ_MyrkaP.modelo.Cantante;
import ec.edu.ups.FernandezJ_MyrkaP.modelo.Compositor;
import ec.edu.ups.FernandezJ_MyrkaP.modelo.Disco;
import ec.edu.ups.FernandezJ_MyrkaP.modelo.Persona;

public class VentanaListarPersonas extends javax.swing.JInternalFrame {

    private ControladorPersona controladoraPersona;
    
    public VentanaListarPersonas(ControladorPersona controladoraPersona) {
        initComponents();
        this.controladoraPersona = controladoraPersona;
        cargarTablaPersonas();
    }


    public void cambiarIdioma(Locale localizacion){
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("vista/opciones/Bundle", localizacion); // NOI18N
        
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("VentanaListarPersonas.jPanel1.border.title"))); // NOI18N

        btnCancelar.setText(bundle.getString("VentanaListarPersonas.btnCancelar.text")); // NOI18N

        jLabel1.setText(bundle.getString("VentanaListarPersonas.jLabel1.text")); // NOI18N

        jLabel2.setText(bundle.getString("VentanaListarPersonas.jLabel2.text")); // NOI18N



        jLabel3.setText(bundle.getString("VentanaListarPersonas.jLabel3.text")); // NOI18N

        jLabel4.setText(bundle.getString("VentanaListarPersonas.jLabel4.text")); // NOI18N


    }
    private void cargarTablaPersonas() {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Código", "Tipo","Nombre","Apellido",
        "Edad","Nacionalidad","Salario",}, 0);
        List<Persona> lstPersonas = controladoraPersona.listar();
        for (Persona p:  lstPersonas) {
            int codigo = p.getCodigo();
            String tipo;
            if(p instanceof Compositor){
                tipo = "Compositor";
            }else{
                tipo = "Cantante";
            }
            String nombre = p.getNombre();
            String apellido = p.getApellido();
            int edad = p.getEdad();
            String nacionalidad = p.getNacionalidad();
            double salario = p.getSalario();
            Object[] rowData = {codigo, tipo, nombre, apellido, edad, nacionalidad, salario};
            modelo.addRow(rowData);
        }
        this.tblPersonas.setModel(modelo);
    }
    private void cargarTablaCanciones(List<Cancion> lstCanciones) {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Código", "Titulo","Letra","Tiempo",}, 0);
        for (Cancion c:  lstCanciones) {
            int codigo = c.getCodigo();      
            String titulo = c.getTitulo();
            String letra = c.getLetra();
            double salario = c.getTiempoEnMinutos();
            Object[] rowData = {codigo, titulo, letra, salario};
            modelo.addRow(rowData);
        }
        this.tblCanciones.setModel(modelo);
    }
    
    private void cargarTablaDiscografia(List<Disco> discografia) {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Código", "Titulo","Letra","Tiempo",}, 0);
        for (Disco d:  discografia) {
            int codigo = d.getCodigo();      
            String nombre = d.getNombre();
            int anioDeLanzamiento = d.getAnioDeLanzamiento();
            Object[] rowData = {codigo, nombre, anioDeLanzamiento};
            modelo.addRow(rowData);
        }
        this.tblDiscografia.setModel(modelo);
        
    }
    
    private void cargarTablaClientes(List<Cantante> lstCantantes) {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Código", "Tipo","Nombre","Apellido",
        "Edad","Nacionalidad","Salario",}, 0);
        for (Cantante c:  lstCantantes) {
            int codigo = c.getCodigo();
            String tipo = "Cantante";
            String nombre = c.getNombre();
            String apellido = c.getApellido();
            int edad = c.getEdad();
            String nacionalidad = c.getNacionalidad();
            double salario = c.getSalario();
            Object[] rowData = {codigo, tipo, nombre, apellido, edad, nacionalidad, salario};
            modelo.addRow(rowData);
        }
        this.tblClientes.setModel(modelo);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPersonas = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDiscografia = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCanciones = new javax.swing.JTable();

        setClosable(true);

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("ec/edu/ups/FernandezJ_MyrkaP/vista/opciones/Bundle"); // NOI18N
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("VentanaListarPersonas.jPanel1.border.title"))); // NOI18N

        tblPersonas.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPersonas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblPersonasMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblPersonas);

        btnCancelar.setText(bundle.getString("VentanaListarPersonas.btnCancelar.text")); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel1.setText(bundle.getString("VentanaListarPersonas.jLabel1.text")); // NOI18N

        jLabel2.setText(bundle.getString("VentanaListarPersonas.jLabel2.text")); // NOI18N

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblClientes);

        jLabel3.setText(bundle.getString("VentanaListarPersonas.jLabel3.text")); // NOI18N

        jLabel4.setText(bundle.getString("VentanaListarPersonas.jLabel4.text")); // NOI18N

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
        jScrollPane3.setViewportView(tblDiscografia);

        tblCanciones.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tblCanciones);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(btnCancelar)))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCancelar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void tblPersonasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPersonasMousePressed
        int pos = tblPersonas.getSelectedRow();
        Persona aux = controladoraPersona.listar().get(pos);
        if(aux instanceof Compositor){
            cargarTablaCanciones(((Compositor) aux).getCancionesTop100Billboard());
            cargarTablaClientes(((Compositor) aux).getClientes());
            cargarTablaDiscografia(new ArrayList<>());
        }else{
            cargarTablaCanciones(new ArrayList<>());
            cargarTablaClientes(new ArrayList<>());
            cargarTablaDiscografia(((Cantante) aux).getDiscografia());
        }
    }//GEN-LAST:event_tblPersonasMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable tblCanciones;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTable tblDiscografia;
    private javax.swing.JTable tblPersonas;
    // End of variables declaration//GEN-END:variables
}
