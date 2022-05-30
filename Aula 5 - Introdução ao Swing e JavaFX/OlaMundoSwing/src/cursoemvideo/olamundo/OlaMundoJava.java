package cursoemvideo.olamundo;

public class OlaMundoJava extends javax.swing.JFrame {
    public OlaMundoJava() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMensagem = new javax.swing.JLabel();
        btnClick = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblMensagem.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblMensagem.setForeground(new java.awt.Color(255, 0, 0));
        lblMensagem.setText("Aqui vai aparecer a mensagem");

        btnClick.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnClick.setText("Clique em Mim!");
        btnClick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClickActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(lblMensagem)
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(btnClick)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(lblMensagem)
                .addGap(53, 53, 53)
                .addComponent(btnClick)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClickActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClickActionPerformed
        lblMensagem.setText("Olá, Mundo!");
    }//GEN-LAST:event_btnClickActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OlaMundoJava().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClick;
    private javax.swing.JLabel lblMensagem;
    // End of variables declaration//GEN-END:variables
}
