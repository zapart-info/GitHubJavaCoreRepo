package zapart.javacore.innerclass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.Timer;



public class TimerEx implements ActionListener
{
	Timer t;

	public TimerEx(int interval) 										
	{
		t = new Timer( interval, this );
	}

	public void start() 
	{
		
		t.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		Date d = new Date();
		Random random = new Random();
		float f = random.nextFloat()*30-8;
		System.out.println("Now time is " + d.toString() + " " + f);
	}

}
