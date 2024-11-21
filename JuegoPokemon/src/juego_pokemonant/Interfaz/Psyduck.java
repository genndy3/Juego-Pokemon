package juego_pokemonant.Interfaz;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import juego_pokemonant.ListaPokemon;
import juego_pokemonant.Pokedex;

/**
 *
 * @author MadellineAraya
 */
public class Psyduck extends javax.swing.JFrame {
    
    public static boolean presionado4 = false;
    
    public Psyduck() {
        initComponents();
        setSize(800,535);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAnterior3 = new javax.swing.JButton();
        btnElige4 = new javax.swing.JButton();
        btnSiguiente4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAnterior3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/BtnanteriorSalir.png"))); // NOI18N
        btnAnterior3.setBorder(null);
        btnAnterior3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnterior3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAnterior3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAnterior3MouseExited(evt);
            }
        });
        btnAnterior3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnterior3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnterior3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, -1));

        btnElige4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/ElegirBtnSale.png"))); // NOI18N
        btnElige4.setToolTipText("");
        btnElige4.setBorder(null);
        btnElige4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnElige4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnElige4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnElige4MouseExited(evt);
            }
        });
        btnElige4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElige4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnElige4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, -1));

        btnSiguiente4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/BotonSSalir.png"))); // NOI18N
        btnSiguiente4.setBorder(null);
        btnSiguiente4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSiguiente4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSiguiente4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSiguiente4MouseExited(evt);
            }
        });
        btnSiguiente4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguiente4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/Spyduck.png"))); // NOI18N
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
  
    private void btnAnterior3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnterior3MouseEntered
        btnAnterior3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/Btnanterior.png")));
        Oak sonidoBtn = new Oak();
        sonidoBtn.sonidoBtns();
    }//GEN-LAST:event_btnAnterior3MouseEntered

    private void btnAnterior3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnterior3MouseExited
        btnAnterior3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/BtnanteriorSalir.png")));
    }//GEN-LAST:event_btnAnterior3MouseExited

    private void btnAnterior3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnterior3ActionPerformed
         Charmander abrir3 = new Charmander ();
       if(abrir3.isPresionado3()==true){
           
       abrir3.getBtnElige3().setEnabled(false);
       }
       abrir3.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnAnterior3ActionPerformed

    private void btnElige4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElige4MouseEntered
        btnElige4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/ElegirEntra.png")));
        Oak sonidoBtn = new Oak();
        sonidoBtn.sonidoBtns();
    }//GEN-LAST:event_btnElige4MouseEntered

    private void btnElige4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElige4MouseExited
        btnElige4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/ElegirBtnSale.png")));
    }//GEN-LAST:event_btnElige4MouseExited

    private void btnElige4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElige4ActionPerformed
        presionado4 = true;
        Pokedex p = new Pokedex();
        ListaPokemon listaJugador = new ListaPokemon();
        p.getListaPokemonJugador().escoger(listaJugador.getListaPokemonJugador(), "Psyduck");
        btnElige4.setEnabled(false);
    }//GEN-LAST:event_btnElige4ActionPerformed

    private void btnSiguiente4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguiente4MouseEntered
        btnSiguiente4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/BotonSEnter.png")));
        Oak sonidoBtn = new Oak();
        sonidoBtn.sonidoBtns();
    }//GEN-LAST:event_btnSiguiente4MouseEntered

    private void btnSiguiente4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguiente4MouseExited
        btnSiguiente4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/BotonSSalir.png")));
    }//GEN-LAST:event_btnSiguiente4MouseExited

    private void btnSiguiente4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguiente4ActionPerformed
       Persian abrir5 = new Persian();
       if(abrir5.isPresionado5()==true){
           
       abrir5.getBtnElige5().setEnabled(false);
       }
       abrir5.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnSiguiente4ActionPerformed

    public static boolean isPresionado4() {
        return presionado4;
    }

    public static void setPresionado4(boolean presionado4) {
        Psyduck.presionado4 = presionado4;
    }

    public JButton getBtnElige4() {
        return btnElige4;
    }

    public void setBtnElige4(JButton btnElige4) {
        this.btnElige4 = btnElige4;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior3;
    private javax.swing.JButton btnElige4;
    private javax.swing.JButton btnSiguiente4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
