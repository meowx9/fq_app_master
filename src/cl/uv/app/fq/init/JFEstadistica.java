/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.uv.app.fq.init;

import cl.uv.app.fq.bo.MedicoBo;
import cl.uv.app.fq.bo.PacienteBo;
import cl.uv.app.fq.resource.ResourcesUtil;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author bnavarro
 */
public class JFEstadistica extends javax.swing.JFrame {

    private PacienteBo paciente;
    private MedicoBo medico;
    private List<String> meses = Arrays.asList("Seleccione Mes", "Enero", "Febrero", "Marzo");
    private List<String> anios = Arrays.asList("Seleccione Año", "2019");

    /**
     * Creates new form JFListarSesionesJuego
     *
     * @param paciente
     * @param medico
     */
    public JFEstadistica(PacienteBo paciente, MedicoBo medico) {
        initComponents();
        this.setLocationRelativeTo(null);

        this.paciente = paciente;
        this.medico = medico;
        String nombre = "Paciente: " + paciente.getNombre();
        System.out.println(nombre);
        lblNombrePaciente.setText(nombre);
    }

    private JFEstadistica() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        btnVolver = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblNombrePaciente = new javax.swing.JLabel();
        select1 = new javax.swing.JComboBox<>();
        select2 = new javax.swing.JComboBox<>();
        lblImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnVolver.setFont(new java.awt.Font("Arial Unicode MS", 0, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/uv/app/fq/resource/btns/botonvolver.png"))); // NOI18N
        btnVolver.setBorder(null);
        btnVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(194, 212, 93));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cl/uv/app/fq/resource/btns/estadistica.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblNombrePaciente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNombrePaciente.setForeground(new java.awt.Color(102, 102, 102));
        lblNombrePaciente.setText("Paciente: : :");

        select1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Día", "Semana", "Mes", "Año" }));
        select1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                select1ItemStateChanged(evt);
            }
        });
        select1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select1ActionPerformed(evt);
            }
        });

        select2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(select2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(select1, javax.swing.GroupLayout.Alignment.LEADING, 0, 134, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 474, Short.MAX_VALUE)
                                .addComponent(btnVolver))
                            .addComponent(lblImagen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(21, 21, 21))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(lblNombrePaciente)
                .addGap(18, 18, 18)
                .addComponent(select1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(select2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVolver)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        JFPerfilPaciente jf = new JFPerfilPaciente(paciente, medico);
        jf.setVisible(true);
        this.setVisible(false);
// TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

    private void select1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select1ActionPerformed
        select2.removeAllItems();

        if (select1.getSelectedItem() != null) {
            if (select1.getSelectedItem().toString().equals("Día")) {
                System.out.println("Seleccione Día");
                lblImagen.setIcon(null);

                for (String mes : meses) {
                    select2.addItem(mes);
                }
            }
            if (select1.getSelectedItem().toString().equals("Semana")) {
                System.out.println("Seleccione Semana");
                lblImagen.setIcon(null);

                for (String mes : meses) {
                    select2.addItem(mes);
                }
            }
            if (select1.getSelectedItem().toString().equals("Mes")) {
                System.out.println("Seleccione Mes");
                lblImagen.setIcon(null);

                for (String anio : anios) {
                    select2.addItem(anio);
                }
            }
            if (select1.getSelectedItem().toString().equals("Año")) {
                lblImagen.setIcon(null);

                System.out.println("Seleccione Año");
                select2.removeAllItems();
                select2.addItem("Seleccione");
                select2.addItem("-");

            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_select1ActionPerformed

    private void select2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select2ActionPerformed
        ResourcesUtil util = new ResourcesUtil();
        if (select2.getSelectedIndex() > 0) {

            if (select1.getSelectedItem().toString().equals("Día") && select1.getSelectedItem() != null) {
                if (select2.getSelectedItem().toString().equals("Enero")) {
                    lblImagen.setIcon(new ImageIcon(util.x1()));
                }
                if (select2.getSelectedItem().toString().equals("Febrero")) {
                    lblImagen.setIcon(new ImageIcon(util.x2()));
                }
                if (select2.getSelectedItem().toString().equals("Marzo")) {
                    lblImagen.setIcon(new ImageIcon(util.x3()));

                }

            }

            if (select1.getSelectedItem().toString().equals("Semana") && select1.getSelectedItem() != null) {
                if (select2.getSelectedItem().toString().equals("Enero")) {
                    lblImagen.setIcon(new ImageIcon(util.x4()));
                }
                if (select2.getSelectedItem().toString().equals("Febrero")) {
                    lblImagen.setIcon(new ImageIcon(util.x5()));
                }
                if (select2.getSelectedItem().toString().equals("Marzo")) {
                    lblImagen.setIcon(new ImageIcon(util.x6()));

                }

            }
            if (select1.getSelectedItem().toString().equals("Mes") && select1.getSelectedItem() != null) {
                if (select2.getSelectedItem().toString().equals("2019")) {
                    lblImagen.setIcon(new ImageIcon(util.x7()));
                }

            }
            if (select1.getSelectedItem().toString().equals("Año") && select1.getSelectedItem() != null) {
                if (select2.getSelectedItem().toString().equals("-")) {
                    lblImagen.setIcon(new ImageIcon(util.x8()));
                }

            }
        }


    }//GEN-LAST:event_select2ActionPerformed

    private void select1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_select1ItemStateChanged


    }//GEN-LAST:event_select1ItemStateChanged

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
            java.util.logging.Logger.getLogger(JFEstadistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFEstadistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFEstadistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFEstadistica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFEstadistica();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNombrePaciente;
    private javax.swing.JComboBox<String> select1;
    private javax.swing.JComboBox<String> select2;
    // End of variables declaration//GEN-END:variables
}
