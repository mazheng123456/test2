package testpro1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class NetDemo5 {

	public static void main(String[] args) {
		try {
			//模拟浏览器的功能
			System.out.println("wowo浏览器欢迎您：请输入地址");
			//做一个DNS的映射
			Scanner s = new Scanner(System.in);
			String address = s.next();
			String ip = null;
			if("www.haoren.com".equals(address)){
				ip = "192.168.205.15";
			}
			Socket ss =  new Socket(ip, 8080);
			InputStream inputStream = ss.getInputStream();
			byte[] b = new byte[1024];
			int len = 0;
			len = inputStream.read(b);
			String path  = "d:"+File.separator+"11"+File.separator+"index.html";
			OutputStream out = new FileOutputStream(path);
			out.write(b, 0, len);
			out.close();
			inputStream.close();
			ss.close();


		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
