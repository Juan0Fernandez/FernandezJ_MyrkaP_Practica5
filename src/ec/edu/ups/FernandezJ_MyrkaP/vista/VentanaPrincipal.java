package ec.edu.ups.FernandezJ_MyrkaP.vista;

import ec.edu.ups.FernandezJ_MyrkaP.controlador.ControladorPersona;
import ec.edu.ups.FernandezJ_MyrkaP.dao.PersonaDAO;
import ec.edu.ups.FernandezJ_MyrkaP.idao.IPersonaDAO;
import java.util.Locale;
import java.util.ResourceBundle;
import ec.edu.ups.FernandezJ_MyrkaP.vista.cantante.VentanaBuscarCantante;
import ec.edu.ups.FernandezJ_MyrkaP.vista.cantante.VentanaCrearCantante;
import ec.edu.ups.FernandezJ_MyrkaP.vista.compositor.VentanaAgregarClientes;
import ec.edu.ups.FernandezJ_MyrkaP.vista.compositor.VentanaBuscarCompositor;
import ec.edu.ups.FernandezJ_MyrkaP.vista.compositor.VentanaCrearCompositor;
import ec.edu.ups.FernandezJ_MyrkaP.vista.opciones.VentanaListarPersonas;

public class VentanaPrincipal extends javax.swing.JFrame {

    private VentanaCrearCompositor ventanaCrearCompositor;
    private VentanaBuscarCompositor ventanaBuscarCompositor;
    private VentanaAgregarClientes ventanaAgregarClientes;
    
    private VentanaCrearCantante ventanaCrearCantante;
    private VentanaBuscarCantante ventanaBuscarCantante;
    
    private VentanaListarPersonas ventanaListarPersonas;
    
    private ControladorPersona controladorPersona;
    
    private IPersonaDAO personaDAO;

    private Locale localizacion;
    private ResourceBundle bundle;
    
    public VentanaPrincipal() {

        initComponents();
        setLocationRelativeTo(null);
        
        personaDAO = new PersonaDAO();
        controladorPersona = new ControladorPersona(personaDAO);
        
        localizacion = Locale.getDefault();
        cambiarIdioma();
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuCantante = new javax.swing.JMenu();
        mniCrearCantantes = new javax.swing.JMenuItem();
        mniBusquedaCantante = new javax.swing.JMenuItem();
        mnuCompositor = new javax.swing.JMenu();
        mniCrearCompositor = new javax.swing.JMenuItem();
        mniBusquedaCompositor = new javax.swing.JMenuItem();
        mniAgregarCliente = new javax.swing.JMenuItem();
        mnuIdioma = new javax.swing.JMenu();
        mniEspaniol = new javax.swing.JMenuItem();
        mniIngles = new javax.swing.JMenuItem();
        mniFrances = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        mniImprimirPersonas = new javax.swing.JMenuItem();
        mniSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(pnlPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 770));

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("ec/edu/ups/FernandezJ_MyrkaP/vista/Bundle_es_EC"); // NOI18N
        mnuCantante.setText(bundle.getString("VentanaPrincipal.mnuCantante.text")); // NOI18N

