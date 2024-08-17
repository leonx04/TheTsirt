package app.form;

import javax.swing.JOptionPane;
import raven.alerts.MessageAlerts;
import raven.popup.component.PopupCallbackAction;
import raven.popup.component.PopupController;
import app.tabbed.TabbedForm;
import raven.toast.Notifications;

/**
 *
 * @author RAVEN
 */
public class Home extends TabbedForm {

    /**
     * Creates new form TestForm
     */
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Test");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(817, 142, 234, -1));

        txt.setColumns(20);
        txt.setRows(5);
        jScrollPane1.setViewportView(txt);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(817, 177, -1, -1));

        jButton2.setText("Show Alerts");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 142, 216, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Notifications.getInstance().show(Notifications.Type.INFO, "Test Toast Notifications");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        MessageAlerts.getInstance().showMessage("Thông báo thành công ",
                "Oops! We encountered an issue while attempting to save your data. ", 
                MessageAlerts.MessageType.SUCCESS,
                MessageAlerts.OK_OPTION,
                new PopupCallbackAction() {
            @Override
            public void action(PopupController pc, int i) {
                if (i == MessageAlerts.OK_OPTION) {
                    System.out.println("Click ok");
                }
            }
        });
    }//GEN-LAST:event_jButton2ActionPerformed

    @Override
    public boolean formClose() {
        if (txt.getText().trim().equals("")) {
            return true;
        }
        int opt = JOptionPane.showConfirmDialog(this, "Data not save do you want to close ?", "Close", JOptionPane.YES_NO_OPTION);
        return opt == JOptionPane.YES_OPTION;
    }

    @Override
    public void formOpen() {
        System.out.println("Form open");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txt;
    // End of variables declaration//GEN-END:variables
}
