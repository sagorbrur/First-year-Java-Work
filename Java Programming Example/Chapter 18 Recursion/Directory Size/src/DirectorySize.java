import java.io.File;
import java.util.Scanner;

public class DirectorySize {

	public static void main(String[] args) {
		System.out.println("Enter a directory or a file: ");
		Scanner input=new Scanner(System.in);
		String directory=input.nextLine();
		
		//Display the size
		System.out.println(getSize(new File(directory)) + " bytes");

	}

	public static long getSize(File file){
		long size=0;//store the total size of the files
		
		if(file.isDirectory()){
			File[] files=file.listFiles();
			for(int i=0;files!=null&&i<files.length;i++){
				size+=getSize(files[i]);
			}
		}
		else
			size+=file.length();//Base case
		return size;
	}
	
}
