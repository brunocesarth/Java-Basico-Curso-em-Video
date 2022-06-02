package com.cursoemvideo.telacalculadora;

public class TelaCalculadora extends javax.swing.JFrame {

    public TelaCalculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtValor = new javax.swing.JSpinner();
        btnCalcular = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lblTextoResDiv = new javax.swing.JLabel();
        lblResDiv = new javax.swing.JLabel();
        lblTextoEleCubo = new javax.swing.JLabel();
        lblResEleCubo = new javax.swing.JLabel();
        lblTextoRaizQ = new javax.swing.JLabel();
        lblResRaizQ = new javax.swing.JLabel();
        lblTextoRaizCub = new javax.swing.JLabel();
        lblResRaizCub = new javax.swing.JLabel();
        lblTextoValorAbs = new javax.swing.JLabel();
        lblResValorAbs = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Super Calculadora");

        jLabel2.setText("Informe um valor:");

        txtValor.setMinimumSize(new java.awt.Dimension(70, 22));

        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/operadores.png"))); // NOI18N
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/CALCULADORA.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(lblTextoResDiv)
                            .addComponent(lblTextoEleCubo)
                            .addComponent(lblTextoRaizQ)
                            .addComponent(lblTextoRaizCub)
                            .addComponent(lblTextoValorAbs))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblResDiv)
                            .addComponent(lblResEleCubo)
                            .addComponent(lblResRaizQ)
                            .addComponent(lblResRaizCub)
                            .addComponent(lblResValorAbs)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTextoResDiv)
                            .addComponent(lblResDiv))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTextoEleCubo)
                            .addComponent(lblResEleCubo))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTextoRaizQ)
                            .addComponent(lblResRaizQ))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTextoRaizCub)
                            .addComponent(lblResRaizCub))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTextoValorAbs)
                            .addComponent(lblResValorAbs)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        int valor = Integer.parseInt(txtValor.getValue().toString());
        int div = valor % 2;
        float cubo = (float)Math.pow(valor,3);
        float raizQ = (float)Math.sqrt(valor);
        float raizCub = (float)Math.cbrt(valor);
        int ValorAbs = (int)Math.abs(valor);
        lblTextoResDiv.setText("Resto da Divisão por 2");
        lblTextoEleCubo.setText("Elevado ao Cubo");
        lblTextoRaizQ.setText("Raiz Quadrada");
        lblTextoRaizCub.setText("Raiz Cúbica");
        lblTextoValorAbs.setText("Valor Absoluto");
        lblResDiv.setText(Integer.toString(div));
        lblResEleCubo.setText(Float.toString(cubo));
        lblResRaizQ.setText(Float.toString(raizQ));
        lblResRaizCub.setText(Float.toString(raizCub));
        lblResValorAbs.setText(Integer.toString(ValorAbs));
    }//GEN-LAST:event_btnCalcularActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblResDiv;
    private javax.swing.JLabel lblResEleCubo;
    private javax.swing.JLabel lblResRaizCub;
    private javax.swing.JLabel lblResRaizQ;
    private javax.swing.JLabel lblResValorAbs;
    private javax.swing.JLabel lblTextoEleCubo;
    private javax.swing.JLabel lblTextoRaizCub;
    private javax.swing.JLabel lblTextoRaizQ;
    private javax.swing.JLabel lblTextoResDiv;
    private javax.swing.JLabel lblTextoValorAbs;
    private javax.swing.JSpinner txtValor;
    // End of variables declaration//GEN-END:variables
}
