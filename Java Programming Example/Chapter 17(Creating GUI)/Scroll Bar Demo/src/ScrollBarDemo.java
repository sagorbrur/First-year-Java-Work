import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ScrollBarDemo extends JFrame {
	//Create Horizontal and vertical scrollbar
	private JScrollBar jscbHort = new JScrollBar(JScrollBar.HORIZONTAL);
	private JScrollBar jscbVert = new JScrollBar(JScrollBar.VERTICAL);
	
	//Create MessagePanel
	private JButton jbtOk = new JButton("OK");
	
	public static void main(String[] args){
		ScrollBarDemo frame = new ScrollBarDemo();
		frame.setTitle("ScrollBarDemo");
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
		
	}
	public ScrollBarDemo(){
		setLayout(new BorderLayout());
		add(jbtOk,BorderLayout.CENTER);
		add(jscbVert,BorderLayout.EAST);
		add(jscbHort,BorderLayout.SOUTH);
		
		jscbHort.addAdjustmentListener(new AdjustmentListener(){
			public void adjustmentValueChanged(AdjustmentEvent e){
				double value = jscbHort.getValue();
				double maximumValue = jscbHort.getMaximum();
				double newX = (value * jbtOk.getWidth()/maximumValue);
				//jbtOk.setXCoordinate((int)newX);
			}
		});
		jscbVert.addAdjustmentListener(new AdjustmentListener(){
			public void adjustmentValueChanged(AdjustmentEvent e){
				double value = jscbVert.getValue();
				double maximumValue = jscbVert.getMaximum();
				double newY = (value * jbtOk.getHeight()/maximumValue);
				//jbtOk.setYCoordinate((int)newY);
			}
		});
	}

}
