import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;


public class Third extends Frame implements ActionListener
{
	TextField t1,t2;
	Label l1,l2,load;
	JLabel bg;
	Button b1,b2;
	Third()
	{ 
		ImageIcon img = new ImageIcon("login.jpg");
		bg= new JLabel(img);
		setLayout(null);
		setTitle("Login User");
		setVisible(true);
		setSize(1244,700); 
		b1= new Button("<<Back to Home Page");
		b2= new Button("Login>>");
		t1= new TextField(20);
		t2= new TextField(20);
		l1= new Label("  Username");
		l2= new Label("  Password");
		load= new Label("Loading...Please wait.");
		add(load);
		load.setVisible(false);
		add(b1);
		add(b2);
		add(l1);	
		add(l2);
		add(t1);	
		add(t2);
		add(bg);
		
		bg.setBounds(0,0,1244,700);
		l1.setBounds(450,440,100,50);
		l2.setBounds(450,500,100,50);
		t1.setBounds(555,450,200,30);
		t2.setBounds(555,510,200,30);
		b1.addActionListener(this);
		b2.addActionListener(this);
		t1.addActionListener(this);
		t2.addActionListener(this);
		Font myFont1 = new Font("Serif", Font.BOLD,18);
        	b1.setFont(myFont1);
		l1.setFont(myFont1);
		l1.setBackground(Color.red);
		l2.setBackground(Color.red);
		b1.setBackground(Color.green);
		b1.setForeground(Color.black);
		t2.setEchoChar('*');
		Font myFont2 = new Font("Serif", Font.BOLD,18);
        	b2.setFont(myFont2);
		l2.setFont(myFont2);
		load.setFont(myFont2);
		b2.setBackground(Color.yellow);
		b2.setForeground(Color.black);
		load.setBackground(Color.black);
		load.setForeground(Color.white);
		load.setBounds(1000,550,200,50);
		b1.setBounds(100,600,200,50);
		b2.setBounds(1000,600,200,50);
	
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
		if(t1.getText().equals("sit") && t2.getText().equals("sit123"))
		{
		JOptionPane.showMessageDialog(null,"Login Successfull!!");
		load.setVisible(true);
		try {
		load.setText("Loading...Please wait..");
    		Thread.sleep(200);             
		load.setText("Loading...Please wait...");
		Thread.sleep(200);
		load.setText("Loading...Please wait....");
		Thread.sleep(200); 
		load.setText("Loading...Please wait.");
    		Thread.sleep(200);             
		load.setText("Loading...Please wait.."); 
		Thread.sleep(200); 
		load.setText("Loading...Please wait...");
    		Thread.sleep(200);
		load.setText("Loading...Please wait....");
		Thread.sleep(200); 
		             
		load.setText("Loading...Please wait."); 
		Thread.sleep(200);
		load.setText("Loading...Please wait..");
    		Thread.sleep(200);             
		load.setText("Loading...Please wait..."); 
		Thread.sleep(200);  
		load.setText("Loading...Please wait....");
    		Thread.sleep(200);             
		load.setText("Loading...Please wait."); 
		Thread.sleep(200); 
		load.setText("Loading...Please wait..");
    		Thread.sleep(200);             
		
		} catch(InterruptedException ex) {
    		Thread.currentThread().interrupt();
		}
			setVisible(false);
			Fourth y1 = new Fourth();
		}
		else
		{
			JOptionPane.showMessageDialog(null,"Login Failed!!");
		}		
	}
repaint();
}
}

