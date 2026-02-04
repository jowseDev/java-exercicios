
import javax.swing.JOptionPane;

public class ClienteView extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ClienteView.class.getName());

    public ClienteView() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Cliente = new javax.swing.JLabel();
        btn_NomeRG = new javax.swing.JButton();
        btn_NomeIdade = new javax.swing.JButton();
        input_Nome = new javax.swing.JTextField();
        input_Idade = new javax.swing.JTextField();
        lbl_Nome = new javax.swing.JLabel();
        lbl_Idade = new javax.swing.JLabel();
        input_RG = new javax.swing.JTextField();
        lbl_RG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_Cliente.setText("Cliente");

        btn_NomeRG.setText("Nome e RG");
        btn_NomeRG.addActionListener(this::btn_NomeRGActionPerformed);

        btn_NomeIdade.setText("Nome e Idade");
        btn_NomeIdade.addActionListener(this::btn_NomeIdadeActionPerformed);

        lbl_Nome.setText("Nome:");

        lbl_Idade.setText("Idade:");

        lbl_RG.setText("RG:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(552, 552, 552)
                        .addComponent(lbl_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(526, 526, 526)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_NomeIdade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_NomeRG, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_RG)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(input_RG, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_Nome)
                                    .addComponent(lbl_Idade))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(input_Idade, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(input_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(353, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lbl_Cliente)
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Nome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input_Idade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_Idade))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(input_RG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_RG))
                .addGap(42, 42, 42)
                .addComponent(btn_NomeRG)
                .addGap(18, 18, 18)
                .addComponent(btn_NomeIdade)
                .addContainerGap(196, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btn_NomeRGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NomeRGActionPerformed
          ClienteDTO clienteDTO = new ClienteDTO();
          ClienteCTR clienteCTR = new ClienteCTR();
          
          clienteDTO.setNome(input_Nome.getText());
          clienteDTO.setRg(input_RG.getText());
          
          JOptionPane.showMessageDialog(null, clienteCTR.mostrarNomeRg(clienteDTO));

    }//GEN-LAST:event_btn_NomeRGActionPerformed

    private void btn_NomeIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NomeIdadeActionPerformed
          ClienteDTO clienteDTO = new ClienteDTO();
          ClienteCTR clienteCTR = new ClienteCTR();
          
          clienteDTO.setNome(input_Nome.getText());
          clienteDTO.setIdade(Integer.parseInt(input_Idade.getText()));
          
          JOptionPane.showMessageDialog(null, clienteCTR.mostrarNomeIdade(clienteDTO));
    }//GEN-LAST:event_btn_NomeIdadeActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new ClienteView().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_NomeIdade;
    private javax.swing.JButton btn_NomeRG;
    private javax.swing.JTextField input_Idade;
    private javax.swing.JTextField input_Nome;
    private javax.swing.JTextField input_RG;
    private javax.swing.JLabel lbl_Cliente;
    private javax.swing.JLabel lbl_Idade;
    private javax.swing.JLabel lbl_Nome;
    private javax.swing.JLabel lbl_RG;
    // End of variables declaration//GEN-END:variables
}
