package relojtest;

import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Test extends javax.swing.JFrame {

    
    String num;
 
    public Test() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CB1 = new javax.swing.JCheckBox();
        CB2 = new javax.swing.JCheckBox();
        CB3 = new javax.swing.JCheckBox();
        CB4 = new javax.swing.JCheckBox();
        CB5 = new javax.swing.JCheckBox();
        CB6 = new javax.swing.JCheckBox();
        CB8 = new javax.swing.JCheckBox();
        CB10 = new javax.swing.JCheckBox();
        CB11 = new javax.swing.JCheckBox();
        CB9 = new javax.swing.JCheckBox();
        CB12 = new javax.swing.JCheckBox();
        CB13 = new javax.swing.JCheckBox();
        h = new javax.swing.JLabel();
        m = new javax.swing.JLabel();
        s = new javax.swing.JLabel();
        LBLT = new javax.swing.JLabel();
        LBLP1 = new javax.swing.JLabel();
        LBLP2 = new javax.swing.JLabel();
        CB7 = new javax.swing.JCheckBox();
        CB22 = new javax.swing.JCheckBox();
        CB17 = new javax.swing.JCheckBox();
        CB14 = new javax.swing.JCheckBox();
        CB19 = new javax.swing.JCheckBox();
        CB24 = new javax.swing.JCheckBox();
        CB15 = new javax.swing.JCheckBox();
        CB16 = new javax.swing.JCheckBox();
        CB18 = new javax.swing.JCheckBox();
        CB21 = new javax.swing.JCheckBox();
        CB23 = new javax.swing.JCheckBox();
        CB26 = new javax.swing.JCheckBox();
        CB25 = new javax.swing.JCheckBox();
        CBP1 = new javax.swing.JCheckBox();
        CBP2 = new javax.swing.JCheckBox();
        CBM1 = new javax.swing.JCheckBox();
        CBM4 = new javax.swing.JCheckBox();
        CBM6 = new javax.swing.JCheckBox();
        CBM9 = new javax.swing.JCheckBox();
        CBM11 = new javax.swing.JCheckBox();
        CBM2 = new javax.swing.JCheckBox();
        CBM3 = new javax.swing.JCheckBox();
        CBM5 = new javax.swing.JCheckBox();
        CBM8 = new javax.swing.JCheckBox();
        CBM10 = new javax.swing.JCheckBox();
        CBM13 = new javax.swing.JCheckBox();
        CBM12 = new javax.swing.JCheckBox();
        CBM7 = new javax.swing.JCheckBox();
        CB20 = new javax.swing.JCheckBox();
        CBM14 = new javax.swing.JCheckBox();
        CBM17 = new javax.swing.JCheckBox();
        CBM19 = new javax.swing.JCheckBox();
        CBM22 = new javax.swing.JCheckBox();
        CBM24 = new javax.swing.JCheckBox();
        CBM15 = new javax.swing.JCheckBox();
        CBM16 = new javax.swing.JCheckBox();
        CBM18 = new javax.swing.JCheckBox();
        CBM21 = new javax.swing.JCheckBox();
        CBM23 = new javax.swing.JCheckBox();
        CBM26 = new javax.swing.JCheckBox();
        CBM25 = new javax.swing.JCheckBox();
        CBP3 = new javax.swing.JCheckBox();
        CBP4 = new javax.swing.JCheckBox();
        CBS1 = new javax.swing.JCheckBox();
        CBS4 = new javax.swing.JCheckBox();
        CBS6 = new javax.swing.JCheckBox();
        CBS9 = new javax.swing.JCheckBox();
        CBS11 = new javax.swing.JCheckBox();
        CBS2 = new javax.swing.JCheckBox();
        CBS3 = new javax.swing.JCheckBox();
        CBS5 = new javax.swing.JCheckBox();
        CBS8 = new javax.swing.JCheckBox();
        CBS17 = new javax.swing.JCheckBox();
        CBS13 = new javax.swing.JCheckBox();
        CBS12 = new javax.swing.JCheckBox();
        CBS14 = new javax.swing.JCheckBox();
        CBS10 = new javax.swing.JCheckBox();
        CBM20 = new javax.swing.JCheckBox();
        CBS19 = new javax.swing.JCheckBox();
        CBS22 = new javax.swing.JCheckBox();
        CBS24 = new javax.swing.JCheckBox();
        CBS15 = new javax.swing.JCheckBox();
        CBS16 = new javax.swing.JCheckBox();
        CBS18 = new javax.swing.JCheckBox();
        CBS21 = new javax.swing.JCheckBox();
        CBS23 = new javax.swing.JCheckBox();
        CBS26 = new javax.swing.JCheckBox();
        CBS25 = new javax.swing.JCheckBox();
        CBS20 = new javax.swing.JCheckBox();
        CBS7 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reloj Digital - CheckBox");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        h.setText("00");

        m.setText("00");

        s.setText("00");

        LBLT.setText("Hora:");

        LBLP1.setText(":");

        LBLP2.setText(":");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CB11)
                            .addComponent(CB6)
                            .addComponent(CB4)
                            .addComponent(CB1)
                            .addComponent(CB9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CB2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CB3))
                            .addComponent(CB5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CB7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CB8))
                            .addComponent(CB10)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CB12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CB13, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CB22)
                            .addComponent(CB17)
                            .addComponent(CB14)
                            .addComponent(CB19)
                            .addComponent(CB24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CB15)
                            .addComponent(CB20)
                            .addComponent(CB25, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CB21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CBM6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CB16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CBM1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CB18)
                                        .addGap(18, 18, 18)
                                        .addComponent(CBP1)
                                        .addGap(18, 18, 18)
                                        .addComponent(CBM4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CBM2)
                                    .addComponent(CBM7, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CB23)
                                        .addGap(18, 18, 18)
                                        .addComponent(CBP2))
                                    .addComponent(CB26))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CBM11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(CBM12))
                                    .addComponent(CBM9))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CBM3)
                                .addGap(5, 5, 5)
                                .addComponent(CBM14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CBM15))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CBM5)
                                .addGap(5, 5, 5)
                                .addComponent(CBM17))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CBM8)
                                .addGap(5, 5, 5)
                                .addComponent(CBM19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CBM20))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CBM10)
                                .addGap(5, 5, 5)
                                .addComponent(CBM22))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CBM13)
                                .addGap(5, 5, 5)
                                .addComponent(CBM24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CBM25)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CBM16)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CBM18)
                                .addGap(18, 18, 18)
                                .addComponent(CBP3))
                            .addComponent(CBM21)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CBM23)
                                .addGap(18, 18, 18)
                                .addComponent(CBP4))
                            .addComponent(CBM26))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CBS1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CBS2))
                            .addComponent(CBS4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CBS6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CBS7))
                            .addComponent(CBS9)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CBS11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CBS12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CBS13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CBS24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CBS25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CBS26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(CBS10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CBS22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CBS23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(CBS8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CBS19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CBS20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CBS21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(CBS5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CBS17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CBS18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(CBS3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CBS14, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CBS15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CBS16))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(h)
                        .addGap(2, 2, 2)
                        .addComponent(LBLP1)
                        .addGap(3, 3, 3)
                        .addComponent(m)
                        .addGap(2, 2, 2)
                        .addComponent(LBLP2)
                        .addGap(2, 2, 2)
                        .addComponent(s))
                    .addComponent(LBLT))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CB3)
                                        .addComponent(CB2)
                                        .addComponent(CB1)
                                        .addComponent(CB14)
                                        .addComponent(CB15)
                                        .addComponent(CB16))
                                    .addComponent(CBM1)
                                    .addComponent(CBM2)
                                    .addComponent(CBM3)
                                    .addComponent(CBM14)
                                    .addComponent(CBM15)
                                    .addComponent(CBM16)
                                    .addComponent(CBS1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CBS2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CBS3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CBS14, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CBS15, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CBS16, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(CB4)
                                                            .addComponent(CB5)
                                                            .addComponent(CB17))
                                                        .addComponent(CBM4, javax.swing.GroupLayout.Alignment.TRAILING))
                                                    .addComponent(CBM5)
                                                    .addComponent(CBM17)
                                                    .addComponent(CBM18))
                                                .addComponent(CBS4, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addComponent(CBS5))
                                        .addComponent(CBS17))
                                    .addComponent(CBS18)))
                            .addComponent(CB18)
                            .addComponent(CBP1)
                            .addComponent(CBP3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CB21)
                                    .addComponent(CB6)
                                    .addComponent(CB8)
                                    .addComponent(CB7)
                                    .addComponent(CB19)
                                    .addComponent(CBM6)
                                    .addComponent(CBM8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CBM7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CBM19, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CBM21, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CBS6)
                                    .addComponent(CBS8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CBS19, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CBS21, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CBS20, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CBS7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CBM20, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CB10)
                                            .addComponent(CB9)
                                            .addComponent(CB22))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CB11)
                                            .addComponent(CB12)
                                            .addComponent(CB13, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CB23)
                                            .addComponent(CBP2)
                                            .addComponent(CBM9)
                                            .addComponent(CBM10, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(CBM22, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(CBM23)
                                            .addComponent(CBP4)
                                            .addComponent(CBS9, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(CBS10, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(CBS22, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(CBS23, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(CB26))
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(CBM11)
                                                                                .addComponent(CBM13, javax.swing.GroupLayout.Alignment.TRAILING))
                                                                            .addComponent(CBM24, javax.swing.GroupLayout.Alignment.TRAILING))
                                                                        .addComponent(CBM26, javax.swing.GroupLayout.Alignment.TRAILING))
                                                                    .addComponent(CBS11, javax.swing.GroupLayout.Alignment.TRAILING))
                                                                .addComponent(CBS13, javax.swing.GroupLayout.Alignment.TRAILING))
                                                            .addComponent(CBS24, javax.swing.GroupLayout.Alignment.TRAILING))
                                                        .addComponent(CBS26, javax.swing.GroupLayout.Alignment.TRAILING))
                                                    .addComponent(CBS25, javax.swing.GroupLayout.Alignment.TRAILING)))))
                                    .addComponent(CBM12, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CBM25, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CBS12, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(CB20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CB25)
                            .addComponent(CB24))
                        .addGap(39, 39, 39)))
                .addComponent(LBLT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(h)
                    .addComponent(m)
                    .addComponent(s)
                    .addComponent(LBLP1)
                    .addComponent(LBLP2))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        timer = new Timer(1000, new cronometro());
        timer.start();
    }//GEN-LAST:event_formWindowOpened

    public class cronometro implements ActionListener{
      
      @Override
      public void actionPerformed(ActionEvent evt){
      
          GregorianCalendar tiempo = new GregorianCalendar();
          
          int hora, minutos, segundos;
          
          hora=tiempo.get(Calendar.HOUR);
          minutos=tiempo.get(Calendar.MINUTE);
          segundos=tiempo.get(Calendar.SECOND);
         
          h.setText(String.valueOf(hora));
          m.setText(String.valueOf(minutos));
          s.setText(String.valueOf(segundos));
         
          String valorh,valorm, valors;
          
          valorh= h.getText();
          valorm= m.getText();
          valors= s.getText();
        
 //**************************HORAS************************//       

 //Numero 00//--------------------------------------------/
        if (!"00".equals(valorh)){
        } else {
        //Numero 1//    
        CB1.setSelected(true);  CB1.setVisible(true);
        CB2.setSelected(true);  CB2.setVisible(true);
        CB3.setSelected(true);  CB3.setVisible(true);
        CB4.setSelected(true);  CB4.setVisible(true);
        CB5.setSelected(true);  CB5.setVisible(true);
        CB6.setSelected(true);  CB6.setVisible(true);
        CB7.setSelected(false);  CB7.setVisible(false);
        CB8.setSelected(true);  CB8.setVisible(true);
        CB9.setSelected(true);  CB9.setVisible(true);
        CB10.setSelected(true); CB10.setVisible(true);
        CB11.setSelected(true); CB11.setVisible(true);
        CB12.setSelected(true); CB12.setVisible(true);
        CB13.setSelected(true); CB13.setVisible(true);
        //Numero 0//    
        CB14.setSelected(true); CB14.setVisible(true);
        CB15.setSelected(true); CB15.setVisible(true);
        CB16.setSelected(true); CB16.setVisible(true);
        CB17.setSelected(true); CB17.setVisible(true);
        CB18.setSelected(true); CB18.setVisible(true);
        CB19.setSelected(true); CB19.setVisible(true); 
        CB20.setSelected(false); CB20.setVisible(false);
        CB21.setSelected(true); CB21.setVisible(true);
        CB22.setSelected(true); CB22.setVisible(true);
        CB23.setSelected(true); CB23.setVisible(true);
        CB24.setSelected(true); CB24.setVisible(true);
        CB25.setSelected(true); CB25.setVisible(true); 
        CB26.setSelected(true); CB26.setVisible(true);
        }    
 //Numero 0//--------------------------------------------/
        if (!"0".equals(valorh)){
        } else {
        //Numero 1//    
        CB1.setSelected(true);  CB1.setVisible(false);
        CB2.setSelected(true);  CB2.setVisible(false);
        CB3.setSelected(true);  CB3.setVisible(false);
        CB4.setSelected(true);  CB4.setVisible(false);
        CB5.setSelected(true);  CB5.setVisible(false);
        CB6.setSelected(true);  CB6.setVisible(false);
        CB7.setSelected(false);  CB7.setVisible(false);
        CB8.setSelected(true);  CB8.setVisible(false);
        CB9.setSelected(true);  CB9.setVisible(false);
        CB10.setSelected(true); CB10.setVisible(false);
        CB11.setSelected(true); CB11.setVisible(false);
        CB12.setSelected(true); CB12.setVisible(false);
        CB13.setSelected(true); CB13.setVisible(false);
        //Numero 0//    
        CB14.setSelected(true); CB14.setVisible(true);
        CB15.setSelected(true); CB15.setVisible(true);
        CB16.setSelected(true); CB16.setVisible(true);
        CB17.setSelected(true); CB17.setVisible(true);
        CB18.setSelected(true); CB18.setVisible(true);
        CB19.setSelected(true); CB19.setVisible(true); 
        CB20.setSelected(false); CB20.setVisible(false);
        CB21.setSelected(true); CB21.setVisible(true);
        CB22.setSelected(true); CB22.setVisible(true);
        CB23.setSelected(true); CB23.setVisible(true);
        CB24.setSelected(true); CB24.setVisible(true);
        CB25.setSelected(true); CB25.setVisible(true); 
        CB26.setSelected(true); CB26.setVisible(true);
        }    
 //Numero 1//--------------------------------------------/
        if (!"1".equals(valorh)){
        } else {
        //Numero 1//    
        CB1.setSelected(false);  CB1.setVisible(false);
        CB2.setSelected(false);  CB2.setVisible(false);
        CB3.setSelected(true);   CB3.setVisible(true);
        CB4.setSelected(false);  CB4.setVisible(false);
        CB5.setSelected(true);   CB5.setVisible(true);
        CB6.setSelected(false);  CB6.setVisible(false);
        CB7.setSelected(false);  CB7.setVisible(false);
        CB8.setSelected(true);   CB8.setVisible(true);
        CB9.setSelected(false);  CB9.setVisible(false);
        CB10.setSelected(true);  CB10.setVisible(true);
        CB11.setSelected(false); CB11.setVisible(false);
        CB12.setSelected(false); CB12.setVisible(false);
        CB13.setSelected(true);  CB13.setVisible(true);
        //Numero 0//    
        CB14.setSelected(false); CB14.setVisible(false);
        CB15.setSelected(false); CB15.setVisible(false);
        CB16.setSelected(false); CB16.setVisible(false);
        CB17.setSelected(false); CB17.setVisible(false);
        CB18.setSelected(false); CB18.setVisible(false);
        CB19.setSelected(false); CB19.setVisible(false); 
        CB20.setSelected(false); CB20.setVisible(false);
        CB21.setSelected(false); CB21.setVisible(false);
        CB22.setSelected(false); CB22.setVisible(false);
        CB23.setSelected(false); CB23.setVisible(false);
        CB24.setSelected(false); CB24.setVisible(false);
        CB25.setSelected(false); CB25.setVisible(false); 
        CB26.setSelected(false); CB26.setVisible(false);
        }      
//Numero 2//--------------------------------------------------/
        if (!"2".equals(valorh)){
        } else {
        //Numero 2//    
        CB1.setSelected(true);   CB1.setVisible(true);
        CB2.setSelected(true);   CB2.setVisible(true);
        CB3.setSelected(true);   CB3.setVisible(true);
        CB4.setSelected(false);  CB4.setVisible(false);
        CB5.setSelected(true);   CB5.setVisible(true);
        CB6.setSelected(true);   CB6.setVisible(true);
        CB7.setSelected(true);   CB7.setVisible(true);
        CB8.setSelected(true);   CB8.setVisible(true);
        CB9.setSelected(true);   CB9.setVisible(true);
        CB10.setSelected(false); CB10.setVisible(false);
        CB11.setSelected(true);  CB11.setVisible(true);
        CB12.setSelected(true);  CB12.setVisible(true);
        CB13.setSelected(true);  CB13.setVisible(true);
        //Numero 0//    
        CB14.setSelected(false); CB14.setVisible(false);
        CB15.setSelected(false); CB15.setVisible(false);
        CB16.setSelected(false); CB16.setVisible(false);
        CB17.setSelected(false); CB17.setVisible(false);
        CB18.setSelected(false); CB18.setVisible(false);
        CB19.setSelected(false); CB19.setVisible(false); 
        CB20.setSelected(false); CB20.setVisible(false);
        CB21.setSelected(false); CB21.setVisible(false);
        CB22.setSelected(false); CB22.setVisible(false);
        CB23.setSelected(false); CB23.setVisible(false);
        CB24.setSelected(false); CB24.setVisible(false);
        CB25.setSelected(false); CB25.setVisible(false); 
        CB26.setSelected(false); CB26.setVisible(false);
        }
//Numero 3//--------------------------------------------------/
        if (!"3".equals(valorh)){
        } else {
        //Numero 3//    
        CB1.setSelected(true);   CB1.setVisible(true);
        CB2.setSelected(true);   CB2.setVisible(true);
        CB3.setSelected(true);   CB3.setVisible(true);
        CB4.setSelected(false);  CB4.setVisible(false);
        CB5.setSelected(true);   CB5.setVisible(true);
        CB6.setSelected(true);   CB6.setVisible(true);
        CB7.setSelected(true);   CB7.setVisible(true);
        CB8.setSelected(true);   CB8.setVisible(true);
        CB9.setSelected(false);  CB9.setVisible(false);
        CB10.setSelected(true);  CB10.setVisible(true);
        CB11.setSelected(true);  CB11.setVisible(true);
        CB12.setSelected(true);  CB12.setVisible(true);
        CB13.setSelected(true);  CB13.setVisible(true);
        //Numero 0//    
        CB14.setSelected(false); CB14.setVisible(false);
        CB15.setSelected(false); CB15.setVisible(false);
        CB16.setSelected(false); CB16.setVisible(false);
        CB17.setSelected(false); CB17.setVisible(false);
        CB18.setSelected(false); CB18.setVisible(false);
        CB19.setSelected(false); CB19.setVisible(false); 
        CB20.setSelected(false); CB20.setVisible(false);
        CB21.setSelected(false); CB21.setVisible(false);
        CB22.setSelected(false); CB22.setVisible(false);
        CB23.setSelected(false); CB23.setVisible(false);
        CB24.setSelected(false); CB24.setVisible(false);
        CB25.setSelected(false); CB25.setVisible(false); 
        CB26.setSelected(false); CB26.setVisible(false);
        }              
//Numero 4//--------------------------------------------------/
        if (!"4".equals(valorh)){
        } else {
        //Numero 4//    
        CB1.setSelected(true);   CB1.setVisible(true);
        CB2.setSelected(false);   CB2.setVisible(false);
        CB3.setSelected(true);   CB3.setVisible(true);
        CB4.setSelected(true);  CB4.setVisible(true);
        CB5.setSelected(true);   CB5.setVisible(true);
        CB6.setSelected(true);   CB6.setVisible(true);
        CB7.setSelected(true);   CB7.setVisible(true);
        CB8.setSelected(true);   CB8.setVisible(true);
        CB9.setSelected(false);   CB9.setVisible(false);
        CB10.setSelected(true); CB10.setVisible(true);
        CB11.setSelected(false);  CB11.setVisible(false);
        CB12.setSelected(false);  CB12.setVisible(false);
        CB13.setSelected(true);  CB13.setVisible(true);
        //Numero 0//    
        CB14.setSelected(false); CB14.setVisible(false);
        CB15.setSelected(false); CB15.setVisible(false);
        CB16.setSelected(false); CB16.setVisible(false);
        CB17.setSelected(false); CB17.setVisible(false);
        CB18.setSelected(false); CB18.setVisible(false);
        CB19.setSelected(false); CB19.setVisible(false); 
        CB20.setSelected(false); CB20.setVisible(false);
        CB21.setSelected(false); CB21.setVisible(false);
        CB22.setSelected(false); CB22.setVisible(false);
        CB23.setSelected(false); CB23.setVisible(false);
        CB24.setSelected(false); CB24.setVisible(false);
        CB25.setSelected(false); CB25.setVisible(false); 
        CB26.setSelected(false); CB26.setVisible(false);
        }      
//Numero 5//--------------------------------------------------/
        if (!"5".equals(valorh)){
        } else {
        //Numero 2//    
        CB1.setSelected(true);   CB1.setVisible(true);
        CB2.setSelected(true);   CB2.setVisible(true);
        CB3.setSelected(true);   CB3.setVisible(true);
        CB4.setSelected(true);   CB4.setVisible(true);
        CB5.setSelected(false);  CB5.setVisible(false);
        CB6.setSelected(true);   CB6.setVisible(true);
        CB7.setSelected(true);   CB7.setVisible(true);
        CB8.setSelected(true);   CB8.setVisible(true);
        CB9.setSelected(false);  CB9.setVisible(false);
        CB10.setSelected(true);  CB10.setVisible(true);
        CB11.setSelected(true);  CB11.setVisible(true);
        CB12.setSelected(true);  CB12.setVisible(true);
        CB13.setSelected(true);  CB13.setVisible(true);
        //Numero 0//    
        CB14.setSelected(false); CB14.setVisible(false);
        CB15.setSelected(false); CB15.setVisible(false);
        CB16.setSelected(false); CB16.setVisible(false);
        CB17.setSelected(false); CB17.setVisible(false);
        CB18.setSelected(false); CB18.setVisible(false);
        CB19.setSelected(false); CB19.setVisible(false); 
        CB20.setSelected(false); CB20.setVisible(false);
        CB21.setSelected(false); CB21.setVisible(false);
        CB22.setSelected(false); CB22.setVisible(false);
        CB23.setSelected(false); CB23.setVisible(false);
        CB24.setSelected(false); CB24.setVisible(false);
        CB25.setSelected(false); CB25.setVisible(false); 
        CB26.setSelected(false); CB26.setVisible(false);
        }
//Numero 6//--------------------------------------------------/
        if (!"6".equals(valorh)){
        } else {
        //Numero 2//    
        CB1.setSelected(true);   CB1.setVisible(true);
        CB2.setSelected(false);  CB2.setVisible(false);
        CB3.setSelected(false);  CB3.setVisible(false);
        CB4.setSelected(true);   CB4.setVisible(true);
        CB5.setSelected(false);  CB5.setVisible(false);
        CB6.setSelected(true);   CB6.setVisible(true);
        CB7.setSelected(true);   CB7.setVisible(true);
        CB8.setSelected(true);   CB8.setVisible(true);
        CB9.setSelected(true);   CB9.setVisible(true);
        CB10.setSelected(true);  CB10.setVisible(true);
        CB11.setSelected(true);  CB11.setVisible(true);
        CB12.setSelected(true);  CB12.setVisible(true);
        CB13.setSelected(true);  CB13.setVisible(true);
        //Numero 0//    
        CB14.setSelected(false); CB14.setVisible(false);
        CB15.setSelected(false); CB15.setVisible(false);
        CB16.setSelected(false); CB16.setVisible(false);
        CB17.setSelected(false); CB17.setVisible(false);
        CB18.setSelected(false); CB18.setVisible(false);
        CB19.setSelected(false); CB19.setVisible(false); 
        CB20.setSelected(false); CB20.setVisible(false);
        CB21.setSelected(false); CB21.setVisible(false);
        CB22.setSelected(false); CB22.setVisible(false);
        CB23.setSelected(false); CB23.setVisible(false);
        CB24.setSelected(false); CB24.setVisible(false);
        CB25.setSelected(false); CB25.setVisible(false); 
        CB26.setSelected(false); CB26.setVisible(false);
        }
//Numero 7//--------------------------------------------------/
        if (!"7".equals(valorh)){
        } else {
        //Numero 2//    
        CB1.setSelected(true);   CB1.setVisible(true);
        CB2.setSelected(true);   CB2.setVisible(true);
        CB3.setSelected(true);   CB3.setVisible(true);
        CB4.setSelected(false);  CB4.setVisible(false);
        CB5.setSelected(true);   CB5.setVisible(true);
        CB6.setSelected(false);  CB6.setVisible(false);
        CB7.setSelected(true);   CB7.setVisible(true);
        CB8.setSelected(true);   CB8.setVisible(true);
        CB9.setSelected(false);  CB9.setVisible(false);
        CB10.setSelected(true);  CB10.setVisible(true);
        CB11.setSelected(false); CB11.setVisible(false);
        CB12.setSelected(false); CB12.setVisible(false);
        CB13.setSelected(true);  CB13.setVisible(true);
        //Numero 0//    
        CB14.setSelected(false); CB14.setVisible(false);
        CB15.setSelected(false); CB15.setVisible(false);
        CB16.setSelected(false); CB16.setVisible(false);
        CB17.setSelected(false); CB17.setVisible(false);
        CB18.setSelected(false); CB18.setVisible(false);
        CB19.setSelected(false); CB19.setVisible(false); 
        CB20.setSelected(false); CB20.setVisible(false);
        CB21.setSelected(false); CB21.setVisible(false);
        CB22.setSelected(false); CB22.setVisible(false);
        CB23.setSelected(false); CB23.setVisible(false);
        CB24.setSelected(false); CB24.setVisible(false);
        CB25.setSelected(false); CB25.setVisible(false); 
        CB26.setSelected(false); CB26.setVisible(false);
        }  
//Numero 8//--------------------------------------------------/
        if (!"8".equals(valorh)){
        } else {
        //Numero 2//    
        CB1.setSelected(true);   CB1.setVisible(true);
        CB2.setSelected(true);   CB2.setVisible(true);
        CB3.setSelected(true);   CB3.setVisible(true);
        CB4.setSelected(true);  CB4.setVisible(true);
        CB5.setSelected(true);   CB5.setVisible(true);
        CB6.setSelected(true);   CB6.setVisible(true);
        CB7.setSelected(true);   CB7.setVisible(true);
        CB8.setSelected(true);   CB8.setVisible(true);
        CB9.setSelected(true);   CB9.setVisible(true);
        CB10.setSelected(true); CB10.setVisible(true);
        CB11.setSelected(true);  CB11.setVisible(true);
        CB12.setSelected(true);  CB12.setVisible(true);
        CB13.setSelected(true);  CB13.setVisible(true);
        //Numero 0//    
        CB14.setSelected(false); CB14.setVisible(false);
        CB15.setSelected(false); CB15.setVisible(false);
        CB16.setSelected(false); CB16.setVisible(false);
        CB17.setSelected(false); CB17.setVisible(false);
        CB18.setSelected(false); CB18.setVisible(false);
        CB19.setSelected(false); CB19.setVisible(false); 
        CB20.setSelected(false); CB20.setVisible(false);
        CB21.setSelected(false); CB21.setVisible(false);
        CB22.setSelected(false); CB22.setVisible(false);
        CB23.setSelected(false); CB23.setVisible(false);
        CB24.setSelected(false); CB24.setVisible(false);
        CB25.setSelected(false); CB25.setVisible(false); 
        CB26.setSelected(false); CB26.setVisible(false);
        }
//Numero 9//--------------------------------------------------/
        if (!"9".equals(valorh)){
        } else {
        //Numero 2//    
        CB1.setSelected(true);   CB1.setVisible(true);
        CB2.setSelected(true);   CB2.setVisible(true);
        CB3.setSelected(true);   CB3.setVisible(true);
        CB4.setSelected(true);   CB4.setVisible(true);
        CB5.setSelected(true);   CB5.setVisible(true);
        CB6.setSelected(true);   CB6.setVisible(true);
        CB7.setSelected(true);   CB7.setVisible(true);
        CB8.setSelected(true);   CB8.setVisible(true);
        CB9.setSelected(false);   CB9.setVisible(false);
        CB10.setSelected(true); CB10.setVisible(true);
        CB11.setSelected(true);  CB11.setVisible(true);
        CB12.setSelected(true);  CB12.setVisible(true);
        CB13.setSelected(true);  CB13.setVisible(true);
        //Numero 0//    
        CB14.setSelected(false); CB14.setVisible(false);
        CB15.setSelected(false); CB15.setVisible(false);
        CB16.setSelected(false); CB16.setVisible(false);
        CB17.setSelected(false); CB17.setVisible(false);
        CB18.setSelected(false); CB18.setVisible(false);
        CB19.setSelected(false); CB19.setVisible(false); 
        CB20.setSelected(false); CB20.setVisible(false);
        CB21.setSelected(false); CB21.setVisible(false);
        CB22.setSelected(false); CB22.setVisible(false);
        CB23.setSelected(false); CB23.setVisible(false);
        CB24.setSelected(false); CB24.setVisible(false);
        CB25.setSelected(false); CB25.setVisible(false); 
        CB26.setSelected(false); CB26.setVisible(false);
        }
//Numero 10//---------------------------------------------------/
        if (!"10".equals(valorh)){
        } else {
        //Numero 1//    
        CB1.setSelected(false);  CB1.setVisible(false);
        CB2.setSelected(false);  CB2.setVisible(false);
        CB3.setSelected(true);   CB3.setVisible(true);
        CB4.setSelected(false);  CB4.setVisible(false);
        CB5.setSelected(true);   CB5.setVisible(true);
        CB6.setSelected(false);  CB6.setVisible(false);
        CB7.setSelected(false);  CB7.setVisible(false);
        CB8.setSelected(true);   CB8.setVisible(true);
        CB9.setSelected(false);  CB9.setVisible(false);
        CB10.setSelected(true);  CB10.setVisible(true);
        CB11.setSelected(false); CB11.setVisible(false);
        CB12.setSelected(false); CB12.setVisible(false);
        CB13.setSelected(true);  CB13.setVisible(true);
        //Numero 0//    
        CB14.setSelected(true); CB14.setVisible(true);
        CB15.setSelected(true); CB15.setVisible(true);
        CB16.setSelected(true); CB16.setVisible(true);
        CB17.setSelected(true); CB17.setVisible(true);
        CB18.setSelected(true); CB18.setVisible(true);
        CB19.setSelected(true); CB19.setVisible(true); 
        CB20.setSelected(true); CB20.setVisible(true);
        CB21.setSelected(true); CB21.setVisible(true);
        CB22.setSelected(true); CB22.setVisible(true);
        CB23.setSelected(true); CB23.setVisible(true);
        CB24.setSelected(true); CB24.setVisible(true);
        CB25.setSelected(true); CB25.setVisible(true); 
        CB26.setSelected(true); CB26.setVisible(true);
        }     
//Numero 11//---------------------------------------------------/
        if (!"11".equals(valorh)){
        } else {
        //Numero 1//    
        CB1.setSelected(false);  CB1.setVisible(false);
        CB2.setSelected(false);  CB2.setVisible(false);
        CB3.setSelected(true);   CB3.setVisible(true);
        CB4.setSelected(false);  CB4.setVisible(false);
        CB5.setSelected(true);   CB5.setVisible(true);
        CB6.setSelected(false);  CB6.setVisible(false);
        CB7.setSelected(false);  CB7.setVisible(false);
        CB8.setSelected(true);   CB8.setVisible(true);
        CB9.setSelected(false);  CB9.setVisible(false);
        CB10.setSelected(true);  CB10.setVisible(true);
        CB11.setSelected(false); CB11.setVisible(false);
        CB12.setSelected(false); CB12.setVisible(false);
        CB13.setSelected(true);  CB13.setVisible(true);
        //Numero 1// 
        CB14.setSelected(false); CB14.setVisible(false);
        CB15.setSelected(false); CB15.setVisible(false);
        CB16.setSelected(true);  CB16.setVisible(true);
        CB17.setSelected(false); CB17.setVisible(false);
        CB18.setSelected(true);  CB18.setVisible(true);
        CB19.setSelected(false); CB19.setVisible(false);
        CB20.setSelected(false); CB20.setVisible(false);
        CB21.setSelected(true);  CB21.setVisible(true);
        CB22.setSelected(false); CB22.setVisible(false);
        CB23.setSelected(true);  CB23.setVisible(true);
        CB24.setSelected(false); CB24.setVisible(false);
        CB25.setSelected(false); CB25.setVisible(false);
        CB26.setSelected(true);  CB26.setVisible(true);        
        }           
//Numero 12//-------------------------------------------------------/
        if (!"12".equals(valorh)){
        } else {
        //Numero 1//    
        CB1.setSelected(false);  CB1.setVisible(false);
        CB2.setSelected(false);  CB2.setVisible(false);
        CB3.setSelected(true);   CB3.setVisible(true);
        CB4.setSelected(false);  CB4.setVisible(false);
        CB5.setSelected(true);   CB5.setVisible(true);
        CB6.setSelected(false);  CB6.setVisible(false);
        CB7.setSelected(false);  CB7.setVisible(false);
        CB8.setSelected(true);   CB8.setVisible(true);
        CB9.setSelected(false);  CB9.setVisible(false);
        CB10.setSelected(true);  CB10.setVisible(true);
        CB11.setSelected(false); CB11.setVisible(false);
        CB12.setSelected(false); CB12.setVisible(false);
        CB13.setSelected(true);  CB13.setVisible(true);
        //Numero 2//    
        CB14.setSelected(false); CB14.setVisible(false);
        CB15.setSelected(false); CB15.setVisible(false);
        CB16.setSelected(true);  CB16.setVisible(true);
        CB17.setSelected(false); CB17.setVisible(false);
        CB18.setSelected(true);  CB18.setVisible(true);
        CB19.setSelected(false); CB19.setVisible(false);
        CB20.setSelected(false); CB20.setVisible(false);
        CB21.setSelected(true);  CB21.setVisible(true);
        CB22.setSelected(false); CB22.setVisible(false);
        CB23.setSelected(true);  CB23.setVisible(true);
        CB24.setSelected(false); CB24.setVisible(false);
        CB25.setSelected(false); CB25.setVisible(false);
        CB26.setSelected(true);  CB26.setVisible(true);
        }                   
        
//***************************MINUTOS***********************//        
        

//Numero 00//--------------------------------------------/
        if (!"00".equals(valorm)){
        } else {
        //Numero 0//    
        CBM1.setSelected(true);  CBM1.setVisible(true);
        CBM2.setSelected(true);  CBM2.setVisible(true);
        CBM3.setSelected(true);  CBM3.setVisible(true);
        CBM4.setSelected(true);  CBM4.setVisible(true);
        CBM5.setSelected(true);  CBM5.setVisible(true);
        CBM6.setSelected(true);  CBM6.setVisible(true);
        CBM7.setSelected(false);  CBM7.setVisible(false);
        CBM8.setSelected(true);  CBM8.setVisible(true);
        CBM9.setSelected(true);  CBM9.setVisible(true);
        CBM10.setSelected(true); CBM10.setVisible(true);
        CBM11.setSelected(true); CBM11.setVisible(true);
        CBM12.setSelected(true); CBM12.setVisible(true);
        CBM13.setSelected(true); CBM13.setVisible(true);
        //Numero 0//    
        CBM14.setSelected(true); CBM14.setVisible(true);
        CBM15.setSelected(true); CBM15.setVisible(true);
        CBM16.setSelected(true); CBM16.setVisible(true);
        CBM17.setSelected(true); CBM17.setVisible(true);
        CBM18.setSelected(true); CBM18.setVisible(true);
        CBM19.setSelected(true); CBM19.setVisible(true); 
        CBM20.setSelected(false); CBM20.setVisible(false);
        CBM21.setSelected(true); CBM21.setVisible(true);
        CBM22.setSelected(true); CBM22.setVisible(true);
        CBM23.setSelected(true); CBM23.setVisible(true);
        CBM24.setSelected(true); CBM24.setVisible(true);
        CBM25.setSelected(true); CBM25.setVisible(true); 
        CBM26.setSelected(true); CBM26.setVisible(true);
        }    
 //Numero 0//--------------------------------------------/
        if (!"0".equals(valorm)){
        } else {
        //Numero 1//    
        CBM1.setSelected(true);  CBM1.setVisible(true);
        CBM2.setSelected(true);  CBM2.setVisible(true);
        CBM3.setSelected(true);  CBM3.setVisible(true);
        CBM4.setSelected(true);  CBM4.setVisible(true);
        CBM5.setSelected(true);  CBM5.setVisible(true);
        CBM6.setSelected(true);  CBM6.setVisible(true);
        CBM7.setSelected(false);  CBM7.setVisible(false);
        CBM8.setSelected(true);  CBM8.setVisible(true);
        CBM9.setSelected(true);  CBM9.setVisible(true);
        CBM10.setSelected(true); CBM10.setVisible(true);
        CBM11.setSelected(true); CBM11.setVisible(true);
        CBM12.setSelected(true); CBM12.setVisible(true);
        CBM13.setSelected(true); CBM13.setVisible(true);
        //Numero 0//    
        CBM14.setSelected(true); CBM14.setVisible(true);
        CBM15.setSelected(true); CBM15.setVisible(true);
        CBM16.setSelected(true); CBM16.setVisible(true);
        CBM17.setSelected(true); CBM17.setVisible(true);
        CBM18.setSelected(true); CBM18.setVisible(true);
        CBM19.setSelected(true); CBM19.setVisible(true); 
        CBM20.setSelected(false); CBM20.setVisible(false);
        CBM21.setSelected(true); CBM21.setVisible(true);
        CBM22.setSelected(true); CBM22.setVisible(true);
        CBM23.setSelected(true); CBM23.setVisible(true);
        CBM24.setSelected(true); CBM24.setVisible(true);
        CBM25.setSelected(true); CBM25.setVisible(true); 
        CBM26.setSelected(true); CBM26.setVisible(true);
        }    
 //Numero 1//--------------------------------------------/
        if (!"1".equals(valorm)){
        } else {
        //Numero 1//    
        CBM14.setSelected(false);  CBM14.setVisible(false);
        CBM15.setSelected(false);  CBM15.setVisible(false);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(false);  CBM17.setVisible(false);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(false);  CBM19.setVisible(false);
        CBM20.setSelected(false);  CBM20.setVisible(false);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(false);  CBM22.setVisible(false);
        CBM23.setSelected(true);  CBM23.setVisible(true);
        CBM24.setSelected(false); CBM24.setVisible(false);
        CBM25.setSelected(false); CBM25.setVisible(false);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        //Numero 0//    
        CBM1.setSelected(true); CBM1.setVisible(true);
        CBM2.setSelected(true); CBM2.setVisible(true);
        CBM3.setSelected(true); CBM3.setVisible(true);
        CBM4.setSelected(true); CBM4.setVisible(true);
        CBM5.setSelected(true); CBM5.setVisible(true);
        CBM6.setSelected(true); CBM6.setVisible(true); 
        CBM7.setSelected(false); CBM7.setVisible(false);
        CBM8.setSelected(true); CBM8.setVisible(true);
        CBM9.setSelected(true); CBM9.setVisible(true);
        CBM10.setSelected(true); CBM10.setVisible(true);
        CBM11.setSelected(true); CBM11.setVisible(true);
        CBM12.setSelected(true); CBM12.setVisible(true); 
        CBM13.setSelected(true); CBM13.setVisible(true);
        }      
//Numero 2//--------------------------------------------------/
        if (!"2".equals(valorm)){
        } else {
        //Numero 2//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(true);   CBM15.setVisible(true);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(false);  CBM17.setVisible(false);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(true);   CBM22.setVisible(true);
        CBM23.setSelected(false); CBM23.setVisible(false);
        CBM24.setSelected(true);  CBM24.setVisible(true);
        CBM25.setSelected(true);  CBM25.setVisible(true);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        //Numero 0//    
        CBM1.setSelected(true); CBM1.setVisible(true);
        CBM2.setSelected(true); CBM2.setVisible(true);
        CBM3.setSelected(true); CBM3.setVisible(true);
        CBM4.setSelected(true); CBM4.setVisible(true);
        CBM5.setSelected(true); CBM5.setVisible(true);
        CBM6.setSelected(true); CBM6.setVisible(true); 
        CBM7.setSelected(false); CBM7.setVisible(false);
        CBM8.setSelected(true); CBM8.setVisible(true);
        CBM9.setSelected(true); CBM9.setVisible(true);
        CBM10.setSelected(true); CBM10.setVisible(true);
        CBM11.setSelected(true); CBM11.setVisible(true);
        CBM12.setSelected(true); CBM12.setVisible(true); 
        CBM13.setSelected(true); CBM13.setVisible(true);
        }
//Numero 3//--------------------------------------------------/
        if (!"3".equals(valorm)){
        } else {
        //Numero 3//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(true);   CBM15.setVisible(true);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(false);  CBM17.setVisible(false);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(false);  CBM22.setVisible(false);
        CBM23.setSelected(true);  CBM23.setVisible(true);
        CBM24.setSelected(true);  CBM24.setVisible(true);
        CBM25.setSelected(true);  CBM25.setVisible(true);
        CBM26.setSelected(true);  CBM26.setVisible(true);
         //Numero 0//    
        CBM1.setSelected(true); CBM1.setVisible(true);
        CBM2.setSelected(true); CBM2.setVisible(true);
        CBM3.setSelected(true); CBM3.setVisible(true);
        CBM4.setSelected(true); CBM4.setVisible(true);
        CBM5.setSelected(true); CBM5.setVisible(true);
        CBM6.setSelected(true); CBM6.setVisible(true); 
        CBM7.setSelected(false); CBM7.setVisible(false);
        CBM8.setSelected(true); CBM8.setVisible(true);
        CBM9.setSelected(true); CBM9.setVisible(true);
        CBM10.setSelected(true); CBM10.setVisible(true);
        CBM11.setSelected(true); CBM11.setVisible(true);
        CBM12.setSelected(true); CBM12.setVisible(true); 
        CBM13.setSelected(true); CBM13.setVisible(true);
        }              
//Numero 4//--------------------------------------------------/
        if (!"4".equals(valorm)){
        } else {
        //Numero 4//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(false);   CBM15.setVisible(false);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(true);  CBM17.setVisible(true);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(false);   CBM22.setVisible(false);
        CBM23.setSelected(true); CBM23.setVisible(true);
        CBM24.setSelected(false);  CBM24.setVisible(false);
        CBM25.setSelected(false);  CBM25.setVisible(false);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        //Numero 0//    
        CBM1.setSelected(true); CBM1.setVisible(true);
        CBM2.setSelected(true); CBM2.setVisible(true);
        CBM3.setSelected(true); CBM3.setVisible(true);
        CBM4.setSelected(true); CBM4.setVisible(true);
        CBM5.setSelected(true); CBM5.setVisible(true);
        CBM6.setSelected(true); CBM6.setVisible(true); 
        CBM7.setSelected(false); CBM7.setVisible(false);
        CBM8.setSelected(true); CBM8.setVisible(true);
        CBM9.setSelected(true); CBM9.setVisible(true);
        CBM10.setSelected(true); CBM10.setVisible(true);
        CBM11.setSelected(true); CBM11.setVisible(true);
        CBM12.setSelected(true); CBM12.setVisible(true); 
        CBM13.setSelected(true); CBM13.setVisible(true);
        }      
//Numero 5//--------------------------------------------------/
        if (!"5".equals(valorm)){
        } else {
        //Numero 2//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(true);   CBM15.setVisible(true);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(true);   CBM17.setVisible(true);
        CBM18.setSelected(false);  CBM18.setVisible(false);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(false);  CBM22.setVisible(false);
        CBM23.setSelected(true);  CBM23.setVisible(true);
        CBM24.setSelected(true);  CBM24.setVisible(true);
        CBM25.setSelected(true);  CBM25.setVisible(true);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        //Numero 0//    
        CBM1.setSelected(true); CBM1.setVisible(true);
        CBM2.setSelected(true); CBM2.setVisible(true);
        CBM3.setSelected(true); CBM3.setVisible(true);
        CBM4.setSelected(true); CBM4.setVisible(true);
        CBM5.setSelected(true); CBM5.setVisible(true);
        CBM6.setSelected(true); CBM6.setVisible(true); 
        CBM7.setSelected(false); CBM7.setVisible(false);
        CBM8.setSelected(true); CBM8.setVisible(true);
        CBM9.setSelected(true); CBM9.setVisible(true);
        CBM10.setSelected(true); CBM10.setVisible(true);
        CBM11.setSelected(true); CBM11.setVisible(true);
        CBM12.setSelected(true); CBM12.setVisible(true); 
        CBM13.setSelected(true); CBM13.setVisible(true);
        }
//Numero 6//--------------------------------------------------/
        if (!"6".equals(valorm)){
        } else {
        //Numero 2//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(false);  CBM15.setVisible(false);
        CBM16.setSelected(false);  CBM16.setVisible(false);
        CBM17.setSelected(true);   CBM17.setVisible(true);
        CBM18.setSelected(false);  CBM18.setVisible(false);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(true);   CBM22.setVisible(true);
        CBM23.setSelected(true);  CBM23.setVisible(true);
        CBM24.setSelected(true);  CBM24.setVisible(true);
        CBM25.setSelected(true);  CBM25.setVisible(true);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        //Numero 0//    
        CBM1.setSelected(true); CBM1.setVisible(true);
        CBM2.setSelected(true); CBM2.setVisible(true);
        CBM3.setSelected(true); CBM3.setVisible(true);
        CBM4.setSelected(true); CBM4.setVisible(true);
        CBM5.setSelected(true); CBM5.setVisible(true);
        CBM6.setSelected(true); CBM6.setVisible(true); 
        CBM7.setSelected(false); CBM7.setVisible(false);
        CBM8.setSelected(true); CBM8.setVisible(true);
        CBM9.setSelected(true); CBM9.setVisible(true);
        CBM10.setSelected(true); CBM10.setVisible(true);
        CBM11.setSelected(true); CBM11.setVisible(true);
        CBM12.setSelected(true); CBM12.setVisible(true); 
        CBM13.setSelected(true); CBM13.setVisible(true);
        }
//Numero 7//--------------------------------------------------/
        if (!"7".equals(valorm)){
        } else {
        //Numero 2//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(true);   CBM15.setVisible(true);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(false);  CBM17.setVisible(false);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(false);  CBM19.setVisible(false);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(false);  CBM22.setVisible(false);
        CBM23.setSelected(true);  CBM23.setVisible(true);
        CBM24.setSelected(false); CBM24.setVisible(false);
        CBM25.setSelected(false); CBM25.setVisible(false);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        //Numero 0//    
        CBM1.setSelected(true); CBM1.setVisible(true);
        CBM2.setSelected(true); CBM2.setVisible(true);
        CBM3.setSelected(true); CBM3.setVisible(true);
        CBM4.setSelected(true); CBM4.setVisible(true);
        CBM5.setSelected(true); CBM5.setVisible(true);
        CBM6.setSelected(true); CBM6.setVisible(true); 
        CBM7.setSelected(false); CBM7.setVisible(false);
        CBM8.setSelected(true); CBM8.setVisible(true);
        CBM9.setSelected(true); CBM9.setVisible(true);
        CBM10.setSelected(true); CBM10.setVisible(true);
        CBM11.setSelected(true); CBM11.setVisible(true);
        CBM12.setSelected(true); CBM12.setVisible(true); 
        CBM13.setSelected(true); CBM13.setVisible(true);
        }  
//Numero 8//--------------------------------------------------/
        if (!"8".equals(valorm)){
        } else {
        //Numero 2//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(true);   CBM15.setVisible(true);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(true);  CBM17.setVisible(true);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(true);   CBM22.setVisible(true);
        CBM23.setSelected(true); CBM23.setVisible(true);
        CBM24.setSelected(true);  CBM24.setVisible(true);
        CBM25.setSelected(true);  CBM25.setVisible(true);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        //Numero 0//    
        CBM1.setSelected(true); CBM1.setVisible(true);
        CBM2.setSelected(true); CBM2.setVisible(true);
        CBM3.setSelected(true); CBM3.setVisible(true);
        CBM4.setSelected(true); CBM4.setVisible(true);
        CBM5.setSelected(true); CBM5.setVisible(true);
        CBM6.setSelected(true); CBM6.setVisible(true); 
        CBM7.setSelected(false); CBM7.setVisible(false);
        CBM8.setSelected(true); CBM8.setVisible(true);
        CBM9.setSelected(true); CBM9.setVisible(true);
        CBM10.setSelected(true); CBM10.setVisible(true);
        CBM11.setSelected(true); CBM11.setVisible(true);
        CBM12.setSelected(true); CBM12.setVisible(true); 
        CBM13.setSelected(true); CBM13.setVisible(true);
        }
//Numero 9//--------------------------------------------------/
        if (!"9".equals(valorm)){
        } else {
        //Numero 2//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(true);   CBM15.setVisible(true);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(true);  CBM17.setVisible(true);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(false);   CBM22.setVisible(false);
        CBM23.setSelected(true); CBM23.setVisible(true);
        CBM24.setSelected(true);  CBM24.setVisible(true);
        CBM25.setSelected(true);  CBM25.setVisible(true);
        CBM26.setSelected(true);  CBM26.setVisible(true);
       //Numero 0//    
        CBM1.setSelected(true); CBM1.setVisible(true);
        CBM2.setSelected(true); CBM2.setVisible(true);
        CBM3.setSelected(true); CBM3.setVisible(true);
        CBM4.setSelected(true); CBM4.setVisible(true);
        CBM5.setSelected(true); CBM5.setVisible(true);
        CBM6.setSelected(true); CBM6.setVisible(true); 
        CBM7.setSelected(false); CBM7.setVisible(false);
        CBM8.setSelected(true); CBM8.setVisible(true);
        CBM9.setSelected(true); CBM9.setVisible(true);
        CBM10.setSelected(true); CBM10.setVisible(true);
        CBM11.setSelected(true); CBM11.setVisible(true);
        CBM12.setSelected(true); CBM12.setVisible(true); 
        CBM13.setSelected(true); CBM13.setVisible(true);
        }
//Numero 10//---------------------------------------------------/
        if (!"10".equals(valorm)){
        } else {
        //Numero 1//    
        CBM1.setSelected(false);  CBM1.setVisible(false);
        CBM2.setSelected(false);  CBM2.setVisible(false);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(false);  CBM4.setVisible(false);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(false);  CBM6.setVisible(false);
        CBM7.setSelected(false);  CBM7.setVisible(false);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);  CBM9.setVisible(false);
        CBM10.setSelected(true);  CBM10.setVisible(true);
        CBM11.setSelected(false); CBM11.setVisible(false);
        CBM12.setSelected(false); CBM12.setVisible(false);
        CBM13.setSelected(true);  CBM13.setVisible(true);
           //Numero 0//    
        CBM14.setSelected(true); CBM14.setVisible(true);
        CBM15.setSelected(true); CBM15.setVisible(true);
        CBM16.setSelected(true); CBM16.setVisible(true);
        CBM17.setSelected(true); CBM17.setVisible(true);
        CBM18.setSelected(true); CBM18.setVisible(true);
        CBM19.setSelected(true); CBM19.setVisible(true); 
        CBM20.setSelected(false); CBM20.setVisible(false);
        CBM21.setSelected(true); CBM21.setVisible(true);
        CBM22.setSelected(true); CBM22.setVisible(true);
        CBM23.setSelected(true); CBM23.setVisible(true);
        CBM24.setSelected(true); CBM24.setVisible(true);
        CBM25.setSelected(true); CBM25.setVisible(true); 
        CBM26.setSelected(true); CBM26.setVisible(true);
        }     
//Numero 11//---------------------------------------------------/
        if (!"11".equals(valorm)){
        } else {
        //Numero 1//    
        CBM1.setSelected(false);  CBM1.setVisible(false);
        CBM2.setSelected(false);  CBM2.setVisible(false);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(false);  CBM4.setVisible(false);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(false);  CBM6.setVisible(false);
        CBM7.setSelected(false);  CBM7.setVisible(false);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);  CBM9.setVisible(false);
        CBM10.setSelected(true);  CBM10.setVisible(true);
        CBM11.setSelected(false); CBM11.setVisible(false);
        CBM12.setSelected(false); CBM12.setVisible(false);
        CBM13.setSelected(true);  CBM13.setVisible(true);
        //Numero 1// 
        CBM14.setSelected(false); CBM14.setVisible(false);
        CBM15.setSelected(false); CBM15.setVisible(false);
        CBM16.setSelected(true);  CBM16.setVisible(true);
        CBM17.setSelected(false); CBM17.setVisible(false);
        CBM18.setSelected(true);  CBM18.setVisible(true);
        CBM19.setSelected(false); CBM19.setVisible(false);
        CBM20.setSelected(false); CBM20.setVisible(false);
        CBM21.setSelected(true);  CBM21.setVisible(true);
        CBM22.setSelected(false); CBM22.setVisible(false);
        CBM23.setSelected(true);  CBM23.setVisible(true);
        CBM24.setSelected(false); CBM24.setVisible(false);
        CBM25.setSelected(false); CBM25.setVisible(false);
        CBM26.setSelected(true);  CBM26.setVisible(true);        
        }           
