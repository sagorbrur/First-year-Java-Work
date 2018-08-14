package eleven;

import java.util.ArrayList;

public class exercise115 {

	public static void main(String[] args) {
		
		course ss=new course("CSE");
		ss.addStudent("DHIRAJ");
		ss.addStudent("SAGOR");
		ss.addStudent("SALAM");
		ss.addStudent("Angkon");
		ss.addStudent("Aliph");
		ss.dropStudent(3);
		for(int i=0;i<ss.getNumberOfStudent();i++)
			System.out.println(ss.getStudent());
		
		System.out.println(ss.getNumberOfStudent());
	}

}
class course{
	private String courseName;
	private int number=100;
	private ArrayList<String> student=new ArrayList<String>();
	private int numberOfStudent=0;
	private int i=0;
	public course(String courseName)
	{
		this.courseName=courseName;
	}
	public void addStudent(String studet)
	
	{
		
		student.add(studet);
		numberOfStudent++;
	}
	public String getStudent()
	{
		
		return student.get(i++);
		
	}
	public int getNumberOfStudent()
	{
		return student.size();
	}
	public String getCourseName()
	{
		return courseName;
	}
	public void dropStudent(int i)
	{
		student.remove(i);
	}
	
	public void clear()
	{
		student.clear();
	}
}

