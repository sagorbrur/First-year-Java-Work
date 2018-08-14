import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class subClasss extends JFrame {
	private JLabel a;
	
	public subClasss(){
		super("the title bar");
		setLayout(new FlowLayout());
		
		a=new JLabel("This is a sentence");
		
		a.setToolTipText("This is gona show up no hover");
		add(a);
		
	}

}
