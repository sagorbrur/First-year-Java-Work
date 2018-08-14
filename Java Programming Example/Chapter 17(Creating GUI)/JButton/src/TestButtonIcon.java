import javax.swing.*;
public class TestButtonIcon extends JFrame {

	public static void main(String[] args) {
		
		JFrame frame=new TestButtonIcon();
		frame.setTitle("Button Icon");
		frame.setSize(200, 100);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		

	}
	public TestButtonIcon(){
		ImageIcon bdIcon=new ImageIcon("image/bdflag.png");
		ImageIcon fbIcon=new ImageIcon("image/fb2.png");
		ImageIcon twIcon=new ImageIcon("image/tweet.png");
		
		JButton jbt = new JButton("Click it",bdIcon);
		jbt.setPressedIcon(fbIcon);
		jbt.setRolloverIcon(twIcon);
		add(jbt);
	}

}
