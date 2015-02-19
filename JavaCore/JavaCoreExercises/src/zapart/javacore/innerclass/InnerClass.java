package zapart.javacore.innerclass;

public class InnerClass 
{
	public static void process()
	{
		int interval = 5000;
		
		TimerEx timer = new TimerEx( interval );
		timer.start();
		
		TimerEx timer2 = new TimerEx( interval );
		timer2.start();
		
		TimerEx timer3 = new TimerEx( interval );
		timer3.start();
		
		TimerEx timer4 = new TimerEx( interval );
		timer4.start();
		
		TimerEx timer5 = new TimerEx( interval );
		timer5.start();
	}

}
