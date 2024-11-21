package juego_pokemonant.Interfaz;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import juego_pokemonant.Juego_PokemonAnt;
import juego_pokemonant.ListaPokemon;
import juego_pokemonant.Pokedex;

/**
 *
 * @author MadellineAraya
 */
public class Squirtle extends javax.swing.JFrame {
    
    public static boolean presionado = false;
    
    public Squirtle() {
        initComponents();
        setSize(800,535);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnElige = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnElige.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/ElegirBtnSale.png"))); // NOI18N
        btnElige.setToolTipText("");
        btnElige.setBorder(null);
        btnElige.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnElige.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEligeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEligeMouseExited(evt);
            }
        });
        btnElige.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEligeActionPerformed(evt);
            }
        });
        jPanel1.add(btnElige, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, -1, -1));

        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/BotonSSalir.png"))); // NOI18N
        btnSiguiente.setBorder(null);
        btnSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSiguienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSiguienteMouseExited(evt);
            }
        });
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 420, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/juego_pokemonant/Interfaz/Recursos/squirtlefondo.png"))); // NOI18N
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

    private void btnEligeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEligeActionPerformed
        presionado = true;
           Pokedex p = new Pokedex ();
        ListaPokemon listaJugador = new ListaPokemon();
        p.getListaPokemonJugador().escoger(listaJugador.getListaPokemonJugador(), "Squirtle");
        btnElige.setEnabled(false);
    }//GEN-LAST:event_btnEligeActionPerformed
    
    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        Rattata abrir3 = new Rattata ();
        if(abrir3.isPresionado2()==true){
           
          abrir3.getBtnElige2().setEnabled(false);
       }
           abrir3.setVisible(true);
           this.dispose();       
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnEligeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEligeMouseEntered
        btnElige.setIcon(new javax.swing.ImageIcon(getClass().getResource(
             "/juego_pokemonant/Interfaz/Recursos/ElegirEntra.png")));
        Oak sonidoBtn = new Oak();
        sonidoBtn.sonidoBtns();
    }//GEN-LAST:event_btnEligeMouseEntered

    private void btnEligeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEligeMouseExited
        btnElige.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/ElegirBtnSale.png")));   
    }//GEN-LAST:event_btnEligeMouseExited

    private void btnSiguienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguienteMouseEntered
        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/juego_pokemonant/Interfaz/Recursos/BotonSEnter.png")));
        Oak sonidoBtn = new Oak();
        sonidoBtn.sonidoBtns();
    }//GEN-LAST:event_btnSiguienteMouseEntered

    private void btnSiguienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSiguienteMouseExited
       btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource(
               "/juego_pokemonant/Interfaz/Recursos/BotonSSalir.png")));
    }//GEN-LAST:event_btnSiguienteMouseExited

    public static boolean isPresionado() {
        return presionado;
    }

    public static void setPresionado(boolean presionado) {
        Squirtle.presionado = presionado;
    }

    public JButton getBtnElige() {
        return btnElige;
    }

    public void setBtnElige(JButton btnElige) {
        this.btnElige = btnElige;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElige;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
