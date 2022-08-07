/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

/**
 *
 * @author santi
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpnEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuArchivo = new javax.swing.JMenu();
        mnuCentroTrabajo = new javax.swing.JMenuItem();
        mnuDepartamentos = new javax.swing.JMenuItem();
        mnuEmpleados = new javax.swing.JMenuItem();
        mnuHabilidadesEmple = new javax.swing.JMenuItem();
        mnuHijosEmple = new javax.swing.JMenuItem();
        mnuSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout dpnEscritorioLayout = new javax.swing.GroupLayout(dpnEscritorio);
        dpnEscritorio.setLayout(dpnEscritorioLayout);
        dpnEscritorioLayout.setHorizontalGroup(
            dpnEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
        );
        dpnEscritorioLayout.setVerticalGroup(
            dpnEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );

        mnuArchivo.setText("Archivo");

        mnuCentroTrabajo.setText("Centro Trabajo");
        mnuCentroTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCentroTrabajoActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuCentroTrabajo);

        mnuDepartamentos.setText("Departamentos");
        mnuDepartamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuDepartamentosActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuDepartamentos);

        mnuEmpleados.setText("Empleados");
        mnuEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEmpleadosActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuEmpleados);

        mnuHabilidadesEmple.setText("Habilidades Empleados");
        mnuHabilidadesEmple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHabilidadesEmpleActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuHabilidadesEmple);

        mnuHijosEmple.setText("Hijos Empleados");
        mnuHijosEmple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHijosEmpleActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuHijosEmple);

        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuSalir);

        jMenuBar1.add(mnuArchivo);

        jMenu2.setText("Ayuda");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(dpnEscritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(dpnEscritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCentroTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCentroTrabajoActionPerformed
        FrmCentroTrabajo frmCenTrabajo =  new FrmCentroTrabajo();
        
        dpnEscritorio.add(frmCenTrabajo);
        frmCenTrabajo.show();
    }//GEN-LAST:event_mnuCentroTrabajoActionPerformed

    private void mnuDepartamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuDepartamentosActionPerformed
        FrmDepto frmDepto =  new FrmDepto();
        
        dpnEscritorio.add(frmDepto);
        frmDepto.show();
    }//GEN-LAST:event_mnuDepartamentosActionPerformed

    private void mnuEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEmpleadosActionPerformed
        FrmEmpleado frmEmpleado =  new FrmEmpleado();
        
        dpnEscritorio.add(frmEmpleado);
        frmEmpleado.show();
    }//GEN-LAST:event_mnuEmpleadosActionPerformed

    private void mnuHabilidadesEmpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHabilidadesEmpleActionPerformed
        FrmHabiliEmple frmHabiliEm =  new FrmHabiliEmple();
        
        dpnEscritorio.add(frmHabiliEm);
        frmHabiliEm.show();
    }//GEN-LAST:event_mnuHabilidadesEmpleActionPerformed

    private void mnuHijosEmpleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHijosEmpleActionPerformed
        FrmHijosEmple frmHijoEmple =  new FrmHijosEmple();
        
        dpnEscritorio.add(frmHijoEmple);
        frmHijoEmple.show();
    }//GEN-LAST:event_mnuHijosEmpleActionPerformed

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
         System.exit(0);
    }//GEN-LAST:event_mnuSalirActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpnEscritorio;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenuItem mnuCentroTrabajo;
    private javax.swing.JMenuItem mnuDepartamentos;
    private javax.swing.JMenuItem mnuEmpleados;
    private javax.swing.JMenuItem mnuHabilidadesEmple;
    private javax.swing.JMenuItem mnuHijosEmple;
    private javax.swing.JMenuItem mnuSalir;
    // End of variables declaration//GEN-END:variables
}