package demo.view;

import demo.controller.Controller;
import javax.swing.JFrame;

public class Frame extends JFrame
{
	private Controller app;
	
	public Frame(Controller app)
	{
		super();
		this.app = app;
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(1000, 1000);
		this.setResizable(false);
		this.setTitle("Awesome GUI");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
