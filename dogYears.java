// Chapter 6 Question 16

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class dogYears extends JFrame
  implements ActionListener
{
  JTextField inputHYears, displayDog;

  public Dog()
  {
    super("Dog Years Calculator");
    JLabel labelLbs = new JLabel("Human Years:", SwingConstants.RIGHT);
    inputLbs = new JTextField(5);
    JLabel labelBmi = new JLabel("Dog Years = ", SwingConstants.RIGHT);
    displayBmi = new JTextField(5);
    displayBmi.setEditable(false);
    JButton go = new JButton("Calculate");
    go.addActionListener(this);

    Container c = getContentPane();
    c.setBackground(Color.GRAY);
    JPanel p = new JPanel();
    p.setLayout(new GridLayout(3, 2, 5, 5));
    p.add(labelHYears);
    p.add(inputHYears);
    p.add(labelDog);
    p.add(displayDog);
    c.add(p, BorderLayout.CENTER);
    c.add(go, BorderLayout.SOUTH);
  }

  public void actionPerformed(ActionEvent e)
  {
    int hYears = Integer.parseInt(inputLbs.getText());
    double bmi = calculateDog(hYears);
    DecimalFormat df = new DecimalFormat("00.0");
    displayDog.setText(df.format(Dog));
  }

	//Returns age in dog years
  private double calculateDog(int hYears)
  {
	
  }

  public static void main(String[] args)
  {
    Dog w = new Dog();
    w.setBounds(300, 300, 300, 160);
    w.setDefaultCloseOperation(EXIT_ON_CLOSE);
    w.setVisible(true);
  }
}

