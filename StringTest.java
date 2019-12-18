import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StringTest extends JFrame
        implements ActionListener
{
  private JTextField input, result;

  public StringTest()
  {
    super("String test");
    Box box1 = Box.createVerticalBox();
    box1.add(new JLabel("Input:"));
    box1.add(Box.createVerticalStrut(10));
    box1.add(new JLabel("Result:"));

    input = new JTextField(20);
    input.setBackground(Color.WHITE);
    input.addActionListener(this);
    input.selectAll();

    result = new JTextField(20);
    result.setBackground(Color.WHITE);
    result.setEditable(false);

    Box box2 = Box.createVerticalBox();
    box2.add(input);
    box2.add(Box.createVerticalStrut(10));
    box2.add(result);

    Container c = getContentPane();
    c.setLayout(new FlowLayout());
    c.add(box1);
    c.add(box2);
    input.requestFocus();
  }

  public void actionPerformed(ActionEvent e)
  {
  	String str = input.getText();
  	if(validateCC(str))
  	{
  		str = ("Valid");
  	}
  	else
  	{
  		str = ("Invalid");
  	}
  	result.setText(str);
  	input.selectAll();
  }


	public boolean isPalindrome(String word)
	{
		int length = word.length();
		for (int i=0; i<(length+1)/2; i++)
		{
			if (word.charAt(i) != word.charAt(length-1-i))
			{
				return false;
			}
		}
		return true;
	}

	public static boolean validateCC(String s)
	{
		String s1 = s.substring(0, 4);
		String s2 = s.substring(5, 9);
		String s3 = s.substring(10, 14);
		String s4 = s.substring(15, 19);
		int w = Character.getNumericValue(s4.charAt(0));
		int x = Character.getNumericValue(s4.charAt(1));
		int y = Character.getNumericValue(s4.charAt(2));
		int z = Character.getNumericValue(s4.charAt(3));
		if (s.length() == 19)
		{
			if (s.charAt(4) == '-' && s.charAt(9) == '-' && s.charAt(14) == '-')
			{
				if (Character.isDigit(s1.charAt(0)) == true && Character.isDigit(s1.charAt(1)) == true && Character.isDigit(s1.charAt(2)) == true && Character.isDigit(s1.charAt(3)))
				{
					if (Character.isDigit(s2.charAt(0)) == true && Character.isDigit(s2.charAt(1)) == true && Character.isDigit(s2.charAt(2)) == true && Character.isDigit(s2.charAt(3)))
					{
						if (Character.isDigit(s3.charAt(0)) == true && Character.isDigit(s3.charAt(1)) == true && Character.isDigit(s3.charAt(2)) == true && Character.isDigit(s3.charAt(3)))
						{
							if (Character.isDigit(s4.charAt(0)) == true && Character.isDigit(s4.charAt(1)) == true && Character.isDigit(s4.charAt(2)) == true && Character.isDigit(s4.charAt(3)))
							{
								if (w + x + y +z > 10 && w + x + y +z < 20)
								{
									return true;
								}
							}
						}
					}
				}
			}
		}
		return false;
			
	}

	public String convertName(String s)
	{
		int length = s.length();
		int comma = s.indexOf(',');
		String firstName = s.substring(comma+1);
		String lastName = s.substring(0, comma);
		String actualName = firstName.concat(" " + lastName);
		return actualName;
		
	}
  public static void main(String[] args)
  {
    StringTest window = new StringTest();
    window.setBounds(100, 100, 300, 100);
    window.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window.setVisible(true);
  }
}

