/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.interfaz.calculadoraa;

public class Interfaz_calculadora extends javax.swing.JFrame {

    public Interfaz_calculadora() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantalla = new javax.swing.JTextField();
        num1 = new javax.swing.JButton();
        num2 = new javax.swing.JButton();
        num3 = new javax.swing.JButton();
        num4 = new javax.swing.JButton();
        num5 = new javax.swing.JButton();
        num6 = new javax.swing.JButton();
        num7 = new javax.swing.JButton();
        num8 = new javax.swing.JButton();
        num9 = new javax.swing.JButton();
        num0 = new javax.swing.JButton();
        suma = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        multiplicacion = new javax.swing.JButton();
        division = new javax.swing.JButton();
        igual = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        num1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        num1.setText("1");
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });

        num2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        num2.setText("2");
        num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2ActionPerformed(evt);
            }
        });

        num3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        num3.setText("3");
        num3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num3ActionPerformed(evt);
            }
        });

        num4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        num4.setText("4");
        num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num4ActionPerformed(evt);
            }
        });

        num5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        num5.setText("5");
        num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num5ActionPerformed(evt);
            }
        });

        num6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        num6.setText("6");
        num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num6ActionPerformed(evt);
            }
        });

        num7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        num7.setText("7");
        num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num7ActionPerformed(evt);
            }
        });

        num8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        num8.setText("8");
        num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num8ActionPerformed(evt);
            }
        });

        num9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        num9.setText("9");
        num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num9ActionPerformed(evt);
            }
        });

        num0.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        num0.setText("0");
        num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num0ActionPerformed(evt);
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

        igual.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(num7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(num1, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                                .addComponent(num4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(num0, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                            .addComponent(num2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(num5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(num8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(num3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(num6, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(num9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(division, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(suma, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resta, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(multiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(suma, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(resta, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(num6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(num7, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(num8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(num9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(multiplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(num0, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(igual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(division, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Declaracion de variables publicas de clase
    
    // Numero1 y numero2 seran las variables que guarden los numeros que ingrese
    // el usuario
    public int numero1 = 0;
    public int numero2 = 0;
    
    // Operacion sera la variable la cual resivira la operacion que desee hacer
    // el usuario
    public String operacion = "";
    
    // Multiplicacion
    private void multiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicacionActionPerformed
        // TODO add your handling code here:
        
        // Se extrae lo que haya en la pantalla cuando seleccione la operacion
        // multiplicacion
        String num1 = pantalla.getText();
        
        // numero1 la variable publica de clasa tendra el valor de lo que se
        // extrajo de la pantalla pero perseado a un entero ya que todo lo que
        // se devulve de una interdaz son cadenas de texto
        numero1 = Integer.parseInt(num1);
        
        // La variable publica operacion tendra el valor de multiplicar cuando
        // seleccione multiplicar, con el fin de poder saber que operacion 
        // escogio el usuario
        operacion = "*";
        
        // Se mostrara la pantalla vacia para que el usuario seleccione el 
        // siguiente numero 
        pantalla.setText("");
    }//GEN-LAST:event_multiplicacionActionPerformed

    // Boton numero 1
    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
        // TODO add your handling code here:
        
        // Cuando se de click al boton uno la variable numero extraera lo que
        // haya en pantalla
        String numero = pantalla.getText();
        
        // Dicha variable tendra el valor de la misma variable concatenada con
        // el numero 1 que fue el numero que selecciono, esto hara que cada que
        // oprime 1 se concatene con lo que ya haya en la pantalla
        numero = numero + "1";
        
        // Se muestra en la pantalla el nuevo numero ya concatenado 
        pantalla.setText(numero);
    }//GEN-LAST:event_num1ActionPerformed

    // Boton numero 2
    private void num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2ActionPerformed
        // TODO add your handling code here:
        
        // Cuando se de click al boton dos la variable numero extraera lo que
        // haya en pantalla
        String numero = pantalla.getText();
        
        // Dicha variable tendra el valor de la misma variable concatenada con
        // el numero 2 que fue el numero que selecciono, esto hara que cada que
        // oprima 2 se concatene con lo que ya haya en la pantalla
        numero = numero + "2";
        
        // Se muestra en la pantalla el nuevo numero ya concatenado 
        pantalla.setText(numero);
    }//GEN-LAST:event_num2ActionPerformed

    // Boton numero 3
    private void num3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num3ActionPerformed
        // TODO add your handling code here:
        
        // Cuando se de click al boton tres la variable numero extraera lo que
        // haya en pantalla
        String numero = pantalla.getText();
        
        // Dicha variable tendra el valor de la misma variable concatenada con
        // el numero 3 que fue el numero que selecciono, esto hara que cada que
        // oprima 3 se concatene con lo que ya haya en la pantalla
        numero = numero + "3";
        
        // Se muestra en la pantalla el nuevo numero ya concatenado 
        pantalla.setText(numero);
    }//GEN-LAST:event_num3ActionPerformed

    // Boton numero 4
    private void num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num4ActionPerformed
        // TODO add your handling code here:
        
        // Cuando se de click al boton cuatro la variable numero extraera lo que
        // haya en pantalla
        String numero = pantalla.getText();
        
        // Dicha variable tendra el valor de la misma variable concatenada con
        // el numero 4 que fue el numero que selecciono, esto hara que cada que
        // oprima 4 se concatene con lo que ya haya en la pantalla
        numero = numero + "4";
        
        // Se muestra en la pantalla el nuevo numero ya concatenado 
        pantalla.setText(numero);
    }//GEN-LAST:event_num4ActionPerformed

    // Boton numero 5
    private void num5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num5ActionPerformed
        // TODO add your handling code here:
        
        // Cuando se de click al boton cinco la variable numero extraera lo que
        // haya en pantalla
        String numero = pantalla.getText();
        
        // Dicha variable tendra el valor de la misma variable concatenada con
        // el numero 5 que fue el numero que selecciono, esto hara que cada que
        // oprima 5 se concatene con lo que ya haya en la pantalla
        numero = numero + "5";
        
        // Se muestra en la pantalla el nuevo numero ya concatenado 
        pantalla.setText(numero);
    }//GEN-LAST:event_num5ActionPerformed

    // Boton numero 6
    private void num6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num6ActionPerformed
        // TODO add your handling code here:
        
        // Cuando se de click al boton seis  la variable numero extraera lo que
        // haya en pantalla
        String numero = pantalla.getText();
        
        // Dicha variable tendra el valor de la misma variable concatenada con
        // el numero 6 que fue el numero que selecciono, esto hara que cada que
        // oprima 6 se concatene con lo que ya haya en la pantalla
        numero = numero + "6";
        
        // Se muestra en la pantalla el nuevo numero ya concatenado 
        pantalla.setText(numero);
    }//GEN-LAST:event_num6ActionPerformed

    // Boton 7
    private void num7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num7ActionPerformed
        // TODO add your handling code here:
        
        // Cuando se de click al boton siete  la variable numero extraera lo que
        // haya en pantalla
        String numero = pantalla.getText();
        
        // Dicha variable tendra el valor de la misma variable concatenada con
        // el numero 7 que fue el numero que selecciono, esto hara que cada que
        // oprima 7 se concatene con lo que ya haya en la pantalla
        numero = numero + "7";
        
        // Se muestra en la pantalla el nuevo numero ya concatenado 
        pantalla.setText(numero);
    }//GEN-LAST:event_num7ActionPerformed

    // Boton numero 8
    private void num8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num8ActionPerformed
        // TODO add your handling code here:
        
        // Cuando se de click al boton ocho  la variable numero extraera lo que
        // haya en pantalla
        String numero = pantalla.getText();
        
        // Dicha variable tendra el valor de la misma variable concatenada con
        // el numero 8 que fue el numero que selecciono, esto hara que cada que
        // oprima 8 se concatene con lo que ya haya en la pantalla
        numero = numero + "8";
        
        // Se muestra en la pantalla el nuevo numero ya concatenado 
        pantalla.setText(numero);
    }//GEN-LAST:event_num8ActionPerformed

    // Boton numero 9
    private void num9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num9ActionPerformed
        // TODO add your handling code here:
        
        // Cuando se de click al boton nueve la variable numero extraera lo que
        // haya en pantalla
        String numero = pantalla.getText();
        
        // Dicha variable tendra el valor de la misma variable concatenada con
        // el numero 9 que fue el numero que selecciono, esto hara que cada que
        // oprima 9 se concatene con lo que ya haya en la pantalla
        numero = numero + "9";
        
        // Se muestra en la pantalla el nuevo numero ya concatenado 
        pantalla.setText(numero);
    }//GEN-LAST:event_num9ActionPerformed

    // Boton 0
    private void num0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num0ActionPerformed
        // TODO add your handling code here:
        
        // Cuando se de click al boton cero la variable numero extraera lo que
        // haya en pantalla
        String numero = pantalla.getText();
        
        // Dicha variable tendra el valor de la misma variable concatenada con
        // el numero 0 que fue el numero que selecciono, esto hara que cada que
        // oprima 0 se concatene con lo que ya haya en la pantalla
        numero = numero + "0";
        
        // Se muestra en la pantalla el nuevo numero ya concatenado 
        pantalla.setText(numero);
    }//GEN-LAST:event_num0ActionPerformed
    
    // Suma
    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed
        // TODO add your handling code here:
        
        // Se extrae lo que haya en la pantalla cuando seleccione la operacion
        // suma desde el propio boton
        String num1 = pantalla.getText();
        
        // numero1 la variable publica de clases, tendra el valor de lo que se
        // extrajo de la pantalla pero perseado a un entero ya que todo lo que
        // se devulve de una interdaz son cadenas de texto
        numero1 = Integer.parseInt(num1);
        
        // La variable publica operacion tendra el valor del signo suma cuando
        // seleccione el boton sumar, con el fin de poder saber que operacion 
        // escogio el usuario
        operacion = "+";
        
        // Se mostrara la pantalla vacia para que el usuario seleccione el 
        // siguiente numero 
        pantalla.setText("");
        
    }//GEN-LAST:event_sumaActionPerformed

    // Resta
    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
        // TODO add your handling code here:
        
        // Se extrae lo que haya en la pantalla cuando seleccione la operacion
        // resta desde el propio boton
        String num1 = pantalla.getText();
        
        // numero1 la variable publica de clases, tendra el valor de lo que se
        // extrajo de la pantalla pero perseado a un entero ya que todo lo que
        // se devulve de una interdaz son cadenas de texto
        numero1 = Integer.parseInt(num1);
        
        // La variable publica operacion tendra el valor del signo resta cuando
        // seleccione el boton resta, con el fin de poder saber que operacion 
        // escogio el usuario
        operacion = "-";
        
        // Se mostrara la pantalla vacia para que el usuario seleccione el 
        // siguiente numero 
        pantalla.setText("");
        
    }//GEN-LAST:event_restaActionPerformed

    // Division
    private void divisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionActionPerformed
        // TODO add your handling code here:
        
        // Se extrae lo que haya en la pantalla cuando seleccione la operacion
        // dividir desde el propio boton
        String num1 = pantalla.getText();
        
        // numero1 la variable publica de clases, tendra el valor de lo que se
        // extrajo de la pantalla pero perseado a un entero ya que todo lo que
        // se devulve de una interdaz son cadenas de texto
        numero1 = Integer.parseInt(num1);
        
        // La variable publica operacion tendra el valor del signo dividir cuando
        // seleccione el boton division, con el fin de poder saber que operacion 
        // escogio el usuario
        operacion = "/";
        
        // Se mostrara la pantalla vacia para que el usuario seleccione el 
        // siguiente numero 
        pantalla.setText("");
        
    }//GEN-LAST:event_divisionActionPerformed

    // Boton igual - Boton que hace toda las operaciones
    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        // TODO add your handling code here:
        
        // La variable num2 extraera el segundo numero que ingreso el usuario en
        // pantalla, pues el numero1 se extrajo desde que escogio alguna operacion
        // para realizar
        String num2 = pantalla.getText();
        
        // La variable publica de clase numero2, sera igual al perseo de num2
        // que es la que contiene el numero convertido en cadena de texto
        numero2 = Integer.parseInt(num2);
      
        // Se realiza una condicional donde se evalua el valor de operacion,
        // recordemos que el valor de la operacion se asigna dependiendo del
        // boton que seleccione el usuario.
        // Despues de validar que operacion hacer, se asigna a una variable a
        // dicha operacion, esa variable se persea a un String para asignarselo
        // a otra y la variable que contiene el resultado ya perseado en tipo
        // de dato string se muestra en pantalla con set.text
        if (operacion == "+"){
            int resultado = numero1 + numero2;
            String result = Integer.toString(resultado);
            pantalla.setText(result);
        }else if (operacion == "-"){
            int resultado = numero1 - numero2;
            String result = Integer.toString(resultado);
            pantalla.setText(result);    
        }else if (operacion == "*"){
            int resultado = numero1 * numero2;
            String result = Integer.toString(resultado);
            pantalla.setText(result);
        }else if (operacion == "/"){
            int resultado = numero1 / numero2;
            String result = Integer.toString(resultado);
            pantalla.setText(result);
        }
        
    }//GEN-LAST:event_igualActionPerformed

    
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
            java.util.logging.Logger.getLogger(Interfaz_calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton division;
    private javax.swing.JButton igual;
    private javax.swing.JButton multiplicacion;
    private javax.swing.JButton num0;
    private javax.swing.JButton num1;
    private javax.swing.JButton num2;
    private javax.swing.JButton num3;
    private javax.swing.JButton num4;
    private javax.swing.JButton num5;
    private javax.swing.JButton num6;
    private javax.swing.JButton num7;
    private javax.swing.JButton num8;
    private javax.swing.JButton num9;
    private javax.swing.JTextField pantalla;
    private javax.swing.JButton resta;
    private javax.swing.JButton suma;
    // End of variables declaration//GEN-END:variables
}
