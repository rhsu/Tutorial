/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author RHsu
 */
public class UseThisPanel extends javax.swing.JPanel
{

	/**
	 * Creates new form UseThisPanel
	 */
	@SuppressWarnings("LeakingThisInConstructor")
	public UseThisPanel()
	{
		initComponents();
		jTextField1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{
				String text = jTextField1.getText();
				jTextArea1.append(text + "\n");
				jTextField1.selectAll();
				jTextArea1.setCaretPosition(jTextArea1.getDocument().getLength());
			}
		});
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 250));
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 400, 30));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

	static int ctr = 0;
}
