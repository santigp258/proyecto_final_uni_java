/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Formularios;

import Clases.Messages;
import Controllers.CentroTrabajoController;
import Controllers.EmpleadoController;
import Models.CentroTrabajo;
import Models.Empleado;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Laura Isabel
 */
public class FrmCentroTrabajo extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmCentroTrabajo
     */
    DefaultTableModel dtm = new DefaultTableModel();

    List<CentroTrabajo> centros;
    List<Empleado> empleados;

    CentroTrabajoController centroRepository;

    CentroTrabajo selectedCentro = null;

    int selectedIndex;

    private void getCentros() {
        try {
            centros = centroRepository.all();
            dtm.setRowCount(0);
            txtTotalCentros.setText(centros.size() + "");
            for (CentroTrabajo centro : centros) {
                dtm.addRow(new Object[]{
                    centro.getId(),
                    centro.getNombre(),
                    centro.getCiudad(),
                    centro.getTelefono(),
                    centro.getDireccion(),
                    centro.getDirigenteId() == null ? "null" : centro.getDirigenteId()
                });
            }
        } catch (Exception e) {
            Messages.error("Error!", "Algo salio mal al cargar los centros");
            e.printStackTrace();
        }
    }

    private void getEmpleados() {
        try {
            empleados = new EmpleadoController().all();
            cmbDirigente.addItem("Seleccione un dirigente (opcional)");
            for (Empleado empleado : empleados) {
                cmbDirigente.addItem(empleado.getId() + "-" + empleado.getNombre());
            }
        } catch (Exception e) {
            Messages.error("Error!", "Algo salio mal al cargar los empleados");
            e.printStackTrace();
        }
    }

    public FrmCentroTrabajo() {

        initComponents();

        this.centroRepository = new CentroTrabajoController();

        String[] titulo = new String[]{"id", "Nombre", "Ciudad",
            "Telefono", "Direccion", "dirigente_id"};
        dtm.setColumnIdentifiers(titulo);
        tblTabla.setModel(dtm);

        getCentros();
        getEmpleados();
        txtTotalCentros.setText(centros.size() + "");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtNomCentro = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTelCentro = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCiudadCen = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtDireCentro = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cmbDirigente = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnModificacion = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnConsulta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabla = new javax.swing.JTable();
        btnGuardar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtTotalCentros = new javax.swing.JTextField();

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)), "Datos Centro de Trabajo"));

        jLabel10.setText("Nombre:");

        txtNomCentro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomCentroKeyTyped(evt);
            }
        });

        jLabel12.setText("Teléfono:");

        txtTelCentro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelCentroKeyTyped(evt);
            }
        });

        jLabel13.setText("Ciudad:");

        txtCiudadCen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCiudadCenKeyTyped(evt);
            }
        });

        jLabel14.setText("Dirección:");

        txtDireCentro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireCentroKeyTyped(evt);
            }
        });

        jLabel15.setText("Dirigente");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCiudadCen, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(txtNomCentro, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(cmbDirigente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(29, 29, 29)
                        .addComponent(txtDireCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTelCentro, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCiudadCen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtTelCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtDireCentro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cmbDirigente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153))));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificacion.setText("Modificación");
        btnModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificacionActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnConsulta.setText("Consulta");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        tblTabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblTabla);

        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btnGuardar)
                        .addGap(38, 38, 38)
                        .addComponent(btnAgregar)
                        .addGap(28, 28, 28)
                        .addComponent(btnModificacion)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnConsulta)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificacion)
                    .addComponent(btnEliminar)
                    .addComponent(btnConsulta)
                    .addComponent(btnGuardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel11.setText("Total centro de trabajos:");

        txtTotalCentros.setEnabled(false);
        txtTotalCentros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalCentrosActionPerformed(evt);
            }
        });
        txtTotalCentros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalCentrosKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(txtTotalCentros, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addGap(290, 290, 290))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtTotalCentros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Boolean validarCampos() {

        if (txtNomCentro.getText().equals("")) {
            /* Si el campo de texto del NOMBRE es igual a vacío*/
            JOptionPane.showMessageDialog(rootPane, "Debe digitar un Nombre");
            //Muestra un mensaje de llamado de atención.
            txtNomCentro.requestFocusInWindow(); //Se lleva el foco al campo de texto
            return false; //Lo saca del método.
        }

        if (txtTelCentro.getText().equals("")) {
            /* Si el campo de texto del Telefono es igual a vacío*/
            JOptionPane.showMessageDialog(rootPane, "Debe digitar un Telefono");
            //Muestra un mensaje de llamado de atención.
            txtTelCentro.requestFocusInWindow(); //Se lleva el foco al campo de texto
            return false; //Lo saca del método.
        }

        if (txtCiudadCen.getText().equals("")) {
            /* Si el campo de texto de dreccion es igual a vacío*/
            JOptionPane.showMessageDialog(rootPane, "Debe digitar una Direccion");
            //Muestra un mensaje de llamado de atención.
            txtCiudadCen.requestFocusInWindow(); //Se lleva el foco al campo de texto
            return false; //Lo saca del método.
        }

        if (txtDireCentro.getText().equals("")) {
            /* Si el campo de texto de direccion es igual a vacío*/
            JOptionPane.showMessageDialog(rootPane, "Debe digitar una Direccion");
            //Muestra un mensaje de llamado de atención.
            txtDireCentro.requestFocusInWindow(); //Se lleva el foco al campo de texto
            return false; //Lo saca del método.
        }
        return true;
    }

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

        if (!validarCampos()) {
            return;
        }

        String name = txtNomCentro.getText();

        CentroTrabajo centro = new CentroTrabajo(
                name,
                txtCiudadCen.getText(),
                txtTelCentro.getText(),
                txtDireCentro.getText()
        );

        if (cmbDirigente.getSelectedIndex() > 0) {
            int dirigenteiD = Integer.parseInt(cmbDirigente.getSelectedItem().toString().split("-", 2)[0]);
            centro.setDirigenteId(dirigenteiD);
        }

        Boolean isCreated = centroRepository.create(centro);

        if (isCreated) {
            JOptionPane.showMessageDialog(rootPane, "El centro " + name + " ha sido creado correctamente");

            getCentros();
            return;
        }

        Messages.error("Error!", "No se pudo crear el centro");
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void rellenarCampos(CentroTrabajo centro) {
        txtNomCentro.setText(centro.getNombre());
        txtCiudadCen.setText(centro.getCiudad());
        txtTelCentro.setText(centro.getTelefono());
        txtDireCentro.setText(centro.getDireccion());
    }

    private void btnModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificacionActionPerformed
        int tableIndex = tblTabla.getSelectedRow();

        if (tableIndex == -1) {
            Messages.error("Error", "Debe seleccionar una fila");
            return;
        }

        int column = 0;
        int row = tblTabla.getSelectedRow();
        int centroId = Integer.parseInt(tblTabla.getModel().getValueAt(row, column).toString());

        int centroIndex = centroRepository.indexOf(centros, centroId);

        if (centroIndex > -1) {

            CentroTrabajo centro = centros.get(centroIndex);

            selectedCentro = centro;

            selectedIndex = tableIndex;
            rellenarCampos(centro);
            btnGuardar.setEnabled(true);

            return;
        }

        Messages.error("Error", "No se encontro el centro");
    }//GEN-LAST:event_btnModificacionActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int tableIndex = tblTabla.getSelectedRow();

        if (tableIndex == -1) {
            Messages.error("Error", "Debe seleccionar una fila");
            return;
        }

        int column = 0;
        int row = tblTabla.getSelectedRow();
        int centroId = Integer.parseInt(tblTabla.getModel().getValueAt(row, column).toString());

        int centroIndex = centroRepository.indexOf(centros, centroId);

        if (centroIndex > -1) {
            CentroTrabajo centro = centros.get(centroIndex);

            Boolean isDeleted = centroRepository.delete(centro.id);

            if (isDeleted) {
                Messages.info("Eliminado", "El centro " + centro.getNombre() + " ha sido eliminado correctamente");
                dtm.removeRow(row);
            }
            return;
        }
        Messages.error("Error", "No se pudo eliminar el centro");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        String result = (String) JOptionPane.showInputDialog(
                this,
                "ingrese la id del centro:\n",
                "buscar cliente",
                JOptionPane.PLAIN_MESSAGE,
                null,
                null,
                "100");

        if (result == null) {
            return;
        }

        try {
            CentroTrabajo centro = centroRepository.getById(Integer.parseInt(result));
            Messages.info("Todo salio bien", "Se ha encontrado el centro " + centro.getNombre());
            btnGuardar.setEnabled(true);
            rellenarCampos(centro);
        } catch (Exception e) {
            Messages.error("Fallo", "El centro con id " + result + " no se ha encontrado");
        }
    }//GEN-LAST:event_btnConsultaActionPerformed

    
    private void txtNomCentroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomCentroKeyTyped
        // TODO add your handling code here:
        if (txtNomCentro.getText().length() >= 30) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_txtNomCentroKeyTyped

    private void txtCiudadCenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCiudadCenKeyTyped
        // TODO add your handling code here:
        if (txtCiudadCen.getText().length() >= 40) { //
            evt.consume();
            Toolkit.getDefaultToolkit().beep(); //     
        }
    }//GEN-LAST:event_txtCiudadCenKeyTyped

    private void txtTelCentroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelCentroKeyTyped
        // TODO add your handling code here:
        if (txtTelCentro.getText().length() >= 15) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();

        }
    }//GEN-LAST:event_txtTelCentroKeyTyped

    private void txtDireCentroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireCentroKeyTyped
        // TODO add your handling code here:
        if (txtDireCentro.getText().length() >= 30) {
            evt.consume();
            Toolkit.getDefaultToolkit().beep();

        }
    }//GEN-LAST:event_txtDireCentroKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (!validarCampos()) {
            return;
        }

        if (selectedCentro == null) {
            Messages.error("Error!", "No hay un centro para actualizar");
            return;
        }

        String nombre = txtNomCentro.getText();
        String ciudad = txtCiudadCen.getText();
        String telefono = txtTelCentro.getText();
        String direccion = txtDireCentro.getText();

        selectedCentro.setNombre(nombre);
        selectedCentro.setCiudad(ciudad);
        selectedCentro.setTelefono(telefono);
        selectedCentro.setDireccion(direccion);

        if (cmbDirigente.getSelectedIndex() > 0) {
            int dirigenteiD = Integer.parseInt(cmbDirigente.getSelectedItem().toString().split("-", 2)[0]);
            selectedCentro.setDirigenteId(dirigenteiD);
        }

        Boolean result = centroRepository.update(selectedCentro);

        if (result) {
            Messages.info("Todo luce bien!", "Se actualizo el centro " + selectedCentro.getNombre() + " exitosamente");
            btnGuardar.setEnabled(false);

            tblTabla.setValueAt(selectedCentro.getId(), selectedIndex, 0);

            tblTabla.setValueAt(nombre, selectedIndex, 1);

            tblTabla.setValueAt(ciudad, selectedIndex, 2);

            tblTabla.setValueAt(telefono, selectedIndex, 3);

            tblTabla.setValueAt(direccion, selectedIndex, 4);

            tblTabla.setValueAt(selectedCentro.getDirigenteId(), selectedIndex, 5);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtTotalCentrosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalCentrosKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalCentrosKeyTyped

    private void txtTotalCentrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalCentrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalCentrosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificacion;
    private javax.swing.JComboBox<String> cmbDirigente;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTabla;
    private javax.swing.JTextField txtCiudadCen;
    private javax.swing.JTextField txtDireCentro;
    private javax.swing.JTextField txtNomCentro;
    private javax.swing.JTextField txtTelCentro;
    private javax.swing.JTextField txtTotalCentros;
    // End of variables declaration//GEN-END:variables
}