//Numero 12//-------------------------------------------------------/
        if (!"12".equals(valorm)){
        } else {
        //Numero 1//    
        CBM1.setSelected(false);  CBM1.setVisible(false);
        CBM2.setSelected(false);  CBM2.setVisible(false);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(false);  CBM4.setVisible(false);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(false);  CBM6.setVisible(false);
        CBM7.setSelected(false);  CBM7.setVisible(false);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);  CBM9.setVisible(false);
        CBM10.setSelected(true);  CBM10.setVisible(true);
        CBM11.setSelected(false); CBM11.setVisible(false);
        CBM12.setSelected(false); CBM12.setVisible(false);
        CBM13.setSelected(true);  CBM13.setVisible(true);
      //Numero 2//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(true);   CBM15.setVisible(true);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(false);  CBM17.setVisible(false);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(true);   CBM22.setVisible(true);
        CBM23.setSelected(false); CBM23.setVisible(false);
        CBM24.setSelected(true);  CBM24.setVisible(true);
        CBM25.setSelected(true);  CBM25.setVisible(true);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }                   
//Numero 13//-------------------------------------------------------/
        if (!"13".equals(valorm)){
        } else {
        //Numero 1//    
        CBM1.setSelected(false);  CBM1.setVisible(false);
        CBM2.setSelected(false);  CBM2.setVisible(false);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(false);  CBM4.setVisible(false);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(false);  CBM6.setVisible(false);
        CBM7.setSelected(false);  CBM7.setVisible(false);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);  CBM9.setVisible(false);
        CBM10.setSelected(true);  CBM10.setVisible(true);
        CBM11.setSelected(false); CBM11.setVisible(false);
        CBM12.setSelected(false); CBM12.setVisible(false);
        CBM13.setSelected(true);  CBM13.setVisible(true);
        //Numero 3//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(true);   CBM15.setVisible(true);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(false);  CBM17.setVisible(false);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(false);  CBM22.setVisible(false);
        CBM23.setSelected(true);  CBM23.setVisible(true);
        CBM24.setSelected(true);  CBM24.setVisible(true);
        CBM25.setSelected(true);  CBM25.setVisible(true);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }            
