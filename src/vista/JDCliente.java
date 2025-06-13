package vista;

import conexion.Conexion;
import java.sql.*;
import controlador.Ctrl_Cliente;
import datos.Cliente;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JDCliente extends javax.swing.JDialog {
    private int idCliente;
    Cliente cl = new Cliente();
    Ctrl_Cliente ct = new Ctrl_Cliente();
    DefaultTableModel model = new DefaultTableModel();
    
    public JDCliente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        try {
            initComponents();
            this.setLocationRelativeTo(null);
            
            // Configuración segura de la tabla
            model.setColumnIdentifiers(new String[]{"ID", "Apellido", "Nombre", "Dni", "Celular", "Dirección"});
            if (jtbCliente != null) {
                jtbCliente.setModel(model);
                this.CargarTCliente();
                this.FijarColumna();
            }
        } catch (Exception e) {
            System.err.println("Error al inicializar JDCliente: " + e.getMessage());
            JOptionPane.showMessageDialog(this, 
                "Error al cargar la interfaz: " + e.getMessage(),
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        }
    }
    //public class JDProducto extends javax.swing.JDialog {
    //private int idProducto;
    //Producto pro = new Producto();
    //Ctrl_Producto ct = new Ctrl_Producto();
    //DefaultTableModel model = new DefaultTableModel();

    //public JDProducto(java.awt.Frame parent, boolean modal) {
    //    super(parent, modal);
    //    initComponents();
    //    this.setLocationRelativeTo(null);
        
        // Configurar modelo de tabla sin columna 'modelo'
    //    model.setColumnIdentifiers(new String[]{"ID", "Marca", "Almacenamiento", "Color", "Precio", "Stock", "Descripción"});
    //    jtbProducto.setModel(model);
        
    //    this.CargarTProducto();
    //    this.FijarColumna();
    //}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtIdcliente = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbCliente = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/TELPERU.PNG"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de cliente");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtIdcliente.setBackground(new java.awt.Color(204, 204, 255));
        txtIdcliente.setEnabled(false);
        txtIdcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdclienteActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel10.setText("Apellido");

        txtApellido.setBackground(new java.awt.Color(204, 204, 255));
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel9.setText("Nombre");

        txtNombre.setBackground(new java.awt.Color(204, 204, 255));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel14.setText("DNI");

        txtDni.setBackground(new java.awt.Color(204, 204, 255));
        txtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniActionPerformed(evt);
            }
        });

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel16.setText("Celular");

        txtCelular.setBackground(new java.awt.Color(204, 204, 255));
        txtCelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCelularActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel15.setText("Dirección");

        txtDireccion.setBackground(new java.awt.Color(204, 204, 255));
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(0, 102, 255));
        btnGuardar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GuardarTodo.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnNuevo.setBackground(new java.awt.Color(0, 102, 255));
        btnNuevo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel2.setText("REGISTRAR USUARIO");

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabel19.setText("Buscar");

        txtBuscar.setBackground(new java.awt.Color(204, 204, 255));

        btnBuscar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borrar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel19)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnActualizar)))
                .addGap(16, 16, 16))
        );

        jtbCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Apellido", "Nombre", "DNI", "Celular", "Dirección"
            }
        ));
        jScrollPane2.setViewportView(jtbCliente);
        if (jtbCliente.getColumnModel().getColumnCount() > 0) {
            jtbCliente.getColumnModel().getColumn(0).setResizable(false);
            jtbCliente.getColumnModel().getColumn(0).setPreferredWidth(20);
            jtbCliente.getColumnModel().getColumn(1).setResizable(false);
            jtbCliente.getColumnModel().getColumn(1).setPreferredWidth(50);
            jtbCliente.getColumnModel().getColumn(2).setResizable(false);
            jtbCliente.getColumnModel().getColumn(2).setPreferredWidth(50);
            jtbCliente.getColumnModel().getColumn(3).setResizable(false);
            jtbCliente.getColumnModel().getColumn(3).setPreferredWidth(30);
            jtbCliente.getColumnModel().getColumn(4).setResizable(false);
            jtbCliente.getColumnModel().getColumn(4).setPreferredWidth(30);
            jtbCliente.getColumnModel().getColumn(5).setResizable(false);
            jtbCliente.getColumnModel().getColumn(5).setPreferredWidth(100);
        }

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/TELPERU.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDni)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtIdcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(244, 244, 244))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(txtIdcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        if (txtApellido.getText().equals("") || txtNombre.getText().equals("") || txtDni.getText().equals("") || txtCelular.getText().equals("") || txtDireccion.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
            txtApellido.setBackground(Color.RED);
            txtNombre.setBackground(Color.RED);
            txtDni.setBackground(Color.RED);
            txtCelular.setBackground(Color.RED);
            txtDireccion.setBackground(Color.RED);
        } else {
            try {
                cl.setApellido(txtApellido.getText().trim());
                cl.setNombre(txtNombre.getText().trim());
                cl.setDni(txtDni.getText().trim());
                cl.setCelular(txtCelular.getText().trim());
                cl.setDireccion(txtDireccion.getText().trim());

                if (ct.guardar(cl)) {
                    JOptionPane.showMessageDialog(null, "Cliente registrado");
                    this.CargarTCliente();
                    this.FijarColumna();
                    this.Limpiar();

                } else {
                    JOptionPane.showMessageDialog(null, "Error al guardar");
                }
            } catch (HeadlessException | NumberFormatException e) {
                System.out.println("Error en: " + e);
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (idCliente==0) {
    JOptionPane.showMessageDialog(this, "Seleccione un usuario de la tabla", "Advertencia", JOptionPane.WARNING_MESSAGE);
} else {
    int confirmacion = JOptionPane.showConfirmDialog(
        this, 
        "¿Está seguro de eliminar este producto?", 
        "Confirmar eliminación", 
        JOptionPane.YES_NO_OPTION
    );        
    if (confirmacion == JOptionPane.YES_OPTION) {
        if (ct.eliminar(idCliente)) {  // Si eliminar() devuelve true al tener éxito
            JOptionPane.showMessageDialog(this, "Cliente eliminado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            this.Limpiar();
            this.CargarTCliente();
            this.FijarColumna();
            idCliente = 0;  // Resetear el ID
        } else {
            JOptionPane.showMessageDialog(this, "Error al eliminar el cliente", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}    
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if ( txtApellido.getText().isEmpty() && txtNombre.getText().isEmpty() && txtDni.getText().isEmpty() && txtCelular.getText().isEmpty() && txtDireccion.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Complete todos los campos");
        } else {
            cl.setApellido(txtApellido.getText().trim());
            cl.setNombre(txtNombre.getText().trim());
            cl.setDni(txtDni.getText().trim());
            cl.setCelular(txtCelular.getText().trim());
            cl.setDireccion(txtDireccion.getText().trim());

            if (ct.actualizar(cl, idCliente)) {
                JOptionPane.showMessageDialog(null, "Datos del cliente actualizados");
                this.Limpiar();
                this.CargarTCliente();
                this.FijarColumna();
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar");
            }
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        txtApellido.setText("");
        txtNombre.setText("");
        txtDni.setText("");
        txtCelular.setText("");
        txtDireccion.setText("");
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        this.Buscar(txtBuscar.getText());
        this.FijarColumna();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        txtApellido.transferFocus();
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        txtNombre.transferFocus();
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniActionPerformed
        txtDni.transferFocus();
    }//GEN-LAST:event_txtDniActionPerformed

    private void txtCelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCelularActionPerformed
        txtCelular.transferFocus();
    }//GEN-LAST:event_txtCelularActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        txtDireccion.transferFocus();
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtIdclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdclienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdclienteActionPerformed

    public static void main(String args[]) {

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            JDCliente dialog = new JDCliente(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jtbCliente;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtIdcliente;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

    private void Limpiar() {
        txtIdcliente.setText("");
        txtApellido.setText("");
        txtNombre.setText("");
        txtDni.setText("");
        txtCelular.setText("");
        txtDireccion.setText("");
    }

    private void Buscar(String buscar) {
        try {
            DefaultTableModel model;
            model = ct.buscar(buscar);
            jtbCliente.setModel(model);
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }

    private void CargarTCliente() {
        model.setRowCount(0);
        model.setColumnCount(0);
        Connection cn = Conexion.conectar();
        String sql = "SELECT * FROM cliente";
        Statement st;

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            JDCliente.jtbCliente = new JTable(model);
            JDCliente.jScrollPane2.setViewportView(JDCliente.jtbCliente);

            model.addColumn("ID");
            model.addColumn("Apellido");
            model.addColumn("Nombre");
            model.addColumn("DNI");
            model.addColumn("Celular");
            model.addColumn("Dirección");

            while (rs.next()) {
                Object fila[] = new Object[6];
                for (int i = 0; i < 6; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla cliente" + e);
        }

        jtbCliente.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jtbCliente.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    idCliente = (int) model.getValueAt(fila_point, columna_point);
                    EnviarDatosClienteSelec(idCliente);
                }
            }
        });
    }

    private void EnviarDatosClienteSelec(int idCliente) {
        try {
              Connection cn = Conexion.conectar();
                String sql = "SELECT * FROM cliente WHERE idCliente = '" + idCliente + "'";
                PreparedStatement ps = cn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                
                if (rs.next()) {
                    txtIdcliente.setText(rs.getString("idCliente"));
                    txtApellido.setText(rs.getString("apellido"));
                    txtNombre.setText(rs.getString("nombre"));
                    txtDni.setText(rs.getString("dni"));
                    txtCelular.setText(rs.getString("celular"));
                    txtDireccion.setText(rs.getString("direccion"));
                }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al selecionar cliente " + e);
        }
    }
    
    //Tamaño del ancho de las columnas y filarlos
    private void FijarColumna() {
        jtbCliente.getColumnModel().getColumn(0).setPreferredWidth(20);
        jtbCliente.getColumnModel().getColumn(0).setResizable(false);
        jtbCliente.getColumnModel().getColumn(1).setPreferredWidth(40);
        jtbCliente.getColumnModel().getColumn(1).setResizable(false);
        jtbCliente.getColumnModel().getColumn(2).setPreferredWidth(40);
        jtbCliente.getColumnModel().getColumn(2).setResizable(false);
        jtbCliente.getColumnModel().getColumn(3).setPreferredWidth(30);
        jtbCliente.getColumnModel().getColumn(3).setResizable(false);
        jtbCliente.getColumnModel().getColumn(4).setPreferredWidth(30);
        jtbCliente.getColumnModel().getColumn(4).setResizable(false);
        jtbCliente.getColumnModel().getColumn(5).setPreferredWidth(90);
        jtbCliente.getColumnModel().getColumn(5).setResizable(false);
        
        jtbCliente.setRowHeight(20);
    }
}
