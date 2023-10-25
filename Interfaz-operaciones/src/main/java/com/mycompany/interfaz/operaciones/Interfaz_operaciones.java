/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.interfaz.operaciones;

public class Interfaz_operaciones extends javax.swing.JFrame {

    public Interfaz_operaciones() {
        initComponents();
        Interfaz_salarios abrir = new Interfaz_salarios ();
        abrir.setVisible(true);
        this.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        numero2 = new javax.swing.JTextField();
        numero1 = new javax.swing.JTextField();
        result = new javax.swing.JTextField();
        suma = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        multiplicacion = new javax.swing.JButton();
        division = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setText("OPERACIONES");

        numero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero2ActionPerformed(evt);
            }
        });

        numero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numero1ActionPerformed(evt);
            }
        });

        result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultActionPerformed(evt);
            }
        });

        suma.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        suma.setText("+");
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });

        resta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        resta.setText("-");
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
        });

        multiplicacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        multiplicacion.setText("x");
        multiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicacionActionPerformed(evt);
            }
        });

        division.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        division.setText("/");
        division.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingrese un numero");

        jLabel3.setText("Ingrese un numero");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(numero1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                                .addComponent(numero2, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(resta)
                                .addGap(33, 33, 33)
                                .addComponent(multiplicacion))
                            .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(suma))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(division)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(numero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(numero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(suma)
                    .addComponent(resta)
                    .addComponent(multiplicacion)
                    .addComponent(division))
                .addGap(18, 18, 18)
                .addComponent(eliminar)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void numero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero1ActionPerformed

    private void numero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numero2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numero2ActionPerformed

    private void resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultActionPerformed

    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed
        // TODO add your handling code here:
        
        // Declaracion de variables
        int numero_1 = 0;
        int numero_2 = 0;
        int resultado = 0;
        
        // A las variables que hacen referencia a los dos numeros se le asignan
        // la caja en la que van con el metodo getText para traer la informacion
        // que ingrese el usuario y se persea para que se convierta en un entero
        // en ese caso
        numero_1 = Integer.parseInt(numero1.getText());
        numero_2 = Integer.parseInt(numero2.getText());
        
        // A una variable se le asigna la suma de las dos variables
        resultado = numero_1 + numero_2;
        
        // Para observar el resultado de la suma en la caja correspondiente se
        // llama a la caja en la que se va mostrar el resultado seguido del
        // metodo setText para llamar la informacion de la variable. Esta 
        // variable debe ser concatenada con un string siempre la variable sea
        // de un tipo de dato diferente a un string
        result.setText(""+resultado);
    }//GEN-LAST:event_sumaActionPerformed

    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
        // TODO add your handling code here:
        
        // Declaracion de variables
        int numero_1 = 0;
        int numero_2 = 0;
        int resultado = 0;
        
        // A las variables que hacen referencia a los dos numeros se le asignan
        // la caja en la que van con el metodo getText para traer la informacion
        // que ingrese el usuario y se persea para que se convierta en un entero
        // en ese caso
        numero_1 = Integer.parseInt(numero1.getText());
        numero_2 = Integer.parseInt(numero2.getText());
        
        // A una variable se le asigna la suma de las dos variables
        resultado = numero_1 - numero_2;
        
        // Para observar el resultado de la suma en la caja correspondiente se
        // llama a la caja en la que se va mostrar el resultado seguido del
        // metodo setText para llamar la informacion de la variable. Esta 
        // variable debe ser concatenada con un string siempre la variable sea
        // de un tipo de dato diferente a un string
        result.setText(""+resultado);
       
    }//GEN-LAST:event_restaActionPerformed

    private void multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicacionActionPerformed
        // TODO add your handling code here:
        
        // Declaracion de variables
        int numero_1 = 0;
        int numero_2 = 0;
        int resultado = 0;
        
        // A las variables que hacen referencia a los dos numeros se le asignan
        // la caja en la que van con el metodo getText para traer la informacion
        // que ingrese el usuario y se persea para que se convierta en un entero
        // en ese caso
        numero_1 = Integer.parseInt(numero1.getText());
        numero_2 = Integer.parseInt(numero2.getText());
        
        // A una variable se le asigna la suma de las dos variables
        resultado = numero_1 * numero_2;
        
        // Para observar el resultado de la suma en la caja correspondiente se
        // llama a la caja en la que se va mostrar el resultado seguido del
        // metodo setText para llamar la informacion de la variable. Esta 
        // variable debe ser concatenada con un string siempre la variable sea
        // de un tipo de dato diferente a un string
        result.setText(""+resultado);
    }//GEN-LAST:event_multiplicacionActionPerformed

    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
        // TODO add your handling code here:
        
        // Declaracion de variables
        int numero_1 = 0;
        int numero_2 = 0;
        int resultado = 0;
        
        // A las variables que hacen referencia a los dos numeros se le asignan
        // la caja en la que van con el metodo getText para traer la informacion
        // que ingrese el usuario y se persea para que se convierta en un entero
        // en ese caso
        numero_1 = Integer.parseInt(numero1.getText());
        numero_2 = Integer.parseInt(numero2.getText());
        
        // A una variable se le asigna la suma de las dos variables
        resultado = numero_1 / numero_2;
        
        // Para observar el resultado de la suma en la caja correspondiente se
        // llama a la caja en la que se va mostrar el resultado seguido del
        // metodo setText para llamar la informacion de la variable. Esta 
        // variable debe ser concatenada con un string siempre la variable sea
        // de un tipo de dato diferente a un string
        result.setText(""+resultado);
    }//GEN-LAST:event_divisionActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        
        numero1.setText("");
        numero2.setText("");
        result.setText("");

    }//GEN-LAST:event_eliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz_operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_operaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_operaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton division;
    private javax.swing.JButton eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton multiplicacion;
    private javax.swing.JTextField numero1;
    private javax.swing.JTextField numero2;
    private javax.swing.JButton resta;
    private javax.swing.JTextField result;
    private javax.swing.JButton suma;
    // End of variables declaration//GEN-END:variables
}
