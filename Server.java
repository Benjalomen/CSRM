import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import org.omg.CORBA.portable.OutputStream;

public class Server {
	private Repository r;

	public Server(Repository r) {
		super();
		this.r = r;
		System.out.println("SERVER RUNNING");
	}
	
	public Server(){
		this.r = new Repository();
		System.out.println("SERVER RUNNING");
	}
	
	public void Test1(){
		System.out.println("TEST 1");
	}

	public Repository getR() {
		return r;
	}

	public void setR(Repository r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "Server [r=" + r + "]";
	}
	
	public void run(){
		
	}
	
/*	
	public void run(String[] args){
		if(args.length < 1)
			return;
		
		int port = Integer.parseInt(args[0]);
		
		try(ServerSocket serverSocket = new ServerSocket(port)){
			
			System.out.println("Server is listening on port " + port);
			 
            while (true) {
                Socket socket = serverSocket.accept();
 
                System.out.println("New client connected");
 
                OutputStream output = socket.getOutputStream();
                PrintWriter writer = new PrintWriter(output, true);
 
                writer.println(new Date().toString());
            }
			
		} catch(IOException ex){
			System.out.println("Server exception: " + ex.getMessage());
            ex.printStackTrace();
		}
	}
*/
}
