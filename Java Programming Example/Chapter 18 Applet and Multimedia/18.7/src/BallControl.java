import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class BallControl extends JPanel {
	private Ball ball = new Ball();
	private JButton jbtSuspend = new JButton("Suspend");
	private JButton jbtResume = new JButton("Resume");
	private JScrollBar jbsDelay = new JScrollBar();
	
	public BallControl(){
		JPanel panel = new JPanel();
		panel.add(jbtSuspend);
		panel.add(jbtResume);
		
		ball.setBorder(new javax.swing.border.LineBorder(Color.red));
		jbsDelay.setOrientation(JScrollBar.HORIZONTAL);
		ball.setDelay(jbsDelay.getMaximum());
		setLayout(new BorderLayout());
		add(jbsDelay,BorderLayout.NORTH);
		add(ball,BorderLayout.CENTER);
	}
	

}
