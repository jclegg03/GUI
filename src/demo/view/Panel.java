package demo.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;

import demo.controller.Controller;

public class Panel extends JPanel
{
	private Controller app;
	private JButton demoButton;
	private JLabel demoLabel;
	
	public Panel(Controller app)
	{
		super();
		this.app = app;
		this.demoButton = new JButton("Click for controller method.");
		this.demoLabel = new JLabel("Text to display");
		
		setupPanel();
		setupListeners();
		setupLayout();
	}
	
	private void setupPanel()
	{
		this.setBackground(Color.MAGENTA);
	}
	
	private void setupListeners()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
}
