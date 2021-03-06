/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author 1379.joan23
 */
public class ViewProductos extends javax.swing.JFrame {

    /**
     * Creates new form ViewProductos
     */
    public ViewProductos() {
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

        jlProducto = new javax.swing.JLabel();
        jlNombre = new javax.swing.JLabel();
        jlEstoc_actual = new javax.swing.JLabel();
        jlEstoc_minimo = new javax.swing.JLabel();
        jlEstoc_maximo = new javax.swing.JLabel();
        jlPrecio = new javax.swing.JLabel();
        jlSerie = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jtEstoc_actual = new javax.swing.JTextField();
        jtEstoc_minimo = new javax.swing.JTextField();
        jtEstoc_maximo = new javax.swing.JTextField();
        jtPrecio = new javax.swing.JTextField();
        jcSerie = new javax.swing.JComboBox<>();
        jbGuardar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jcCategoria = new javax.swing.JComboBox<>();
        jlCategoria = new javax.swing.JLabel();
        jbEditar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jlProducto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlProducto.setText("Producto");

        jlNombre.setText("Nombre");

        jlEstoc_actual.setText("Estoc actual");

        jlEstoc_minimo.setText("Estoc_minimo");

        jlEstoc_maximo.setText("Estoc_maximo");

        jlPrecio.setText("Precio");

        jlSerie.setText("Serie");

        jtNombre.setEnabled(false);
        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });

        jtEstoc_actual.setEnabled(false);
        jtEstoc_actual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtEstoc_actualActionPerformed(evt);
            }
        });

        jtEstoc_minimo.setEnabled(false);

        jtEstoc_maximo.setEnabled(false);

        jtPrecio.setEnabled(false);

        jcSerie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas", "FUBBLA", "HEKTAR", "KVART", "KROBY", "RANARP" }));
        jcSerie.setEnabled(false);
        jcSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcSerieActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.setEnabled(false);
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbNuevo.setText("Nuevo");
        jbNuevo.setEnabled(false);
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.setEnabled(false);
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jcCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todas", "Lamparas", "Lamparas de mesa", "Lamparas de pie", "Lamparas de techo", "Iluminacion exterior", "Bombillas", "Ojos de buey" }));
        jcCategoria.setEnabled(false);

        jlCategoria.setText("Categoria");

        jbEditar.setText("Editar");
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jlSerie)
                    .addComponent(jlPrecio)
                    .addComponent(jlEstoc_maximo)
                    .addComponent(jlEstoc_minimo)
                    .addComponent(jlEstoc_actual)
                    .addComponent(jlNombre)
                    .addComponent(jlProducto))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtNombre)
                    .addComponent(jtEstoc_actual)
                    .addComponent(jtEstoc_minimo)
                    .addComponent(jtEstoc_maximo)
                    .addComponent(jtPrecio)
                    .addComponent(jcSerie, 0, 126, Short.MAX_VALUE))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlCategoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(jbSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(28, 28, 28)))
                        .addContainerGap(150, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jbEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbNuevo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jbEditar)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jbGuardar)
                                    .addComponent(jbSalir))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jbNuevo)
                                    .addComponent(jbEditar))
                                .addGap(38, 38, 38))
                            .addComponent(jbEliminar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlProducto)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlNombre)
                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlEstoc_actual)
                            .addComponent(jtEstoc_actual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlEstoc_minimo)
                            .addComponent(jtEstoc_minimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlEstoc_maximo)
                            .addComponent(jtEstoc_maximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPrecio)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlSerie)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jlCategoria)))
                .addContainerGap(189, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreActionPerformed

    private void jtEstoc_actualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtEstoc_actualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtEstoc_actualActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
        Limpiar();
        Deshabilitar();
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
        // Vaciamos los campos
        Limpiar();
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jcSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcSerieActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
         dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        // TODO add your handling code here:
        Habilitar();
        
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
        Deshabilitar();
    }//GEN-LAST:event_jbGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(ViewProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProductos().setVisible(true);
            }
        });
    }
//Mis Funciones
    //Funcion que vacia todas las cajas de Texto
   private void Limpiar(){
        this.jtNombre.setText("");
        this.jtEstoc_actual.setText("");
        this.jtEstoc_minimo.setText("");
        this.jtEstoc_maximo.setText("");
        this.jtPrecio.setText("");
        this.jcCategoria.setSelectedItem("Todas");
        this.jcSerie.setSelectedItem("Todas");
   }
   //Funcion para habilitar
   private void Habilitar(){
        this.jtNombre.setEnabled(true);
        this.jtEstoc_actual.setEnabled(true);
        this.jtEstoc_maximo.setEnabled(true);
        this.jtEstoc_minimo.setEnabled(true);
        this.jtPrecio.setEnabled(true);
        this.jbGuardar.setEnabled(true);
        this.jbEditar.setEnabled(true);
        this.jbEliminar.setEnabled(true);
        this.jbNuevo.setEnabled(true);
        this.jcCategoria.setEnabled(true);
        this.jcSerie.setEnabled(true);
   }
   //Funcion para deshabilitar
      private void Deshabilitar(){
        this.jtNombre.setEnabled(false);
        this.jtEstoc_actual.setEnabled(false);
        this.jtEstoc_maximo.setEnabled(false);
        this.jtEstoc_minimo.setEnabled(false);
        this.jtPrecio.setEnabled(false);
        this.jbGuardar.setEnabled(false);
        this.jbEliminar.setEnabled(false);
        this.jbNuevo.setEnabled(false);
        this.jcCategoria.setEnabled(false);
        this.jcSerie.setEnabled(false);
        
   }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcCategoria;
    private javax.swing.JComboBox<String> jcSerie;
    private javax.swing.JLabel jlCategoria;
    private javax.swing.JLabel jlEstoc_actual;
    private javax.swing.JLabel jlEstoc_maximo;
    private javax.swing.JLabel jlEstoc_minimo;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlPrecio;
    private javax.swing.JLabel jlProducto;
    private javax.swing.JLabel jlSerie;
    private javax.swing.JTextField jtEstoc_actual;
    private javax.swing.JTextField jtEstoc_maximo;
    private javax.swing.JTextField jtEstoc_minimo;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtPrecio;
    // End of variables declaration//GEN-END:variables
}
