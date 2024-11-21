package juego_pokemonant.Interfaz;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import juego_pokemonant.ListaPokemon;
import juego_pokemonant.Pokedex;
/**
 *
 * @author MadellineAraya
 */
public class Wartortle extends javax.swing.JFrame {
    
   public static boolean presionado7 = false;
   
    public Wartortle() {
        initComponents();
        setSize(800,535);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAnterior5 = new javax.swing.JButton();
        btnElige7 = new javax.swing.JButton();
        btnSiguiente7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAnterior5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/BtnanteriorSalir.png"))); // NOI18N
        btnAnterior5.setBorder(null);
        btnAnterior5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnterior5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAnterior5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAnterior5MouseExited(evt);
            }
        });
        btnAnterior5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnterior5ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnterior5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, -1));

        btnElige7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/ElegirBtnSale.png"))); // NOI18N
        btnElige7.setToolTipText("");
        btnElige7.setBorder(null);
        btnElige7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnElige7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnElige7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnElige7MouseExited(evt);
            }
        });
        btnElige7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElige7ActionPerformed(evt);
            }
        });
        jPanel1.add(btnElige7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, -1));

        btnSiguiente7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/BotonSSalir.png"))); // NOI18N
        btnSiguiente7.setBorder(null);
        btnSiguiente7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSiguiente7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSiguiente7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSiguiente7MouseExited(evt);
            }
        });
        btnSiguiente7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguiente7ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/Wartortle.png"))); // NOI18N
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

    private void btnAnterior5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnterior5MouseEntered
        btnAnterior5.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/Btnanterior.png")));
        Oak sonidoBtn = new Oak();
        sonidoBtn.sonidoBtns();
    }//GEN-LAST:event_btnAnterior5MouseEntered

    private void btnAnterior5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnterior5MouseExited
        btnAnterior5.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/BtnanteriorSalir.png")));
    }//GEN-LAST:event_btnAnterior5MouseExited

    private void btnAnterior5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnterior5ActionPerformed
        Ninetales abrir6 = new Ninetales();
       if(abrir6.isPresionado6()==true){
           
       abrir6.getBtnElige6().setEnabled(false);
       }
       abrir6.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnAnterior5ActionPerformed

    private void btnElige7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElige7MouseEntered
        btnElige7.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/ElegirEntra.png")));
        Oak sonidoBtn = new Oak();
        sonidoBtn.sonidoBtns();
    }//GEN-LAST:event_btnElige7MouseEntered

    private void btnElige7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElige7MouseExited
        btnElige7.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/ElegirBtnSale.png")));
    }//GEN-LAST:event_btnElige7MouseExited

    private void btnElige7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElige7ActionPerformed
        presionado7 = true;
        Pokedex p = new Pokedex();
        ListaPokemon listaJugador = new ListaPokemon();
        p.getListaPokemonJugador().escoger(listaJugador.getListaPokemonJugador(), "Wartortle");
        btnElige7.setEnabled(false);
    }//GEN-LAST:event_btnElige7ActionPerformed

    private void btnSiguiente7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguiente7MouseEntered
        btnSiguiente7.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/BotonSEnter.png")));
        Oak sonidoBtn = new Oak();
        sonidoBtn.sonidoBtns();
    }//GEN-LAST:event_btnSiguiente7MouseEntered

    private void btnSiguiente7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguiente7MouseExited
        btnSiguiente7.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/BotonSSalir.png")));
    }//GEN-LAST:event_btnSiguiente7MouseExited

    private void btnSiguiente7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguiente7ActionPerformed
       Eevee abrir8 = new Eevee();
       if(abrir8.isPresionado8()==true){
           
       abrir8.getBtnElige8().setEnabled(false);
       }
       abrir8.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnSiguiente7ActionPerformed

    public static boolean isPresionado7() {
        return presionado7;
    }

    public static void setPresionado7(boolean presionado7) {
        Wartortle.presionado7 = presionado7;
    }

    public JButton getBtnElige7() {
        return btnElige7;
    }

    public void setBtnElige7(JButton btnElige7) {
        this.btnElige7 = btnElige7;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior5;
    private javax.swing.JButton btnElige7;
    private javax.swing.JButton btnSiguiente7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
