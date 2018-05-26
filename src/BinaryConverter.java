import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.reflect.Executable;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements MouseListener {
	JTextField textField = new JTextField(20);
	JLabel label = new JLabel();
	
	
	
	
public static void main(String[] args) {
	new BinaryConverter().binary();
	

	
	
	
	
}
void binary() {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	
	JButton button = new JButton();
	
	
	
	frame.setVisible(true);
	frame.setSize(300, 300);
	frame.add(panel);
	panel.add(textField);
	panel.add(button);
	button.setText("Convert");
	panel.add(label);
	label.setText("A");
	frame.pack();
	button.addMouseListener(this);
	
} 

public void mouseClicked(MouseEvent e) {
	
	// TODO Auto-generated method stub
	label.setText(convert(textField.getText()));
	 System.out.print(convert(textField.getText()));
	 
}
String convert(String input) {
    if(input.length() != 8){
         JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
         return "-";
    }
    String binary = "[0-1]+";    //must contain numbers in the given range
    if (!input.matches(binary)) {
         JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
         return "-";
    }
    try {
         int asciiValue = Integer.parseInt(input, 2);
         char theLetter = (char) asciiValue;
         return "" + theLetter;
    } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
         return "-";
    }
}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
}

