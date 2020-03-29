package testpro1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class NetDemo1 {

	public static void main(String[] args) {
		System.out.println("发送端：");
		try {
			String info = "美女，你好人！";
			byte[] b = info.getBytes();
			DatagramSocket ds  = new DatagramSocket();
			DatagramPacket dp = new  DatagramPacket(b, b.length, InetAddress.getByName("192.168.205.15"), 7777);
			ds.send(dp);
			ds.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
