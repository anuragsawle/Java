import java.net.*;
import java.io.*;
public class Myserver {
	public static void main(String[] args){  
		try{  
		ServerSocket ss=new ServerSocket(6666);  
		Socket s=ss.accept();//establishes connection   
		DataInputStream dis=new DataInputStream(s.getInputStream());
		String a=dis.readUTF();  
		System.out.println("message= "+a);  
		ss.close();  
		}catch(Exception e){System.out.println(e);}  
		}  
}
