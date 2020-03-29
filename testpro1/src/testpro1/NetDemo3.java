package testpro1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class NetDemo3 {

	public static void main(String[] args) {
		System.out.println("客户端：");
		try {
			Socket s = new Socket("192.168.205.15",9999);
			OutputStream out = s.getOutputStream();
			out.write("hello服务器".getBytes());
			s.close();
			out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