//Numero 14//-------------------------------------------------------/
        if (!"14".equals(valorm)){
        } else {
        //Numero 1//    
        CBM1.setSelected(false);  CBM1.setVisible(false);
        CBM2.setSelected(false);  CBM2.setVisible(false);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(false);  CBM4.setVisible(false);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(false);  CBM6.setVisible(false);
        CBM7.setSelected(false);  CBM7.setVisible(false);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);  CBM9.setVisible(false);
        CBM10.setSelected(true);  CBM10.setVisible(true);
        CBM11.setSelected(false); CBM11.setVisible(false);
        CBM12.setSelected(false); CBM12.setVisible(false);
        CBM13.setSelected(true);  CBM13.setVisible(true);
   //Numero 4//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(false);   CBM15.setVisible(false);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(true);  CBM17.setVisible(true);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(false);   CBM22.setVisible(false);
        CBM23.setSelected(true); CBM23.setVisible(true);
        CBM24.setSelected(false);  CBM24.setVisible(false);
        CBM25.setSelected(false);  CBM25.setVisible(false);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }                    
//Numero 15//-------------------------------------------------------/
        if (!"15".equals(valorm)){
        } else {
        //Numero 1//    
        CBM1.setSelected(false);  CBM1.setVisible(false);
        CBM2.setSelected(false);  CBM2.setVisible(false);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(false);  CBM4.setVisible(false);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(false);  CBM6.setVisible(false);
        CBM7.setSelected(false);  CBM7.setVisible(false);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);  CBM9.setVisible(false);
        CBM10.setSelected(true);  CBM10.setVisible(true);
        CBM11.setSelected(false); CBM11.setVisible(false);
        CBM12.setSelected(false); CBM12.setVisible(false);
        CBM13.setSelected(true);  CBM13.setVisible(true);
   //Numero 5//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(true);   CBM15.setVisible(true);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(true);   CBM17.setVisible(true);
        CBM18.setSelected(false);  CBM18.setVisible(false);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(false);  CBM22.setVisible(false);
        CBM23.setSelected(true);  CBM23.setVisible(true);
        CBM24.setSelected(true);  CBM24.setVisible(true);
        CBM25.setSelected(true);  CBM25.setVisible(true);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }                            
 //Numero 16//-------------------------------------------------------/
        if (!"16".equals(valorm)){
        } else {
        //Numero 1//    
        CBM1.setSelected(false);  CBM1.setVisible(false);
        CBM2.setSelected(false);  CBM2.setVisible(false);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(false);  CBM4.setVisible(false);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(false);  CBM6.setVisible(false);
        CBM7.setSelected(false);  CBM7.setVisible(false);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);  CBM9.setVisible(false);
        CBM10.setSelected(true);  CBM10.setVisible(true);
        CBM11.setSelected(false); CBM11.setVisible(false);
        CBM12.setSelected(false); CBM12.setVisible(false);
        CBM13.setSelected(true);  CBM13.setVisible(true);
  //Numero 2//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(false);  CBM15.setVisible(false);
        CBM16.setSelected(false);  CBM16.setVisible(false);
        CBM17.setSelected(true);   CBM17.setVisible(true);
        CBM18.setSelected(false);  CBM18.setVisible(false);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(true);   CBM22.setVisible(true);
        CBM23.setSelected(true);  CBM23.setVisible(true);
        CBM24.setSelected(true);  CBM24.setVisible(true);
        CBM25.setSelected(true);  CBM25.setVisible(true);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }               
 //Numero 17//-------------------------------------------------------/
        if (!"17".equals(valorm)){
        } else {
        //Numero 1//    
        CBM1.setSelected(false);  CBM1.setVisible(false);
        CBM2.setSelected(false);  CBM2.setVisible(false);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(false);  CBM4.setVisible(false);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(false);  CBM6.setVisible(false);
        CBM7.setSelected(false);  CBM7.setVisible(false);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);  CBM9.setVisible(false);
        CBM10.setSelected(true);  CBM10.setVisible(true);
        CBM11.setSelected(false); CBM11.setVisible(false);
        CBM12.setSelected(false); CBM12.setVisible(false);
        CBM13.setSelected(true);  CBM13.setVisible(true);
  //Numero 2//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(true);   CBM15.setVisible(true);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(false);  CBM17.setVisible(false);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(false);  CBM19.setVisible(false);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(false);  CBM22.setVisible(false);
        CBM23.setSelected(true);  CBM23.setVisible(true);
        CBM24.setSelected(false); CBM24.setVisible(false);
        CBM25.setSelected(false); CBM25.setVisible(false);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }                       
 //Numero 18//-------------------------------------------------------/
        if (!"18".equals(valorm)){
        } else {
        //Numero 1//    
        CBM1.setSelected(false);  CBM1.setVisible(false);
        CBM2.setSelected(false);  CBM2.setVisible(false);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(false);  CBM4.setVisible(false);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(false);  CBM6.setVisible(false);
        CBM7.setSelected(false);  CBM7.setVisible(false);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);  CBM9.setVisible(false);
        CBM10.setSelected(true);  CBM10.setVisible(true);
        CBM11.setSelected(false); CBM11.setVisible(false);
        CBM12.setSelected(false); CBM12.setVisible(false);
        CBM13.setSelected(true);  CBM13.setVisible(true);
        //Numero 2//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(true);   CBM15.setVisible(true);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(true);  CBM17.setVisible(true);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(true);   CBM22.setVisible(true);
        CBM23.setSelected(true); CBM23.setVisible(true);
        CBM24.setSelected(true);  CBM24.setVisible(true);
        CBM25.setSelected(true);  CBM25.setVisible(true);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }                      
  //Numero 19//-------------------------------------------------------/
        if (!"19".equals(valorm)){
        } else {
        //Numero 1//    
        CBM1.setSelected(false);  CBM1.setVisible(false);
        CBM2.setSelected(false);  CBM2.setVisible(false);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(false);  CBM4.setVisible(false);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(false);  CBM6.setVisible(false);
        CBM7.setSelected(false);  CBM7.setVisible(false);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);  CBM9.setVisible(false);
        CBM10.setSelected(true);  CBM10.setVisible(true);
        CBM11.setSelected(false); CBM11.setVisible(false);
        CBM12.setSelected(false); CBM12.setVisible(false);
        CBM13.setSelected(true);  CBM13.setVisible(true);
 //Numero 2//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(true);   CBM15.setVisible(true);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(true);  CBM17.setVisible(true);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(false);   CBM22.setVisible(false);
        CBM23.setSelected(true); CBM23.setVisible(true);
        CBM24.setSelected(true);  CBM24.setVisible(true);
        CBM25.setSelected(true);  CBM25.setVisible(true);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }                      
//Numero 20//--------------------------------------------------/
        if (!"20".equals(valorm)){
        } else {
        //Numero 2//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(true);   CBM2.setVisible(true);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(false);  CBM4.setVisible(false);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(true);   CBM9.setVisible(true);
        CBM10.setSelected(false); CBM10.setVisible(false);
        CBM11.setSelected(true);  CBM11.setVisible(true);
        CBM12.setSelected(true);  CBM12.setVisible(true);
        CBM13.setSelected(true);  CBM13.setVisible(true);
        //Numero 0//    
           //Numero 0//    
        CBM14.setSelected(true); CBM14.setVisible(true);
        CBM15.setSelected(true); CBM15.setVisible(true);
        CBM16.setSelected(true); CBM16.setVisible(true);
        CBM17.setSelected(true); CBM17.setVisible(true);
        CBM18.setSelected(true); CBM18.setVisible(true);
        CBM19.setSelected(true); CBM19.setVisible(true); 
        CBM20.setSelected(false); CBM20.setVisible(false);
        CBM21.setSelected(true); CBM21.setVisible(true);
        CBM22.setSelected(true); CBM22.setVisible(true);
        CBM23.setSelected(true); CBM23.setVisible(true);
        CBM24.setSelected(true); CBM24.setVisible(true);
        CBM25.setSelected(true); CBM25.setVisible(true); 
        CBM26.setSelected(true); CBM26.setVisible(true);
        }
//Numero 21//--------------------------------------------------/
        if (!"21".equals(valorm)){
        } else {
        //Numero 2//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(true);   CBM2.setVisible(true);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(false);  CBM4.setVisible(false);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(true);   CBM9.setVisible(true);
        CBM10.setSelected(false); CBM10.setVisible(false);
        CBM11.setSelected(true);  CBM11.setVisible(true);
        CBM12.setSelected(true);  CBM12.setVisible(true);
        CBM13.setSelected(true);  CBM13.setVisible(true);
             //Numero 1//    
        CBM14.setSelected(false);  CBM14.setVisible(false);
        CBM15.setSelected(false);  CBM15.setVisible(false);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(false);  CBM17.setVisible(false);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(false);  CBM19.setVisible(false);
        CBM20.setSelected(false);  CBM20.setVisible(false);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(false);  CBM22.setVisible(false);
        CBM23.setSelected(true);  CBM23.setVisible(true);
        CBM24.setSelected(false); CBM24.setVisible(false);
        CBM25.setSelected(false); CBM25.setVisible(false);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }        
 //Numero 22//--------------------------------------------------/
        if (!"22".equals(valorm)){
        } else {
        //Numero 2//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(true);   CBM2.setVisible(true);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(false);  CBM4.setVisible(false);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(true);   CBM9.setVisible(true);
        CBM10.setSelected(false); CBM10.setVisible(false);
        CBM11.setSelected(true);  CBM11.setVisible(true);
        CBM12.setSelected(true);  CBM12.setVisible(true);
        CBM13.setSelected(true);  CBM13.setVisible(true);
         //Numero 2//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(true);   CBM15.setVisible(true);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(false);  CBM17.setVisible(false);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(true);   CBM22.setVisible(true);
        CBM23.setSelected(false); CBM23.setVisible(false);
        CBM24.setSelected(true);  CBM24.setVisible(true);
        CBM25.setSelected(true);  CBM25.setVisible(true);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }       
