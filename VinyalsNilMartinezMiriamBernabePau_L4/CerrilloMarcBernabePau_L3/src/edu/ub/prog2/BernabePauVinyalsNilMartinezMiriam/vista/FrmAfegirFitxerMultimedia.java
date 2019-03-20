package edu.ub.prog2.BernabePauVinyalsNilMartinezMiriam.vista;

import edu.ub.prog2.BernabePauVinyalsNilMartinezMiriam.controlador.Controlador;
import edu.ub.prog2.utils.AplicacioException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class FrmAfegirFitxerMultimedia extends javax.swing.JDialog {
    Controlador controlador;
    

    public FrmAfegirFitxerMultimedia(java.awt.Frame parent, boolean modal,Controlador c) {
        super(parent, modal);
       
        this.controlador=c;
        
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        botoCami = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nomText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        codecText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        duradaText = new javax.swing.JTextField();
        miniaturaTag = new javax.swing.JLabel();
        camiMiniatura = new javax.swing.JButton();
        alcadaTag = new javax.swing.JLabel();
        alcadaText = new javax.swing.JTextField();
        ampladaTag = new javax.swing.JLabel();
        ampladaText = new javax.swing.JTextField();
        fpsTag = new javax.swing.JLabel();
        fpsText = new javax.swing.JTextField();
        kbpsTag = new javax.swing.JLabel();
        kbpsText = new javax.swing.JTextField();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        checkAudio = new javax.swing.JCheckBox();
        checkVideo = new javax.swing.JCheckBox();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("jCheckBoxMenuItem2");

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("jCheckBoxMenuItem3");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Cami del fitxer");

        botoCami.setText("Afegir cami");
        botoCami.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoCamiActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nom del fitxer");

        nomText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomTextActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Codec");

        codecText.setText("codec");
        codecText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codecTextActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Durada");

        duradaText.setText("34");
        duradaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duradaTextActionPerformed(evt);
            }
        });

        miniaturaTag.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        miniaturaTag.setText("Cami Miniatura");

        camiMiniatura.setText("Afegir cami");
        camiMiniatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                camiMiniaturaActionPerformed(evt);
            }
        });

        alcadaTag.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        alcadaTag.setText("Alçada");

        alcadaText.setText("34");

        ampladaTag.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ampladaTag.setText("Amplada");

        ampladaText.setText("34");

        fpsTag.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fpsTag.setText("FPS");

        fpsText.setText("34");

        kbpsTag.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kbpsTag.setText("kbps");

        kbpsText.setText("34");
        kbpsText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kbpsTextActionPerformed(evt);
            }
        });

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        checkAudio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        checkAudio.setText("AUDIO");
        checkAudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAudioActionPerformed(evt);
            }
        });

        checkVideo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        checkVideo.setText("VIDEO");
        checkVideo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkVideoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkVideo)
                            .addComponent(checkAudio))
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(botoCami, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kbpsTag)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(kbpsText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(duradaText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(codecText, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nomText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(195, 195, 195))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fpsTag)
                            .addComponent(ampladaTag)
                            .addComponent(miniaturaTag)
                            .addComponent(camiMiniatura, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(alcadaTag)
                            .addComponent(alcadaText)
                            .addComponent(ampladaText)
                            .addComponent(fpsText))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(miniaturaTag))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botoCami, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(camiMiniatura, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(alcadaTag))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alcadaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ampladaTag)
                    .addComponent(checkAudio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codecText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ampladaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fpsTag))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(duradaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fpsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kbpsTag)
                    .addComponent(checkVideo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kbpsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botoCamiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoCamiActionPerformed
        JFileChooser cami= new JFileChooser();
        cami.setVisible(true);
        cami.showOpenDialog(this);
        this.botoCami.setText(cami.getSelectedFile().getAbsolutePath());
    }//GEN-LAST:event_botoCamiActionPerformed

    private void codecTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codecTextActionPerformed
      this.codecText.setText("a");
    }//GEN-LAST:event_codecTextActionPerformed

    private void checkAudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAudioActionPerformed
       if (this.checkAudio.isSelected()){
            this.alcadaTag.setEnabled(false);
            this.ampladaTag.setEnabled(false);
            this.fpsTag.setEnabled(false);
            this.alcadaText.setEnabled(false);
            this.ampladaText.setEnabled(false);
            this.fpsText.setEnabled(false);
       }else if (!this.checkAudio.isSelected()){
            this.alcadaTag.setEnabled(true);
            this.ampladaTag.setEnabled(true);
            this.fpsTag.setEnabled(true);
            this.alcadaText.setEnabled(true);
            this.ampladaText.setEnabled(true);
            this.fpsText.setEnabled(true);
       }
    }//GEN-LAST:event_checkAudioActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        if (this.checkAudio.isSelected() && this.checkVideo.isSelected()){
             JOptionPane.showMessageDialog(rootPane,"Només pots seleccionar audio o video","ERROR DE SELECCIÓ" ,JOptionPane.WARNING_MESSAGE);
             
         }
         else if(!this.checkAudio.isSelected() && !this.checkVideo.isSelected()){
              JOptionPane.showMessageDialog(rootPane,"Selecciona quin tipus de fitxer vols afegir(AUDIO o VIDEO)","ERROR DE SELECCIÓ" ,JOptionPane.WARNING_MESSAGE);

         }
        
         else if (this.checkAudio.isSelected()){
             float durada= Float.parseFloat(this.duradaText.getText());
             int kbps= Integer.parseInt(this.kbpsText.getText());
             
                  try{
                 controlador.afegirAudio(this.botoCami.getText(), this.camiMiniatura.getText(), this.nomText.getText(), this.codecText.getText(), durada, kbps);
                  }catch(AplicacioException ex){
                  }
            this.dispose();
             
         }else if (this.checkVideo.isSelected()){
             float durada= Float.parseFloat(this.duradaText.getText());
             int alcada= Integer.parseInt(this.alcadaText.getText());
             int amplada=Integer.parseInt(this.ampladaText.getText());
             float fps=Float.parseFloat(this.fpsText.getText());
                try{
                controlador.afegirVideo(this.botoCami.getText(), this.nomText.getText(), this.codecText.getText(), durada, alcada, amplada, fps);
                }catch(AplicacioException ex){
                }
             
             
             this.dispose();
         }
         
         
         
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void checkVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkVideoActionPerformed
        if (this.checkVideo.isSelected()){
            this.kbpsTag.setEnabled(false);
            this.kbpsText.setEnabled(false);
            this.camiMiniatura.setEnabled(false);
            this.miniaturaTag.setEnabled(false);
            
        }else if (!this.checkVideo.isSelected()){
            this.kbpsTag.setEnabled(true);
            this.kbpsText.setEnabled(true);
            this.camiMiniatura.setEnabled(true);
            this.miniaturaTag.setEnabled(true);
        }
    }//GEN-LAST:event_checkVideoActionPerformed

    private void camiMiniaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_camiMiniaturaActionPerformed
        JFileChooser cami= new JFileChooser();
        cami.setVisible(true);
        cami.showOpenDialog(this);
        this.camiMiniatura.setText(cami.getSelectedFile().getAbsolutePath());
        
    }//GEN-LAST:event_camiMiniaturaActionPerformed

    private void nomTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomTextActionPerformed
        
        this.nomText.setText("Nom");
        
    }//GEN-LAST:event_nomTextActionPerformed

    private void duradaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duradaTextActionPerformed
        
        this.duradaText.setText("1");
    }//GEN-LAST:event_duradaTextActionPerformed

    private void kbpsTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kbpsTextActionPerformed
       this.kbpsText.setText("1");
    }//GEN-LAST:event_kbpsTextActionPerformed
    
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
            java.util.logging.Logger.getLogger(FrmAfegirFitxerMultimedia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAfegirFitxerMultimedia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAfegirFitxerMultimedia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAfegirFitxerMultimedia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Controlador cont=new Controlador();
                FrmAfegirFitxerMultimedia dialog = new FrmAfegirFitxerMultimedia(new javax.swing.JFrame(), true,cont );
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alcadaTag;
    private javax.swing.JTextField alcadaText;
    private javax.swing.JLabel ampladaTag;
    private javax.swing.JTextField ampladaText;
    private javax.swing.JButton botoCami;
    private javax.swing.JButton camiMiniatura;
    private javax.swing.JButton cancelButton;
    private javax.swing.JCheckBox checkAudio;
    private javax.swing.JCheckBox checkVideo;
    private javax.swing.JTextField codecText;
    private javax.swing.JTextField duradaText;
    private javax.swing.JLabel fpsTag;
    private javax.swing.JTextField fpsText;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JLabel kbpsTag;
    private javax.swing.JTextField kbpsText;
    private javax.swing.JLabel miniaturaTag;
    private javax.swing.JTextField nomText;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables

}
