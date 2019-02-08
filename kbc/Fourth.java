import java.awt.*;
import java.applet.*;
import javax.swing.*;
import java.awt.event.*;

public class Fourth extends Frame implements ActionListener,MouseMotionListener
{
	int xpos;
     	int ypos;
	boolean rect1Active,rect2Active,rect3Active,rect4Active;
	JLabel bg,op,ffl;
	int ffused;
	Button b1,b2,b3,b4,b5,ffb;
	Fourth()
	{ 
		ffused=0;
		ImageIcon i = new ImageIcon("1.jpg");
		ImageIcon fif = new ImageIcon("fif.jpg");
		ImageIcon i1 = new ImageIcon("option.jpg");
		bg= new JLabel(i);
		op= new JLabel(i1);
		ffl=new JLabel(fif);
		setLayout(null);
		setTitle("Kaun Banega Crorepati!!!!!!");
		setVisible(true);
		setSize(1100,760); 
		b1= new Button("Kaushalya");
		b2= new Button("Kaikei");
		b3= new Button("Manthara");
		b4= new Button("Mohini");
		b5= new Button("Quit Game");
		ffb= new Button("50:50");
		add(ffb);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(bg);
		add(op);
		
		ffb.setBounds(950,200,100,52);		
		ffl.setBounds(950,200,100,52);		
		bg.setBounds(0,0,1100,460);
		op.setBounds(0,455,1100,300);
		b1.setBounds(75,500,430,70);
		b2.setBounds(620,500,430,70);
		b3.setBounds(75,630,430,70);
		b4.setBounds(620,630,430,70);
		b5.setBounds(50,50,200,50);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		ffb.addActionListener(this);
		Font myFont1 = new Font("Serif", Font.BOLD,25);
        	b1.setFont(myFont1);
		b2.setFont(myFont1);
		ffb.setFont(myFont1);
		ffb.setBackground(Color.black);
		ffb.setForeground(Color.white);
		
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b3.setBackground(Color.black);
		b3.setForeground(Color.white);
		b4.setBackground(Color.black);
		b4.setForeground(Color.white);
		b3.setFont(myFont1);
		b4.setFont(myFont1);
		Font myFont2 = new Font("Serif", Font.BOLD,18);
        	
		b5.setFont(myFont2);
		b5.setBackground(Color.yellow);
		b5.setForeground(Color.red);
		addMouseMotionListener(this);
	}
 public void mouseMoved(MouseEvent me) 
     { 
          xpos = me.getX();
          ypos = me.getY();
 
         if (xpos > 65&& xpos < 85+430 && ypos > 490
        && ypos < 510+70) 
               this.rect1Active = true;
          else 
              this.rect1Active = false;
	 if (xpos > 605&& xpos < 635+430 && ypos > 485
        && ypos < 515+70) 
               this.rect2Active = true;
          else 
              this.rect2Active = false;
	 if (xpos > 60&& xpos < 85+430 && ypos > 615
        && ypos < 645+70) 
               this.rect3Active = true;
          else 
              this.rect3Active = false;
	 if (xpos > 605&& xpos < 635+430 && ypos > 615
        && ypos < 645+70) 
               this.rect4Active = true;
          else 
              this.rect4Active = false;

 
	if (rect1Active)b1.setBackground(Color.orange);
	  else b1.setBackground(Color.black);
	if (rect2Active)b2.setBackground(Color.orange);
	  else b2.setBackground(Color.black);
	if (rect3Active)b3.setBackground(Color.orange);
	  else b3.setBackground(Color.black);
	if (rect4Active)b4.setBackground(Color.orange);
	  else b4.setBackground(Color.black);
     }

     public void mouseDragged(MouseEvent me) 
     {
     }


public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==b5)
	{
		System.exit(0); 
	}
	if(ae.getSource()==ffb)
	{
		remove(b2);
		remove(b3);
		ffused=1;
	}
	if(ae.getSource()==b1)
	{
		try {
		b1.setBackground(Color.orange);
    		Thread.sleep(200);             
		b1.setBackground(Color.green); 
		Thread.sleep(200); 
		b1.setBackground(Color.orange);
    		Thread.sleep(200);             
		b1.setBackground(Color.green); 
		Thread.sleep(200); 
		b1.setBackground(Color.orange);
    		Thread.sleep(200);             
		b1.setBackground(Color.green); 
		Thread.sleep(200);
		b1.setBackground(Color.orange);
    		Thread.sleep(200);             
		b1.setBackground(Color.green); 
		Thread.sleep(200);  
		} catch(InterruptedException ex) {
    		Thread.currentThread().interrupt();
		}	
		JOptionPane.showMessageDialog(null,"Congratulation..You won 1000 Rs.\n\nProceed to next Question?");	

		q2 e11= new q2(ffused);
		setVisible(false);
		
	}
	if(ae.getSource()==b2 || ae.getSource()==b3 || ae.getSource()==b4)
	{
	b4.setBackground(Color.red);
	b2.setBackground(Color.red);
	b3.setBackground(Color.red);
	b1.setBackground(Color.green);
	JOptionPane.showMessageDialog(null,"Incorrect Answer..\n\nThe correct answer is (a)Kaushalya.");
	JOptionPane.showMessageDialog(null,"Total Money won : 0 Rs");
	First x1= new First();
	repaint();
	}
}

public static void main(String args[])
	{
		Fourth f1=new Fourth();
	} 
}

//27210250@mkcl.org