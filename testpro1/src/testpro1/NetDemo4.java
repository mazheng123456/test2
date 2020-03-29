package testpro1;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class NetDemo4 {

	public static void main(String[] args) {
		System.out.println("服务器：");
		try {
			ServerSocket ss = new ServerSocket(9999);
			Socket s = ss.accept();
			InputStream in = s.getInputStream();
			byte[] b = new byte[1024];
			
			int len = in.read(b);
			
			System.out.println(new String(b,0,len));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
