// Chapter 6 Question 16

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class LeapYear extends JFrame
  implements ActionListener
{
  JTextField inputyears, displayLeap;

  public LeapYear()
  {

    super("Jam Flat Calculator");
    JLabel labelyears = new JLabel("Years:", SwingConstants.RIGHT);
    inputyears = new JTextField(5);
    JLabel labelYears = new JLabel("Is it a leap year? ", SwingConstants.RIGHT);
    displayLeap = new JTextField(5);
    displayLeap.setEditable(false);
    JButton go = new JButton("Check");
    go.addActionListener(this);

    Container c = getContentPane();
    c.setBackground(Color.GRAY);
    JPanel p = new JPanel();
    p.setLayout(new GridLayout(3, 2, 5, 5));
    p.add(labelyears);
    p.add(inputyears);
    p.add(labelYears);
    p.add(displayLeap);
    c.add(p, BorderLayout.CENTER);
    c.add(go, BorderLayout.SOUTH);
  }

  public void actionPerformed(ActionEvent e)
  {
    int years = Integer.parseInt(inputyears.getText());
    boolean Years = isLeapYear(years);
    if (Years == true)
    {
    	displayLeap.setText("Ye");
    }
	else displayLeap.setText("Nah");

  }

	//Calculates if its a leap year
  public boolean isLeapYear(int years)
  {
  	if (years % 4 == 0)
  	{
  		if (years % 100 != 0)
  		{
  			return true;
  		}
  		else if (years % 400 == 0)
  		{
  			return true;
  		}
  		else return false;
  	}
  	else return false;
  }

  public static void main(String[] args)
  {
    LeapYear w = new LeapYear();
    w.setBounds(300, 300, 300, 160);
    w.setDefaultCloseOperation(EXIT_ON_CLOSE);
    w.setVisible(true);
  }
}

