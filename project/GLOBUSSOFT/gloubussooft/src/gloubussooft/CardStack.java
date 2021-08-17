package gloubussooft;

public class CardStack
{
	double c;
	public int calculate()
	{
		double n=2,count=0;
		
		while (true)
		{
			count+=(1/n);
			
			if(count>=c)
			{
				break;
				
			}
			n++;
		}
		return (int)n-1;
	}
	public CardStack(double c)
	{
		super();
		this.c=c;
	}

}
