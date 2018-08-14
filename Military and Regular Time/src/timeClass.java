
public class timeClass {
	public static void main(String[] args){
		sagor sagorObject=new sagor();
		System.out.println(sagorObject.toMilitary());
		System.out.println(sagorObject.toString());
		
		sagorObject.setTime(15,25,12);
		System.out.println(sagorObject.toMilitary());
		System.out.println(sagorObject.toString());

}
}
