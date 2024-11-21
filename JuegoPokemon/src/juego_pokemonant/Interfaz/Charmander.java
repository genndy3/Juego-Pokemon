package juego_pokemonant.Interfaz;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import juego_pokemonant.ListaPokemon;
import juego_pokemonant.Pokedex;

/**
 *
 * @author MadellineAraya
 */
public class Charmander extends javax.swing.JFrame {
    
    public static boolean presionado3 = false; 
    
    public Charmander() {
        initComponents();
        setSize(800,535);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAnterior2 = new javax.swing.JButton();
        btnSiguiente3 = new javax.swing.JButton();
        btnElige3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAnterior2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/BtnanteriorSalir.png"))); // NOI18N
        btnAnterior2.setBorder(null);
        btnAnterior2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnterior2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAnterior2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAnterior2MouseExited(evt);
            }
        });
        btnAnterior2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnterior2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnterior2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, -1));

        btnSiguiente3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/BotonSSalir.png"))); // NOI18N
        btnSiguiente3.setBorder(null);
        btnSiguiente3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSiguiente3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSiguiente3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSiguiente3MouseExited(evt);
            }
        });
        btnSiguiente3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguiente3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, -1, -1));

        btnElige3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/ElegirBtnSale.png"))); // NOI18N
        btnElige3.setToolTipText("");
        btnElige3.setBorder(null);
        btnElige3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnElige3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnElige3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnElige3MouseExited(evt);
            }
        });
        btnElige3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElige3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnElige3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/Charmander.png"))); // NOI18N
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

    private void btnAnterior2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnterior2MouseEntered
        btnAnterior2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/Btnanterior.png")));
        Oak sonidoBtn = new Oak();
        sonidoBtn.sonidoBtns();
    }//GEN-LAST:event_btnAnterior2MouseEntered

    private void btnAnterior2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnterior2MouseExited
        btnAnterior2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/BtnanteriorSalir.png")));
    }//GEN-LAST:event_btnAnterior2MouseExited

    private void btnAnterior2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnterior2ActionPerformed
        Rattata abrir2 = new Rattata ();
       if(abrir2.isPresionado2()==true){
           
       abrir2.getBtnElige2().setEnabled(false);
       }
       abrir2.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnAnterior2ActionPerformed

    private void btnElige3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElige3MouseEntered
        btnElige3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/ElegirEntra.png")));
        Oak sonidoBtn = new Oak();
        sonidoBtn.sonidoBtns();
    }//GEN-LAST:event_btnElige3MouseEntered

    private void btnElige3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElige3MouseExited
        btnElige3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/ElegirBtnSale.png")));
    }//GEN-LAST:event_btnElige3MouseExited

    private void btnElige3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElige3ActionPerformed
        presionado3 = true;
        Pokedex p = new Pokedex();
        ListaPokemon listaJugador = new ListaPokemon();
        p.getListaPokemonJugador().escoger(listaJugador.getListaPokemonJugador(), "Charmander");
        btnElige3.setEnabled(false);
    }//GEN-LAST:event_btnElige3ActionPerformed

    private void btnSiguiente3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguiente3MouseEntered
        btnSiguiente3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/BotonSEnter.png")));
        Oak sonidoBtn = new Oak();
        sonidoBtn.sonidoBtns();
    }//GEN-LAST:event_btnSiguiente3MouseEntered

    private void btnSiguiente3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguiente3MouseExited
        btnSiguiente3.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/BotonSSalir.png")));
    }//GEN-LAST:event_btnSiguiente3MouseExited

    private void btnSiguiente3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguiente3ActionPerformed
        Psyduck abrir4 = new Psyduck ();
       if(abrir4.isPresionado4()==true){
           
       abrir4.getBtnElige4().setEnabled(false);
       }
       abrir4.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnSiguiente3ActionPerformed

    public static boolean isPresionado3() {
        return presionado3;
    }

    public static void setPresionado3(boolean presionado3) {
        Charmander.presionado3 = presionado3;
    }

    public JButton getBtnElige3() {
        return btnElige3;
    }

    public void setBtnElige3(JButton btnElige3) {
        this.btnElige3 = btnElige3;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior2;
    private javax.swing.JButton btnElige3;
    private javax.swing.JButton btnSiguiente3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
