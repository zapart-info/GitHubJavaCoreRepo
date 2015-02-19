package zapart.javacore.main;

import javax.swing.JOptionPane;

import zapart.javacore.innerclass.InnerClass;

public class Application 
{
	public static void main(String[] args) 
	{
		System.out.println("Application Entry!");
		
		InnerClass.process();
				
		JOptionPane.showMessageDialog(null, "Push Button to End Application!");

		System.exit(0);
	}

}
