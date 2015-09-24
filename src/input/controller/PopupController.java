package input.controller;

import input.view.PopupDisplay;

public class PopupController
{
	private PopupDisplay myPopups;
	
	public PopupController()
	{
		myPopups = new PopupDisplay();
	}
	
	public void start()
	{
		String temp = myPopups.getAnswer("Type in your name");
		
		myPopups.displayResponse("You typed in " + temp);
	}

	{
		
	priavte boolean isDouble(String input)
	}
		boolean isDouble = false;
		
		try
	{
		double vaildDouble = Double.parseDouble(input);
		isDouble = true;
	}
	catch(NumberFormatExeception error)
	{
		
	}
}