//Numero 23//--------------------------------------------------/
        if (!"23".equals(valorm)){
        } else {
        //Numero 2//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(true);   CBM2.setVisible(true);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(false);  CBM4.setVisible(false);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(true);   CBM9.setVisible(true);
        CBM10.setSelected(false); CBM10.setVisible(false);
        CBM11.setSelected(true);  CBM11.setVisible(true);
        CBM12.setSelected(true);  CBM12.setVisible(true);
        CBM13.setSelected(true);  CBM13.setVisible(true);
       //Numero 3//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(true);   CBM15.setVisible(true);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(false);  CBM17.setVisible(false);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(false);  CBM22.setVisible(false);
        CBM23.setSelected(true);  CBM23.setVisible(true);
        CBM24.setSelected(true);  CBM24.setVisible(true);
        CBM25.setSelected(true);  CBM25.setVisible(true);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }        
 //Numero 24//--------------------------------------------------/
        if (!"24".equals(valorm)){
        } else {
        //Numero 2//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(true);   CBM2.setVisible(true);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(false);  CBM4.setVisible(false);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(true);   CBM9.setVisible(true);
        CBM10.setSelected(false); CBM10.setVisible(false);
        CBM11.setSelected(true);  CBM11.setVisible(true);
        CBM12.setSelected(true);  CBM12.setVisible(true);
        CBM13.setSelected(true);  CBM13.setVisible(true);
       //Numero 4//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(false);   CBM15.setVisible(false);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(true);  CBM17.setVisible(true);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(false);   CBM22.setVisible(false);
        CBM23.setSelected(true); CBM23.setVisible(true);
        CBM24.setSelected(false);  CBM24.setVisible(false);
        CBM25.setSelected(false);  CBM25.setVisible(false);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }       
 //Numero 25//--------------------------------------------------/
        if (!"25".equals(valorm)){
        } else {
        //Numero 2//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(true);   CBM2.setVisible(true);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(false);  CBM4.setVisible(false);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(true);   CBM9.setVisible(true);
        CBM10.setSelected(false); CBM10.setVisible(false);
        CBM11.setSelected(true);  CBM11.setVisible(true);
        CBM12.setSelected(true);  CBM12.setVisible(true);
        CBM13.setSelected(true);  CBM13.setVisible(true);
      //Numero 2//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(true);   CBM15.setVisible(true);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(true);   CBM17.setVisible(true);
        CBM18.setSelected(false);  CBM18.setVisible(false);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(false);  CBM22.setVisible(false);
        CBM23.setSelected(true);  CBM23.setVisible(true);
        CBM24.setSelected(true);  CBM24.setVisible(true);
        CBM25.setSelected(true);  CBM25.setVisible(true);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }  
//Numero 26//--------------------------------------------------/
        if (!"26".equals(valorm)){
        } else {
        //Numero 2//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(true);   CBM2.setVisible(true);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(false);  CBM4.setVisible(false);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(true);   CBM9.setVisible(true);
        CBM10.setSelected(false); CBM10.setVisible(false);
        CBM11.setSelected(true);  CBM11.setVisible(true);
        CBM12.setSelected(true);  CBM12.setVisible(true);
        CBM13.setSelected(true);  CBM13.setVisible(true);
        //Numero 2//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(false);  CBM15.setVisible(false);
        CBM16.setSelected(false);  CBM16.setVisible(false);
        CBM17.setSelected(true);   CBM17.setVisible(true);
        CBM18.setSelected(false);  CBM18.setVisible(false);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(true);   CBM22.setVisible(true);
        CBM23.setSelected(true);  CBM23.setVisible(true);
        CBM24.setSelected(true);  CBM24.setVisible(true);
        CBM25.setSelected(true);  CBM25.setVisible(true);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }        
 //Numero 27//--------------------------------------------------/
        if (!"30".equals(valorm)){
        } else {
        //Numero 2//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(true);   CBM2.setVisible(true);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(false);  CBM4.setVisible(false);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(true);   CBM9.setVisible(true);
        CBM10.setSelected(false); CBM10.setVisible(false);
        CBM11.setSelected(true);  CBM11.setVisible(true);
        CBM12.setSelected(true);  CBM12.setVisible(true);
        CBM13.setSelected(true);  CBM13.setVisible(true);
         //Numero 2//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(true);   CBM15.setVisible(true);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(false);  CBM17.setVisible(false);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(false);  CBM19.setVisible(false);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(false);  CBM22.setVisible(false);
        CBM23.setSelected(true);  CBM23.setVisible(true);
        CBM24.setSelected(false); CBM24.setVisible(false);
        CBM25.setSelected(false); CBM25.setVisible(false);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        } 
 //Numero 28//--------------------------------------------------/
        if (!"28".equals(valorm)){
        } else {
        //Numero 2//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(true);   CBM2.setVisible(true);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(false);  CBM4.setVisible(false);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(true);   CBM9.setVisible(true);
        CBM10.setSelected(false); CBM10.setVisible(false);
        CBM11.setSelected(true);  CBM11.setVisible(true);
        CBM12.setSelected(true);  CBM12.setVisible(true);
        CBM13.setSelected(true);  CBM13.setVisible(true);
         //Numero 2//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(true);   CBM15.setVisible(true);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(true);  CBM17.setVisible(true);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(true);   CBM22.setVisible(true);
        CBM23.setSelected(true); CBM23.setVisible(true);
        CBM24.setSelected(true);  CBM24.setVisible(true);
        CBM25.setSelected(true);  CBM25.setVisible(true);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }       
//Numero 29//--------------------------------------------------/
        if (!"29".equals(valorm)){
        } else {
        //Numero 2//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(true);   CBM2.setVisible(true);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(false);  CBM4.setVisible(false);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(true);   CBM9.setVisible(true);
        CBM10.setSelected(false); CBM10.setVisible(false);
        CBM11.setSelected(true);  CBM11.setVisible(true);
        CBM12.setSelected(true);  CBM12.setVisible(true);
        CBM13.setSelected(true);  CBM13.setVisible(true);
       //Numero 2//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(true);   CBM15.setVisible(true);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(true);  CBM17.setVisible(true);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(false);   CBM22.setVisible(false);
        CBM23.setSelected(true); CBM23.setVisible(true);
        CBM24.setSelected(true);  CBM24.setVisible(true);
        CBM25.setSelected(true);  CBM25.setVisible(true);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }
        
//Numero 30//--------------------------------------------------/
        if (!"30".equals(valorm)){
        } else {
        //Numero 3//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(true);   CBM2.setVisible(true);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(false);  CBM4.setVisible(false);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);  CBM9.setVisible(false);
        CBM10.setSelected(true);  CBM10.setVisible(true);
        CBM11.setSelected(true);  CBM11.setVisible(true);
        CBM12.setSelected(true);  CBM12.setVisible(true);
        CBM13.setSelected(true);  CBM13.setVisible(true);
          //Numero 0//    
          //Numero 0//    
        CBM14.setSelected(true); CBM14.setVisible(true);
        CBM15.setSelected(true); CBM15.setVisible(true);
        CBM16.setSelected(true); CBM16.setVisible(true);
        CBM17.setSelected(true); CBM17.setVisible(true);
        CBM18.setSelected(true); CBM18.setVisible(true);
        CBM19.setSelected(true); CBM19.setVisible(true); 
        CBM20.setSelected(false); CBM20.setVisible(false);
        CBM21.setSelected(true); CBM21.setVisible(true);
        CBM22.setSelected(true); CBM22.setVisible(true);
        CBM23.setSelected(true); CBM23.setVisible(true);
        CBM24.setSelected(true); CBM24.setVisible(true);
        CBM25.setSelected(true); CBM25.setVisible(true); 
        CBM26.setSelected(true); CBM26.setVisible(true);
        }           
//Numero 31//--------------------------------------------------/
        if (!"31".equals(valorm)){
        } else {
        //Numero 3//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(true);   CBM2.setVisible(true);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(false);  CBM4.setVisible(false);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);  CBM9.setVisible(false);
        CBM10.setSelected(true);  CBM10.setVisible(true);
        CBM11.setSelected(true);  CBM11.setVisible(true);
        CBM12.setSelected(true);  CBM12.setVisible(true);
        CBM13.setSelected(true);  CBM13.setVisible(true);
       //Numero 1//    
        CBM14.setSelected(false);  CBM14.setVisible(false);
        CBM15.setSelected(false);  CBM15.setVisible(false);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(false);  CBM17.setVisible(false);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(false);  CBM19.setVisible(false);
        CBM20.setSelected(false);  CBM20.setVisible(false);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(false);  CBM22.setVisible(false);
        CBM23.setSelected(true);  CBM23.setVisible(true);
        CBM24.setSelected(false); CBM24.setVisible(false);
        CBM25.setSelected(false); CBM25.setVisible(false);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }               
 //Numero 32//--------------------------------------------------/
        if (!"32".equals(valorm)){
        } else {
        //Numero 3//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(true);   CBM2.setVisible(true);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(false);  CBM4.setVisible(false);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);  CBM9.setVisible(false);
        CBM10.setSelected(true);  CBM10.setVisible(true);
        CBM11.setSelected(true);  CBM11.setVisible(true);
        CBM12.setSelected(true);  CBM12.setVisible(true);
        CBM13.setSelected(true);  CBM13.setVisible(true);
        //Numero 2//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(true);   CBM15.setVisible(true);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(false);  CBM17.setVisible(false);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(true);   CBM22.setVisible(true);
        CBM23.setSelected(false); CBM23.setVisible(false);
        CBM24.setSelected(true);  CBM24.setVisible(true);
        CBM25.setSelected(true);  CBM25.setVisible(true);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }              
 //Numero 33//--------------------------------------------------/
        if (!"33".equals(valorm)){
        } else {
        //Numero 3//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(true);   CBM2.setVisible(true);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(false);  CBM4.setVisible(false);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);  CBM9.setVisible(false);
        CBM10.setSelected(true);  CBM10.setVisible(true);
        CBM11.setSelected(true);  CBM11.setVisible(true);
        CBM12.setSelected(true);  CBM12.setVisible(true);
        CBM13.setSelected(true);  CBM13.setVisible(true);
         //Numero 3//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(true);   CBM15.setVisible(true);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(false);  CBM17.setVisible(false);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(false);  CBM22.setVisible(false);
        CBM23.setSelected(true);  CBM23.setVisible(true);
        CBM24.setSelected(true);  CBM24.setVisible(true);
        CBM25.setSelected(true);  CBM25.setVisible(true);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }              
//Numero 34//--------------------------------------------------/
        if (!"34".equals(valorm)){
        } else {
        //Numero 3//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(true);   CBM2.setVisible(true);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(false);  CBM4.setVisible(false);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);  CBM9.setVisible(false);
        CBM10.setSelected(true);  CBM10.setVisible(true);
        CBM11.setSelected(true);  CBM11.setVisible(true);
        CBM12.setSelected(true);  CBM12.setVisible(true);
        CBM13.setSelected(true);  CBM13.setVisible(true);
         //Numero 4//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(false);   CBM15.setVisible(false);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(true);  CBM17.setVisible(true);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(false);   CBM22.setVisible(false);
        CBM23.setSelected(true); CBM23.setVisible(true);
        CBM24.setSelected(false);  CBM24.setVisible(false);
        CBM25.setSelected(false);  CBM25.setVisible(false);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }
 //Numero 35//--------------------------------------------------/
        if (!"35".equals(valorm)){
        } else {
        //Numero 3//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(true);   CBM2.setVisible(true);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(false);  CBM4.setVisible(false);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);  CBM9.setVisible(false);
        CBM10.setSelected(true);  CBM10.setVisible(true);
        CBM11.setSelected(true);  CBM11.setVisible(true);
        CBM12.setSelected(true);  CBM12.setVisible(true);
        CBM13.setSelected(true);  CBM13.setVisible(true);
    //Numero 2//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(true);   CBM15.setVisible(true);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(true);   CBM17.setVisible(true);
        CBM18.setSelected(false);  CBM18.setVisible(false);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(false);  CBM22.setVisible(false);
        CBM23.setSelected(true);  CBM23.setVisible(true);
        CBM24.setSelected(true);  CBM24.setVisible(true);
        CBM25.setSelected(true);  CBM25.setVisible(true);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        } 
        
//Numero 36//--------------------------------------------------/
        if (!"36".equals(valorm)){
        } else {
        //Numero 3//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(true);   CBM2.setVisible(true);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(false);  CBM4.setVisible(false);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);  CBM9.setVisible(false);
        CBM10.setSelected(true);  CBM10.setVisible(true);
        CBM11.setSelected(true);  CBM11.setVisible(true);
        CBM12.setSelected(true);  CBM12.setVisible(true);
        CBM13.setSelected(true);  CBM13.setVisible(true);
      //Numero 2//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(false);  CBM15.setVisible(false);
        CBM16.setSelected(false);  CBM16.setVisible(false);
        CBM17.setSelected(true);   CBM17.setVisible(true);
        CBM18.setSelected(false);  CBM18.setVisible(false);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(true);   CBM22.setVisible(true);
        CBM23.setSelected(true);  CBM23.setVisible(true);
        CBM24.setSelected(true);  CBM24.setVisible(true);
        CBM25.setSelected(true);  CBM25.setVisible(true);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }   
//Numero 37//--------------------------------------------------/
        if (!"37".equals(valorm)){
        } else {
        //Numero 3//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(true);   CBM2.setVisible(true);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(false);  CBM4.setVisible(false);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);  CBM9.setVisible(false);
        CBM10.setSelected(true);  CBM10.setVisible(true);
        CBM11.setSelected(true);  CBM11.setVisible(true);
        CBM12.setSelected(true);  CBM12.setVisible(true);
        CBM13.setSelected(true);  CBM13.setVisible(true);
          //Numero 2//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(true);   CBM15.setVisible(true);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(false);  CBM17.setVisible(false);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(false);  CBM19.setVisible(false);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(false);  CBM22.setVisible(false);
        CBM23.setSelected(true);  CBM23.setVisible(true);
        CBM24.setSelected(false); CBM24.setVisible(false);
        CBM25.setSelected(false); CBM25.setVisible(false);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }
//Numero 38//--------------------------------------------------/
        if (!"38".equals(valorm)){
        } else {
        //Numero 3//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(true);   CBM2.setVisible(true);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(false);  CBM4.setVisible(false);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);  CBM9.setVisible(false);
        CBM10.setSelected(true);  CBM10.setVisible(true);
        CBM11.setSelected(true);  CBM11.setVisible(true);
        CBM12.setSelected(true);  CBM12.setVisible(true);
        CBM13.setSelected(true);  CBM13.setVisible(true);
          //Numero 2//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(true);   CBM15.setVisible(true);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(true);  CBM17.setVisible(true);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(true);   CBM22.setVisible(true);
        CBM23.setSelected(true); CBM23.setVisible(true);
        CBM24.setSelected(true);  CBM24.setVisible(true);
        CBM25.setSelected(true);  CBM25.setVisible(true);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }   
//Numero 39//--------------------------------------------------/
        if (!"39".equals(valorm)){
        } else {
        //Numero 3//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(true);   CBM2.setVisible(true);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(false);  CBM4.setVisible(false);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);  CBM9.setVisible(false);
        CBM10.setSelected(true);  CBM10.setVisible(true);
        CBM11.setSelected(true);  CBM11.setVisible(true);
        CBM12.setSelected(true);  CBM12.setVisible(true);
        CBM13.setSelected(true);  CBM13.setVisible(true);
       //Numero 2//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(true);   CBM15.setVisible(true);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(true);  CBM17.setVisible(true);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(false);   CBM22.setVisible(false);
        CBM23.setSelected(true); CBM23.setVisible(true);
        CBM24.setSelected(true);  CBM24.setVisible(true);
        CBM25.setSelected(true);  CBM25.setVisible(true);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }               
        
//Numero 40//--------------------------------------------------/
        if (!"40".equals(valorm)){
        } else {
        //Numero 4//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(false);   CBM2.setVisible(false);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(true);  CBM4.setVisible(true);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);   CBM9.setVisible(false);
        CBM10.setSelected(true); CBM10.setVisible(true);
        CBM11.setSelected(false);  CBM11.setVisible(false);
        CBM12.setSelected(false);  CBM12.setVisible(false);
        CBM13.setSelected(true);  CBM13.setVisible(true);
        //Numero 0//    
            //Numero 0//    
        CBM14.setSelected(true); CBM14.setVisible(true);
        CBM15.setSelected(true); CBM15.setVisible(true);
        CBM16.setSelected(true); CBM16.setVisible(true);
        CBM17.setSelected(true); CBM17.setVisible(true);
        CBM18.setSelected(true); CBM18.setVisible(true);
        CBM19.setSelected(true); CBM19.setVisible(true); 
        CBM20.setSelected(false); CBM20.setVisible(false);
        CBM21.setSelected(true); CBM21.setVisible(true);
        CBM22.setSelected(true); CBM22.setVisible(true);
        CBM23.setSelected(true); CBM23.setVisible(true);
        CBM24.setSelected(true); CBM24.setVisible(true);
        CBM25.setSelected(true); CBM25.setVisible(true); 
        CBM26.setSelected(true); CBM26.setVisible(true);
        }   
 //Numero 41//--------------------------------------------------/
        if (!"41".equals(valorm)){
        } else {
        //Numero 4//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(false);   CBM2.setVisible(false);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(true);  CBM4.setVisible(true);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);   CBM9.setVisible(false);
        CBM10.setSelected(true); CBM10.setVisible(true);
        CBM11.setSelected(false);  CBM11.setVisible(false);
        CBM12.setSelected(false);  CBM12.setVisible(false);
        CBM13.setSelected(true);  CBM13.setVisible(true);
         //Numero 1//    
        CBM14.setSelected(false);  CBM14.setVisible(false);
        CBM15.setSelected(false);  CBM15.setVisible(false);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(false);  CBM17.setVisible(false);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(false);  CBM19.setVisible(false);
        CBM20.setSelected(false);  CBM20.setVisible(false);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(false);  CBM22.setVisible(false);
        CBM23.setSelected(true);  CBM23.setVisible(true);
        CBM24.setSelected(false); CBM24.setVisible(false);
        CBM25.setSelected(false); CBM25.setVisible(false);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }          
//Numero 42//--------------------------------------------------/
        if (!"42".equals(valorm)){
        } else {
        //Numero 4//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(false);   CBM2.setVisible(false);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(true);  CBM4.setVisible(true);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);   CBM9.setVisible(false);
        CBM10.setSelected(true); CBM10.setVisible(true);
        CBM11.setSelected(false);  CBM11.setVisible(false);
        CBM12.setSelected(false);  CBM12.setVisible(false);
        CBM13.setSelected(true);  CBM13.setVisible(true);
         //Numero 2//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(true);   CBM15.setVisible(true);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(false);  CBM17.setVisible(false);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(true);   CBM22.setVisible(true);
        CBM23.setSelected(false); CBM23.setVisible(false);
        CBM24.setSelected(true);  CBM24.setVisible(true);
        CBM25.setSelected(true);  CBM25.setVisible(true);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }           
 //Numero 43//--------------------------------------------------/
        if (!"43".equals(valorm)){
        } else {
        //Numero 4//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(false);   CBM2.setVisible(false);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(true);  CBM4.setVisible(true);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);   CBM9.setVisible(false);
        CBM10.setSelected(true); CBM10.setVisible(true);
        CBM11.setSelected(false);  CBM11.setVisible(false);
        CBM12.setSelected(false);  CBM12.setVisible(false);
        CBM13.setSelected(true);  CBM13.setVisible(true);
         //Numero 3//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(true);   CBM15.setVisible(true);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(false);  CBM17.setVisible(false);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(false);  CBM22.setVisible(false);
        CBM23.setSelected(true);  CBM23.setVisible(true);
        CBM24.setSelected(true);  CBM24.setVisible(true);
        CBM25.setSelected(true);  CBM25.setVisible(true);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }          
//Numero 44//--------------------------------------------------/
        if (!"44".equals(valorm)){
        } else {
        //Numero 4//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(false);   CBM2.setVisible(false);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(true);  CBM4.setVisible(true);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);   CBM9.setVisible(false);
        CBM10.setSelected(true); CBM10.setVisible(true);
        CBM11.setSelected(false);  CBM11.setVisible(false);
        CBM12.setSelected(false);  CBM12.setVisible(false);
        CBM13.setSelected(true);  CBM13.setVisible(true);
        //Numero 4//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(false);   CBM15.setVisible(false);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(true);  CBM17.setVisible(true);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(false);   CBM22.setVisible(false);
        CBM23.setSelected(true); CBM23.setVisible(true);
        CBM24.setSelected(false);  CBM24.setVisible(false);
        CBM25.setSelected(false);  CBM25.setVisible(false);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }           
//Numero 45//--------------------------------------------------/
        if (!"45".equals(valorm)){
        } else {
        //Numero 4//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(false);   CBM2.setVisible(false);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(true);  CBM4.setVisible(true);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);   CBM9.setVisible(false);
        CBM10.setSelected(true); CBM10.setVisible(true);
        CBM11.setSelected(false);  CBM11.setVisible(false);
        CBM12.setSelected(false);  CBM12.setVisible(false);
        CBM13.setSelected(true);  CBM13.setVisible(true);
            //Numero 2//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(true);   CBM15.setVisible(true);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(true);   CBM17.setVisible(true);
        CBM18.setSelected(false);  CBM18.setVisible(false);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(false);  CBM22.setVisible(false);
        CBM23.setSelected(true);  CBM23.setVisible(true);
        CBM24.setSelected(true);  CBM24.setVisible(true);
        CBM25.setSelected(true);  CBM25.setVisible(true);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }           
