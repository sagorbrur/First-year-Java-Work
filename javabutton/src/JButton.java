import javax.swing.JOptionPane;
public class JButton {
	public static void main(String[] args){
	JOptionPane.showMessageDialog(null, "Welcome to Java!");
	int sum=0;
	for(int i=1;i<=5;i++){
		System.out.println("Welcome to Java!");
		for(int j=1;j<=9;j++){
			sum=sum+i;
		}
		System.out.printf("%d\n", sum);
	}
	
	}

}
