package testpro1;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class NetDemo6 {

	public static void main(String[] args) {
		try {
			System.out.println("web服务器正在运行....");
			ServerSocket ss = new ServerSocket(8080);
			Socket s = ss.accept();
			OutputStream out = s.getOutputStream();
			out.write("<h1><font color=red>我是好人</font></h1>".getBytes());
			out.close();
			ss.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}


	}

}
