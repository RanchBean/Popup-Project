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
		String name = myPopups.getAnswer("Type in your name");
		
		myPopups.displayResponse("You typed in " + name);
		
		int age;
		String tempAge = myPopups.getAnswer("You typed in " + name);
		
		age = Integer.parseInt(tempAge);
		
		myPopups.displayResponse("You typed in " + age);
		
		double weight;
		String tempWeight = myPopups.getAnswer("Type in your weight");
		weight = Double.parseDouble(tempWeight);
		
		mypopups
		
	}

	{
		
	private boolean isDouble(String input)
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
