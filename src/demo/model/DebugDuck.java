package demo.model;

public class DebugDuck implements Comparable <DebugDuck>
{
	private String name;
	private int questionCount;
	
	public DebugDuck(String name, int questionCount)
	{
		this.name = name;
		this.questionCount = questionCount;
	}
	
	public DebugDuck(String name)
	{
		this.name = name;
		this.questionCount = 0;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getQuestionCount()
	{
		return questionCount;
	}

	public void setQuestionCount(int questionCount)
	{
		this.questionCount = questionCount;
	}
	
	public int compareTo(DebugDuck otherDuck)
	{
		return this.questionCount - otherDuck.questionCount;
	}
	
	@Override
	public String toString()
	{
		String description = "This duck (" + name + ") has been asked " + questionCount + " questions.";
		
		return description;
	}
}