//Numero 46//--------------------------------------------------/
        if (!"46".equals(valorm)){
        } else {
        //Numero 4//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(false);   CBM2.setVisible(false);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(true);  CBM4.setVisible(true);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);   CBM9.setVisible(false);
        CBM10.setSelected(true); CBM10.setVisible(true);
        CBM11.setSelected(false);  CBM11.setVisible(false);
        CBM12.setSelected(false);  CBM12.setVisible(false);
        CBM13.setSelected(true);  CBM13.setVisible(true);
          //Numero 2//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(false);  CBM15.setVisible(false);
        CBM16.setSelected(false);  CBM16.setVisible(false);
        CBM17.setSelected(true);   CBM17.setVisible(true);
        CBM18.setSelected(false);  CBM18.setVisible(false);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(true);   CBM22.setVisible(true);
        CBM23.setSelected(true);  CBM23.setVisible(true);
        CBM24.setSelected(true);  CBM24.setVisible(true);
        CBM25.setSelected(true);  CBM25.setVisible(true);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }         
//Numero 47//--------------------------------------------------/
        if (!"47".equals(valorm)){
        } else {
        //Numero 4//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(false);   CBM2.setVisible(false);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(true);  CBM4.setVisible(true);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);   CBM9.setVisible(false);
        CBM10.setSelected(true); CBM10.setVisible(true);
        CBM11.setSelected(false);  CBM11.setVisible(false);
        CBM12.setSelected(false);  CBM12.setVisible(false);
        CBM13.setSelected(true);  CBM13.setVisible(true);
        //Numero 2//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(true);   CBM15.setVisible(true);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(false);  CBM17.setVisible(false);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(false);  CBM19.setVisible(false);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(false);  CBM22.setVisible(false);
        CBM23.setSelected(true);  CBM23.setVisible(true);
        CBM24.setSelected(false); CBM24.setVisible(false);
        CBM25.setSelected(false); CBM25.setVisible(false);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }   
 //Numero 48//--------------------------------------------------/
        if (!"48".equals(valorm)){
        } else {
        //Numero 4//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(false);   CBM2.setVisible(false);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(true);  CBM4.setVisible(true);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);   CBM9.setVisible(false);
        CBM10.setSelected(true); CBM10.setVisible(true);
        CBM11.setSelected(false);  CBM11.setVisible(false);
        CBM12.setSelected(false);  CBM12.setVisible(false);
        CBM13.setSelected(true);  CBM13.setVisible(true);
        //Numero 2//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(true);   CBM15.setVisible(true);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(true);  CBM17.setVisible(true);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(true);   CBM22.setVisible(true);
        CBM23.setSelected(true); CBM23.setVisible(true);
        CBM24.setSelected(true);  CBM24.setVisible(true);
        CBM25.setSelected(true);  CBM25.setVisible(true);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }          
 //Numero 49//--------------------------------------------------/
        if (!"49".equals(valorm)){
        } else {
        //Numero 4//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(false);   CBM2.setVisible(false);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(true);  CBM4.setVisible(true);
        CBM5.setSelected(true);   CBM5.setVisible(true);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);   CBM9.setVisible(false);
        CBM10.setSelected(true); CBM10.setVisible(true);
        CBM11.setSelected(false);  CBM11.setVisible(false);
        CBM12.setSelected(false);  CBM12.setVisible(false);
        CBM13.setSelected(true);  CBM13.setVisible(true);
        //Numero 2//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(true);   CBM15.setVisible(true);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(true);  CBM17.setVisible(true);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(false);   CBM22.setVisible(false);
        CBM23.setSelected(true); CBM23.setVisible(true);
        CBM24.setSelected(true);  CBM24.setVisible(true);
        CBM25.setSelected(true);  CBM25.setVisible(true);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }          

//Numero 50//--------------------------------------------------/
        if (!"50".equals(valorm)){
        } else {
        //Numero 2//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(true);   CBM2.setVisible(true);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(true);   CBM4.setVisible(true);
        CBM5.setSelected(false);  CBM5.setVisible(false);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);  CBM9.setVisible(false);
        CBM10.setSelected(true);  CBM10.setVisible(true);
        CBM11.setSelected(true);  CBM11.setVisible(true);
        CBM12.setSelected(true);  CBM12.setVisible(true);
        CBM13.setSelected(true);  CBM13.setVisible(true);
            //Numero 0//    
        CBM14.setSelected(true); CBM14.setVisible(true);
        CBM15.setSelected(true); CBM15.setVisible(true);
        CBM16.setSelected(true); CBM16.setVisible(true);
        CBM17.setSelected(true); CBM17.setVisible(true);
        CBM18.setSelected(true); CBM18.setVisible(true);
        CBM19.setSelected(true); CBM19.setVisible(true); 
        CBM20.setSelected(false); CBM20.setVisible(false);
        CBM21.setSelected(true); CBM21.setVisible(true);
        CBM22.setSelected(true); CBM22.setVisible(true);
        CBM23.setSelected(true); CBM23.setVisible(true);
        CBM24.setSelected(true); CBM24.setVisible(true);
        CBM25.setSelected(true); CBM25.setVisible(true); 
        CBM26.setSelected(true); CBM26.setVisible(true);
        }       
 //Numero 51//--------------------------------------------------/
        if (!"51".equals(valorm)){
        } else {
        //Numero 2//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(true);   CBM2.setVisible(true);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(true);   CBM4.setVisible(true);
        CBM5.setSelected(false);  CBM5.setVisible(false);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);  CBM9.setVisible(false);
        CBM10.setSelected(true);  CBM10.setVisible(true);
        CBM11.setSelected(true);  CBM11.setVisible(true);
        CBM12.setSelected(true);  CBM12.setVisible(true);
        CBM13.setSelected(true);  CBM13.setVisible(true);
        //Numero 1//    
        CBM14.setSelected(false);  CBM14.setVisible(false);
        CBM15.setSelected(false);  CBM15.setVisible(false);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(false);  CBM17.setVisible(false);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(false);  CBM19.setVisible(false);
        CBM20.setSelected(false);  CBM20.setVisible(false);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(false);  CBM22.setVisible(false);
        CBM23.setSelected(true);  CBM23.setVisible(true);
        CBM24.setSelected(false); CBM24.setVisible(false);
        CBM25.setSelected(false); CBM25.setVisible(false);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }              
 //Numero 52//--------------------------------------------------/
        if (!"52".equals(valorm)){
        } else {
        //Numero 2//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(true);   CBM2.setVisible(true);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(true);   CBM4.setVisible(true);
        CBM5.setSelected(false);  CBM5.setVisible(false);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);  CBM9.setVisible(false);
        CBM10.setSelected(true);  CBM10.setVisible(true);
        CBM11.setSelected(true);  CBM11.setVisible(true);
        CBM12.setSelected(true);  CBM12.setVisible(true);
        CBM13.setSelected(true);  CBM13.setVisible(true);
         //Numero 2//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(true);   CBM15.setVisible(true);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(false);  CBM17.setVisible(false);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(true);   CBM22.setVisible(true);
        CBM23.setSelected(false); CBM23.setVisible(false);
        CBM24.setSelected(true);  CBM24.setVisible(true);
        CBM25.setSelected(true);  CBM25.setVisible(true);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }              
 //Numero 53//--------------------------------------------------/
        if (!"53".equals(valorm)){
        } else {
        //Numero 2//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(true);   CBM2.setVisible(true);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(true);   CBM4.setVisible(true);
        CBM5.setSelected(false);  CBM5.setVisible(false);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);  CBM9.setVisible(false);
        CBM10.setSelected(true);  CBM10.setVisible(true);
        CBM11.setSelected(true);  CBM11.setVisible(true);
        CBM12.setSelected(true);  CBM12.setVisible(true);
        CBM13.setSelected(true);  CBM13.setVisible(true);
        //Numero 3//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(true);   CBM15.setVisible(true);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(false);  CBM17.setVisible(false);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(false);  CBM22.setVisible(false);
        CBM23.setSelected(true);  CBM23.setVisible(true);
        CBM24.setSelected(true);  CBM24.setVisible(true);
        CBM25.setSelected(true);  CBM25.setVisible(true);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }              
 //Numero 54//--------------------------------------------------/
        if (!"54".equals(valorm)){
        } else {
        //Numero 2//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(true);   CBM2.setVisible(true);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(true);   CBM4.setVisible(true);
        CBM5.setSelected(false);  CBM5.setVisible(false);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);  CBM9.setVisible(false);
        CBM10.setSelected(true);  CBM10.setVisible(true);
        CBM11.setSelected(true);  CBM11.setVisible(true);
        CBM12.setSelected(true);  CBM12.setVisible(true);
        CBM13.setSelected(true);  CBM13.setVisible(true);
            //Numero 4//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(false);   CBM15.setVisible(false);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(true);  CBM17.setVisible(true);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(false);   CBM22.setVisible(false);
        CBM23.setSelected(true); CBM23.setVisible(true);
        CBM24.setSelected(false);  CBM24.setVisible(false);
        CBM25.setSelected(false);  CBM25.setVisible(false);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }              
 //Numero 55//--------------------------------------------------/
        if (!"55".equals(valorm)){
        } else {
        //Numero 2//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(true);   CBM2.setVisible(true);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(true);   CBM4.setVisible(true);
        CBM5.setSelected(false);  CBM5.setVisible(false);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);  CBM9.setVisible(false);
        CBM10.setSelected(true);  CBM10.setVisible(true);
        CBM11.setSelected(true);  CBM11.setVisible(true);
        CBM12.setSelected(true);  CBM12.setVisible(true);
        CBM13.setSelected(true);  CBM13.setVisible(true);
         //Numero 2//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(true);   CBM15.setVisible(true);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(true);   CBM17.setVisible(true);
        CBM18.setSelected(false);  CBM18.setVisible(false);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(false);  CBM22.setVisible(false);
        CBM23.setSelected(true);  CBM23.setVisible(true);
        CBM24.setSelected(true);  CBM24.setVisible(true);
        CBM25.setSelected(true);  CBM25.setVisible(true);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }              
//Numero 56//--------------------------------------------------/
        if (!"56".equals(valorm)){
        } else {
        //Numero 2//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(true);   CBM2.setVisible(true);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(true);   CBM4.setVisible(true);
        CBM5.setSelected(false);  CBM5.setVisible(false);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);  CBM9.setVisible(false);
        CBM10.setSelected(true);  CBM10.setVisible(true);
        CBM11.setSelected(true);  CBM11.setVisible(true);
        CBM12.setSelected(true);  CBM12.setVisible(true);
        CBM13.setSelected(true);  CBM13.setVisible(true);
     //Numero 2//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(false);  CBM15.setVisible(false);
        CBM16.setSelected(false);  CBM16.setVisible(false);
        CBM17.setSelected(true);   CBM17.setVisible(true);
        CBM18.setSelected(false);  CBM18.setVisible(false);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(true);   CBM22.setVisible(true);
        CBM23.setSelected(true);  CBM23.setVisible(true);
        CBM24.setSelected(true);  CBM24.setVisible(true);
        CBM25.setSelected(true);  CBM25.setVisible(true);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }               
//Numero 57//--------------------------------------------------/
        if (!"57".equals(valorm)){
        } else {
        //Numero 2//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(true);   CBM2.setVisible(true);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(true);   CBM4.setVisible(true);
        CBM5.setSelected(false);  CBM5.setVisible(false);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);  CBM9.setVisible(false);
        CBM10.setSelected(true);  CBM10.setVisible(true);
        CBM11.setSelected(true);  CBM11.setVisible(true);
        CBM12.setSelected(true);  CBM12.setVisible(true);
        CBM13.setSelected(true);  CBM13.setVisible(true);
      //Numero 2//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(true);   CBM15.setVisible(true);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(false);  CBM17.setVisible(false);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(false);  CBM19.setVisible(false);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(false);  CBM22.setVisible(false);
        CBM23.setSelected(true);  CBM23.setVisible(true);
        CBM24.setSelected(false); CBM24.setVisible(false);
        CBM25.setSelected(false); CBM25.setVisible(false);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }    
//Numero 58//--------------------------------------------------/
        if (!"58".equals(valorm)){
        } else {
        //Numero 2//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(true);   CBM2.setVisible(true);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(true);   CBM4.setVisible(true);
        CBM5.setSelected(false);  CBM5.setVisible(false);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);  CBM9.setVisible(false);
        CBM10.setSelected(true);  CBM10.setVisible(true);
        CBM11.setSelected(true);  CBM11.setVisible(true);
        CBM12.setSelected(true);  CBM12.setVisible(true);
        CBM13.setSelected(true);  CBM13.setVisible(true);
          //Numero 2//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(true);   CBM15.setVisible(true);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(true);  CBM17.setVisible(true);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(true);   CBM22.setVisible(true);
        CBM23.setSelected(true); CBM23.setVisible(true);
        CBM24.setSelected(true);  CBM24.setVisible(true);
        CBM25.setSelected(true);  CBM25.setVisible(true);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }               
 //Numero 59//--------------------------------------------------/
        if (!"59".equals(valorm)){
        } else {
        //Numero 2//    
        CBM1.setSelected(true);   CBM1.setVisible(true);
        CBM2.setSelected(true);   CBM2.setVisible(true);
        CBM3.setSelected(true);   CBM3.setVisible(true);
        CBM4.setSelected(true);   CBM4.setVisible(true);
        CBM5.setSelected(false);  CBM5.setVisible(false);
        CBM6.setSelected(true);   CBM6.setVisible(true);
        CBM7.setSelected(true);   CBM7.setVisible(true);
        CBM8.setSelected(true);   CBM8.setVisible(true);
        CBM9.setSelected(false);  CBM9.setVisible(false);
        CBM10.setSelected(true);  CBM10.setVisible(true);
        CBM11.setSelected(true);  CBM11.setVisible(true);
        CBM12.setSelected(true);  CBM12.setVisible(true);
        CBM13.setSelected(true);  CBM13.setVisible(true);
   //Numero 2//    
        CBM14.setSelected(true);   CBM14.setVisible(true);
        CBM15.setSelected(true);   CBM15.setVisible(true);
        CBM16.setSelected(true);   CBM16.setVisible(true);
        CBM17.setSelected(true);  CBM17.setVisible(true);
        CBM18.setSelected(true);   CBM18.setVisible(true);
        CBM19.setSelected(true);   CBM19.setVisible(true);
        CBM20.setSelected(true);   CBM20.setVisible(true);
        CBM21.setSelected(true);   CBM21.setVisible(true);
        CBM22.setSelected(false);   CBM22.setVisible(false);
        CBM23.setSelected(true); CBM23.setVisible(true);
        CBM24.setSelected(true);  CBM24.setVisible(true);
        CBM25.setSelected(true);  CBM25.setVisible(true);
        CBM26.setSelected(true);  CBM26.setVisible(true);
        }              
        
//***************************SEGUNDOS***********************//         
//Numero 00//--------------------------------------------/
        if (!"00".equals(valors)){
        } else {
        //Numero 0//    
        CBS1.setSelected(true);  CBS1.setVisible(true);
        CBS2.setSelected(true);  CBS2.setVisible(true);
        CBS3.setSelected(true);  CBS3.setVisible(true);
        CBS4.setSelected(true);  CBS4.setVisible(true);
        CBS5.setSelected(true);  CBS5.setVisible(true);
        CBS6.setSelected(true);  CBS6.setVisible(true);
        CBS7.setSelected(false);  CBS7.setVisible(false);
        CBS8.setSelected(true);  CBS8.setVisible(true);
        CBS9.setSelected(true);  CBS9.setVisible(true);
        CBS10.setSelected(true); CBS10.setVisible(true);
        CBS11.setSelected(true); CBS11.setVisible(true);
        CBS12.setSelected(true); CBS12.setVisible(true);
        CBS13.setSelected(true); CBS13.setVisible(true);
        //Numero 0//    
        CBS14.setSelected(true); CBS14.setVisible(true);
        CBS15.setSelected(true); CBS15.setVisible(true);
        CBS16.setSelected(true); CBS16.setVisible(true);
        CBS17.setSelected(true); CBS17.setVisible(true);
        CBS18.setSelected(true); CBS18.setVisible(true);
        CBS19.setSelected(true); CBS19.setVisible(true); 
        CBS20.setSelected(false); CBS20.setVisible(false);
        CBS21.setSelected(true); CBS21.setVisible(true);
        CBS22.setSelected(true); CBS22.setVisible(true);
        CBS23.setSelected(true); CBS23.setVisible(true);
        CBS24.setSelected(true); CBS24.setVisible(true);
        CBS25.setSelected(true); CBS25.setVisible(true); 
        CBS26.setSelected(true); CBS26.setVisible(true);
        }    
 //Numero 0//--------------------------------------------/
        if (!"0".equals(valors)){
        } else {
        //Numero 1//    
        CBS1.setSelected(true);  CBS1.setVisible(true);
        CBS2.setSelected(true);  CBS2.setVisible(true);
        CBS3.setSelected(true);  CBS3.setVisible(true);
        CBS4.setSelected(true);  CBS4.setVisible(true);
        CBS5.setSelected(true);  CBS5.setVisible(true);
        CBS6.setSelected(true);  CBS6.setVisible(true);
        CBS7.setSelected(false);  CBS7.setVisible(false);
        CBS8.setSelected(true);  CBS8.setVisible(true);
        CBS9.setSelected(true);  CBS9.setVisible(true);
        CBS10.setSelected(true); CBS10.setVisible(true);
        CBS11.setSelected(true); CBS11.setVisible(true);
        CBS12.setSelected(true); CBS12.setVisible(true);
        CBS13.setSelected(true); CBS13.setVisible(true);
        //Numero 0//    
        CBS14.setSelected(true); CBS14.setVisible(true);
        CBS15.setSelected(true); CBS15.setVisible(true);
        CBS16.setSelected(true); CBS16.setVisible(true);
        CBS17.setSelected(true); CBS17.setVisible(true);
        CBS18.setSelected(true); CBS18.setVisible(true);
        CBS19.setSelected(true); CBS19.setVisible(true); 
        CBS20.setSelected(false); CBS20.setVisible(false);
        CBS21.setSelected(true); CBS21.setVisible(true);
        CBS22.setSelected(true); CBS22.setVisible(true);
        CBS23.setSelected(true); CBS23.setVisible(true);
        CBS24.setSelected(true); CBS24.setVisible(true);
        CBS25.setSelected(true); CBS25.setVisible(true); 
        CBS26.setSelected(true); CBS26.setVisible(true);
        }    
 //Numero 1//--------------------------------------------/
        if (!"1".equals(valors)){
        } else {
        //Numero 1//    
        CBS14.setSelected(false);  CBS14.setVisible(false);
        CBS15.setSelected(false);  CBS15.setVisible(false);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(false);  CBS17.setVisible(false);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(false);  CBS19.setVisible(false);
        CBS20.setSelected(false);  CBS20.setVisible(false);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(false);  CBS22.setVisible(false);
        CBS23.setSelected(true);  CBS23.setVisible(true);
        CBS24.setSelected(false); CBS24.setVisible(false);
        CBS25.setSelected(false); CBS25.setVisible(false);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        //Numero 0//    
        CBS1.setSelected(true); CBS1.setVisible(true);
        CBS2.setSelected(true); CBS2.setVisible(true);
        CBS3.setSelected(true); CBS3.setVisible(true);
        CBS4.setSelected(true); CBS4.setVisible(true);
        CBS5.setSelected(true); CBS5.setVisible(true);
        CBS6.setSelected(true); CBS6.setVisible(true); 
        CBS7.setSelected(false); CBS7.setVisible(false);
        CBS8.setSelected(true); CBS8.setVisible(true);
        CBS9.setSelected(true); CBS9.setVisible(true);
        CBS10.setSelected(true); CBS10.setVisible(true);
        CBS11.setSelected(true); CBS11.setVisible(true);
        CBS12.setSelected(true); CBS12.setVisible(true); 
        CBS13.setSelected(true); CBS13.setVisible(true);
        }      
//Numero 2//--------------------------------------------------/
        if (!"2".equals(valors)){
        } else {
        //Numero 2//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(true);   CBS15.setVisible(true);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(false);  CBS17.setVisible(false);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(true);   CBS22.setVisible(true);
        CBS23.setSelected(false); CBS23.setVisible(false);
        CBS24.setSelected(true);  CBS24.setVisible(true);
        CBS25.setSelected(true);  CBS25.setVisible(true);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        //Numero 0//    
        CBS1.setSelected(true); CBS1.setVisible(true);
        CBS2.setSelected(true); CBS2.setVisible(true);
        CBS3.setSelected(true); CBS3.setVisible(true);
        CBS4.setSelected(true); CBS4.setVisible(true);
        CBS5.setSelected(true); CBS5.setVisible(true);
        CBS6.setSelected(true); CBS6.setVisible(true); 
        CBS7.setSelected(false); CBS7.setVisible(false);
        CBS8.setSelected(true); CBS8.setVisible(true);
        CBS9.setSelected(true); CBS9.setVisible(true);
        CBS10.setSelected(true); CBS10.setVisible(true);
        CBS11.setSelected(true); CBS11.setVisible(true);
        CBS12.setSelected(true); CBS12.setVisible(true); 
        CBS13.setSelected(true); CBS13.setVisible(true);
        }
