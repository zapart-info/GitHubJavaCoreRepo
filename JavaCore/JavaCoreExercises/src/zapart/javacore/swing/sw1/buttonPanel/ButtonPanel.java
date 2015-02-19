package zapart.javacore.swing.sw1.buttonPanel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonPanel extends JFrame 
{
	private final int FRAME_WIDTH = 500;  
	private final int FRAME_HEIGHT = 300;
	
	JPanel buttonPanel;
	
	public ButtonPanel(int...frameSize)
	{
		int w = FRAME_WIDTH;
		int h = FRAME_HEIGHT;
		
		switch( frameSize.length )
		{
			case 1: {
				        w = frameSize[0];
				        h = frameSize[0];
				        break;
			        }
			case 2: {
				        w = frameSize[0];
			            h = frameSize[1];
			            break;
			        }
		}
	
        setSize(w,h);	    
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    buttonPanel = new JPanel();
	    
	    MakeButton buttonRed = new MakeButton("Red", Color.RED);
	    MakeButton buttonGreen = new MakeButton("Green", Color.GREEN);
	    MakeButton buttonBlue = new MakeButton("Blue", Color.BLUE);
	    
	    buttonRed.addActionListener(buttonRed);
	    buttonGreen.addActionListener(buttonGreen);
	    buttonBlue.addActionListener(buttonBlue);
	    
	    buttonPanel.add(buttonRed);
	    buttonPanel.add(buttonGreen);
	    buttonPanel.add(buttonBlue);
	    
	    add(buttonPanel);
	}
	
	private class MakeButton extends JButton implements ActionListener
	{
		JButton _button;
		Color _color; 
		
		public MakeButton(String caption, Color color )
		{
			_button = new JButton(caption);
			_color = color;
		}

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			//setBackground(_color);
			buttonPanel.setBackground( _color );
			
		}
	}
}
