package input.view;

import javax.swing.JOptionPane;
/**
 * This Class provides Popups for input and output.
 * @author ethr5627
 *
 */
public class PopupDisplay
{

	public String getAnswer(String input)
	{
		String answer = "";
				
		answer = JOptionPane.showInputDialog(null, input);
		
		return answer;
	}
	
	public void displayResponse(String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}
}
