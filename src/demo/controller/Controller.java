package demo.controller;

import demo.view.Frame;

public class Controller
{
	private Frame view;
	public Controller()
	{
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
}
