package eleven;

import java.util.Date;
import java.util.ArrayList;

import javax.swing.JFrame;

import javafx.scene.shape.Circle;

public class exercise116 {

	public static void main(String[] args) {
		
		
		ArrayList<Object> aa=new ArrayList<Object>();
		
		Date dd=new Date(System.currentTimeMillis());
		Circle cc=new Circle(20);
		String ss=new String("I am student of begum rokeya university rangpur at cse department");
		JFrame jj=new JFrame();
		aa.add(dd);
		aa.add(cc);
		aa.add(ss);
		aa.add(jj);
		for (int i = 0; i < aa.size(); i++) {
			System.out.println(aa.get(i).toString());
		}
		
	}

}
