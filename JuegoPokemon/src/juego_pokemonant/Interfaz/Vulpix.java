package juego_pokemonant.Interfaz;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import juego_pokemonant.ListaPokemon;
import juego_pokemonant.Pokedex;
/**
 *
 * @author MadellineAraya
 */
public class Vulpix extends javax.swing.JFrame {
    
     public static boolean presionado9 = false; 
     
    public Vulpix() {
        initComponents();
        setSize(800,535);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAnterior8 = new javax.swing.JButton();
        btnElige9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAnterior8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/BtnanteriorSalir.png"))); // NOI18N
        btnAnterior8.setBorder(null);
        btnAnterior8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAnterior8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAnterior8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAnterior8MouseExited(evt);
            }
        });
        btnAnterior8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnterior8ActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnterior8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, -1));

        btnElige9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/ElegirBtnSale.png"))); // NOI18N
        btnElige9.setToolTipText("");
        btnElige9.setBorder(null);
        btnElige9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnElige9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnElige9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnElige9MouseExited(evt);
            }
        });
        btnElige9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElige9ActionPerformed(evt);
            }
        });
        jPanel1.add(btnElige9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/Vulpix.png"))); // NOI18N
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

    private void btnAnterior8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnterior8MouseEntered
       btnAnterior8.setIcon(new javax.swing.ImageIcon(getClass().getResource(
               "/juego_pokemonant/Interfaz/Recursos/Btnanterior.png")));
       Oak sonidoBtn = new Oak();
        sonidoBtn.sonidoBtns();
    }//GEN-LAST:event_btnAnterior8MouseEntered

    private void btnAnterior8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAnterior8MouseExited
        btnAnterior8.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/BtnanteriorSalir.png")));
    }//GEN-LAST:event_btnAnterior8MouseExited

    private void btnAnterior8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnterior8ActionPerformed
       Eevee abrir8 = new Eevee();
       if(abrir8.isPresionado8()==true){
           
       abrir8.getBtnElige8().setEnabled(false);
       }
       abrir8.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_btnAnterior8ActionPerformed

    private void btnElige9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElige9MouseEntered
        btnElige9.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/ElegirEntra.png")));
        Oak sonidoBtn = new Oak();
        sonidoBtn.sonidoBtns();
    }//GEN-LAST:event_btnElige9MouseEntered

    private void btnElige9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElige9MouseExited
        btnElige9.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/ElegirBtnSale.png")));
    }//GEN-LAST:event_btnElige9MouseExited

    private void btnElige9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElige9ActionPerformed
        presionado9 = true;
        Pokedex p = new Pokedex();
        ListaPokemon listaJugador = new ListaPokemon();
        p.getListaPokemonJugador().escoger(listaJugador.getListaPokemonJugador(), "Vulpix");
            btnElige9.setEnabled(false);
    }//GEN-LAST:event_btnElige9ActionPerformed

    public static boolean isPresionado9() {
        return presionado9;
    }

    public static void setPresionado9(boolean presionado9) {
        Vulpix.presionado9 = presionado9;
    }

    public JButton getBtnElige9() {
        return btnElige9;
    }

    public void setBtnElige9(JButton btnElige9) {
        this.btnElige9 = btnElige9;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior8;
    private javax.swing.JButton btnElige9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
