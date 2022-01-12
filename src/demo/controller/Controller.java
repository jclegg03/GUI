package demo.controller;

import demo.view.Frame;

import demo.model.DebugDuck;

public class Controller
{
	private Frame view;
	private DebugDuck jayDuck;
	private DebugDuck dallinDuck;
	
	public Controller()
	{
		this.jayDuck = new DebugDuck("Jay");
		this.dallinDuck = new DebugDuck("Dallin");
		
		this.view = new Frame(this);
	}
	
	public void start()
	{
		
	}
	
	public int getRandom()
	{
		int scale = 10;
		int shift = 5;
		
		return generateRandomNumber(scale, shift);
	}
	
	private int generateRandomNumber(int scalar, int shift)
	{
		int result = 0;
		
		result = (int) (Math.random() * scalar) + shift;
		
		return result;
	}
	
	public String generateDuckData()
	{
		String info = "<html>I have a couple debug ducks ;)<br>";
		info += "The first's name is " + jayDuck.getName() + ", and the second's name is " + dallinDuck.getName() + ".<br>";
		info += "The first has been asked " + jayDuck.getQuestionCount() + " questions, and the second has been asked " + dallinDuck.getQuestionCount() + " questions.<br>"
				+ "<br>Hello Dallin, I know you're reading this ;)"
				+ "<br> I hope the ;) bugs you ;)</html>";
		
		return info;
	}
	
	public void askJayQuestion()
	{
		jayDuck.setQuestionCount(jayDuck.getQuestionCount() + 1);
	}
	
	public void askDallinQuestion()
	{
		dallinDuck.setQuestionCount(dallinDuck.getQuestionCount() + 1);
	}
}
