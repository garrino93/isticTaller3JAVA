package Vista;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal()
    {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIngreso = new javax.swing.JButton();
        btnSalida = new javax.swing.JButton();
        btnNose = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnMenu = new javax.swing.JMenu();
        btnmenuIngresar = new javax.swing.JMenuItem();
        btnmenuSacar = new javax.swing.JMenuItem();
        btnInformes = new javax.swing.JMenu();
        btnListado = new javax.swing.JMenu();
        btnmenuEstacionados = new javax.swing.JMenuItem();
        btnmenuFacturados = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnIngreso.setText("IN");
        btnIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresoActionPerformed(evt);
            }
        });

        btnSalida.setText("Out");
        btnSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidaActionPerformed(evt);
            }
        });

        btnNose.setText("Nose");
        btnNose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoseActionPerformed(evt);
            }
        });

        btnReporte.setText("Reporte");

        btnMenu.setText("Vehiculos");

        btnmenuIngresar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.SHIFT_MASK));
        btnmenuIngresar.setText("Ingresar");
        btnmenuIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuIngresarActionPerformed(evt);
            }
        });
        btnMenu.add(btnmenuIngresar);

        btnmenuSacar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK));
        btnmenuSacar.setText("Sacar");
        btnmenuSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuSacarActionPerformed(evt);
            }
        });
        btnMenu.add(btnmenuSacar);

        jMenuBar1.add(btnMenu);

        btnInformes.setText("Informes");
        jMenuBar1.add(btnInformes);

        btnListado.setText("Listado");

        btnmenuEstacionados.setText("Estacionados");
        btnmenuEstacionados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenuEstacionadosActionPerformed(evt);
            }
        });
        btnListado.add(btnmenuEstacionados);

        btnmenuFacturados.setText("Facturados");
        btnListado.add(btnmenuFacturados);

        jMenuBar1.add(btnListado);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(btnNose, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(btnSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNose, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresoActionPerformed
        frmIngreso objIngreso = new frmIngreso();
        objIngreso.setVisible(true);
    }//GEN-LAST:event_btnIngresoActionPerformed

    private void btnNoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNoseActionPerformed

    private void btnSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidaActionPerformed
        frmSalida objSalida = new frmSalida();
        objSalida.setVisible(true);
        objSalida.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnSalidaActionPerformed

    private void btnmenuIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuIngresarActionPerformed
        //System.out.println("Fue presionado");
        frmIngreso objIngreso = new frmIngreso();
        objIngreso.setVisible(true);
        objIngreso.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnmenuIngresarActionPerformed

    private void btnmenuSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuSacarActionPerformed
        frmSalida objSalida = new frmSalida();
        objSalida.setVisible(true);
        objSalida.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnmenuSacarActionPerformed

    private void btnmenuEstacionadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenuEstacionadosActionPerformed
        frmListado objListado = null;
        try {
            objListado = new frmListado();
        } catch (IOException ex) {
            Logger.getLogger(frmPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        objListado.setVisible(true);
        objListado.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnmenuEstacionadosActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnInformes;
    private javax.swing.JButton btnIngreso;
    private javax.swing.JMenu btnListado;
    private javax.swing.JMenu btnMenu;
    private javax.swing.JButton btnNose;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnSalida;
    private javax.swing.JMenuItem btnmenuEstacionados;
    private javax.swing.JMenuItem btnmenuFacturados;
    private javax.swing.JMenuItem btnmenuIngresar;
    private javax.swing.JMenuItem btnmenuSacar;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}