        mniCrearCantantes.setText(bundle.getString("VentanaPrincipal.mniCrearCantantes.text")); // NOI18N
        mniCrearCantantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCrearCantantesActionPerformed(evt);
            }
        });
        mnuCantante.add(mniCrearCantantes);

        mniBusquedaCantante.setText(bundle.getString("VentanaPrincipal.mniBusquedaCantante.text")); // NOI18N
        mniBusquedaCantante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniBusquedaCantanteActionPerformed(evt);
            }
        });
        mnuCantante.add(mniBusquedaCantante);

        jMenuBar1.add(mnuCantante);

        mnuCompositor.setText(bundle.getString("VentanaPrincipal.mnuCompositor.text")); // NOI18N

        mniCrearCompositor.setText(bundle.getString("VentanaPrincipal.mniCrearCompositor.text")); // NOI18N
        mniCrearCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCrearCompositorActionPerformed(evt);
            }
        });
        mnuCompositor.add(mniCrearCompositor);

        mniBusquedaCompositor.setText(bundle.getString("VentanaPrincipal.mniBusquedaCompositor.text")); // NOI18N
        mniBusquedaCompositor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniBusquedaCompositorActionPerformed(evt);
            }
        });
        mnuCompositor.add(mniBusquedaCompositor);

        mniAgregarCliente.setText(bundle.getString("VentanaPrincipal.mniAgregarCliente.text")); // NOI18N
        mniAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAgregarClienteActionPerformed(evt);
            }
        });
        mnuCompositor.add(mniAgregarCliente);

        jMenuBar1.add(mnuCompositor);

        mnuIdioma.setText(bundle.getString("VentanaPrincipal.mnuIdioma.text")); // NOI18N

        mniEspaniol.setText(bundle.getString("VentanaPrincipal.mniEspaniol.text")); // NOI18N
        mniEspaniol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniEspaniolActionPerformed(evt);
            }
        });
        mnuIdioma.add(mniEspaniol);

        mniIngles.setText(bundle.getString("VentanaPrincipal.mniIngles.text")); // NOI18N
        mniIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniInglesActionPerformed(evt);
            }
        });
        mnuIdioma.add(mniIngles);

        java.util.ResourceBundle bundle1 = java.util.ResourceBundle.getBundle("ec/edu/ups/FernandezJ_MyrkaP/vista/Bundle"); // NOI18N
        mniFrances.setText(bundle1.getString("VentanaPrincipal.mniFrances.text")); // NOI18N
        mniFrances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniFrancesActionPerformed(evt);
            }
        });
        mnuIdioma.add(mniFrances);

        jMenuBar1.add(mnuIdioma);

        jMenu6.setText(bundle.getString("VentanaPrincipal.jMenu6.text")); // NOI18N

        mniImprimirPersonas.setText(bundle.getString("VentanaPrincipal.mniImprimirPersonas.text")); // NOI18N
        mniImprimirPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniImprimirPersonasActionPerformed(evt);
            }
        });
        jMenu6.add(mniImprimirPersonas);

        mniSalir.setText(bundle.getString("VentanaPrincipal.mniSalir.text")); // NOI18N
        mniSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSalirActionPerformed(evt);
            }
        });
        jMenu6.add(mniSalir);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cambiarIdioma(){
        //bundle = ResourceBundle.getBundle("mensajes.mensaje", localizacion);

        bundle = ResourceBundle.getBundle("vista/Bundle", localizacion); // NOI18N
        
        mnuCantante.setText(bundle.getString("VentanaPrincipal.mnuCantante.text")); // NOI18N
        mniCrearCantantes.setText(bundle.getString("VentanaPrincipal.mniCrearCantantes.text")); // NOI18N
        mniBusquedaCantante.setText(bundle.getString("VentanaPrincipal.mniBusquedaCantante.text")); // NOI18N
        mnuCompositor.setText(bundle.getString("VentanaPrincipal.mnuCompositor.text")); // NOI18N
        mniCrearCompositor.setText(bundle.getString("VentanaPrincipal.mniCrearCompositor.text")); // NOI18N
        mniBusquedaCompositor.setText(bundle.getString("VentanaPrincipal.mniBusquedaCompositor.text")); // NOI18N
        mniAgregarCliente.setText(bundle.getString("VentanaPrincipal.mniAgregarCliente.text")); // NOI18N
        mnuIdioma.setText(bundle.getString("VentanaPrincipal.mnuIdioma.text")); // NOI18N
        mniEspaniol.setText(bundle.getString("VentanaPrincipal.mniEspaniol.text")); // NOI18N
        mniIngles.setText(bundle.getString("VentanaPrincipal.mniIngles.text")); // NOI18N
        jMenu6.setText(bundle.getString("VentanaPrincipal.jMenu6.text")); // NOI18N
        mniImprimirPersonas.setText(bundle.getString("VentanaPrincipal.mniImprimirPersonas.text")); // NOI18N
        mniSalir.setText(bundle.getString("VentanaPrincipal.mniSalir.text")); // NOI18N
        mniFrances.setText(bundle.getString("VentanaPrincipal.mniFrances.text"));
        
        if(ventanaCrearCantante!=null){
            ventanaCrearCantante.cambiarIdioma(localizacion);
        }
        
        if(ventanaBuscarCantante!=null){
            ventanaBuscarCantante.cambiarIdioma(localizacion);
        }
       
        if(ventanaCrearCompositor!=null){
            ventanaCrearCompositor.cambiarIdioma(localizacion);
        }
         
        if(ventanaBuscarCompositor!=null){
            ventanaBuscarCompositor.cambiarIdioma(localizacion);
        }
        
        if(ventanaAgregarClientes!=null){
            ventanaAgregarClientes.cambiarIdioma(localizacion);
        }
        
        if(ventanaListarPersonas!=null){
            ventanaListarPersonas.cambiarIdioma(localizacion);
        }

    }
    
    private void mniCrearCantantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCrearCantantesActionPerformed

        ventanaCrearCantante = new VentanaCrearCantante(controladorPersona);
        pnlPrincipal.add(ventanaCrearCantante);

        
        ventanaCrearCantante.setVisible(true);
    }//GEN-LAST:event_mniCrearCantantesActionPerformed

    private void mniBusquedaCantanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniBusquedaCantanteActionPerformed
   
        ventanaBuscarCantante = new VentanaBuscarCantante(controladorPersona);
        pnlPrincipal.add(ventanaBuscarCantante);


        ventanaBuscarCantante.setVisible(true);
    }//GEN-LAST:event_mniBusquedaCantanteActionPerformed

    private void mniCrearCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniCrearCompositorActionPerformed
       
        ventanaCrearCompositor = new VentanaCrearCompositor(controladorPersona);
        pnlPrincipal.add(ventanaCrearCompositor);


        ventanaCrearCompositor.setVisible(true);
    }//GEN-LAST:event_mniCrearCompositorActionPerformed

    private void mniBusquedaCompositorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniBusquedaCompositorActionPerformed

        ventanaBuscarCompositor = new VentanaBuscarCompositor(controladorPersona);
        pnlPrincipal.add(ventanaBuscarCompositor);

        
        ventanaBuscarCompositor.setVisible(true);
    }//GEN-LAST:event_mniBusquedaCompositorActionPerformed

    private void mniAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAgregarClienteActionPerformed
        
        ventanaAgregarClientes = new VentanaAgregarClientes(controladorPersona);
        pnlPrincipal.add(ventanaAgregarClientes);

        
        ventanaAgregarClientes.setVisible(true);
    }//GEN-LAST:event_mniAgregarClienteActionPerformed

    private void mniImprimirPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniImprimirPersonasActionPerformed
        
        ventanaListarPersonas = new VentanaListarPersonas(controladorPersona);
        pnlPrincipal.add(ventanaListarPersonas);
        
       
        ventanaListarPersonas.setVisible(true);
    }//GEN-LAST:event_mniImprimirPersonasActionPerformed

    private void mniSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mniSalirActionPerformed

    private void mniEspaniolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniEspaniolActionPerformed
        localizacion = new Locale("es", "EC");
        cambiarIdioma();
    }//GEN-LAST:event_mniEspaniolActionPerformed

    private void mniInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniInglesActionPerformed
        localizacion = new Locale("en", "US");
        cambiarIdioma();
    }//GEN-LAST:event_mniInglesActionPerformed

    private void mniFrancesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniFrancesActionPerformed
        localizacion = new Locale("fr", "FR");
        cambiarIdioma();
    }//GEN-LAST:event_mniFrancesActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mniAgregarCliente;
    private javax.swing.JMenuItem mniBusquedaCantante;
    private javax.swing.JMenuItem mniBusquedaCompositor;
    private javax.swing.JMenuItem mniCrearCantantes;
    private javax.swing.JMenuItem mniCrearCompositor;
    private javax.swing.JMenuItem mniEspaniol;
    private javax.swing.JMenuItem mniFrances;
    private javax.swing.JMenuItem mniImprimirPersonas;
    private javax.swing.JMenuItem mniIngles;
    private javax.swing.JMenuItem mniSalir;
    private javax.swing.JMenu mnuCantante;
    private javax.swing.JMenu mnuCompositor;
    private javax.swing.JMenu mnuIdioma;
    private javax.swing.JDesktopPane pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
