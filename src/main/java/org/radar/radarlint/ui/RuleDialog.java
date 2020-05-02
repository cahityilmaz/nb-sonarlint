package org.radar.radarlint.ui;

import java.awt.Frame;
import org.sonarsource.sonarlint.core.client.api.common.RuleDetails;

/**
 *
 * @author Victor
 */
public class RuleDialog extends javax.swing.JDialog {

    /**
     * Creates new form RuleDialog
     */
    public RuleDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getRootPane().setDefaultButton(closeButton);
    }
    
    public void setRule(RuleDetails rule) {
        ruleTitle.setText(rule.getName());
        description.setText(rule.getHtmlDescription());
        description.setCaretPosition(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ruleTitle = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        description = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(org.openide.util.NbBundle.getMessage(RuleDialog.class, "RuleDialog.title")); // NOI18N
        setModal(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        ruleTitle.setFont(ruleTitle.getFont().deriveFont(ruleTitle.getFont().getStyle() | java.awt.Font.BOLD));
        org.openide.awt.Mnemonics.setLocalizedText(ruleTitle, org.openide.util.NbBundle.getMessage(RuleDialog.class, "RuleDialog.ruleTitle.text_1")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(closeButton, org.openide.util.NbBundle.getMessage(RuleDialog.class, "RuleDialog.closeButton.text")); // NOI18N
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        description.setEditable(false);
        description.setContentType("text/html"); // NOI18N
        description.setText(org.openide.util.NbBundle.getMessage(RuleDialog.class, "RuleDialog.description.text")); // NOI18N
        jScrollPane1.setViewportView(description);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 427, Short.MAX_VALUE)
                        .addComponent(closeButton))
                    .addComponent(ruleTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ruleTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        setVisible(false);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        getRootPane().setDefaultButton(closeButton);
    }//GEN-LAST:event_formWindowOpened

    public static void showRule(Frame owner, RuleDetails rule) {
        RuleDialog dialog=new RuleDialog(owner, true);
        dialog.setLocationRelativeTo(owner);
        dialog.setRule(rule);
        int minWidth = Math.max(dialog.getWidth(), dialog.ruleTitle.getMinimumSize().width);
        dialog.setSize(minWidth+50, dialog.getHeight());
        dialog.setVisible(true);
        dialog.dispose();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JEditorPane description;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel ruleTitle;
    // End of variables declaration//GEN-END:variables
}