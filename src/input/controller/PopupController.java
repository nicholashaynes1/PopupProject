package input.controller;

import input.model.Thing;

import input.view.PopupDisplay;

public class PopupController
{
	private PopupDisplay myPopups = new PopupDisplay();
	
	public PopupController()
	{
		myPopups = new PopupDisplay();
	}
	
	public void start()
	{
		String name = myPopups.getAnswer("Type in your name");
		myPopups.displayResponse("you typed in " + name);
		
		int age;
		String tempAge = myPopups.getAnswer("type your age");
		
		age = Integer.parseInt(tempAge);
		
		myPopups.displayResponse("You typed in " + age);
		
		double weight;
		String tempWeight = myPopups.getAnswer("Type in your weight");
		weight = Double.parseDouble(tempWeight);
		myThing = new Thing (name, age, weight);
				
		
		
		
		
	}
}
