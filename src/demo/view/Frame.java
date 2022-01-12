package demo.view;

import demo.controller.Controller;
import javax.swing.JFrame;

public class Frame extends JFrame
{
	private Controller app;
	private Panel panel;
	
	public Frame(Controller app)
	{
		super();
		this.app = app;
		this.panel = new Panel(app);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(700, 700);
		this.setResizable(false);
		this.setTitle("Awesome GUI");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
	}
}
