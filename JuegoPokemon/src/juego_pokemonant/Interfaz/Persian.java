package juego_pokemonant.Interfaz;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import juego_pokemonant.ListaPokemon;
import juego_pokemonant.Pokedex;

/**
 *
 * @author MadellineAraya
 */
public class Persian extends javax.swing.JFrame {
    
   public static boolean presionado5 = false;  
   
    public Persian() {
        initComponents();
        setSize(800,535);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAnterior4 = new javax.swing.JButton();
        btnElige5 = new javax.swing.JButton();
        btnSiguiente5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAnterior4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/BtnanteriorSalir.png"))); // NOI18N
        btnAnterior4.setBorder(null);
        btnAnterior4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnterior4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAnterior4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAnterior4MouseExited(evt);
            }
        });
        btnAnterior4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnterior4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnterior4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, -1));

        btnElige5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/ElegirBtnSale.png"))); // NOI18N
        btnElige5.setToolTipText("");
        btnElige5.setBorder(null);
        btnElige5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnElige5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnElige5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnElige5MouseExited(evt);
            }
        });
        btnElige5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElige5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnElige5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, -1));

        btnSiguiente5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/BotonSSalir.png"))); // NOI18N
        btnSiguiente5.setBorder(null);
        btnSiguiente5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSiguiente5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSiguiente5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSiguiente5MouseExited(evt);
            }
        });
        btnSiguiente5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguiente5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/PersianF.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void btnAnterior4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnterior4MouseEntered
        btnAnterior4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/Btnanterior.png")));
        Oak sonidoBtn = new Oak();
        sonidoBtn.sonidoBtns();
    }//GEN-LAST:event_btnAnterior4MouseEntered

    private void btnAnterior4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnterior4MouseExited
        btnAnterior4.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/BtnanteriorSalir.png")));
    }//GEN-LAST:event_btnAnterior4MouseExited

    private void btnAnterior4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnterior4ActionPerformed
       Psyduck abrir4 = new Psyduck();
       if(abrir4.isPresionado4()==true){
           
       abrir4.getBtnElige4().setEnabled(false);
       }
       abrir4.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnAnterior4ActionPerformed

    private void btnElige5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElige5MouseEntered
        btnElige5.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/ElegirEntra.png")));
        Oak sonidoBtn = new Oak();
        sonidoBtn.sonidoBtns();
    }//GEN-LAST:event_btnElige5MouseEntered

    private void btnElige5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElige5MouseExited
        btnElige5.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/ElegirBtnSale.png")));
    }//GEN-LAST:event_btnElige5MouseExited

    private void btnElige5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElige5ActionPerformed
        presionado5 = true;
        Pokedex p = new Pokedex();
        ListaPokemon listaJugador = new ListaPokemon();
        p.getListaPokemonJugador().escoger(listaJugador.getListaPokemonJugador(), "Persian");
        btnElige5.setEnabled(false);
    }//GEN-LAST:event_btnElige5ActionPerformed

    private void btnSiguiente5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguiente5MouseEntered
        btnSiguiente5.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/BotonSEnter.png")));
        Oak sonidoBtn = new Oak();
        sonidoBtn.sonidoBtns();
    }//GEN-LAST:event_btnSiguiente5MouseEntered

    private void btnSiguiente5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguiente5MouseExited
        btnSiguiente5.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/BotonSSalir.png")));
    }//GEN-LAST:event_btnSiguiente5MouseExited

    private void btnSiguiente5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguiente5ActionPerformed
       Ninetales abrir6 = new Ninetales();
       if(abrir6.isPresionado6()==true){
           
       abrir6.getBtnElige6().setEnabled(false);
       }
       abrir6.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnSiguiente5ActionPerformed

    public static boolean isPresionado5() {
        return presionado5;
    }

    public static void setPresionado5(boolean presionado5) {
        Persian.presionado5 = presionado5;
    }

    public JButton getBtnElige5() {
        return btnElige5;
    }

    public void setBtnElige5(JButton btnElige5) {
        this.btnElige5 = btnElige5;
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior4;
    private javax.swing.JButton btnElige5;
    private javax.swing.JButton btnSiguiente5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