//Numero 3//--------------------------------------------------/
        if (!"3".equals(valors)){
        } else {
        //Numero 3//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(true);   CBS15.setVisible(true);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(false);  CBS17.setVisible(false);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(false);  CBS22.setVisible(false);
        CBS23.setSelected(true);  CBS23.setVisible(true);
        CBS24.setSelected(true);  CBS24.setVisible(true);
        CBS25.setSelected(true);  CBS25.setVisible(true);
        CBS26.setSelected(true);  CBS26.setVisible(true);
         //Numero 0//    
        CBS1.setSelected(true); CBS1.setVisible(true);
        CBS2.setSelected(true); CBS2.setVisible(true);
        CBS3.setSelected(true); CBS3.setVisible(true);
        CBS4.setSelected(true); CBS4.setVisible(true);
        CBS5.setSelected(true); CBS5.setVisible(true);
        CBS6.setSelected(true); CBS6.setVisible(true); 
        CBS7.setSelected(false); CBS7.setVisible(false);
        CBS8.setSelected(true); CBS8.setVisible(true);
        CBS9.setSelected(true); CBS9.setVisible(true);
        CBS10.setSelected(true); CBS10.setVisible(true);
        CBS11.setSelected(true); CBS11.setVisible(true);
        CBS12.setSelected(true); CBS12.setVisible(true); 
        CBS13.setSelected(true); CBS13.setVisible(true);
        }              
//Numero 4//--------------------------------------------------/
        if (!"4".equals(valors)){
        } else {
        //Numero 4//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(false);   CBS15.setVisible(false);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(true);  CBS17.setVisible(true);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(false);   CBS22.setVisible(false);
        CBS23.setSelected(true); CBS23.setVisible(true);
        CBS24.setSelected(false);  CBS24.setVisible(false);
        CBS25.setSelected(false);  CBS25.setVisible(false);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        //Numero 0//    
        CBS1.setSelected(true); CBS1.setVisible(true);
        CBS2.setSelected(true); CBS2.setVisible(true);
        CBS3.setSelected(true); CBS3.setVisible(true);
        CBS4.setSelected(true); CBS4.setVisible(true);
        CBS5.setSelected(true); CBS5.setVisible(true);
        CBS6.setSelected(true); CBS6.setVisible(true); 
        CBS7.setSelected(false); CBS7.setVisible(false);
        CBS8.setSelected(true); CBS8.setVisible(true);
        CBS9.setSelected(true); CBS9.setVisible(true);
        CBS10.setSelected(true); CBS10.setVisible(true);
        CBS11.setSelected(true); CBS11.setVisible(true);
        CBS12.setSelected(true); CBS12.setVisible(true); 
        CBS13.setSelected(true); CBS13.setVisible(true);
        }      
//Numero 5//--------------------------------------------------/
        if (!"5".equals(valors)){
        } else {
        //Numero 2//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(true);   CBS15.setVisible(true);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(true);   CBS17.setVisible(true);
        CBS18.setSelected(false);  CBS18.setVisible(false);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(false);  CBS22.setVisible(false);
        CBS23.setSelected(true);  CBS23.setVisible(true);
        CBS24.setSelected(true);  CBS24.setVisible(true);
        CBS25.setSelected(true);  CBS25.setVisible(true);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        //Numero 0//    
        CBS1.setSelected(true); CBS1.setVisible(true);
        CBS2.setSelected(true); CBS2.setVisible(true);
        CBS3.setSelected(true); CBS3.setVisible(true);
        CBS4.setSelected(true); CBS4.setVisible(true);
        CBS5.setSelected(true); CBS5.setVisible(true);
        CBS6.setSelected(true); CBS6.setVisible(true); 
        CBS7.setSelected(false); CBS7.setVisible(false);
        CBS8.setSelected(true); CBS8.setVisible(true);
        CBS9.setSelected(true); CBS9.setVisible(true);
        CBS10.setSelected(true); CBS10.setVisible(true);
        CBS11.setSelected(true); CBS11.setVisible(true);
        CBS12.setSelected(true); CBS12.setVisible(true); 
        CBS13.setSelected(true); CBS13.setVisible(true);
        }
//Numero 6//--------------------------------------------------/
        if (!"6".equals(valors)){
        } else {
        //Numero 2//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(false);  CBS15.setVisible(false);
        CBS16.setSelected(false);  CBS16.setVisible(false);
        CBS17.setSelected(true);   CBS17.setVisible(true);
        CBS18.setSelected(false);  CBS18.setVisible(false);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(true);   CBS22.setVisible(true);
        CBS23.setSelected(true);  CBS23.setVisible(true);
        CBS24.setSelected(true);  CBS24.setVisible(true);
        CBS25.setSelected(true);  CBS25.setVisible(true);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        //Numero 0//    
        CBS1.setSelected(true); CBS1.setVisible(true);
        CBS2.setSelected(true); CBS2.setVisible(true);
        CBS3.setSelected(true); CBS3.setVisible(true);
        CBS4.setSelected(true); CBS4.setVisible(true);
        CBS5.setSelected(true); CBS5.setVisible(true);
        CBS6.setSelected(true); CBS6.setVisible(true); 
        CBS7.setSelected(false); CBS7.setVisible(false);
        CBS8.setSelected(true); CBS8.setVisible(true);
        CBS9.setSelected(true); CBS9.setVisible(true);
        CBS10.setSelected(true); CBS10.setVisible(true);
        CBS11.setSelected(true); CBS11.setVisible(true);
        CBS12.setSelected(true); CBS12.setVisible(true); 
        CBS13.setSelected(true); CBS13.setVisible(true);
        }
//Numero 7//--------------------------------------------------/
        if (!"7".equals(valors)){
        } else {
        //Numero 2//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(true);   CBS15.setVisible(true);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(false);  CBS17.setVisible(false);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(false);  CBS19.setVisible(false);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(false);  CBS22.setVisible(false);
        CBS23.setSelected(true);  CBS23.setVisible(true);
        CBS24.setSelected(false); CBS24.setVisible(false);
        CBS25.setSelected(false); CBS25.setVisible(false);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        //Numero 0//    
        CBS1.setSelected(true); CBS1.setVisible(true);
        CBS2.setSelected(true); CBS2.setVisible(true);
        CBS3.setSelected(true); CBS3.setVisible(true);
        CBS4.setSelected(true); CBS4.setVisible(true);
        CBS5.setSelected(true); CBS5.setVisible(true);
        CBS6.setSelected(true); CBS6.setVisible(true); 
        CBS7.setSelected(false); CBS7.setVisible(false);
        CBS8.setSelected(true); CBS8.setVisible(true);
        CBS9.setSelected(true); CBS9.setVisible(true);
        CBS10.setSelected(true); CBS10.setVisible(true);
        CBS11.setSelected(true); CBS11.setVisible(true);
        CBS12.setSelected(true); CBS12.setVisible(true); 
        CBS13.setSelected(true); CBS13.setVisible(true);
        }  
//Numero 8//--------------------------------------------------/
        if (!"8".equals(valors)){
        } else {
        //Numero 2//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(true);   CBS15.setVisible(true);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(true);  CBS17.setVisible(true);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(true);   CBS22.setVisible(true);
        CBS23.setSelected(true); CBS23.setVisible(true);
        CBS24.setSelected(true);  CBS24.setVisible(true);
        CBS25.setSelected(true);  CBS25.setVisible(true);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        //Numero 0//    
        CBS1.setSelected(true); CBS1.setVisible(true);
        CBS2.setSelected(true); CBS2.setVisible(true);
        CBS3.setSelected(true); CBS3.setVisible(true);
        CBS4.setSelected(true); CBS4.setVisible(true);
        CBS5.setSelected(true); CBS5.setVisible(true);
        CBS6.setSelected(true); CBS6.setVisible(true); 
        CBS7.setSelected(false); CBS7.setVisible(false);
        CBS8.setSelected(true); CBS8.setVisible(true);
        CBS9.setSelected(true); CBS9.setVisible(true);
        CBS10.setSelected(true); CBS10.setVisible(true);
        CBS11.setSelected(true); CBS11.setVisible(true);
        CBS12.setSelected(true); CBS12.setVisible(true); 
        CBS13.setSelected(true); CBS13.setVisible(true);
        }
//Numero 9//--------------------------------------------------/
        if (!"9".equals(valors)){
        } else {
        //Numero 2//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(true);   CBS15.setVisible(true);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(true);  CBS17.setVisible(true);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(false);   CBS22.setVisible(false);
        CBS23.setSelected(true); CBS23.setVisible(true);
        CBS24.setSelected(true);  CBS24.setVisible(true);
        CBS25.setSelected(true);  CBS25.setVisible(true);
        CBS26.setSelected(true);  CBS26.setVisible(true);
       //Numero 0//    
        CBS1.setSelected(true); CBS1.setVisible(true);
        CBS2.setSelected(true); CBS2.setVisible(true);
        CBS3.setSelected(true); CBS3.setVisible(true);
        CBS4.setSelected(true); CBS4.setVisible(true);
        CBS5.setSelected(true); CBS5.setVisible(true);
        CBS6.setSelected(true); CBS6.setVisible(true); 
        CBS7.setSelected(false); CBS7.setVisible(false);
        CBS8.setSelected(true); CBS8.setVisible(true);
        CBS9.setSelected(true); CBS9.setVisible(true);
        CBS10.setSelected(true); CBS10.setVisible(true);
        CBS11.setSelected(true); CBS11.setVisible(true);
        CBS12.setSelected(true); CBS12.setVisible(true); 
        CBS13.setSelected(true); CBS13.setVisible(true);
        }
//Numero 10//---------------------------------------------------/
        if (!"10".equals(valors)){
        } else {
        //Numero 1//    
        CBS1.setSelected(false);  CBS1.setVisible(false);
        CBS2.setSelected(false);  CBS2.setVisible(false);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(false);  CBS4.setVisible(false);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(false);  CBS6.setVisible(false);
        CBS7.setSelected(false);  CBS7.setVisible(false);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);  CBS9.setVisible(false);
        CBS10.setSelected(true);  CBS10.setVisible(true);
        CBS11.setSelected(false); CBS11.setVisible(false);
        CBS12.setSelected(false); CBS12.setVisible(false);
        CBS13.setSelected(true);  CBS13.setVisible(true);
           //Numero 0//    
        CBS14.setSelected(true); CBS14.setVisible(true);
        CBS15.setSelected(true); CBS15.setVisible(true);
        CBS16.setSelected(true); CBS16.setVisible(true);
        CBS17.setSelected(true); CBS17.setVisible(true);
        CBS18.setSelected(true); CBS18.setVisible(true);
        CBS19.setSelected(true); CBS19.setVisible(true); 
        CBS20.setSelected(false); CBS20.setVisible(false);
        CBS21.setSelected(true); CBS21.setVisible(true);
        CBS22.setSelected(true); CBS22.setVisible(true);
        CBS23.setSelected(true); CBS23.setVisible(true);
        CBS24.setSelected(true); CBS24.setVisible(true);
        CBS25.setSelected(true); CBS25.setVisible(true); 
        CBS26.setSelected(true); CBS26.setVisible(true);
        }     
//Numero 11//---------------------------------------------------/
        if (!"11".equals(valors)){
        } else {
        //Numero 1//    
        CBS1.setSelected(false);  CBS1.setVisible(false);
        CBS2.setSelected(false);  CBS2.setVisible(false);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(false);  CBS4.setVisible(false);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(false);  CBS6.setVisible(false);
        CBS7.setSelected(false);  CBS7.setVisible(false);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);  CBS9.setVisible(false);
        CBS10.setSelected(true);  CBS10.setVisible(true);
        CBS11.setSelected(false); CBS11.setVisible(false);
        CBS12.setSelected(false); CBS12.setVisible(false);
        CBS13.setSelected(true);  CBS13.setVisible(true);
        //Numero 1// 
        CBS14.setSelected(false); CBS14.setVisible(false);
        CBS15.setSelected(false); CBS15.setVisible(false);
        CBS16.setSelected(true);  CBS16.setVisible(true);
        CBS17.setSelected(false); CBS17.setVisible(false);
        CBS18.setSelected(true);  CBS18.setVisible(true);
        CBS19.setSelected(false); CBS19.setVisible(false);
        CBS20.setSelected(false); CBS20.setVisible(false);
        CBS21.setSelected(true);  CBS21.setVisible(true);
        CBS22.setSelected(false); CBS22.setVisible(false);
        CBS23.setSelected(true);  CBS23.setVisible(true);
        CBS24.setSelected(false); CBS24.setVisible(false);
        CBS25.setSelected(false); CBS25.setVisible(false);
        CBS26.setSelected(true);  CBS26.setVisible(true);        
        }           
//Numero 12//-------------------------------------------------------/
        if (!"12".equals(valors)){
        } else {
        //Numero 1//    
        CBS1.setSelected(false);  CBS1.setVisible(false);
        CBS2.setSelected(false);  CBS2.setVisible(false);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(false);  CBS4.setVisible(false);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(false);  CBS6.setVisible(false);
        CBS7.setSelected(false);  CBS7.setVisible(false);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);  CBS9.setVisible(false);
        CBS10.setSelected(true);  CBS10.setVisible(true);
        CBS11.setSelected(false); CBS11.setVisible(false);
        CBS12.setSelected(false); CBS12.setVisible(false);
        CBS13.setSelected(true);  CBS13.setVisible(true);
        //Numero 2//    
        CBS14.setSelected(false); CBS14.setVisible(false);
        CBS15.setSelected(false); CBS15.setVisible(false);
        CBS16.setSelected(true);  CBS16.setVisible(true);
        CBS17.setSelected(false); CBS17.setVisible(false);
        CBS18.setSelected(true);  CBS18.setVisible(true);
        CBS19.setSelected(false); CBS19.setVisible(false);
        CBS20.setSelected(false); CBS20.setVisible(false);
        CBS21.setSelected(true);  CBS21.setVisible(true);
        CBS22.setSelected(false); CBS22.setVisible(false);
        CBS23.setSelected(true);  CBS23.setVisible(true);
        CBS24.setSelected(false); CBS24.setVisible(false);
        CBS25.setSelected(false); CBS25.setVisible(false);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }                   
//Numero 13//-------------------------------------------------------/
        if (!"13".equals(valors)){
        } else {
        //Numero 1//    
        CBS1.setSelected(false);  CBS1.setVisible(false);
        CBS2.setSelected(false);  CBS2.setVisible(false);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(false);  CBS4.setVisible(false);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(false);  CBS6.setVisible(false);
        CBS7.setSelected(false);  CBS7.setVisible(false);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);  CBS9.setVisible(false);
        CBS10.setSelected(true);  CBS10.setVisible(true);
        CBS11.setSelected(false); CBS11.setVisible(false);
        CBS12.setSelected(false); CBS12.setVisible(false);
        CBS13.setSelected(true);  CBS13.setVisible(true);
        //Numero 3//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(true);   CBS15.setVisible(true);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(false);  CBS17.setVisible(false);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(false);  CBS22.setVisible(false);
        CBS23.setSelected(true);  CBS23.setVisible(true);
        CBS24.setSelected(true);  CBS24.setVisible(true);
        CBS25.setSelected(true);  CBS25.setVisible(true);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }            
//Numero 14//-------------------------------------------------------/
        if (!"14".equals(valors)){
        } else {
        //Numero 1//    
        CBS1.setSelected(false);  CBS1.setVisible(false);
        CBS2.setSelected(false);  CBS2.setVisible(false);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(false);  CBS4.setVisible(false);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(false);  CBS6.setVisible(false);
        CBS7.setSelected(false);  CBS7.setVisible(false);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);  CBS9.setVisible(false);
        CBS10.setSelected(true);  CBS10.setVisible(true);
        CBS11.setSelected(false); CBS11.setVisible(false);
        CBS12.setSelected(false); CBS12.setVisible(false);
        CBS13.setSelected(true);  CBS13.setVisible(true);
   //Numero 4//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(false);   CBS15.setVisible(false);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(true);  CBS17.setVisible(true);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(false);   CBS22.setVisible(false);
        CBS23.setSelected(true); CBS23.setVisible(true);
        CBS24.setSelected(false);  CBS24.setVisible(false);
        CBS25.setSelected(false);  CBS25.setVisible(false);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }                    
//Numero 15//-------------------------------------------------------/
        if (!"15".equals(valors)){
        } else {
        //Numero 1//    
        CBS1.setSelected(false);  CBS1.setVisible(false);
        CBS2.setSelected(false);  CBS2.setVisible(false);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(false);  CBS4.setVisible(false);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(false);  CBS6.setVisible(false);
        CBS7.setSelected(false);  CBS7.setVisible(false);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);  CBS9.setVisible(false);
        CBS10.setSelected(true);  CBS10.setVisible(true);
        CBS11.setSelected(false); CBS11.setVisible(false);
        CBS12.setSelected(false); CBS12.setVisible(false);
        CBS13.setSelected(true);  CBS13.setVisible(true);
   //Numero 5//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(true);   CBS15.setVisible(true);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(true);   CBS17.setVisible(true);
        CBS18.setSelected(false);  CBS18.setVisible(false);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(false);  CBS22.setVisible(false);
        CBS23.setSelected(true);  CBS23.setVisible(true);
        CBS24.setSelected(true);  CBS24.setVisible(true);
        CBS25.setSelected(true);  CBS25.setVisible(true);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }                            
 //Numero 16//-------------------------------------------------------/
        if (!"16".equals(valors)){
        } else {
        //Numero 1//    
        CBS1.setSelected(false);  CBS1.setVisible(false);
        CBS2.setSelected(false);  CBS2.setVisible(false);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(false);  CBS4.setVisible(false);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(false);  CBS6.setVisible(false);
        CBS7.setSelected(false);  CBS7.setVisible(false);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);  CBS9.setVisible(false);
        CBS10.setSelected(true);  CBS10.setVisible(true);
        CBS11.setSelected(false); CBS11.setVisible(false);
        CBS12.setSelected(false); CBS12.setVisible(false);
        CBS13.setSelected(true);  CBS13.setVisible(true);
  //Numero 2//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(false);  CBS15.setVisible(false);
        CBS16.setSelected(false);  CBS16.setVisible(false);
        CBS17.setSelected(true);   CBS17.setVisible(true);
        CBS18.setSelected(false);  CBS18.setVisible(false);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(true);   CBS22.setVisible(true);
        CBS23.setSelected(true);  CBS23.setVisible(true);
        CBS24.setSelected(true);  CBS24.setVisible(true);
        CBS25.setSelected(true);  CBS25.setVisible(true);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }               
 //Numero 17//-------------------------------------------------------/
        if (!"17".equals(valors)){
        } else {
        //Numero 1//    
        CBS1.setSelected(false);  CBS1.setVisible(false);
        CBS2.setSelected(false);  CBS2.setVisible(false);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(false);  CBS4.setVisible(false);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(false);  CBS6.setVisible(false);
        CBS7.setSelected(false);  CBS7.setVisible(false);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);  CBS9.setVisible(false);
        CBS10.setSelected(true);  CBS10.setVisible(true);
        CBS11.setSelected(false); CBS11.setVisible(false);
        CBS12.setSelected(false); CBS12.setVisible(false);
        CBS13.setSelected(true);  CBS13.setVisible(true);
  //Numero 2//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(true);   CBS15.setVisible(true);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(false);  CBS17.setVisible(false);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(false);  CBS19.setVisible(false);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(false);  CBS22.setVisible(false);
        CBS23.setSelected(true);  CBS23.setVisible(true);
        CBS24.setSelected(false); CBS24.setVisible(false);
        CBS25.setSelected(false); CBS25.setVisible(false);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }                       
 //Numero 18//-------------------------------------------------------/
        if (!"18".equals(valors)){
        } else {
        //Numero 1//    
        CBS1.setSelected(false);  CBS1.setVisible(false);
        CBS2.setSelected(false);  CBS2.setVisible(false);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(false);  CBS4.setVisible(false);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(false);  CBS6.setVisible(false);
        CBS7.setSelected(false);  CBS7.setVisible(false);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);  CBS9.setVisible(false);
        CBS10.setSelected(true);  CBS10.setVisible(true);
        CBS11.setSelected(false); CBS11.setVisible(false);
        CBS12.setSelected(false); CBS12.setVisible(false);
        CBS13.setSelected(true);  CBS13.setVisible(true);
        //Numero 2//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(true);   CBS15.setVisible(true);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(true);  CBS17.setVisible(true);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(true);   CBS22.setVisible(true);
        CBS23.setSelected(true); CBS23.setVisible(true);
        CBS24.setSelected(true);  CBS24.setVisible(true);
        CBS25.setSelected(true);  CBS25.setVisible(true);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }                      
  //Numero 19//-------------------------------------------------------/
        if (!"19".equals(valors)){
        } else {
        //Numero 1//    
        CBS1.setSelected(false);  CBS1.setVisible(false);
        CBS2.setSelected(false);  CBS2.setVisible(false);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(false);  CBS4.setVisible(false);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(false);  CBS6.setVisible(false);
        CBS7.setSelected(false);  CBS7.setVisible(false);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);  CBS9.setVisible(false);
        CBS10.setSelected(true);  CBS10.setVisible(true);
        CBS11.setSelected(false); CBS11.setVisible(false);
        CBS12.setSelected(false); CBS12.setVisible(false);
        CBS13.setSelected(true);  CBS13.setVisible(true);
 //Numero 2//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(true);   CBS15.setVisible(true);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(true);  CBS17.setVisible(true);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(false);   CBS22.setVisible(false);
        CBS23.setSelected(true); CBS23.setVisible(true);
        CBS24.setSelected(true);  CBS24.setVisible(true);
        CBS25.setSelected(true);  CBS25.setVisible(true);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }                      
