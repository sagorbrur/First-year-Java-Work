import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	private static int uniqueId;
	
	private ArrayList<ClientThread> al;
	
	private ServerGui sg;
	
	private SimpleDateFormate sdf;
	
	private int port;
	
	private boolean keepGoing;
	
	public Server(int port){
		this(port,null);
	}
	
	public Server(int port, ServerGui sg){
		this.sg=sg;
		this.port=port;
		
		sdf=new SimpleDateFormate("HH:mm:ss");
		al=new ArrayList<ClientThread>();
	}
	
	public void start(){
		keepGoing=true;
		try{
			ServerSocket serversocket=new ServerSocket(port);
			while(keepGoing){
				display("Server waiting for Clients on port " + port+".");
				
				Socket socket=serversocket.accept();
				if(!keepGoing)
					break;
				ClientThread t=new ClientThread(socket);
				al.add(t);
				t.start();
			}
			
			try{
				serversocket.close();
				for(int i=0;i<al.size();++i){
					ClientThread tc=al.get(i);
					try{
						tc.sInput.close();
						tc.sOutput.close();
						tc.socket.close();
					}
					catch(IOException ioE){
				}
			}
		}catch(Exception e){
			display("Exception closing the server and client ");
		}
	}
	catch(IOException e){
		String msg=sdf.format(new Date())+"Exception on new socket: "+e+display(msg);
		
	}

}
}
