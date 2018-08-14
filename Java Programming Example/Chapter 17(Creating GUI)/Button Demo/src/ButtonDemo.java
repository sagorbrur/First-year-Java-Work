import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
public class ButtonDemo extends JFrame {
	//protected MessagePanel messagePanel=new MessagePanel("Welcome to Java");
	private JButton jbtLeft=new JButton("<=");
	private JButton jbtright=new JButton("=>");
	public static void main(String[] args) {
		ButtonDemo frame=new ButtonDemo();
		frame.setTitle("Button Demo");
		frame.setSize(250,100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		

	}
public ButtonDemo(){
	//messagePanel.setBackground(Color.WHITE);
	
	JPanel jpButton=new JPanel();
	jpButton.add(jbtLeft);
	jpButton.add(jbtright);
	
	jbtLeft.setMnemonic('L');
	jbtright.setMnemonic('R');
	
	jbtLeft.setToolTipText("Move message to left");
	jbtright.setToolTipText("Move message to right");
	setLayout(new BorderLayout());
	//add(messagePanel,BorderLayout.CENTER);
	add(jpButton,BorderLayout.SOUTH);
	
	jbtLeft.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			//messagePanel.moveLeft();
		}
	});
	
}

}