//Numero 20//--------------------------------------------------/
        if (!"20".equals(valors)){
        } else {
        //Numero 2//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(true);   CBS2.setVisible(true);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(false);  CBS4.setVisible(false);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(true);   CBS9.setVisible(true);
        CBS10.setSelected(false); CBS10.setVisible(false);
        CBS11.setSelected(true);  CBS11.setVisible(true);
        CBS12.setSelected(true);  CBS12.setVisible(true);
        CBS13.setSelected(true);  CBS13.setVisible(true);
        //Numero 0//    
           //Numero 0//    
        CBS14.setSelected(true); CBS14.setVisible(true);
        CBS15.setSelected(true); CBS15.setVisible(true);
        CBS16.setSelected(true); CBS16.setVisible(true);
        CBS17.setSelected(true); CBS17.setVisible(true);
        CBS18.setSelected(true); CBS18.setVisible(true);
        CBS19.setSelected(true); CBS19.setVisible(true); 
        CBS20.setSelected(false); CBS20.setVisible(false);
        CBS21.setSelected(true); CBS21.setVisible(true);
        CBS22.setSelected(true); CBS22.setVisible(true);
        CBS23.setSelected(true); CBS23.setVisible(true);
        CBS24.setSelected(true); CBS24.setVisible(true);
        CBS25.setSelected(true); CBS25.setVisible(true); 
        CBS26.setSelected(true); CBS26.setVisible(true);
        }
//Numero 21//--------------------------------------------------/
        if (!"21".equals(valors)){
        } else {
        //Numero 2//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(true);   CBS2.setVisible(true);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(false);  CBS4.setVisible(false);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(true);   CBS9.setVisible(true);
        CBS10.setSelected(false); CBS10.setVisible(false);
        CBS11.setSelected(true);  CBS11.setVisible(true);
        CBS12.setSelected(true);  CBS12.setVisible(true);
        CBS13.setSelected(true);  CBS13.setVisible(true);
             //Numero 1//    
        CBS14.setSelected(false);  CBS14.setVisible(false);
        CBS15.setSelected(false);  CBS15.setVisible(false);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(false);  CBS17.setVisible(false);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(false);  CBS19.setVisible(false);
        CBS20.setSelected(false);  CBS20.setVisible(false);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(false);  CBS22.setVisible(false);
        CBS23.setSelected(true);  CBS23.setVisible(true);
        CBS24.setSelected(false); CBS24.setVisible(false);
        CBS25.setSelected(false); CBS25.setVisible(false);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }        
 //Numero 22//--------------------------------------------------/
        if (!"22".equals(valors)){
        } else {
        //Numero 2//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(true);   CBS2.setVisible(true);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(false);  CBS4.setVisible(false);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(true);   CBS9.setVisible(true);
        CBS10.setSelected(false); CBS10.setVisible(false);
        CBS11.setSelected(true);  CBS11.setVisible(true);
        CBS12.setSelected(true);  CBS12.setVisible(true);
        CBS13.setSelected(true);  CBS13.setVisible(true);
         //Numero 2//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(true);   CBS15.setVisible(true);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(false);  CBS17.setVisible(false);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(true);   CBS22.setVisible(true);
        CBS23.setSelected(false); CBS23.setVisible(false);
        CBS24.setSelected(true);  CBS24.setVisible(true);
        CBS25.setSelected(true);  CBS25.setVisible(true);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }       
//Numero 23//--------------------------------------------------/
        if (!"23".equals(valors)){
        } else {
        //Numero 2//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(true);   CBS2.setVisible(true);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(false);  CBS4.setVisible(false);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(true);   CBS9.setVisible(true);
        CBS10.setSelected(false); CBS10.setVisible(false);
        CBS11.setSelected(true);  CBS11.setVisible(true);
        CBS12.setSelected(true);  CBS12.setVisible(true);
        CBS13.setSelected(true);  CBS13.setVisible(true);
       //Numero 3//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(true);   CBS15.setVisible(true);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(false);  CBS17.setVisible(false);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(false);  CBS22.setVisible(false);
        CBS23.setSelected(true);  CBS23.setVisible(true);
        CBS24.setSelected(true);  CBS24.setVisible(true);
        CBS25.setSelected(true);  CBS25.setVisible(true);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }        
 //Numero 24//--------------------------------------------------/
        if (!"24".equals(valors)){
        } else {
        //Numero 2//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(true);   CBS2.setVisible(true);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(false);  CBS4.setVisible(false);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(true);   CBS9.setVisible(true);
        CBS10.setSelected(false); CBS10.setVisible(false);
        CBS11.setSelected(true);  CBS11.setVisible(true);
        CBS12.setSelected(true);  CBS12.setVisible(true);
        CBS13.setSelected(true);  CBS13.setVisible(true);
       //Numero 4//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(false);   CBS15.setVisible(false);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(true);  CBS17.setVisible(true);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(false);   CBS22.setVisible(false);
        CBS23.setSelected(true); CBS23.setVisible(true);
        CBS24.setSelected(false);  CBS24.setVisible(false);
        CBS25.setSelected(false);  CBS25.setVisible(false);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }       
 //Numero 25//--------------------------------------------------/
        if (!"25".equals(valors)){
        } else {
        //Numero 2//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(true);   CBS2.setVisible(true);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(false);  CBS4.setVisible(false);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(true);   CBS9.setVisible(true);
        CBS10.setSelected(false); CBS10.setVisible(false);
        CBS11.setSelected(true);  CBS11.setVisible(true);
        CBS12.setSelected(true);  CBS12.setVisible(true);
        CBS13.setSelected(true);  CBS13.setVisible(true);
      //Numero 2//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(true);   CBS15.setVisible(true);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(true);   CBS17.setVisible(true);
        CBS18.setSelected(false);  CBS18.setVisible(false);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(false);  CBS22.setVisible(false);
        CBS23.setSelected(true);  CBS23.setVisible(true);
        CBS24.setSelected(true);  CBS24.setVisible(true);
        CBS25.setSelected(true);  CBS25.setVisible(true);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }  
//Numero 26//--------------------------------------------------/
        if (!"26".equals(valors)){
        } else {
        //Numero 2//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(true);   CBS2.setVisible(true);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(false);  CBS4.setVisible(false);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(true);   CBS9.setVisible(true);
        CBS10.setSelected(false); CBS10.setVisible(false);
        CBS11.setSelected(true);  CBS11.setVisible(true);
        CBS12.setSelected(true);  CBS12.setVisible(true);
        CBS13.setSelected(true);  CBS13.setVisible(true);
        //Numero 2//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(false);  CBS15.setVisible(false);
        CBS16.setSelected(false);  CBS16.setVisible(false);
        CBS17.setSelected(true);   CBS17.setVisible(true);
        CBS18.setSelected(false);  CBS18.setVisible(false);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(true);   CBS22.setVisible(true);
        CBS23.setSelected(true);  CBS23.setVisible(true);
        CBS24.setSelected(true);  CBS24.setVisible(true);
        CBS25.setSelected(true);  CBS25.setVisible(true);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }        
 //Numero 27//--------------------------------------------------/
        if (!"30".equals(valors)){
        } else {
        //Numero 2//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(true);   CBS2.setVisible(true);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(false);  CBS4.setVisible(false);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(true);   CBS9.setVisible(true);
        CBS10.setSelected(false); CBS10.setVisible(false);
        CBS11.setSelected(true);  CBS11.setVisible(true);
        CBS12.setSelected(true);  CBS12.setVisible(true);
        CBS13.setSelected(true);  CBS13.setVisible(true);
         //Numero 2//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(true);   CBS15.setVisible(true);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(false);  CBS17.setVisible(false);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(false);  CBS19.setVisible(false);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(false);  CBS22.setVisible(false);
        CBS23.setSelected(true);  CBS23.setVisible(true);
        CBS24.setSelected(false); CBS24.setVisible(false);
        CBS25.setSelected(false); CBS25.setVisible(false);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        } 
 //Numero 28//--------------------------------------------------/
        if (!"28".equals(valors)){
        } else {
        //Numero 2//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(true);   CBS2.setVisible(true);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(false);  CBS4.setVisible(false);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(true);   CBS9.setVisible(true);
        CBS10.setSelected(false); CBS10.setVisible(false);
        CBS11.setSelected(true);  CBS11.setVisible(true);
        CBS12.setSelected(true);  CBS12.setVisible(true);
        CBS13.setSelected(true);  CBS13.setVisible(true);
         //Numero 2//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(true);   CBS15.setVisible(true);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(true);  CBS17.setVisible(true);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(true);   CBS22.setVisible(true);
        CBS23.setSelected(true); CBS23.setVisible(true);
        CBS24.setSelected(true);  CBS24.setVisible(true);
        CBS25.setSelected(true);  CBS25.setVisible(true);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }       
//Numero 29//--------------------------------------------------/
        if (!"29".equals(valors)){
        } else {
        //Numero 2//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(true);   CBS2.setVisible(true);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(false);  CBS4.setVisible(false);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(true);   CBS9.setVisible(true);
        CBS10.setSelected(false); CBS10.setVisible(false);
        CBS11.setSelected(true);  CBS11.setVisible(true);
        CBS12.setSelected(true);  CBS12.setVisible(true);
        CBS13.setSelected(true);  CBS13.setVisible(true);
       //Numero 2//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(true);   CBS15.setVisible(true);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(true);  CBS17.setVisible(true);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(false);   CBS22.setVisible(false);
        CBS23.setSelected(true); CBS23.setVisible(true);
        CBS24.setSelected(true);  CBS24.setVisible(true);
        CBS25.setSelected(true);  CBS25.setVisible(true);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }
        
//Numero 30//--------------------------------------------------/
        if (!"30".equals(valors)){
        } else {
        //Numero 3//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(true);   CBS2.setVisible(true);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(false);  CBS4.setVisible(false);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);  CBS9.setVisible(false);
        CBS10.setSelected(true);  CBS10.setVisible(true);
        CBS11.setSelected(true);  CBS11.setVisible(true);
        CBS12.setSelected(true);  CBS12.setVisible(true);
        CBS13.setSelected(true);  CBS13.setVisible(true);
          //Numero 0//    
          //Numero 0//    
        CBS14.setSelected(true); CBS14.setVisible(true);
        CBS15.setSelected(true); CBS15.setVisible(true);
        CBS16.setSelected(true); CBS16.setVisible(true);
        CBS17.setSelected(true); CBS17.setVisible(true);
        CBS18.setSelected(true); CBS18.setVisible(true);
        CBS19.setSelected(true); CBS19.setVisible(true); 
        CBS20.setSelected(false); CBS20.setVisible(false);
        CBS21.setSelected(true); CBS21.setVisible(true);
        CBS22.setSelected(true); CBS22.setVisible(true);
        CBS23.setSelected(true); CBS23.setVisible(true);
        CBS24.setSelected(true); CBS24.setVisible(true);
        CBS25.setSelected(true); CBS25.setVisible(true); 
        CBS26.setSelected(true); CBS26.setVisible(true);
        }           
  
//Numero 31//--------------------------------------------------/
        if (!"31".equals(valors)){
        } else {
        //Numero 3//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(true);   CBS2.setVisible(true);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(false);  CBS4.setVisible(false);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);  CBS9.setVisible(false);
        CBS10.setSelected(true);  CBS10.setVisible(true);
        CBS11.setSelected(true);  CBS11.setVisible(true);
        CBS12.setSelected(true);  CBS12.setVisible(true);
        CBS13.setSelected(true);  CBS13.setVisible(true);
       //Numero 1//    
        CBS14.setSelected(false);  CBS14.setVisible(false);
        CBS15.setSelected(false);  CBS15.setVisible(false);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(false);  CBS17.setVisible(false);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(false);  CBS19.setVisible(false);
        CBS20.setSelected(false);  CBS20.setVisible(false);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(false);  CBS22.setVisible(false);
        CBS23.setSelected(true);  CBS23.setVisible(true);
        CBS24.setSelected(false); CBS24.setVisible(false);
        CBS25.setSelected(false); CBS25.setVisible(false);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }               
 //Numero 32//--------------------------------------------------/
        if (!"32".equals(valors)){
        } else {
        //Numero 3//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(true);   CBS2.setVisible(true);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(false);  CBS4.setVisible(false);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);  CBS9.setVisible(false);
        CBS10.setSelected(true);  CBS10.setVisible(true);
        CBS11.setSelected(true);  CBS11.setVisible(true);
        CBS12.setSelected(true);  CBS12.setVisible(true);
        CBS13.setSelected(true);  CBS13.setVisible(true);
        //Numero 2//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(true);   CBS15.setVisible(true);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(false);  CBS17.setVisible(false);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(true);   CBS22.setVisible(true);
        CBS23.setSelected(false); CBS23.setVisible(false);
        CBS24.setSelected(true);  CBS24.setVisible(true);
        CBS25.setSelected(true);  CBS25.setVisible(true);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }              
