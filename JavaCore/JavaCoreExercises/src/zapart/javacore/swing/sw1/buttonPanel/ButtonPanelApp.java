package zapart.javacore.swing.sw1.buttonPanel;

import java.awt.EventQueue;

public class ButtonPanelApp {

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable()
			                   {
			                        public void run()
			                        {
			                      	   ButtonPanel panel = new ButtonPanel();
			                    	   panel.setVisible(true);
			                        }
				               });
		                  
	}
}
