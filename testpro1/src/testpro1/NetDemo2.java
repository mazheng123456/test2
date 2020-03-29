package testpro1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class NetDemo2 {

	public static void main(String[] args) {
		System.out.println("接收端：");
		try {
			DatagramSocket ds = new DatagramSocket(7777);
			byte[] b =  new byte[1024];
			DatagramPacket dp = new DatagramPacket(b,b.length);
			ds.receive(dp);
			System.out.println(new String(dp.getData(),0,dp.getLength()));
			ds.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
