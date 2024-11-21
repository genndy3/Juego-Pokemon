package juego_pokemonant.Interfaz;

import java.io.IOException;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import juego_pokemonant.BatallaP;
import juego_pokemonant.ListaPokemon;
import juego_pokemonant.Nodo;
import juego_pokemonant.Pokedex;
import juego_pokemonant.Pokemon;

/**
 *
 * @author MadellineAraya
 */
public class EligePoke extends javax.swing.JFrame {

    private static String pokemonSeleccionado1 = ""; 
    private static String pokemonSeleccionado2 = "";
    private static String pokemonSeleccionado3 = "";
    private static String pokemonSeleccionado4 = "";
    private static String pokeBatalla;
    public static boolean derrotado1 = false;
    public static boolean derrotado2 = false;
    public static boolean derrotado3 = false;
    public static boolean derrotado4 = false;
    
    private static BatallaP b = new BatallaP();
    private static Pokedex p = new Pokedex();
    
    public EligePoke() {
        initComponents();
        setSize(800,535);
        setLocationRelativeTo(null);
        btn1Pokemon();
        btn2Pokemon();
        btn3Pokemon();
        btn4Pokemon();
        setDefaultCloseOperation(EXIT_ON_CLOSE);            
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEligeB4 = new javax.swing.JButton();
        btnEligeB2 = new javax.swing.JButton();
        btnEligeB1 = new javax.swing.JButton();
        btnEligeB3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEligeB4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEligeB4MouseEntered(evt);
            }
        });
        btnEligeB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEligeB4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnEligeB4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 270, 160));

        btnEligeB2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEligeB2MouseEntered(evt);
            }
        });
        btnEligeB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEligeB2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnEligeB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 270, 160));

        btnEligeB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEligeB1MouseEntered(evt);
            }
        });
        btnEligeB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEligeB1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnEligeB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 270, 160));

        btnEligeB3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEligeB3MouseEntered(evt);
            }
        });
        btnEligeB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEligeB3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnEligeB3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 270, 160));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/BatallaElegir.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
   
     public void btn1Pokemon() { //Utiliza el pokemon obtenido de la clase Pokedex para establecer imagen
                                 //Del pokemon seleccionado
        switch (pokemonSeleccionado1) {
            case "Squirtle":
                btnEligeB1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/Pokemon1.png")));
                break;
            case "Rattata":
                btnEligeB1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/Pokemon2.png")));
                break;
            case "Charmander":
                btnEligeB1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/Pokemon3.png")));
                break;
            case "Psyduck":
                btnEligeB1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/Pokemon4.png")));
                break;
            case "Persian":
                btnEligeB1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/Pokemon5.png")));
                break;
            case "Ninetales":
                btnEligeB1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/Pokemon6.png")));
                break;
            case "Wartortle":
                btnEligeB1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/Pokemon7.png")));
                break;
            case "Eevee":
                btnEligeB1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/Pokemon8.png")));
                break;               
            case "Vulpix":
                btnEligeB1.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/Pokemon9.png")));
                break;
            default:
              
                break;
        }
        if (pokemonSeleccionado1 != "" && pokemonSeleccionado2 != "" && pokemonSeleccionado3 != "" && pokemonSeleccionado4 != "") {
            if (!p.existePokedex(pokemonSeleccionado1, p.getListaPokemonJugador())) {
                derrotado1 = true;
                btnEligeB1.setEnabled(false);
            }
        }
     }
        
      public void btn2Pokemon() { 
                                
        switch (pokemonSeleccionado2) {
            case "Squirtle":
                btnEligeB2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/Pokemon1.png")));
                break;
            case "Rattata":
                btnEligeB2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/Pokemon2.png")));
                break;
            case "Charmander":
                btnEligeB2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/Pokemon3.png")));
                break;
            case "Psyduck":
                btnEligeB2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/Pokemon4.png")));
                break;
            case "Persian":
                btnEligeB2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/Pokemon5.png")));
                break;
            case "Ninetales":
                btnEligeB2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/Pokemon6.png")));
                break;
            case "Wartortle":
                btnEligeB2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/Pokemon7.png")));
                break;
            case "Eevee":
                btnEligeB2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/Pokemon8.png")));
                break;             
            case "Vulpix":
                btnEligeB2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/Pokemon9.png")));
                break;
            default:
              
                break;
        }
        if (pokemonSeleccionado1 != "" && pokemonSeleccionado2 != "" && pokemonSeleccionado3 != "" && pokemonSeleccionado4 != "") {
            if (!p.existePokedex(pokemonSeleccionado2, p.getListaPokemonJugador())) {
                derrotado2 = true;
                btnEligeB2.setEnabled(false);
            }
        }
    }
      
       public void btn3Pokemon() { 
                                
        switch (pokemonSeleccionado3) {
            case "Squirtle":
                btnEligeB3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/Pokemon1.png")));
                break;
            case "Rattata":
                btnEligeB3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/Pokemon2.png")));
                break;
            case "Charmander":
                btnEligeB3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/Pokemon3.png")));
                break;
            case "Psyduck":
                btnEligeB3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/Pokemon4.png")));
                break;
            case "Persian":
                btnEligeB3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/Pokemon5.png")));
                break;
            case "Ninetales":
                btnEligeB3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/Pokemon6.png")));
                break;
            case "Wartortle":
                btnEligeB3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/Pokemon7.png")));
                break;
            case "Eevee":
                btnEligeB3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/Pokemon8.png")));
                break;             
            case "Vulpix":
                btnEligeB3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/Pokemon9.png")));
                break;
            default:
              
                break;
        }
        if (pokemonSeleccionado1 != "" && pokemonSeleccionado2 != "" && pokemonSeleccionado3 != "" && pokemonSeleccionado4 != "") {
            if (!p.existePokedex(pokemonSeleccionado3, p.getListaPokemonJugador())) {
                derrotado3 = true;
                btnEligeB3.setEnabled(false);
            }
        }
    }
      
      public void btn4Pokemon() { 
                                
        switch (pokemonSeleccionado4) {
            case "Squirtle":
                btnEligeB4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/Pokemon1.png")));
                break;
            case "Rattata":
                btnEligeB4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/Pokemon2.png")));
                break;
            case "Charmander":
                btnEligeB4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/Pokemon3.png")));
                break;
            case "Psyduck":
                btnEligeB4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/Pokemon4.png")));
                break;
            case "Persian":
                btnEligeB4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/Pokemon5.png")));
                break;
            case "Ninetales":
                btnEligeB4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/Pokemon6.png")));
                break;
            case "Wartortle":
                btnEligeB4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/Pokemon7.png")));
                break;
            case "Eevee":
                btnEligeB4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/Pokemon8.png")));
                break;             
            case "Vulpix":
                btnEligeB4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/Pokemon9.png")));
                break;
            default:
              
                break;
        }
        if (pokemonSeleccionado1 != "" && pokemonSeleccionado2 != "" && pokemonSeleccionado3 != "" && pokemonSeleccionado4 != "") {
            if (!p.existePokedex(pokemonSeleccionado4, p.getListaPokemonJugador())) {
                derrotado4 = true;
                btnEligeB4.setEnabled(false);
            }
        }
    }
          
    private void btnEligeB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEligeB1ActionPerformed
        pokeBatalla = pokemonSeleccionado1;
        b.escogerPoke(pokeBatalla);
        Batalla abrir = new Batalla();
        
        if(pokemonSeleccionado1 == "Squirtle"){
            ImageIcon nuevaImagen = new ImageIcon(getClass().getResource(
            "/juego_pokemonant/Interfaz/Recursos/Atras1.png"));
            abrir.setLblBatalla(nuevaImagen); 
            reproducirSonido1();            
          }else if(pokemonSeleccionado1 == "Rattata"){
            ImageIcon nuevaImagen = new ImageIcon(getClass().getResource(
            "/juego_pokemonant/Interfaz/Recursos/Atras2.png"));
            abrir.setLblBatalla(nuevaImagen); 
            reproducirSonido2();  
          }else if(pokemonSeleccionado1 == "Charmander"){
            ImageIcon nuevaImagen = new ImageIcon(getClass().getResource(
            "/juego_pokemonant/Interfaz/Recursos/Atras3.png"));
            abrir.setLblBatalla(nuevaImagen); 
            reproducirSonido3();  
          }else if(pokemonSeleccionado1 == "Psyduck"){
            ImageIcon nuevaImagen = new ImageIcon(getClass().getResource(
            "/juego_pokemonant/Interfaz/Recursos/Atras4.png"));
            abrir.setLblBatalla(nuevaImagen);   
            reproducirSonido4();  
          }else if(pokemonSeleccionado1 == "Persian"){
            ImageIcon nuevaImagen = new ImageIcon(getClass().getResource(
            "/juego_pokemonant/Interfaz/Recursos/Atras5.png"));
            abrir.setLblBatalla(nuevaImagen); 
            reproducirSonido5();  
          }else if(pokemonSeleccionado1 == "Ninetales"){
            ImageIcon nuevaImagen = new ImageIcon(getClass().getResource(
            "/juego_pokemonant/Interfaz/Recursos/Atras6.png"));
            abrir.setLblBatalla(nuevaImagen);  
            reproducirSonido6();  
          }else if(pokemonSeleccionado1 == "Wartortle"){
            ImageIcon nuevaImagen = new ImageIcon(getClass().getResource(
            "/juego_pokemonant/Interfaz/Recursos/Atras7.png"));
            abrir.setLblBatalla(nuevaImagen); 
            reproducirSonido7();  
          }else if(pokemonSeleccionado1 == "Eevee"){
            ImageIcon nuevaImagen = new ImageIcon(getClass().getResource(
            "/juego_pokemonant/Interfaz/Recursos/Atras8.png"));
            reproducirSonido8();  
            abrir.setLblBatalla(nuevaImagen);    
          }else if(pokemonSeleccionado1 == "Vulpix"){
            ImageIcon nuevaImagen = new ImageIcon(getClass().getResource(
            "/juego_pokemonant/Interfaz/Recursos/Atras9.png"));
            abrir.setLblBatalla(nuevaImagen); 
            reproducirSonido9();  
          }    
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEligeB1ActionPerformed

    private void btnEligeB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEligeB2ActionPerformed
        pokeBatalla = pokemonSeleccionado2;
        b.escogerPoke(pokeBatalla);
        Batalla abrir = new Batalla();
        
         if(pokemonSeleccionado2 == "Squirtle"){
            ImageIcon nuevaImagen = new ImageIcon(getClass().getResource(
            "/juego_pokemonant/Interfaz/Recursos/Atras1.png"));
            abrir.setLblBatalla(nuevaImagen); 
            reproducirSonido1();            
          }else if(pokemonSeleccionado2 == "Rattata"){
            ImageIcon nuevaImagen = new ImageIcon(getClass().getResource(
            "/juego_pokemonant/Interfaz/Recursos/Atras2.png"));
            abrir.setLblBatalla(nuevaImagen); 
            reproducirSonido2();  
          }else if(pokemonSeleccionado2 == "Charmander"){
            ImageIcon nuevaImagen = new ImageIcon(getClass().getResource(
            "/juego_pokemonant/Interfaz/Recursos/Atras3.png"));
            reproducirSonido3();  
            abrir.setLblBatalla(nuevaImagen);    
          }else if(pokemonSeleccionado2 == "Psyduck"){
            ImageIcon nuevaImagen = new ImageIcon(getClass().getResource(
            "/juego_pokemonant/Interfaz/Recursos/Atras4.png"));
            abrir.setLblBatalla(nuevaImagen);    
            reproducirSonido4();
          }else if(pokemonSeleccionado2 == "Persian"){
            ImageIcon nuevaImagen = new ImageIcon(getClass().getResource(
            "/juego_pokemonant/Interfaz/Recursos/Atras5.png"));
            abrir.setLblBatalla(nuevaImagen); 
            reproducirSonido5();
          }else if(pokemonSeleccionado2 == "Ninetales"){
            ImageIcon nuevaImagen = new ImageIcon(getClass().getResource(
            "/juego_pokemonant/Interfaz/Recursos/Atras6.png"));
            abrir.setLblBatalla(nuevaImagen); 
            reproducirSonido6();
          }else if(pokemonSeleccionado2 == "Wartortle"){
            ImageIcon nuevaImagen = new ImageIcon(getClass().getResource(
            "/juego_pokemonant/Interfaz/Recursos/Atras7.png"));
            abrir.setLblBatalla(nuevaImagen);  
            reproducirSonido7();
          }else if(pokemonSeleccionado2 == "Eevee"){
            ImageIcon nuevaImagen = new ImageIcon(getClass().getResource(
            "/juego_pokemonant/Interfaz/Recursos/Atras8.png"));
            abrir.setLblBatalla(nuevaImagen); 
            reproducirSonido8();
          }else if(pokemonSeleccionado2 == "Vulpix"){
            ImageIcon nuevaImagen = new ImageIcon(getClass().getResource(
            "/juego_pokemonant/Interfaz/Recursos/Atras9.png"));
            abrir.setLblBatalla(nuevaImagen);
            reproducirSonido9();
          }       
        
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEligeB2ActionPerformed

    private void btnEligeB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEligeB3ActionPerformed
        pokeBatalla = pokemonSeleccionado3;
        b.escogerPoke(pokeBatalla);
        Batalla abrir = new Batalla();
        
         if(pokemonSeleccionado3 == "Squirtle"){
            ImageIcon nuevaImagen = new ImageIcon(getClass().getResource(
            "/juego_pokemonant/Interfaz/Recursos/Atras1.png"));
            abrir.setLblBatalla(nuevaImagen); 
            reproducirSonido1();            
          }else if(pokemonSeleccionado3 == "Rattata"){
            ImageIcon nuevaImagen = new ImageIcon(getClass().getResource(
            "/juego_pokemonant/Interfaz/Recursos/Atras2.png"));
            abrir.setLblBatalla(nuevaImagen);
            reproducirSonido2();
          }else if(pokemonSeleccionado3 == "Charmander"){
            ImageIcon nuevaImagen = new ImageIcon(getClass().getResource(
            "/juego_pokemonant/Interfaz/Recursos/Atras3.png"));
            abrir.setLblBatalla(nuevaImagen); 
            reproducirSonido3();
          }else if(pokemonSeleccionado3 == "Psyduck"){
            ImageIcon nuevaImagen = new ImageIcon(getClass().getResource(
            "/juego_pokemonant/Interfaz/Recursos/Atras4.png"));
            abrir.setLblBatalla(nuevaImagen); 
            reproducirSonido4();
          }else if(pokemonSeleccionado3 == "Persian"){
            ImageIcon nuevaImagen = new ImageIcon(getClass().getResource(
            "/juego_pokemonant/Interfaz/Recursos/Atras5.png"));
            abrir.setLblBatalla(nuevaImagen); 
            reproducirSonido5();
          }else if(pokemonSeleccionado3 == "Ninetales"){
            ImageIcon nuevaImagen = new ImageIcon(getClass().getResource(
            "/juego_pokemonant/Interfaz/Recursos/Atras6.png"));
            abrir.setLblBatalla(nuevaImagen);  
            reproducirSonido6();
          }else if(pokemonSeleccionado3 == "Wartortle"){
            ImageIcon nuevaImagen = new ImageIcon(getClass().getResource(
            "/juego_pokemonant/Interfaz/Recursos/Atras7.png"));
            abrir.setLblBatalla(nuevaImagen);
            reproducirSonido7();
          }else if(pokemonSeleccionado3 == "Eevee"){
            ImageIcon nuevaImagen = new ImageIcon(getClass().getResource(
            "/juego_pokemonant/Interfaz/Recursos/Atras8.png"));
            abrir.setLblBatalla(nuevaImagen);
            reproducirSonido8();
          }else if(pokemonSeleccionado3 == "Vulpix"){
            ImageIcon nuevaImagen = new ImageIcon(getClass().getResource(
            "/juego_pokemonant/Interfaz/Recursos/Atras9.png"));
            abrir.setLblBatalla(nuevaImagen);
            reproducirSonido9();
          }       
        
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEligeB3ActionPerformed

    private void btnEligeB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEligeB4ActionPerformed
        pokeBatalla = pokemonSeleccionado4;
        b.escogerPoke(pokeBatalla);
        Batalla abrir = new Batalla();
        
         if(pokemonSeleccionado4 == "Squirtle"){
            ImageIcon nuevaImagen = new ImageIcon(getClass().getResource(
            "/juego_pokemonant/Interfaz/Recursos/Atras1.png"));
            abrir.setLblBatalla(nuevaImagen); 
            reproducirSonido1();         
          }else if(pokemonSeleccionado4 == "Rattata"){
            ImageIcon nuevaImagen = new ImageIcon(getClass().getResource(
            "/juego_pokemonant/Interfaz/Recursos/Atras2.png"));
            abrir.setLblBatalla(nuevaImagen); 
            reproducirSonido2();
          }else if(pokemonSeleccionado4 == "Charmander"){
            ImageIcon nuevaImagen = new ImageIcon(getClass().getResource(
            "/juego_pokemonant/Interfaz/Recursos/Atras3.png"));
            abrir.setLblBatalla(nuevaImagen);   
            reproducirSonido3();
          }else if(pokemonSeleccionado4 == "Psyduck"){
            ImageIcon nuevaImagen = new ImageIcon(getClass().getResource(
            "/juego_pokemonant/Interfaz/Recursos/Atras4.png"));
            abrir.setLblBatalla(nuevaImagen);
            reproducirSonido4();
          }else if(pokemonSeleccionado4 == "Persian"){
            ImageIcon nuevaImagen = new ImageIcon(getClass().getResource(
            "/juego_pokemonant/Interfaz/Recursos/Atras5.png"));
            abrir.setLblBatalla(nuevaImagen);
            reproducirSonido5();
          }else if(pokemonSeleccionado4 == "Ninetales"){
            ImageIcon nuevaImagen = new ImageIcon(getClass().getResource(
            "/juego_pokemonant/Interfaz/Recursos/Atras6.png"));
            abrir.setLblBatalla(nuevaImagen); 
            reproducirSonido6();
          }else if(pokemonSeleccionado4 == "Wartortle"){
            ImageIcon nuevaImagen = new ImageIcon(getClass().getResource(
            "/juego_pokemonant/Interfaz/Recursos/Atras7.png"));
            abrir.setLblBatalla(nuevaImagen);
            reproducirSonido7();
          }else if(pokemonSeleccionado4 == "Eevee"){
            ImageIcon nuevaImagen = new ImageIcon(getClass().getResource(
            "/juego_pokemonant/Interfaz/Recursos/Atras8.png"));
            abrir.setLblBatalla(nuevaImagen);
            reproducirSonido8();
          }else if(pokemonSeleccionado4 == "Vulpix"){
            ImageIcon nuevaImagen = new ImageIcon(getClass().getResource(
            "/juego_pokemonant/Interfaz/Recursos/Atras9.png"));
            abrir.setLblBatalla(nuevaImagen); 
            reproducirSonido9();
          }       
        
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEligeB4ActionPerformed

    private void btnEligeB1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEligeB1MouseEntered
        if (derrotado1 == true){
            
        } else {
        Oak sonidoBtn = new Oak();
        sonidoBtn.sonidoBtns();
        }
    }//GEN-LAST:event_btnEligeB1MouseEntered

    private void btnEligeB2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEligeB2MouseEntered
        if (derrotado2 == true){
            
        } else {
        Oak sonidoBtn = new Oak();
        sonidoBtn.sonidoBtns();
        }
    }//GEN-LAST:event_btnEligeB2MouseEntered

    private void btnEligeB3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEligeB3MouseEntered
        if (derrotado3 == true){
            
        } else {
        Oak sonidoBtn = new Oak();
        sonidoBtn.sonidoBtns();
        }
    }//GEN-LAST:event_btnEligeB3MouseEntered

    private void btnEligeB4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEligeB4MouseEntered
        if (derrotado4 == true){
            
        } else {
        Oak sonidoBtn = new Oak();
        sonidoBtn.sonidoBtns();
        }
    }//GEN-LAST:event_btnEligeB4MouseEntered

    public static String getPokemonSeleccionado1() {
        return pokemonSeleccionado1;
    }

    public static void setPokemonSeleccionado1(String pokemonSeleccionado1) {
        EligePoke.pokemonSeleccionado1 = pokemonSeleccionado1;
    }

    public static String getPokemonSeleccionado2() {
        return pokemonSeleccionado2;
    }

    public static void setPokemonSeleccionado2(String pokemonSeleccionado2) {
        EligePoke.pokemonSeleccionado2 = pokemonSeleccionado2;
    }

    public static String getPokemonSeleccionado3() {
        return pokemonSeleccionado3;
    }

    public static void setPokemonSeleccionado3(String pokemonSeleccionado3) {
        EligePoke.pokemonSeleccionado3 = pokemonSeleccionado3;
    }

    public static String getPokemonSeleccionado4() {
        return pokemonSeleccionado4;
    }

    public static void setPokemonSeleccionado4(String pokemonSeleccionado4) {
        EligePoke.pokemonSeleccionado4 = pokemonSeleccionado4;
    }

    private void reproducirSonido1() {
        try {
            URL soundUrl = getClass().getResource("/juego_pokemonant/Interfaz/Recursos/Grito_de_Squirtle.wav");

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
        private void reproducirSonido2() {
        try {
            URL soundUrl = getClass().getResource("/juego_pokemonant/Interfaz/Recursos/Grito_de_Rattata.wav");

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
        private void reproducirSonido3() {
        try {
            URL soundUrl = getClass().getResource("/juego_pokemonant/Interfaz/Recursos/Grito_de_Charmander.wav");

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
        private void reproducirSonido4() {
        try {
            URL soundUrl = getClass().getResource("/juego_pokemonant/Interfaz/Recursos/Grito_de_Psyduck.wav");

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
       private void reproducirSonido5() {
        try {
            URL soundUrl = getClass().getResource("/juego_pokemonant/Interfaz/Recursos/Grito_de_Persian.wav");

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
       private void reproducirSonido6() {
        try {
            URL soundUrl = getClass().getResource("/juego_pokemonant/Interfaz/Recursos/Grito_de_Ninetales.wav");

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
       private void reproducirSonido7() {
        try {
            URL soundUrl = getClass().getResource("/juego_pokemonant/Interfaz/Recursos/Grito_de_Wartortle.wav");

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
       private void reproducirSonido8() {
        try {
            URL soundUrl = getClass().getResource("/juego_pokemonant/Interfaz/Recursos/Grito_de_Eevee.wav");

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
       private void reproducirSonido9() {
        try {
            URL soundUrl = getClass().getResource("/juego_pokemonant/Interfaz/Recursos/Grito_de_Vulpix.wav");

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

    public String getPokebatalla() {
        return pokeBatalla;
    }
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEligeB1;
    private javax.swing.JButton btnEligeB2;
    private javax.swing.JButton btnEligeB3;
    private javax.swing.JButton btnEligeB4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
