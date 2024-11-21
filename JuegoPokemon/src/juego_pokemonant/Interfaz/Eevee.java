package juego_pokemonant.Interfaz;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import juego_pokemonant.ListaPokemon;
import juego_pokemonant.Pokedex;
/**
 *
 * @author MadellineAraya
 */
public class Eevee extends javax.swing.JFrame {
    
     public static boolean presionado8 = false;  
     
    public Eevee() {
        initComponents();
        setSize(800,535);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAnterior7 = new javax.swing.JButton();
        btnElige8 = new javax.swing.JButton();
        btnSiguiente8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAnterior7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/BtnanteriorSalir.png"))); // NOI18N
        btnAnterior7.setBorder(null);
        btnAnterior7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnterior7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAnterior7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAnterior7MouseExited(evt);
            }
        });
        btnAnterior7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnterior7ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnterior7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, -1));

        btnElige8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/ElegirBtnSale.png"))); // NOI18N
        btnElige8.setToolTipText("");
        btnElige8.setBorder(null);
        btnElige8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnElige8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnElige8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnElige8MouseExited(evt);
            }
        });
        btnElige8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElige8ActionPerformed(evt);
            }
        });
        jPanel1.add(btnElige8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, -1));

        btnSiguiente8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/BotonSSalir.png"))); // NOI18N
        btnSiguiente8.setBorder(null);
        btnSiguiente8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSiguiente8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSiguiente8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSiguiente8MouseExited(evt);
            }
        });
        btnSiguiente8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguiente8ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/Eevee.png"))); // NOI18N
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

    private void btnAnterior7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnterior7MouseEntered
        btnAnterior7.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/Btnanterior.png")));
        Oak sonidoBtn = new Oak();
        sonidoBtn.sonidoBtns();
    }//GEN-LAST:event_btnAnterior7MouseEntered

    private void btnAnterior7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnterior7MouseExited
        btnAnterior7.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/BtnanteriorSalir.png")));
    }//GEN-LAST:event_btnAnterior7MouseExited

    private void btnAnterior7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnterior7ActionPerformed
      Wartortle abrir7 = new Wartortle();
       if(abrir7.isPresionado7()==true){
           
       abrir7.getBtnElige7().setEnabled(false);
       }
       abrir7.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnAnterior7ActionPerformed

    private void btnElige8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElige8MouseEntered
        btnElige8.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/ElegirEntra.png")));
        Oak sonidoBtn = new Oak();
        sonidoBtn.sonidoBtns();
    }//GEN-LAST:event_btnElige8MouseEntered

    private void btnElige8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElige8MouseExited
        btnElige8.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/ElegirBtnSale.png")));
    }//GEN-LAST:event_btnElige8MouseExited

    private void btnElige8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElige8ActionPerformed
        presionado8 = true;
        Pokedex p = new Pokedex();
        ListaPokemon listaJugador = new ListaPokemon();
        p.getListaPokemonJugador().escoger(listaJugador.getListaPokemonJugador(), "Eevee");
        btnElige8.setEnabled(false);
    }//GEN-LAST:event_btnElige8ActionPerformed

    private void btnSiguiente8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguiente8MouseEntered
        btnSiguiente8.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/BotonSEnter.png")));
        Oak sonidoBtn = new Oak();
        sonidoBtn.sonidoBtns();
    }//GEN-LAST:event_btnSiguiente8MouseEntered

    private void btnSiguiente8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguiente8MouseExited
        btnSiguiente8.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/BotonSSalir.png")));
    }//GEN-LAST:event_btnSiguiente8MouseExited

    private void btnSiguiente8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguiente8ActionPerformed
       Vulpix abrir9 = new Vulpix();
       if(abrir9.isPresionado9()==true){
           
       abrir9.getBtnElige9().setEnabled(false);
       }
       abrir9.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnSiguiente8ActionPerformed

    public static boolean isPresionado8() {
        return presionado8;
    }

    public static void setPresionado8(boolean presionado8) {
        Eevee.presionado8 = presionado8;
    }

    public JButton getBtnElige8() {
        return btnElige8;
    }

    public void setBtnElige8(JButton btnElige8) {
        this.btnElige8 = btnElige8;
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior7;
    private javax.swing.JButton btnElige8;
    private javax.swing.JButton btnSiguiente8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
