package juego_pokemonant.Interfaz;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import juego_pokemonant.ListaPokemon;
import juego_pokemonant.Pokedex;

public class Ninetales extends javax.swing.JFrame {
    
  public static boolean presionado6 = false;  
  
    public Ninetales() {
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
        btnElige6 = new javax.swing.JButton();
        btnSiguiente6 = new javax.swing.JButton();
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

        btnElige6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/ElegirBtnSale.png"))); // NOI18N
        btnElige6.setToolTipText("");
        btnElige6.setBorder(null);
        btnElige6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnElige6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnElige6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnElige6MouseExited(evt);
            }
        });
        btnElige6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElige6ActionPerformed(evt);
            }
        });
        jPanel1.add(btnElige6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, -1));

        btnSiguiente6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/BotonSSalir.png"))); // NOI18N
        btnSiguiente6.setBorder(null);
        btnSiguiente6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSiguiente6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSiguiente6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSiguiente6MouseExited(evt);
            }
        });
        btnSiguiente6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguiente6ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/Ninetales.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, -1));

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
       Persian abrir5 = new Persian();
       if(abrir5.isPresionado5()==true){
           
       abrir5.getBtnElige5().setEnabled(false);
       }
       abrir5.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnAnterior4ActionPerformed

    private void btnElige6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElige6MouseEntered
        btnElige6.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/ElegirEntra.png")));
        Oak sonidoBtn = new Oak();
        sonidoBtn.sonidoBtns();
    }//GEN-LAST:event_btnElige6MouseEntered

    private void btnElige6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElige6MouseExited
        btnElige6.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/ElegirBtnSale.png")));
    }//GEN-LAST:event_btnElige6MouseExited

    private void btnElige6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElige6ActionPerformed
        presionado6 = true;
        Pokedex p = new Pokedex();
        ListaPokemon listaJugador = new ListaPokemon();
        p.getListaPokemonJugador().escoger(listaJugador.getListaPokemonJugador(), "Ninetales");
        btnElige6.setEnabled(false);
    }//GEN-LAST:event_btnElige6ActionPerformed

    private void btnSiguiente6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguiente6MouseEntered
        btnSiguiente6.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/BotonSEnter.png")));
        Oak sonidoBtn = new Oak();
        sonidoBtn.sonidoBtns();
    }//GEN-LAST:event_btnSiguiente6MouseEntered

    private void btnSiguiente6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguiente6MouseExited
        btnSiguiente6.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/BotonSSalir.png")));
    }//GEN-LAST:event_btnSiguiente6MouseExited

    private void btnSiguiente6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguiente6ActionPerformed
      Wartortle abrir7 = new Wartortle();
       if(abrir7.isPresionado7()==true){
           
       abrir7.getBtnElige7().setEnabled(false);
       }
       abrir7.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnSiguiente6ActionPerformed

    public static boolean isPresionado6() {
        return presionado6;
    }

    public static void setPresionado6(boolean presionado6) {
        Ninetales.presionado6 = presionado6;
    }

    public JButton getBtnElige6() {
        return btnElige6;
    }

    public void setBtnElige6(JButton btnElige6) {
        this.btnElige6 = btnElige6;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior4;
    private javax.swing.JButton btnElige6;
    private javax.swing.JButton btnSiguiente6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
