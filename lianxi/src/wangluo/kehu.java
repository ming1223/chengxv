package wangluo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class kehu {

public static void main(String[] args){
	PrintWriter out =null;
	BufferedReader br =null;
	try {
		System.out.println("���ӳɹ�");
		while (true) {
			Socket s = new Socket("localhost", 888);
			Scanner scan = new Scanner(System.in);
			System.out.println("������");
			String str = scan.next();
			out = new PrintWriter(s.getOutputStream());
			out.println("������" + str);
			out.flush();
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String str1 = br.readLine();
			System.out.println("����" + str1);
		}
		
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		if(out!=null) {
			out.close();
		}
		if(br!=null) {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
}
