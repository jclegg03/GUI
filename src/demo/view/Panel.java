package demo.view;

import demo.controller.Controller;
import javax.swing.JPanel;
import java.awt.Color;

public class Panel extends JPanel
{
	private Controller app;
	
	public Panel(Controller app)
	{
		super();
		this.app = app;
		
		setupPanel();
		setupListeners();
		setupLayout();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.blue);
	}
	
	private void setupListeners()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
}
