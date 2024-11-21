package juego_pokemonant.Interfaz;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;

/**
 *
 * @author MadellineAraya
 */
public class Oak extends javax.swing.JFrame {
   private boolean botonVisible = true;
   private Clip clip;
   private File audioFile;
    
    public Oak() {
        initComponents();
        setSize(800,535);
        setLocationRelativeTo(null);
        audioFile = new File("C:\\Users\\Lenovo\\Desktop\\"
                + "Proyecto_PokemonAnt\\Juego_PokemonAnt\\src\\"
                + "juego_pokemonant\\Interfaz\\Recursos\\Oak.wav");
        //reproducirMusica();
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEntendido = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEntendido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/Ent---.png"))); // NOI18N
        btnEntendido.setBorder(null);
        btnEntendido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntendido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEntendidoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEntendidoMouseExited(evt);
            }
        });
        btnEntendido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntendidoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntendido, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/LigaTogepi.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

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

    private void btnEntendidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntendidoMouseEntered
       btnEntendido.setIcon(new javax.swing.ImageIcon(getClass().getResource(
               "/juego_pokemonant/Interfaz/Recursos/Entendido.png")));
       sonidoBtns();
    }//GEN-LAST:event_btnEntendidoMouseEntered

    private void btnEntendidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEntendidoMouseExited
       btnEntendido.setIcon(new javax.swing.ImageIcon(getClass().getResource(
               "/juego_pokemonant/Interfaz/Recursos/Ent---.png")));
    }//GEN-LAST:event_btnEntendidoMouseExited

    private void btnEntendidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntendidoActionPerformed
       Squirtle abrir = new Squirtle ();
       abrir.setVisible(true);
       this.dispose();
       //detenerMusica();
    }//GEN-LAST:event_btnEntendidoActionPerformed
      private void reproducirMusica() {
        try {
            // Crear un Clip y cargar el archivo de audio
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            clip = AudioSystem.getClip();
            clip.open(audioStream);

            // Iniciar la reproducción
            clip.start();
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
            e.printStackTrace();
            }
         }

     private void detenerMusica() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
            clip.close();
        }
    }
       
 public void sonidoBtns() {
        try {
            URL soundUrl = getClass().getResource("/juego_pokemonant/Interfaz/Recursos/SonidoBotones.wav");

            if (soundUrl != null) {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundUrl);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
            }
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntendido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
