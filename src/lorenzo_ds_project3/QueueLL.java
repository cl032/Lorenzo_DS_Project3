/**
******************************************************
***  Class Name: QueueLL.
***  Class Author:  Chris Lorenzo
******************************************************
*** This class serves as the GUI for the application.
*   It accepts input values from the user in the form
*   of Integers and places them into a FIFO Queue. It
*   allows the user to view the contents of the queue
*   and permits removal of elements off the queue, and
*   updates the contents to serve as feedback to the
*   user.
* 
*   Class Inputs:
*   — String value from user
*   Return Value:
*   — String to hold all the link values
*   - String to show last link value removed
*   - String value in error msg when applicable
*
******************************************************
*** Date: 24 September 2017
******************************************************
*** Changes: N/A
******************************************************
*/
package lorenzo_ds_project3;

import com.sun.glass.events.KeyEvent;

/**
 *
 * @author Chris
 */
public class QueueLL extends javax.swing.JFrame {

    Queue myQueue = new Queue();        //Create new Queue object and assign it to myQueue var
    
    /**
     * Creates new form QueueLL
     */
    public QueueLL() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAdd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblQueueList = new javax.swing.JLabel();
        btnRemove = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblRemoved = new javax.swing.JLabel();
        lblErrMsg = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Queue Using LinkList");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Papyrus", 0, 24)); // NOI18N
        jLabel1.setText("Queue Using LinkList");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 8)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Created By Chris Lorenzo");

        txtAdd.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddActionPerformed(evt);
            }
        });
        txtAdd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAddKeyPressed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Enter number to add to Queue:");

        btnAdd.setText("Add to Queue");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel4.setText("Queue: ");

        lblQueueList.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        lblQueueList.setForeground(new java.awt.Color(0, 0, 255));
        lblQueueList.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQueueList.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnRemove.setText("Remove from Queue");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        jLabel6.setText("Removed: ");

        lblRemoved.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        lblRemoved.setForeground(new java.awt.Color(0, 102, 51));
        lblRemoved.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRemoved.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblErrMsg.setFont(new java.awt.Font("Courier", 0, 16)); // NOI18N
        lblErrMsg.setForeground(new java.awt.Color(255, 0, 0));
        lblErrMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblErrMsg.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setText("Front:");

        jLabel7.setText("Rear:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(179, 179, 179))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(22, 22, 22)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(1, 1, 1)
                                            .addComponent(jLabel6)
                                            .addGap(11, 11, 11)
                                            .addComponent(lblRemoved, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lblErrMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(241, 241, 241)
                                            .addComponent(jLabel4))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel7))
                                            .addComponent(lblQueueList, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jLabel2))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblQueueList, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(lblErrMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRemoved, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

/**
******************************************************
***  Method Name: btnAddActionPerformed()
***  Method Author:  Chris Lorenzo
******************************************************
*   This method creates a int var and string var to
*   collect string input from user, and try to convert
*   it into an int value.  If it succeeds in conversion,
*   the int value is added to the linked list queue, all
*   labels are cleared, and the remove from queue button
*   is enabled if not already.  Then the printList() method
*   is called to print the current values of the list.  If
*   input is not valid, an error msg is returned to GUI.
* 
*   Method Inputs:
*   — ActionEvent
*   Return Value:
*   — None
*
******************************************************
*** Date: 24 September 2017
******************************************************
*** Changes: N/A
******************************************************
*/ 
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        int i;
        String userInput = txtAdd.getText();
        
        try
        {
            i = Integer.parseInt(userInput);
            myQueue.add(i);
            txtAdd.setText("");
            btnRemove.setEnabled(true);
            lblErrMsg.setText("");
            lblRemoved.setText("");
            lblQueueList.setText(myQueue.myList.printList());
            
        }
        catch (NumberFormatException e)
                {
                    lblErrMsg.setText("ERROR: Input Must Be an Integer");
                    txtAdd.requestFocus();
                    txtAdd.selectAll();
                } 
    }//GEN-LAST:event_btnAddActionPerformed

/**
******************************************************
***  Method Name: btnRemoveActionPerformed()
***  Method Author:  Chris Lorenzo
******************************************************
*   This method checks to see if the list is null. If
*   so, it send a err msg to the user, disables the
*   remove button, and returns control back to the calling
*   statement.  If list is not null, method calls the LinkList
*   class's remove method to place the first link value into
*   a passing var, then assigns the next link the position of
*   first in the list.  It then uses the returned value to
*   place it in the removed label, and calls the printList()
*   method to create a String variable, which gets assigned
*   to the Queue label.
* 
*   Method Inputs:
*   — ActionEvent
*   Return Value:
*   — None
*
******************************************************
*** Date: 24 September 2017
******************************************************
*** Changes: N/A
******************************************************
*/ 
    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        if(myQueue.myList.first == null)
        {
            lblErrMsg.setText("Queue is Empty! No More Links to Remove");
            btnRemove.setEnabled(false);
            return;
        }
        
        int removed = myQueue.myList.remove().value;
        
        lblRemoved.setText(String.valueOf(removed));
        
        lblQueueList.setText(myQueue.myList.printList());
        
        lblErrMsg.setText("");
    }//GEN-LAST:event_btnRemoveActionPerformed

/**
******************************************************
***  Method Name: txtAddActionPerformed()
***  Method Author:  Chris Lorenzo
******************************************************
*   This method was created by accident and couldn't not
*   figure out how to remove it safely.
* 
*   Method Inputs:
*   — ActionEvent
*   Return Value:
*   — None
*
******************************************************
*** Date: 24 September 2017
******************************************************
*** Changes: N/A
******************************************************
*/    
    private void txtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddActionPerformed
  
/**
******************************************************
***  Method Name: txtAddKeyPressed()
***  Method Author:  Chris Lorenzo
******************************************************
***  This method acts as an event handler for when the
*   user presses the enter key when inside the txtInput
*   box.  Once the key is pressed it performs all the
*   statements inside the btnAddActionPerformed() method.
* 
*   Method Inputs:
*   — KeyEvent
*   Return Value:
*   — None
*
******************************************************
*** Date: 24 September 2017
******************************************************
*** Changes: N/A
******************************************************
*/
    private void txtAddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            btnAdd.doClick();
        }
    }//GEN-LAST:event_txtAddKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QueueLL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QueueLL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QueueLL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QueueLL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QueueLL().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblErrMsg;
    private javax.swing.JLabel lblQueueList;
    private javax.swing.JLabel lblRemoved;
    private javax.swing.JTextField txtAdd;
    // End of variables declaration//GEN-END:variables
}