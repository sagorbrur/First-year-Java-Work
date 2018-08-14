import java.io.*;
import java.net.*;

public class StudentServer {
	private ObjectOutputStream outputToFile;
	private ObjectInputStream inputFromClient;
	
	public static void main(String[] args) throws IOException{
		new StudentServer();
	}
	public StudentServer() throws IOException{
		try{
			//create a server socket
			ServerSocket serverSocket = new ServerSocket(8000);
			System.out.println("Server started");
			
			//create an object output stream
			outputToFile = new ObjectOutputStream(new FileOutputStream("student.dat",true));
			
			while(true){
				//Listen for new connecton request
				Socket socket=serverSocket.accept();
				//create an input stream from the socket
				inputFromClient=new ObjectInputStream(socket.getInputStream());
				
				//Read from input
				Object object=inputFromClient.readObject();
				//write to the file
				outputToFile.writeObject(object);
				System.out.println("A new Student object is stored");
				
			}
			
		}
		catch(ClassNotFoundException ex){
			ex.printStackTrace();
		}
		finally{
			try{
				inputFromClient.close();
				outputToFile.close();
			}
			catch(Exception ex){
				ex.printStackTrace();
			}
		}
	}
	

}
