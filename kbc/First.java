import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;


public class First extends Frame implements ActionListener
{
	JLabel bg;
	Button b1,b2,b3;
	First()
	{ 
		ImageIcon im = new ImageIcon("log.jpg");
		bg= new JLabel(im);
		setLayout(null);
		setTitle("My Frame");
		setVisible(true);
		setSize(1000,750); 
		b1= new Button("Login And Play!");
		b2= new Button("View High Scores..");
		b3= new Button("EXIT");
		add(b1);
		add(b2);
		add(b3);
		add(bg);
		bg.setBounds(0,0,1000,750);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		Font myFont1 = new Font("Serif", Font.BOLD,18);
        	b1.setFont(myFont1);
		b1.setForeground(Color.blue);
		Font myFont2 = new Font("Serif", Font.BOLD,18);
        	b2.setFont(myFont2);
		b2.setForeground(Color.blue);
		Font myFont3 = new Font("TimesRoman", Font.BOLD,18);
        	b3.setFont(myFont3);
		b3.setForeground(Color.white);
		b3.setBackground(Color.red);
		b1.setBounds(0,550,200,50);
		b2.setBounds(1000,550,200,50);
		for(int i=0;i<200;i++)
		{
		try {
    		Thread.sleep(10);
		b1.setBounds(i,550,200,50);
		Thread.sleep(10);
		i=i+9;
		} catch(InterruptedException ex) {
    		Thread.currentThread().interrupt();
		}
		}
		for(int i=1000;i>650;i--)
		{
		try {
    		Thread.sleep(10);
		b2.setBounds(i,550,200,50);
		Thread.sleep(10);
		i=i-9;
		} catch(InterruptedException ex) {
    		Thread.currentThread().interrupt();
		}
		}
		for(int i=750;i>610;i--)
		{
		try {
    		Thread.sleep(10);
		b3.setBounds(480,i,80,50);
		Thread.sleep(10);
		i=i-9;
		} catch(InterruptedException ex) {
    		Thread.currentThread().interrupt();
		}
		}



	}
	public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==b1)
	{
		setVisible(false);
		Third x1= new Third();	  
	}
	if(ae.getSource()==b2)
	{
		setVisible(false);
		Second s1= new Second();
	}
	if(ae.getSource()==b3)
	{
		System.exit(0);
	}
repaint();
}

	public static void main(String args[])
	{
		First f1=new First();
	} 
}

