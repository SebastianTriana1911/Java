/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.interfaz.calculadora;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        pantalla = new javax.swing.JTextPane();
        numero1 = new javax.swing.JButton();
        numero2 = new javax.swing.JButton();
        numero3 = new javax.swing.JButton();
        numero4 = new javax.swing.JButton();
        numero5 = new javax.swing.JButton();
        numero6 = new javax.swing.JButton();
        numero7 = new javax.swing.JButton();
        numero8 = new javax.swing.JButton();
        numero9 = new javax.swing.JButton();
        suma = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        multiplicacion = new javax.swing.JButton();
        division = new javax.swing.JButton();
        numero0 = new javax.swing.JButton();
        igual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(pantalla);

        numero1.setText("1");
        numero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero1ActionPerformed(evt);
            }
        });

        numero2.setText("2");
        numero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero2ActionPerformed(evt);
            }
        });

        numero3.setText("3");
        numero3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero3ActionPerformed(evt);
            }
        });

        numero4.setText("4");
        numero4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero4ActionPerformed(evt);
            }
        });

        numero5.setText("5");
        numero5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero5ActionPerformed(evt);
            }
        });

        numero6.setText("6");
        numero6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero6ActionPerformed(evt);
            }
        });

        numero7.setText("7");
        numero7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero7ActionPerformed(evt);
            }
        });

        numero8.setText("8");
        numero8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero8ActionPerformed(evt);
            }
        });

        numero9.setText("9");
        numero9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero9ActionPerformed(evt);
            }
        });

        suma.setText("+");
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });

        resta.setText("-");

        multiplicacion.setText("x");

        division.setText("/");

        numero0.setText("0");
        numero0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero0ActionPerformed(evt);
            }
        });

        igual.setText("=");
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(numero7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(numero1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numero4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(igual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numero2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(numero5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(numero8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(numero6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numero9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numero0, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(numero3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(division, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(suma, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                .addComponent(resta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(multiplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suma, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numero4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resta, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numero8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(numero9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(numero7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(division, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(numero0, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero1ActionPerformed
        // TODO add your handling code here:
        
        String numero1 = pantalla.getText();
        
        numero1 = numero1 + "1";
        
        pantalla.setText(numero1);
    }//GEN-LAST:event_numero1ActionPerformed

    private void numero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero2ActionPerformed
        // TODO add your handling code here:
        
        String numero2 = pantalla.getText();
        
        numero2 = numero2 + "2";
        
        pantalla.setText(numero2);
    }//GEN-LAST:event_numero2ActionPerformed

    private void numero6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero6ActionPerformed
        // TODO add your handling code here:
        
        String numero6 = pantalla.getText();
        
        numero6 = numero6 + "6";
        
        pantalla.setText(numero6);
    }//GEN-LAST:event_numero6ActionPerformed

    public int operacion = 0;
    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed
        // TODO add your handling code here:
         
        String valor1 = pantalla.getText();
        
        int valor2 = 0;
        
        valor2 = Integer.parseInt(valor1);
        
        pantalla.setText("");
        
        operacion = valor2;
        
    }//GEN-LAST:event_sumaActionPerformed

    private void numero3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero3ActionPerformed
        // TODO add your handling code here:
        
        String numero3 = pantalla.getText();
        
        numero3 = numero3 + "3";
        
        pantalla.setText(numero3);
    }//GEN-LAST:event_numero3ActionPerformed

    private void numero4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero4ActionPerformed
        // TODO add your handling code here:
        
        String numero4 = pantalla.getText();
        
        numero4 = numero4 + "4";
        
        pantalla.setText(numero4);
    }//GEN-LAST:event_numero4ActionPerformed

    private void numero5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero5ActionPerformed
        // TODO add your handling code here:
        
        String numero5 = pantalla.getText();
        
        numero5 = numero5 + "3";
        
        pantalla.setText(numero5);
    }//GEN-LAST:event_numero5ActionPerformed

    private void numero7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero7ActionPerformed
        // TODO add your handling code here:
        
        String numero7 = pantalla.getText();
        
        numero7 = numero7 + "7";
        
        pantalla.setText(numero7);
    }//GEN-LAST:event_numero7ActionPerformed

    private void numero8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero8ActionPerformed
        // TODO add your handling code here:
        
        String numero8 = pantalla.getText();
        
        numero8 = numero8 + "8";
        
        pantalla.setText(numero8);
    }//GEN-LAST:event_numero8ActionPerformed

    private void numero9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero9ActionPerformed
        // TODO add your handling code here:
        
        String numero9 = pantalla.getText();
        
        numero9 = numero9 + "9";
        
        pantalla.setText(numero9);
    }//GEN-LAST:event_numero9ActionPerformed

    private void numero0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero0ActionPerformed
        // TODO add your handling code here:
        
        String numero0 = pantalla.getText();
        
        numero0 = numero0 + "0";
        
        pantalla.setText(numero0);
    }//GEN-LAST:event_numero0ActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        // TODO add your handling code here:
           
        String variable = "";
        variable = pantalla.getText();
        
        int variable2 = Integer.parseInt(variable);
        
        pantalla.setText("");
        
        int resultado = operacion + variable2;
        
        String resultado_perseado = Integer.toString(resultado);
        pantalla.setText(resultado_perseado);
        
        
    }//GEN-LAST:event_igualActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton division;
    private javax.swing.JButton igual;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton multiplicacion;
    private javax.swing.JButton numero0;
    private javax.swing.JButton numero1;
    private javax.swing.JButton numero2;
    private javax.swing.JButton numero3;
    private javax.swing.JButton numero4;
    private javax.swing.JButton numero5;
    private javax.swing.JButton numero6;
    private javax.swing.JButton numero7;
    private javax.swing.JButton numero8;
    private javax.swing.JButton numero9;
    private javax.swing.JTextPane pantalla;
    private javax.swing.JButton resta;
    private javax.swing.JButton suma;
    // End of variables declaration//GEN-END:variables
}
