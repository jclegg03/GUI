package demo.view;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import demo.controller.Controller;

public class Panel extends JPanel
{
	private Controller app;
	private JButton demoButton;
	private JLabel demoLabel;
	private JButton duckButton;
	private JLabel duckLabel;
	private JButton askJayQuestion;
	private JButton askDallinQuestion;

	public Panel(Controller app)
	{
		super();
		this.app = app;
		this.demoButton = new JButton("Click for controller method.");
		this.demoLabel = new JLabel("Text to display");
		this.duckButton = new JButton("Click for Duck data.");
		this.duckLabel = new JLabel("Text will be displayed here");
		this.askJayQuestion = new JButton("Click to ask Jay a question.");
		this.askDallinQuestion = new JButton("Click to ask Dallin a question.");

		setupPanel();
		setupListeners();
		setupLayout();
	}

	private void setupPanel()
	{
		this.setBackground(Color.MAGENTA);
		this.add(demoButton);
		this.add(demoLabel);
		this.add(duckButton);
		this.add(duckLabel);
		this.add(askJayQuestion);
		this.add(askDallinQuestion);
	}

	private void setupListeners()
	{
		demoButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				demoLabel.setText(app.getRandom() + "");
			}
		});

		duckButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				duckLabel.setText(app.generateDuckData());
			}
		});

		askJayQuestion.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				app.askJayQuestion();
				duckButton.doClick(5);
			}
		});

		askDallinQuestion.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				app.askDallinQuestion();
				duckButton.doClick(5);
			}
		});
	}

	private void setupLayout()
	{
		this.setLayout(new GridLayout(3, 2, 10, 10));
	}
}
