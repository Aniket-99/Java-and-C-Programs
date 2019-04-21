import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
 
 
public class GuiCalculator extends JPanel implements ActionListener {
 
  private JTextField display = new JTextField("0");
  private double result = 0;
  private String operator = "=";
  private boolean calculating = true;
  
  public GuiCalculator() {
    setLayout(new BorderLayout());
 
    display.setEditable(false);
    add(display, "North");
 
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(4, 4));
    
   
 
    String buttonLabels = "789/456*123-0.=+";
    for (int i = 0; i < buttonLabels.length(); i++) {
      JButton b = new JButton(buttonLabels.substring(i, i + 1));
      panel.add(b);
      b.addActionListener(this);
    }
    add(panel, "Center");
  }
 
  public void actionPerformed(ActionEvent e) {
    String command = e.getActionCommand();
    if ('0' <= command.charAt(0) && command.charAt(0) <= '9' || command.equals(".")) {
      if (calculating)
        display.setText(command);
      else 
        display.setText(display.getText() + command);
      calculating = false;
    } else {
      if (calculating) {
        if (command.equals("-")) {
          display.setText(command);
          calculating = false;
        }
        else if(command.equals("c")) {
        	display.setText("");
        	calculating = false;
        }
        else {
          operator = command;
        }
      } else {
        double x = Double.parseDouble(display.getText());
        calculate(x);
        operator = command;
        calculating = true;
      }
    }
  }
 
  private void calculate(double n) {
    if (operator.equals("+")) {
      result += n;
    }
    else if (operator.equals("-")) {
      result -= n;
    }
    else if (operator.equals("*")) {
      result *= n;
    }
    else if (operator.equals("/")) {
      result /= n;
    }
    else if (operator.equals("=")) {
      result = n;
    }
    display.setText("" + result);
  }
  	
 
  public static void main(String[] args) {
    //JFrame.setDefaultLookAndFeelDecorated(true);
    JFrame frame = new JFrame();
    frame.setTitle(" GUI Calculator");
    frame.setSize(300, 300);
    frame.setResizable(false);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = frame.getContentPane();
    contentPane.add(new GuiCalculator());
    frame.setVisible(true);
  }
}