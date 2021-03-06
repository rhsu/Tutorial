package rhsu.terminalPanelGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *A terminal panel GUI. To best use this, extend this class and override the 
 * process input method.
 */
public abstract class AbstractTerminal extends javax.swing.JPanel
{
	protected int state;
	
	/**
	 * Creates a new Terminal Panel
	 */
	public AbstractTerminal()
	{
		state = 0;
		initComponents();
				
		textField.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent ae)
			{	
				String input = textField.getText();
				
				input = processBasicInput(input);
				
				if(input != null)
				{
					input = processInput(input);
				}
				
				if(input != null)
				{
					textArea.append(input + "\n");
				}
				
				textField.selectAll();
				textArea.setCaretPosition(textArea.getDocument().getLength());
			}
		});
	}
		
	/**
	 * Processes the command `clear` to clean the screen and `exit` to exit.
	 * @param text the user input
	 * @return null if the user's text should not be displayed, otherwise returns the user's text
	 */
	private String processBasicInput(String text)
	{
		if(text.equalsIgnoreCase("clear"))
		{
			textArea.setText("");
			return null;
		}
		else if(text.equalsIgnoreCase("exit"))
		{
			System.exit(0);
		}
		return text;
	}
	
	/**
	 * Override this method to provide extensive functionality. By default, this 
	 * method does nothing.
	 * @param text
	 * @return null if the user's text should not be displayed, otherwise returns the user's text
	 */
	protected String processInput(String text)
	{
		return text;
	}
	
	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPane = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        textField = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textArea.setEditable(false);
        textArea.setColumns(20);
        textArea.setRows(5);
        scrollPane.setViewportView(textArea);

        add(scrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 250));
        add(textField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 400, 30));
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane scrollPane;
    protected javax.swing.JTextArea textArea;
    protected javax.swing.JTextField textField;
    // End of variables declaration//GEN-END:variables
}
