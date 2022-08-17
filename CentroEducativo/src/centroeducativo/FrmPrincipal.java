
package centroeducativo;

import javax.swing.JOptionPane;

/**
 *
 * @author PooGrupo#2
 */
public class FrmPrincipal extends javax.swing.JFrame {

    public FrmPrincipal() {
        initComponents();
        setLocationRelativeTo(this);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMAlumnos = new javax.swing.JMenu();
        jMAAgregar = new javax.swing.JMenuItem();
        jMAConsultar = new javax.swing.JMenuItem();
        jMAListar = new javax.swing.JMenuItem();
        jMDocentes = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMDListar = new javax.swing.JMenuItem();
        jMCursos = new javax.swing.JMenu();
        jMCAgregar = new javax.swing.JMenuItem();
        jMCListar = new javax.swing.JMenuItem();
        jMMatriculas = new javax.swing.JMenu();
        jMMAgregar = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("APLICACIÓN COLEGIO ADSI 1438222");
        setBackground(new java.awt.Color(204, 255, 204));
        setUndecorated(true);

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setForeground(new java.awt.Color(228, 90, 90));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/centroeducativo/LOGO IS 260P.png"))); // NOI18N
        jLabel1.setEnabled(false);

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuBar1.setMinimumSize(new java.awt.Dimension(0, 4));

        jMAlumnos.setText("Alumnos");
        jMAlumnos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMAAgregar.setText("Agregar");
        jMAAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAAgregarActionPerformed(evt);
            }
        });
        jMAlumnos.add(jMAAgregar);

        jMAConsultar.setText("Consultar");
        jMAConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAConsultarActionPerformed(evt);
            }
        });
        jMAlumnos.add(jMAConsultar);

        jMAListar.setText("Listar");
        jMAListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAListarActionPerformed(evt);
            }
        });
        jMAlumnos.add(jMAListar);

        jMenuBar1.add(jMAlumnos);

        jMDocentes.setText("Docentes");
        jMDocentes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem1.setText("Agregar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMDocentes.add(jMenuItem1);

        jMDListar.setText("Listar");
        jMDListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMDListarActionPerformed(evt);
            }
        });
        jMDocentes.add(jMDListar);

        jMenuBar1.add(jMDocentes);

        jMCursos.setText("Cursos");
        jMCursos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMCAgregar.setText("Agregar");
        jMCAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCAgregarActionPerformed(evt);
            }
        });
        jMCursos.add(jMCAgregar);

        jMCListar.setText("Listar");
        jMCListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCListarActionPerformed(evt);
            }
        });
        jMCursos.add(jMCListar);

        jMenuBar1.add(jMCursos);

        jMMatriculas.setText("Matriculas");
        jMMatriculas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMMAgregar.setText("Agregar");
        jMMAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMMAgregarActionPerformed(evt);
            }
        });
        jMMatriculas.add(jMMAgregar);

        jMenuBar1.add(jMMatriculas);

        jMenu1.setText("Cerrar");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMSalir.setText("Salir");
        jMSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSalirActionPerformed(evt);
            }
        });
        jMenu1.add(jMSalir);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMAAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAAgregarActionPerformed

        FrmAgregarAlumno frm = new FrmAgregarAlumno();
        frm.setVisible(true);
    }//GEN-LAST:event_jMAAgregarActionPerformed

    private void jMAListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAListarActionPerformed
        // TODO add your handling code here:
        FrmListarAlumnos frm = new FrmListarAlumnos();
        frm.setVisible(true);
    }//GEN-LAST:event_jMAListarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        FrmAgregarDocente frm = new FrmAgregarDocente();
        frm.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMCAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCAgregarActionPerformed
        // TODO add your handling code here:
        FrmAgregarCurso frm = new FrmAgregarCurso();
        frm.setVisible(true);
    }//GEN-LAST:event_jMCAgregarActionPerformed

    private void jMCListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCListarActionPerformed
        // TODO add your handling code here:
        FrmListarCursos frm = new FrmListarCursos();
        frm.setVisible(true);
    }//GEN-LAST:event_jMCListarActionPerformed

    private void jMDListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMDListarActionPerformed
        // TODO add your handling code here:
        FrmListarDocentes frm = new FrmListarDocentes();
        frm.setVisible(true);
    }//GEN-LAST:event_jMDListarActionPerformed

    private void jMAConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAConsultarActionPerformed
        // TODO add your handling code here:
        FrmConsultarAlumno frm = new FrmConsultarAlumno();
        frm.setVisible(true);
    }//GEN-LAST:event_jMAConsultarActionPerformed

    private void jMSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSalirActionPerformed
        // TODO add your handling code here:
     int confirmado = JOptionPane.showConfirmDialog(null, "Está seguro de Salir");
     if (JOptionPane.OK_OPTION==confirmado){
         System.exit(0);
     }
    }//GEN-LAST:event_jMSalirActionPerformed

    private void jMMAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMMAgregarActionPerformed
        // TODO add your handling code here:
        FrmMatriculas frm = new FrmMatriculas();
        frm.setVisible(true);
    }//GEN-LAST:event_jMMAgregarActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMAAgregar;
    private javax.swing.JMenuItem jMAConsultar;
    private javax.swing.JMenuItem jMAListar;
    private javax.swing.JMenu jMAlumnos;
    private javax.swing.JMenuItem jMCAgregar;
    private javax.swing.JMenuItem jMCListar;
    private javax.swing.JMenu jMCursos;
    private javax.swing.JMenuItem jMDListar;
    private javax.swing.JMenu jMDocentes;
    private javax.swing.JMenuItem jMMAgregar;
    private javax.swing.JMenu jMMatriculas;
    private javax.swing.JMenuItem jMSalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