//Numero 33//--------------------------------------------------/
        if (!"33".equals(valors)){
        } else {
        //Numero 3//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(true);   CBS2.setVisible(true);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(false);  CBS4.setVisible(false);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);  CBS9.setVisible(false);
        CBS10.setSelected(true);  CBS10.setVisible(true);
        CBS11.setSelected(true);  CBS11.setVisible(true);
        CBS12.setSelected(true);  CBS12.setVisible(true);
        CBS13.setSelected(true);  CBS13.setVisible(true);
         //Numero 3//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(true);   CBS15.setVisible(true);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(false);  CBS17.setVisible(false);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(false);  CBS22.setVisible(false);
        CBS23.setSelected(true);  CBS23.setVisible(true);
        CBS24.setSelected(true);  CBS24.setVisible(true);
        CBS25.setSelected(true);  CBS25.setVisible(true);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }              

 //Numero 34//--------------------------------------------------/
        if (!"34".equals(valors)){
        } else {
        //Numero 3//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(true);   CBS2.setVisible(true);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(false);  CBS4.setVisible(false);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);  CBS9.setVisible(false);
        CBS10.setSelected(true);  CBS10.setVisible(true);
        CBS11.setSelected(true);  CBS11.setVisible(true);
        CBS12.setSelected(true);  CBS12.setVisible(true);
        CBS13.setSelected(true);  CBS13.setVisible(true);
        //Numero 4//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(false);   CBS15.setVisible(false);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(true);  CBS17.setVisible(true);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(false);   CBS22.setVisible(false);
        CBS23.setSelected(true); CBS23.setVisible(true);
        CBS24.setSelected(false);  CBS24.setVisible(false);
        CBS25.setSelected(false);  CBS25.setVisible(false);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }       
  /*
 //Numero 35//--------------------------------------------------/
        if (!"35".equals(valors)){
        } else {
        //Numero 3//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(true);   CBS2.setVisible(true);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(false);  CBS4.setVisible(false);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);  CBS9.setVisible(false);
        CBS10.setSelected(true);  CBS10.setVisible(true);
        CBS11.setSelected(true);  CBS11.setVisible(true);
        CBS12.setSelected(true);  CBS12.setVisible(true);
        CBS13.setSelected(true);  CBS13.setVisible(true);
    //Numero 2//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(true);   CBS15.setVisible(true);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(true);   CBS17.setVisible(true);
        CBS18.setSelected(false);  CBS18.setVisible(false);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(false);  CBS22.setVisible(false);
        CBS23.setSelected(true);  CBS23.setVisible(true);
        CBS24.setSelected(true);  CBS24.setVisible(true);
        CBS25.setSelected(true);  CBS25.setVisible(true);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        } 
        
//Numero 36//--------------------------------------------------/
        if (!"36".equals(valors)){
        } else {
        //Numero 3//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(true);   CBS2.setVisible(true);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(false);  CBS4.setVisible(false);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);  CBS9.setVisible(false);
        CBS10.setSelected(true);  CBS10.setVisible(true);
        CBS11.setSelected(true);  CBS11.setVisible(true);
        CBS12.setSelected(true);  CBS12.setVisible(true);
        CBS13.setSelected(true);  CBS13.setVisible(true);
      //Numero 2//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(false);  CBS15.setVisible(false);
        CBS16.setSelected(false);  CBS16.setVisible(false);
        CBS17.setSelected(true);   CBS17.setVisible(true);
        CBS18.setSelected(false);  CBS18.setVisible(false);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(true);   CBS22.setVisible(true);
        CBS23.setSelected(true);  CBS23.setVisible(true);
        CBS24.setSelected(true);  CBS24.setVisible(true);
        CBS25.setSelected(true);  CBS25.setVisible(true);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }   
//Numero 37//--------------------------------------------------/
        if (!"37".equals(valors)){
        } else {
        //Numero 3//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(true);   CBS2.setVisible(true);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(false);  CBS4.setVisible(false);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);  CBS9.setVisible(false);
        CBS10.setSelected(true);  CBS10.setVisible(true);
        CBS11.setSelected(true);  CBS11.setVisible(true);
        CBS12.setSelected(true);  CBS12.setVisible(true);
        CBS13.setSelected(true);  CBS13.setVisible(true);
          //Numero 2//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(true);   CBS15.setVisible(true);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(false);  CBS17.setVisible(false);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(false);  CBS19.setVisible(false);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(false);  CBS22.setVisible(false);
        CBS23.setSelected(true);  CBS23.setVisible(true);
        CBS24.setSelected(false); CBS24.setVisible(false);
        CBS25.setSelected(false); CBS25.setVisible(false);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }
//Numero 38//--------------------------------------------------/
        if (!"38".equals(valors)){
        } else {
        //Numero 3//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(true);   CBS2.setVisible(true);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(false);  CBS4.setVisible(false);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);  CBS9.setVisible(false);
        CBS10.setSelected(true);  CBS10.setVisible(true);
        CBS11.setSelected(true);  CBS11.setVisible(true);
        CBS12.setSelected(true);  CBS12.setVisible(true);
        CBS13.setSelected(true);  CBS13.setVisible(true);
          //Numero 2//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(true);   CBS15.setVisible(true);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(true);  CBS17.setVisible(true);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(true);   CBS22.setVisible(true);
        CBS23.setSelected(true); CBS23.setVisible(true);
        CBS24.setSelected(true);  CBS24.setVisible(true);
        CBS25.setSelected(true);  CBS25.setVisible(true);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }   
//Numero 39//--------------------------------------------------/
        if (!"39".equals(valors)){
        } else {
        //Numero 3//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(true);   CBS2.setVisible(true);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(false);  CBS4.setVisible(false);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);  CBS9.setVisible(false);
        CBS10.setSelected(true);  CBS10.setVisible(true);
        CBS11.setSelected(true);  CBS11.setVisible(true);
        CBS12.setSelected(true);  CBS12.setVisible(true);
        CBS13.setSelected(true);  CBS13.setVisible(true);
       //Numero 2//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(true);   CBS15.setVisible(true);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(true);  CBS17.setVisible(true);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(false);   CBS22.setVisible(false);
        CBS23.setSelected(true); CBS23.setVisible(true);
        CBS24.setSelected(true);  CBS24.setVisible(true);
        CBS25.setSelected(true);  CBS25.setVisible(true);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }               
        
//Numero 40//--------------------------------------------------/
        if (!"40".equals(valors)){
        } else {
        //Numero 4//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(false);   CBS2.setVisible(false);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(true);  CBS4.setVisible(true);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);   CBS9.setVisible(false);
        CBS10.setSelected(true); CBS10.setVisible(true);
        CBS11.setSelected(false);  CBS11.setVisible(false);
        CBS12.setSelected(false);  CBS12.setVisible(false);
        CBS13.setSelected(true);  CBS13.setVisible(true);
        //Numero 0//    
            //Numero 0//    
        CBS14.setSelected(true); CBS14.setVisible(true);
        CBS15.setSelected(true); CBS15.setVisible(true);
        CBS16.setSelected(true); CBS16.setVisible(true);
        CBS17.setSelected(true); CBS17.setVisible(true);
        CBS18.setSelected(true); CBS18.setVisible(true);
        CBS19.setSelected(true); CBS19.setVisible(true); 
        CBS20.setSelected(false); CBS20.setVisible(false);
        CBS21.setSelected(true); CBS21.setVisible(true);
        CBS22.setSelected(true); CBS22.setVisible(true);
        CBS23.setSelected(true); CBS23.setVisible(true);
        CBS24.setSelected(true); CBS24.setVisible(true);
        CBS25.setSelected(true); CBS25.setVisible(true); 
        CBS26.setSelected(true); CBS26.setVisible(true);
        }   
 //Numero 41//--------------------------------------------------/
        if (!"41".equals(valors)){
        } else {
        //Numero 4//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(false);   CBS2.setVisible(false);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(true);  CBS4.setVisible(true);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);   CBS9.setVisible(false);
        CBS10.setSelected(true); CBS10.setVisible(true);
        CBS11.setSelected(false);  CBS11.setVisible(false);
        CBS12.setSelected(false);  CBS12.setVisible(false);
        CBS13.setSelected(true);  CBS13.setVisible(true);
         //Numero 1//    
        CBS14.setSelected(false);  CBS14.setVisible(false);
        CBS15.setSelected(false);  CBS15.setVisible(false);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(false);  CBS17.setVisible(false);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(false);  CBS19.setVisible(false);
        CBS20.setSelected(false);  CBS20.setVisible(false);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(false);  CBS22.setVisible(false);
        CBS23.setSelected(true);  CBS23.setVisible(true);
        CBS24.setSelected(false); CBS24.setVisible(false);
        CBS25.setSelected(false); CBS25.setVisible(false);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }          
//Numero 42//--------------------------------------------------/
        if (!"42".equals(valors)){
        } else {
        //Numero 4//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(false);   CBS2.setVisible(false);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(true);  CBS4.setVisible(true);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);   CBS9.setVisible(false);
        CBS10.setSelected(true); CBS10.setVisible(true);
        CBS11.setSelected(false);  CBS11.setVisible(false);
        CBS12.setSelected(false);  CBS12.setVisible(false);
        CBS13.setSelected(true);  CBS13.setVisible(true);
         //Numero 2//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(true);   CBS15.setVisible(true);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(false);  CBS17.setVisible(false);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(true);   CBS22.setVisible(true);
        CBS23.setSelected(false); CBS23.setVisible(false);
        CBS24.setSelected(true);  CBS24.setVisible(true);
        CBS25.setSelected(true);  CBS25.setVisible(true);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }           
 //Numero 43//--------------------------------------------------/
        if (!"43".equals(valors)){
        } else {
        //Numero 4//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(false);   CBS2.setVisible(false);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(true);  CBS4.setVisible(true);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);   CBS9.setVisible(false);
        CBS10.setSelected(true); CBS10.setVisible(true);
        CBS11.setSelected(false);  CBS11.setVisible(false);
        CBS12.setSelected(false);  CBS12.setVisible(false);
        CBS13.setSelected(true);  CBS13.setVisible(true);
         //Numero 3//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(true);   CBS15.setVisible(true);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(false);  CBS17.setVisible(false);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(false);  CBS22.setVisible(false);
        CBS23.setSelected(true);  CBS23.setVisible(true);
        CBS24.setSelected(true);  CBS24.setVisible(true);
        CBS25.setSelected(true);  CBS25.setVisible(true);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }          
//Numero 44//--------------------------------------------------/
        if (!"44".equals(valors)){
        } else {
        //Numero 4//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(false);   CBS2.setVisible(false);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(true);  CBS4.setVisible(true);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);   CBS9.setVisible(false);
        CBS10.setSelected(true); CBS10.setVisible(true);
        CBS11.setSelected(false);  CBS11.setVisible(false);
        CBS12.setSelected(false);  CBS12.setVisible(false);
        CBS13.setSelected(true);  CBS13.setVisible(true);
        //Numero 4//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(false);   CBS15.setVisible(false);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(true);  CBS17.setVisible(true);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(false);   CBS22.setVisible(false);
        CBS23.setSelected(true); CBS23.setVisible(true);
        CBS24.setSelected(false);  CBS24.setVisible(false);
        CBS25.setSelected(false);  CBS25.setVisible(false);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }           
//Numero 45//--------------------------------------------------/
        if (!"45".equals(valors)){
        } else {
        //Numero 4//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(false);   CBS2.setVisible(false);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(true);  CBS4.setVisible(true);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);   CBS9.setVisible(false);
        CBS10.setSelected(true); CBS10.setVisible(true);
        CBS11.setSelected(false);  CBS11.setVisible(false);
        CBS12.setSelected(false);  CBS12.setVisible(false);
        CBS13.setSelected(true);  CBS13.setVisible(true);
            //Numero 2//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(true);   CBS15.setVisible(true);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(true);   CBS17.setVisible(true);
        CBS18.setSelected(false);  CBS18.setVisible(false);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(false);  CBS22.setVisible(false);
        CBS23.setSelected(true);  CBS23.setVisible(true);
        CBS24.setSelected(true);  CBS24.setVisible(true);
        CBS25.setSelected(true);  CBS25.setVisible(true);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }           
//Numero 46//--------------------------------------------------/
        if (!"46".equals(valors)){
        } else {
        //Numero 4//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(false);   CBS2.setVisible(false);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(true);  CBS4.setVisible(true);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);   CBS9.setVisible(false);
        CBS10.setSelected(true); CBS10.setVisible(true);
        CBS11.setSelected(false);  CBS11.setVisible(false);
        CBS12.setSelected(false);  CBS12.setVisible(false);
        CBS13.setSelected(true);  CBS13.setVisible(true);
          //Numero 2//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(false);  CBS15.setVisible(false);
        CBS16.setSelected(false);  CBS16.setVisible(false);
        CBS17.setSelected(true);   CBS17.setVisible(true);
        CBS18.setSelected(false);  CBS18.setVisible(false);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(true);   CBS22.setVisible(true);
        CBS23.setSelected(true);  CBS23.setVisible(true);
        CBS24.setSelected(true);  CBS24.setVisible(true);
        CBS25.setSelected(true);  CBS25.setVisible(true);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }         
//Numero 47//--------------------------------------------------/
        if (!"47".equals(valors)){
        } else {
        //Numero 4//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(false);   CBS2.setVisible(false);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(true);  CBS4.setVisible(true);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);   CBS9.setVisible(false);
        CBS10.setSelected(true); CBS10.setVisible(true);
        CBS11.setSelected(false);  CBS11.setVisible(false);
        CBS12.setSelected(false);  CBS12.setVisible(false);
        CBS13.setSelected(true);  CBS13.setVisible(true);
        //Numero 2//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(true);   CBS15.setVisible(true);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(false);  CBS17.setVisible(false);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(false);  CBS19.setVisible(false);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(false);  CBS22.setVisible(false);
        CBS23.setSelected(true);  CBS23.setVisible(true);
        CBS24.setSelected(false); CBS24.setVisible(false);
        CBS25.setSelected(false); CBS25.setVisible(false);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }   
 //Numero 48//--------------------------------------------------/
        if (!"48".equals(valors)){
        } else {
        //Numero 4//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(false);   CBS2.setVisible(false);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(true);  CBS4.setVisible(true);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);   CBS9.setVisible(false);
        CBS10.setSelected(true); CBS10.setVisible(true);
        CBS11.setSelected(false);  CBS11.setVisible(false);
        CBS12.setSelected(false);  CBS12.setVisible(false);
        CBS13.setSelected(true);  CBS13.setVisible(true);
        //Numero 2//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(true);   CBS15.setVisible(true);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(true);  CBS17.setVisible(true);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(true);   CBS22.setVisible(true);
        CBS23.setSelected(true); CBS23.setVisible(true);
        CBS24.setSelected(true);  CBS24.setVisible(true);
        CBS25.setSelected(true);  CBS25.setVisible(true);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }          
 //Numero 49//--------------------------------------------------/
        if (!"49".equals(valors)){
        } else {
        //Numero 4//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(false);   CBS2.setVisible(false);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(true);  CBS4.setVisible(true);
        CBS5.setSelected(true);   CBS5.setVisible(true);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);   CBS9.setVisible(false);
        CBS10.setSelected(true); CBS10.setVisible(true);
        CBS11.setSelected(false);  CBS11.setVisible(false);
        CBS12.setSelected(false);  CBS12.setVisible(false);
        CBS13.setSelected(true);  CBS13.setVisible(true);
        //Numero 2//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(true);   CBS15.setVisible(true);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(true);  CBS17.setVisible(true);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(false);   CBS22.setVisible(false);
        CBS23.setSelected(true); CBS23.setVisible(true);
        CBS24.setSelected(true);  CBS24.setVisible(true);
        CBS25.setSelected(true);  CBS25.setVisible(true);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }          

//Numero 50//--------------------------------------------------/
        if (!"50".equals(valors)){
        } else {
        //Numero 2//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(true);   CBS2.setVisible(true);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(true);   CBS4.setVisible(true);
        CBS5.setSelected(false);  CBS5.setVisible(false);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);  CBS9.setVisible(false);
        CBS10.setSelected(true);  CBS10.setVisible(true);
        CBS11.setSelected(true);  CBS11.setVisible(true);
        CBS12.setSelected(true);  CBS12.setVisible(true);
        CBS13.setSelected(true);  CBS13.setVisible(true);
            //Numero 0//    
        CBS14.setSelected(true); CBS14.setVisible(true);
        CBS15.setSelected(true); CBS15.setVisible(true);
        CBS16.setSelected(true); CBS16.setVisible(true);
        CBS17.setSelected(true); CBS17.setVisible(true);
        CBS18.setSelected(true); CBS18.setVisible(true);
        CBS19.setSelected(true); CBS19.setVisible(true); 
        CBS20.setSelected(false); CBS20.setVisible(false);
        CBS21.setSelected(true); CBS21.setVisible(true);
        CBS22.setSelected(true); CBS22.setVisible(true);
        CBS23.setSelected(true); CBS23.setVisible(true);
        CBS24.setSelected(true); CBS24.setVisible(true);
        CBS25.setSelected(true); CBS25.setVisible(true); 
        CBS26.setSelected(true); CBS26.setVisible(true);
        }       
 //Numero 51//--------------------------------------------------/
        if (!"51".equals(valors)){
        } else {
        //Numero 2//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(true);   CBS2.setVisible(true);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(true);   CBS4.setVisible(true);
        CBS5.setSelected(false);  CBS5.setVisible(false);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);  CBS9.setVisible(false);
        CBS10.setSelected(true);  CBS10.setVisible(true);
        CBS11.setSelected(true);  CBS11.setVisible(true);
        CBS12.setSelected(true);  CBS12.setVisible(true);
        CBS13.setSelected(true);  CBS13.setVisible(true);
        //Numero 1//    
        CBS14.setSelected(false);  CBS14.setVisible(false);
        CBS15.setSelected(false);  CBS15.setVisible(false);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(false);  CBS17.setVisible(false);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(false);  CBS19.setVisible(false);
        CBS20.setSelected(false);  CBS20.setVisible(false);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(false);  CBS22.setVisible(false);
        CBS23.setSelected(true);  CBS23.setVisible(true);
        CBS24.setSelected(false); CBS24.setVisible(false);
        CBS25.setSelected(false); CBS25.setVisible(false);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }              
 //Numero 52//--------------------------------------------------/
        if (!"52".equals(valors)){
        } else {
        //Numero 2//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(true);   CBS2.setVisible(true);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(true);   CBS4.setVisible(true);
        CBS5.setSelected(false);  CBS5.setVisible(false);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);  CBS9.setVisible(false);
        CBS10.setSelected(true);  CBS10.setVisible(true);
        CBS11.setSelected(true);  CBS11.setVisible(true);
        CBS12.setSelected(true);  CBS12.setVisible(true);
        CBS13.setSelected(true);  CBS13.setVisible(true);
         //Numero 2//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(true);   CBS15.setVisible(true);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(false);  CBS17.setVisible(false);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(true);   CBS22.setVisible(true);
        CBS23.setSelected(false); CBS23.setVisible(false);
        CBS24.setSelected(true);  CBS24.setVisible(true);
        CBS25.setSelected(true);  CBS25.setVisible(true);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }              
 //Numero 53//--------------------------------------------------/
        if (!"53".equals(valors)){
        } else {
        //Numero 2//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(true);   CBS2.setVisible(true);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(true);   CBS4.setVisible(true);
        CBS5.setSelected(false);  CBS5.setVisible(false);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);  CBS9.setVisible(false);
        CBS10.setSelected(true);  CBS10.setVisible(true);
        CBS11.setSelected(true);  CBS11.setVisible(true);
        CBS12.setSelected(true);  CBS12.setVisible(true);
        CBS13.setSelected(true);  CBS13.setVisible(true);
        //Numero 3//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(true);   CBS15.setVisible(true);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(false);  CBS17.setVisible(false);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(false);  CBS22.setVisible(false);
        CBS23.setSelected(true);  CBS23.setVisible(true);
        CBS24.setSelected(true);  CBS24.setVisible(true);
        CBS25.setSelected(true);  CBS25.setVisible(true);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }              
 //Numero 54//--------------------------------------------------/
        if (!"54".equals(valors)){
        } else {
        //Numero 2//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(true);   CBS2.setVisible(true);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(true);   CBS4.setVisible(true);
        CBS5.setSelected(false);  CBS5.setVisible(false);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);  CBS9.setVisible(false);
        CBS10.setSelected(true);  CBS10.setVisible(true);
        CBS11.setSelected(true);  CBS11.setVisible(true);
        CBS12.setSelected(true);  CBS12.setVisible(true);
        CBS13.setSelected(true);  CBS13.setVisible(true);
            //Numero 4//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(false);   CBS15.setVisible(false);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(true);  CBS17.setVisible(true);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(false);   CBS22.setVisible(false);
        CBS23.setSelected(true); CBS23.setVisible(true);
        CBS24.setSelected(false);  CBS24.setVisible(false);
        CBS25.setSelected(false);  CBS25.setVisible(false);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }              
 //Numero 55//--------------------------------------------------/
        if (!"55".equals(valors)){
        } else {
        //Numero 2//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(true);   CBS2.setVisible(true);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(true);   CBS4.setVisible(true);
        CBS5.setSelected(false);  CBS5.setVisible(false);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);  CBS9.setVisible(false);
        CBS10.setSelected(true);  CBS10.setVisible(true);
        CBS11.setSelected(true);  CBS11.setVisible(true);
        CBS12.setSelected(true);  CBS12.setVisible(true);
        CBS13.setSelected(true);  CBS13.setVisible(true);
         //Numero 2//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(true);   CBS15.setVisible(true);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(true);   CBS17.setVisible(true);
        CBS18.setSelected(false);  CBS18.setVisible(false);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(false);  CBS22.setVisible(false);
        CBS23.setSelected(true);  CBS23.setVisible(true);
        CBS24.setSelected(true);  CBS24.setVisible(true);
        CBS25.setSelected(true);  CBS25.setVisible(true);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }              
//Numero 56//--------------------------------------------------/
        if (!"56".equals(valors)){
        } else {
        //Numero 2//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(true);   CBS2.setVisible(true);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(true);   CBS4.setVisible(true);
        CBS5.setSelected(false);  CBS5.setVisible(false);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);  CBS9.setVisible(false);
        CBS10.setSelected(true);  CBS10.setVisible(true);
        CBS11.setSelected(true);  CBS11.setVisible(true);
        CBS12.setSelected(true);  CBS12.setVisible(true);
        CBS13.setSelected(true);  CBS13.setVisible(true);
     //Numero 2//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(false);  CBS15.setVisible(false);
        CBS16.setSelected(false);  CBS16.setVisible(false);
        CBS17.setSelected(true);   CBS17.setVisible(true);
        CBS18.setSelected(false);  CBS18.setVisible(false);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(true);   CBS22.setVisible(true);
        CBS23.setSelected(true);  CBS23.setVisible(true);
        CBS24.setSelected(true);  CBS24.setVisible(true);
        CBS25.setSelected(true);  CBS25.setVisible(true);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }               
//Numero 57//--------------------------------------------------/
        if (!"57".equals(valors)){
        } else {
        //Numero 2//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(true);   CBS2.setVisible(true);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(true);   CBS4.setVisible(true);
        CBS5.setSelected(false);  CBS5.setVisible(false);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);  CBS9.setVisible(false);
        CBS10.setSelected(true);  CBS10.setVisible(true);
        CBS11.setSelected(true);  CBS11.setVisible(true);
        CBS12.setSelected(true);  CBS12.setVisible(true);
        CBS13.setSelected(true);  CBS13.setVisible(true);
      //Numero 2//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(true);   CBS15.setVisible(true);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(false);  CBS17.setVisible(false);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(false);  CBS19.setVisible(false);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(false);  CBS22.setVisible(false);
        CBS23.setSelected(true);  CBS23.setVisible(true);
        CBS24.setSelected(false); CBS24.setVisible(false);
        CBS25.setSelected(false); CBS25.setVisible(false);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }    
//Numero 58//--------------------------------------------------/
        if (!"58".equals(valors)){
        } else {
        //Numero 2//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(true);   CBS2.setVisible(true);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(true);   CBS4.setVisible(true);
        CBS5.setSelected(false);  CBS5.setVisible(false);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);  CBS9.setVisible(false);
        CBS10.setSelected(true);  CBS10.setVisible(true);
        CBS11.setSelected(true);  CBS11.setVisible(true);
        CBS12.setSelected(true);  CBS12.setVisible(true);
        CBS13.setSelected(true);  CBS13.setVisible(true);
          //Numero 2//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(true);   CBS15.setVisible(true);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(true);  CBS17.setVisible(true);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(true);   CBS22.setVisible(true);
        CBS23.setSelected(true); CBS23.setVisible(true);
        CBS24.setSelected(true);  CBS24.setVisible(true);
        CBS25.setSelected(true);  CBS25.setVisible(true);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }               
 //Numero 59//--------------------------------------------------/
        if (!"59".equals(valors)){
        } else {
        //Numero 2//    
        CBS1.setSelected(true);   CBS1.setVisible(true);
        CBS2.setSelected(true);   CBS2.setVisible(true);
        CBS3.setSelected(true);   CBS3.setVisible(true);
        CBS4.setSelected(true);   CBS4.setVisible(true);
        CBS5.setSelected(false);  CBS5.setVisible(false);
        CBS6.setSelected(true);   CBS6.setVisible(true);
        CBS7.setSelected(true);   CBS7.setVisible(true);
        CBS8.setSelected(true);   CBS8.setVisible(true);
        CBS9.setSelected(false);  CBS9.setVisible(false);
        CBS10.setSelected(true);  CBS10.setVisible(true);
        CBS11.setSelected(true);  CBS11.setVisible(true);
        CBS12.setSelected(true);  CBS12.setVisible(true);
        CBS13.setSelected(true);  CBS13.setVisible(true);
   //Numero 2//    
        CBS14.setSelected(true);   CBS14.setVisible(true);
        CBS15.setSelected(true);   CBS15.setVisible(true);
        CBS16.setSelected(true);   CBS16.setVisible(true);
        CBS17.setSelected(true);  CBS17.setVisible(true);
        CBS18.setSelected(true);   CBS18.setVisible(true);
        CBS19.setSelected(true);   CBS19.setVisible(true);
        CBS20.setSelected(true);   CBS20.setVisible(true);
        CBS21.setSelected(true);   CBS21.setVisible(true);
        CBS22.setSelected(false);   CBS22.setVisible(false);
        CBS23.setSelected(true); CBS23.setVisible(true);
        CBS24.setSelected(true);  CBS24.setVisible(true);
        CBS25.setSelected(true);  CBS25.setVisible(true);
        CBS26.setSelected(true);  CBS26.setVisible(true);
        }              
*/		
        
      }
     
    }    
    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }

    
    private Timer timer;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CB1;
    private javax.swing.JCheckBox CB10;
    private javax.swing.JCheckBox CB11;
    private javax.swing.JCheckBox CB12;
    private javax.swing.JCheckBox CB13;
    private javax.swing.JCheckBox CB14;
    private javax.swing.JCheckBox CB15;
    private javax.swing.JCheckBox CB16;
    private javax.swing.JCheckBox CB17;
    private javax.swing.JCheckBox CB18;
    private javax.swing.JCheckBox CB19;
    private javax.swing.JCheckBox CB2;
    private javax.swing.JCheckBox CB20;
    private javax.swing.JCheckBox CB21;
    private javax.swing.JCheckBox CB22;
    private javax.swing.JCheckBox CB23;
    private javax.swing.JCheckBox CB24;
    private javax.swing.JCheckBox CB25;
    private javax.swing.JCheckBox CB26;
    private javax.swing.JCheckBox CB3;
    private javax.swing.JCheckBox CB4;
    private javax.swing.JCheckBox CB5;
    private javax.swing.JCheckBox CB6;
    private javax.swing.JCheckBox CB7;
    private javax.swing.JCheckBox CB8;
    private javax.swing.JCheckBox CB9;
    private javax.swing.JCheckBox CBM1;
    private javax.swing.JCheckBox CBM10;
    private javax.swing.JCheckBox CBM11;
    private javax.swing.JCheckBox CBM12;
    private javax.swing.JCheckBox CBM13;
    private javax.swing.JCheckBox CBM14;
    private javax.swing.JCheckBox CBM15;
    private javax.swing.JCheckBox CBM16;
    private javax.swing.JCheckBox CBM17;
    private javax.swing.JCheckBox CBM18;
    private javax.swing.JCheckBox CBM19;
    private javax.swing.JCheckBox CBM2;
    private javax.swing.JCheckBox CBM20;
    private javax.swing.JCheckBox CBM21;
    private javax.swing.JCheckBox CBM22;
    private javax.swing.JCheckBox CBM23;
    private javax.swing.JCheckBox CBM24;
    private javax.swing.JCheckBox CBM25;
    private javax.swing.JCheckBox CBM26;
    private javax.swing.JCheckBox CBM3;
    private javax.swing.JCheckBox CBM4;
    private javax.swing.JCheckBox CBM5;
    private javax.swing.JCheckBox CBM6;
    private javax.swing.JCheckBox CBM7;
    private javax.swing.JCheckBox CBM8;
    private javax.swing.JCheckBox CBM9;
    private javax.swing.JCheckBox CBP1;
    private javax.swing.JCheckBox CBP2;
    private javax.swing.JCheckBox CBP3;
    private javax.swing.JCheckBox CBP4;
    private javax.swing.JCheckBox CBS1;
    private javax.swing.JCheckBox CBS10;
    private javax.swing.JCheckBox CBS11;
    private javax.swing.JCheckBox CBS12;
    private javax.swing.JCheckBox CBS13;
    private javax.swing.JCheckBox CBS14;
    private javax.swing.JCheckBox CBS15;
    private javax.swing.JCheckBox CBS16;
    private javax.swing.JCheckBox CBS17;
    private javax.swing.JCheckBox CBS18;
    private javax.swing.JCheckBox CBS19;
    private javax.swing.JCheckBox CBS2;
    private javax.swing.JCheckBox CBS20;
    private javax.swing.JCheckBox CBS21;
    private javax.swing.JCheckBox CBS22;
    private javax.swing.JCheckBox CBS23;
    private javax.swing.JCheckBox CBS24;
    private javax.swing.JCheckBox CBS25;
    private javax.swing.JCheckBox CBS26;
    private javax.swing.JCheckBox CBS3;
    private javax.swing.JCheckBox CBS4;
    private javax.swing.JCheckBox CBS5;
    private javax.swing.JCheckBox CBS6;
    private javax.swing.JCheckBox CBS7;
    private javax.swing.JCheckBox CBS8;
    private javax.swing.JCheckBox CBS9;
    private javax.swing.JLabel LBLP1;
    private javax.swing.JLabel LBLP2;
    private javax.swing.JLabel LBLT;
    private javax.swing.JLabel h;
    private javax.swing.JLabel m;
    private javax.swing.JLabel s;
    // End of variables declaration//GEN-END:variables
}
