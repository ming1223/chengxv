package wangluo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class fuwu {
	public static void main(String[] args) {
		BufferedReader br =null;
		PrintWriter out =null;
		Socket s =null;
		try {
			ServerSocket ss = new ServerSocket(888);
			System.out.println("������");
			while (true) {
				 s = ss.accept();
				Scanner scan = new Scanner(System.in);
				br = new BufferedReader(new InputStreamReader(s.getInputStream()));
				System.out.println("�������" + br.readLine());
				out = new PrintWriter(s.getOutputStream());
				System.out.println("������");
				String str1 = scan.next();
				out.println("������" + str1);
				out.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(br!=null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(out!=null) {
				out.close();
			}
		}
	}

}