package juego_pokemonant.Interfaz;
//Importes para reproducir musica
import javax.sound.sampled.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author MadellineAraya
 */
public class Play extends javax.swing.JFrame {
     private Clip clip;//Para llamar al audio
     private File audioFile; //Ubicacion del audio
     private FloatControl gainControl;
    public Play() {
        initComponents();       
        setSize(802,536); //Ancho y alto de la pantalla
        setLocationRelativeTo(null); //Abre la ventana en el centro
        audioFile = new File("C:C:\\Users\\montt\\OneDrive\\Documentos\\Segundo Cuatrimestre"
                + "\\Estructura de Datos\\Proyecto\\Proyecto_PokemonAnt\\Juego_PokemonAnt\\src"
                + "\\juego_pokemonant\\Interfaz\\Recursos\\Intro.wav");
        //Iniciar la reproducción automáticamente. Descomentar linea 22 para reproducir audio
        //reproducirMusica();
        setDefaultCloseOperation(EXIT_ON_CLOSE);//Cierra el programa al cerrar la ventana
    }

      private void reproducirMusica() {
        try {
            // Crear un Clip y cargar el archivo de audio
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            ajustarVolumen(-500.0f);
            // Iniciar la reproducción
            clip.start();
            
        } catch (IOException | UnsupportedAudioFileException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
     public void ajustarVolumen(float volumen) {
    if (gainControl != null && gainControl.getValue() >= gainControl.getMinimum()
            && gainControl.getValue() <= gainControl.getMaximum()) {
        gainControl.setValue(volumen);
     }
   }    
     private void detenerMusica() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
            clip.close();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnPress = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPress.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/Presstostart.gif"))); // NOI18N
        btnPress.setBorder(null);
        btnPress.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPressActionPerformed(evt);
            }
        });
        jPanel1.add(btnPress, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/Togepi.png"))); // NOI18N
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

    private void btnPressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPressActionPerformed
       Oak abrir = new Oak (); //Instancia
       abrir.setVisible(true); //Hace visible la ventana oak
       this.dispose(); //Cierra esta ventana o sea la Play
       detenerMusica(); //Detiene la musica de la ventana
    }//GEN-LAST:event_btnPressActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPress;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
