package juego_pokemonant.Interfaz;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import juego_pokemonant.BatallaP;
import juego_pokemonant.Pokedex;
import juego_pokemonant.Pokemon;

/**
 *
 * @author MadellineAraya
 */
public class Batalla extends javax.swing.JFrame {
    private static BatallaP b = new BatallaP();
    private static Pokedex getLista = new Pokedex();
    private static int contD = 0;
    private static int contA=0;
    boolean disponibleD = false;
    boolean disponibleA = false;
    private int accionCPU = 0;
    private static String text = "";
     
    public Batalla() {
        initComponents();
        setSize(810,547);
        setLocationRelativeTo(null);   
        mostrarPokemonCpu();//Mostrar pokemon cpu
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Pokedex p = new Pokedex ();
        EligePoke elegirPoke = new EligePoke();
        text += "Haz elegido a "+ elegirPoke.getPokebatalla()+"...\n" +
                "Es tu turno elije tu movimiento" + "\n";
        jCajaDeTexo.setText(text); 
        jButtonVidaJugador.setEnabled(false);
        jButtonVidaCPU.setEnabled(false);
        
        Pokemon jugadorPokemon = new Pokemon();
        jButtonVidaJugador.setText(""+b.getJugadorPokemon().getVida());
        jButtonVidaCPU.setText(""+getLista.getListaPokemonCpu().getCabeza()
                                .getPokemon().getVida());         
        btnDefensa.setEnabled(false);
        btnDefensaEspecial.setEnabled(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnDefensa = new javax.swing.JButton();
        btnDefensaEspecial = new javax.swing.JButton();
        btnAtacar = new javax.swing.JButton();
        btnAtaqueEspecial = new javax.swing.JButton();
        jButtonVidaJugador = new javax.swing.JButton();
        btnElegir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jCajaDeTexo = new javax.swing.JTextArea();
        jButtonVidaCPU = new javax.swing.JButton();
        lblBatalla = new javax.swing.JLabel();
        lblCpu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnDefensa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/btnDefensa1.png"))); // NOI18N
        btnDefensa.setBorder(null);
        btnDefensa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDefensa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDefensaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDefensaMouseExited(evt);
            }
        });
        btnDefensa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefensaActionPerformed(evt);
            }
        });
        jPanel1.add(btnDefensa, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 140, 50));

        btnDefensaEspecial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/btnDefensaEsp1.png"))); // NOI18N
        btnDefensaEspecial.setBorder(null);
        btnDefensaEspecial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDefensaEspecial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDefensaEspecialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDefensaEspecialMouseExited(evt);
            }
        });
        btnDefensaEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefensaEspecialActionPerformed(evt);
            }
        });
        jPanel1.add(btnDefensaEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 450, 140, 60));

        btnAtacar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/btnAtacar1.png"))); // NOI18N
        btnAtacar.setBorder(null);
        btnAtacar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtacar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAtacarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAtacarMouseExited(evt);
            }
        });
        btnAtacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtacarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 150, 50));

        btnAtaqueEspecial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/btnAtaqE1.png"))); // NOI18N
        btnAtaqueEspecial.setBorder(null);
        btnAtaqueEspecial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtaqueEspecial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAtaqueEspecialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAtaqueEspecialMouseExited(evt);
            }
        });
        btnAtaqueEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtaqueEspecialActionPerformed(evt);
            }
        });
        jPanel1.add(btnAtaqueEspecial, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 150, 60));

        jButtonVidaJugador.setText("jButton1");
        jButtonVidaJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVidaJugadorActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonVidaJugador, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, -1));

        btnElegir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/BtnEligeB.png"))); // NOI18N
        btnElegir.setBorder(null);
        btnElegir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnElegir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnElegirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnElegirMouseExited(evt);
            }
        });
        btnElegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElegirActionPerformed(evt);
            }
        });
        jPanel1.add(btnElegir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 290, 30));

        jCajaDeTexo.setColumns(20);
        jCajaDeTexo.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jCajaDeTexo.setRows(5);
        jScrollPane1.setViewportView(jCajaDeTexo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 410, 140));

        jButtonVidaCPU.setText("jButton1");
        jPanel1.add(jButtonVidaCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, -1));
        jPanel1.add(lblBatalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 230, 160));
        jPanel1.add(lblCpu, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 270, 200));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/Pasto.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDefensaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefensaActionPerformed
        b.setEscogeDefensa(1);
        accionCPU = b.turnoCPU();
        if (accionCPU == 1) {
            text += b.ataqueRegular(b.getJugadorPokemon(), b.getCpuPokemon());           
        } else if (accionCPU == 2) {
            text += b.checkAtaqueEspecialCPU();
        }
        btnDefensa.setEnabled(false);
        btnAtacar.setEnabled(true);
        btnAtaqueEspecial.setEnabled(true);
        btnElegir.setEnabled(true);
        btnDefensaEspecial.setEnabled(false);
        
       if (!checkContA()) {
            btnAtaqueEspecial.setEnabled(false);
        } else if (checkContA()) {
            btnAtaqueEspecial.setEnabled(true);
        }
        text += b.checkbatallaJugador();
        text += b.checkbatallaFinal();
        jCajaDeTexo.setText(text);
        Pokemon jugadorPokemon = new Pokemon();
        if (getLista.getListaPokemonCpu().getCabeza() != null){
        jButtonVidaJugador.setText(""+b.getJugadorPokemon().getVida());
        jButtonVidaCPU.setText(""+getLista.getListaPokemonCpu().getCabeza().getPokemon().getVida());
        }
    }//GEN-LAST:event_btnDefensaActionPerformed

    private void btnAtacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtacarActionPerformed
         text += b.atacarJugador() +"\n";
        
        b.turnoCPU();
        btnAtacar.setEnabled(false);
        btnAtaqueEspecial.setEnabled(false);
        btnElegir.setEnabled(false);
        btnDefensa.setEnabled(true);
        
        if (!checkContD()) {
            btnDefensaEspecial.setEnabled(false);
        } else if (checkContD()) {
            btnDefensaEspecial.setEnabled(true);
        }
        text += b.checkbatallaCPU();
        text += b.checkbatallaFinal();
        jCajaDeTexo.setText(text);
        Pokemon jugadorPokemon = new Pokemon();
        jButtonVidaJugador.setText(""+b.getJugadorPokemon().getVida());
        Pokedex getLista = new Pokedex();
        if (getLista.getListaPokemonCpu().getCabeza() != null){
        jButtonVidaCPU.setText(""+getLista.getListaPokemonCpu().getCabeza().getPokemon().getVida());
        mostrarPokemonCpu();
        }
    }//GEN-LAST:event_btnAtacarActionPerformed

    private void btnAtaqueEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtaqueEspecialActionPerformed
       text +=b.AtaqueEspecialJugador() + "\n";
       
        b.turnoCPU();
        btnAtaqueEspecial.setEnabled(false);
        btnAtacar.setEnabled(false);
        btnElegir.setEnabled(false);
        btnDefensa.setEnabled(true);
        contA=2;
        
        if (!checkContD()) {
            btnDefensaEspecial.setEnabled(false);
        } else if (checkContD()) {
            btnDefensaEspecial.setEnabled(true);
        }
        text += b.checkbatallaCPU();
        text += b.checkbatallaFinal();
        jCajaDeTexo.setText(text);
        Pokemon jugadorPokemon = new Pokemon();
        if (getLista.getListaPokemonCpu().getCabeza() != null){
        jButtonVidaJugador.setText(""+b.getJugadorPokemon().getVida());
        jButtonVidaCPU.setText(""+getLista.getListaPokemonCpu().getCabeza().getPokemon().getVida());
        mostrarPokemonCpu();
        }
    }//GEN-LAST:event_btnAtaqueEspecialActionPerformed

    public boolean checkContD(){
        
        if (contD == 2 || contD == 1){
            disponibleD = false;
            contD --;
        } else if (contD == 0){
            disponibleD = true;
        }
        return disponibleD;
    }
    public boolean checkContA(){
        
        if (contA == 2 || contA == 1){
            disponibleA = false;
            contA --;
        } else if (contA == 0){
            disponibleA = true;
        }
        return disponibleA;
    }
    
    private void btnElegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElegirActionPerformed
      EligePoke e = new EligePoke();
      e.setVisible(true);
      mostrarPokemonCpu();
      this.dispose();
    }//GEN-LAST:event_btnElegirActionPerformed

    private void btnElegirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElegirMouseEntered
         btnElegir.setIcon(new javax.swing.ImageIcon(getClass().getResource(
             "/juego_pokemonant/Interfaz/Recursos/BtnEligeB2.png"))); 
         Oak sonidoBtn = new Oak();
        sonidoBtn.sonidoBtns();
    }//GEN-LAST:event_btnElegirMouseEntered

    private void btnElegirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElegirMouseExited
        btnElegir.setIcon(new javax.swing.ImageIcon(getClass().getResource(
             "/juego_pokemonant/Interfaz/Recursos/BtnEligeB.png"))); 
    }//GEN-LAST:event_btnElegirMouseExited

    private void btnAtacarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtacarMouseEntered
        btnAtacar.setIcon(new javax.swing.ImageIcon(getClass().getResource(
             "/juego_pokemonant/Interfaz/Recursos/btnAtacar2.png")));
        Oak sonidoBtn = new Oak();
        sonidoBtn.sonidoBtns();
    }//GEN-LAST:event_btnAtacarMouseEntered

    private void btnAtacarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtacarMouseExited
         btnAtacar.setIcon(new javax.swing.ImageIcon(getClass().getResource(
             "/juego_pokemonant/Interfaz/Recursos/btnAtacar1.png"))); 
    }//GEN-LAST:event_btnAtacarMouseExited

    private void btnAtaqueEspecialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtaqueEspecialMouseEntered
         btnAtaqueEspecial.setIcon(new javax.swing.ImageIcon(getClass().getResource(
             "/juego_pokemonant/Interfaz/Recursos/btnAtaqE2.png"))); 
         Oak sonidoBtn = new Oak();
        sonidoBtn.sonidoBtns();
    }//GEN-LAST:event_btnAtaqueEspecialMouseEntered

    private void btnAtaqueEspecialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAtaqueEspecialMouseExited
        btnAtaqueEspecial.setIcon(new javax.swing.ImageIcon(getClass().getResource(
             "/juego_pokemonant/Interfaz/Recursos/btnAtaqE1.png"))); 
    }//GEN-LAST:event_btnAtaqueEspecialMouseExited

    private void btnDefensaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDefensaMouseEntered
       btnDefensa.setIcon(new javax.swing.ImageIcon(getClass().getResource(
             "/juego_pokemonant/Interfaz/Recursos/btnDefensa2.png"))); 
       Oak sonidoBtn = new Oak();
        sonidoBtn.sonidoBtns();
    }//GEN-LAST:event_btnDefensaMouseEntered

    private void btnDefensaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDefensaMouseExited
       btnDefensa.setIcon(new javax.swing.ImageIcon(getClass().getResource(
             "/juego_pokemonant/Interfaz/Recursos/btnDefensa1.png")));
    }//GEN-LAST:event_btnDefensaMouseExited

    private void btnDefensaEspecialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDefensaEspecialMouseEntered
       btnDefensaEspecial.setIcon(new javax.swing.ImageIcon(getClass().getResource(
             "/juego_pokemonant/Interfaz/Recursos/btnDefensaEsp2.png")));
       Oak sonidoBtn = new Oak();
        sonidoBtn.sonidoBtns();
    }//GEN-LAST:event_btnDefensaEspecialMouseEntered

    private void btnDefensaEspecialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDefensaEspecialMouseExited
        btnDefensaEspecial.setIcon(new javax.swing.ImageIcon(getClass().getResource(
             "/juego_pokemonant/Interfaz/Recursos/btnDefensaEsp1.png"))); 
    }//GEN-LAST:event_btnDefensaEspecialMouseExited

    private void btnDefensaEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDefensaEspecialActionPerformed
       text += b.getJugadorPokemon().getNombre() + " ha bloqueado el ataque "
                    + "utilizando defensa" + "\n" + "especial!"+ "\n";
        b.defensaEspecialJugador();
        accionCPU = b.turnoCPU();
        if (accionCPU == 1) {
            text +=b.ataqueRegular(b.getJugadorPokemon(), b.getCpuPokemon());
        } else if (accionCPU == 2) {
            text += b.checkAtaqueEspecialCPU();
        }
        btnDefensa.setEnabled(false);
        btnDefensaEspecial.setEnabled(false);
        btnAtacar.setEnabled(true);
        btnAtaqueEspecial.setEnabled(true);
        btnElegir.setEnabled(true);
        contD = 2;
        if (!checkContA()) {
            btnAtaqueEspecial.setEnabled(false);
        } else if (checkContA()) {
            btnAtaqueEspecial.setEnabled(true);
        }
        text += b.checkbatallaJugador();
        text += b.checkbatallaFinal();
        jCajaDeTexo.setText(text);
        Pokemon jugadorPokemon = new Pokemon();
        if (getLista.getListaPokemonCpu().getCabeza() != null){
        jButtonVidaJugador.setText(""+b.getJugadorPokemon().getVida());
        jButtonVidaCPU.setText(""+getLista.getListaPokemonCpu().getCabeza().getPokemon().getVida());
        }
    }//GEN-LAST:event_btnDefensaEspecialActionPerformed

    private void jButtonVidaJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVidaJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVidaJugadorActionPerformed

    public JLabel getLblBatalla() {
        return lblBatalla;
    }

    public void setLblBatalla(ImageIcon imageIcon) {
        lblBatalla.setIcon(imageIcon);
    }

    public JLabel getLblCpu() {
        return lblCpu;
    }

    public void setLblCpu(ImageIcon imageIcon2) {
       lblCpu.setIcon(imageIcon2);
    }

     public void mostrarPokemonCpu(){
         BatallaP p = new BatallaP();
         String pokemonCpuB = p.getCpuPokemon().getNombre(); //Toma el nombre del pokemon del cpu

        
          switch (pokemonCpuB) {
            case "Squirtle":
                lblCpu.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/SquirtleCpu1.png")));
                break;
            case "Rattata":
                lblCpu.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/RattataCpu1.png")));
                break;
            case "Charmander":
                 lblCpu.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/CharmanderCpu1.png")));
                break;
            case "Psyduck":   
                 lblCpu.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/PsyduckCpu1.png")));
                break;
            case "Persian":
                lblCpu.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/PersianCpu1.png")));
                break;
            case "Ninetales":
                lblCpu.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/NinetalesCpu1.png")));
                break;
            case "Wartortle":
                lblCpu.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/WartortleCpu1.png")));
                break;
            case "Eevee":
                lblCpu.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/EeveeCpu1.png")));
                break;
            case "Vulpix":
                lblCpu.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                        "/juego_pokemonant/Interfaz/Recursos/VulpixCpu1.png")));
                break;
            default:
              
                break;
        }
     }
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtacar;
    private javax.swing.JButton btnAtaqueEspecial;
    private javax.swing.JButton btnDefensa;
    private javax.swing.JButton btnDefensaEspecial;
    private javax.swing.JButton btnElegir;
    private javax.swing.JButton jButtonVidaCPU;
    private javax.swing.JButton jButtonVidaJugador;
    private javax.swing.JTextArea jCajaDeTexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBatalla;
    private javax.swing.JLabel lblCpu;
    // End of variables declaration//GEN-END:variables
}
