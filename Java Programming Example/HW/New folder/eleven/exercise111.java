package eleven;

import java.io.ObjectInputStream.GetField;

public class exercise111 {

	public static void main(String[] args) {
		geometricObject go=new geometricObject(2,2,1);
		System.out.println(go.toString());
	}

}
class triangle{
	double side1,side2,side3;

	public triangle(double side1, double side2, double side3) {
		
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public triangle() {
		side1=1;
		side2=1;
		side3=1;
	}
	public double GetArea()
	{
		double s=(side1+side2+side3)/2;
		return s*(s-side1)*(s-side2)*(s-side3);
		
	}
	public double getPerimeter() {
		return side1+side2+side3;
		
	}
	public String toString()
	{
		return "Side11 = "+side1+" Side2 = "+side2+" Side3 = "+side3+" Area is "+GetArea()+"\nPerimeter is "+getPerimeter();
	}
	
}
class geometricObject extends triangle{
	public geometricObject()
	{
		super();
	}
	public geometricObject(double side1, double side2, double side3){
		super(side1,side2,side2);
	}
}