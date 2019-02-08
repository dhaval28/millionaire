import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;


public class Second extends Frame implements ActionListener
{
	Button b1,b2;
	Second()
	{ 
		setLayout(null);
		setTitle("--------High Scores--------");
		setVisible(true);
		setSize(1000,750); 
		b1= new Button("<<Back to Home Page");
		b2= new Button("EXIT");
		add(b1);
		add(b2);
		b1.setBounds(200,600,200,50);
		b2.setBounds(650,600,200,50);
		b1.addActionListener(this);
		b2.addActionListener(this);
		Font myFont1 = new Font("Palatino Linotype", Font.BOLD,15);
        	b1.setFont(myFont1);
		b1.setForeground(Color.blue);
		Font myFont2 = new Font("Palatino Linotype", Font.BOLD,15);
        	b2.setFont(myFont2);
		b2.setForeground(Color.blue);
	}
	public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==b1)
	{
		setVisible(false);
		First e1 = new First();  
	}

	if(ae.getSource()==b2)
	{
		System.exit(0);
	}
repaint();
}
	public void paint(Graphics g)
	{
		ImageIcon i = new ImageIcon("high.jpg");
        	g.drawImage(i.getImage(), 0, 0, this);
	}
}

