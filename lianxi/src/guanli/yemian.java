package guanli;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class yemian {
	static String a ;
	static String bookName;
	static String zuoZhe;
	static String chuBan;
	static double jiaGe;
	static int shuhao;
	public static void main(String[] args) {

		System.out.println("***************************");
		System.out.println("�������");
		System.out.println("�����۶����");
		System.out.println("***************************");
		Scanner scan = new Scanner(System.in);
		System.out.println("��ѡ���ܣ�");
		System.out.println("�û���¼:" + "A");
		System.out.println("�û�ע��:" + "B");
		System.out.println("�˳�����:" + "Q");
		String A = scan.next();
		switch (A) {
		case "A":
			putong();
			break;
		case "B":
			System.out.println("aaa");
			break;
		case "Q":
			System.out.println("aaa");
			break;

		default:
			break;
		}
	}

	// ��ͨ�û�
	private static void putong() {
		Scanner scan1 = new Scanner(System.in);
		System.out.println("ѡ���û���¼");
		System.out.println("A" + ":��ͨ�û���½");
		System.out.println("B" + ":����Ա��½");
		String in = scan1.next();
		switch (in) {
		case "A":
			Scanner scan2 = new Scanner(System.in);
			System.out.println("�������û���:");
			int acc = scan2.nextInt();
			System.out.println("����������:");
			int pwd = scan2.nextInt();
			if (acc == 111 && pwd == 123) {
				System.out.println("��½�ɹ�");
			} else if (acc != 111) {
				System.out.println("�˺Ŵ���");
			} else {
				System.out.println("�������");
			}
			gongneng();

			break;
		case "B":
			guanliyuan();

			break;

		default:
			break;
		}

	}

	private static void gongneng() {
		Scanner s = new Scanner(System.in);
		System.out.println("��ѡ����:�鿴ͼ��(A)���ͼ��(B)�޸�ͼ��(C)ɾ��ͼ��(D)�޸��û���(E)�޸�����(F)�鿴�����û�(I)ע��(Q)");
		 a = s.next();
		 List<User> list = new ArrayList<User>();
	
		switch (a) {
		case "A":
			chakan();
			
			break;
		case "B":
			
			System.out.println("����������");
			 bookName	=s.next();
			System.out.println("����������");
			zuoZhe =s.next();
			System.out.println("�����������");
			chuBan = s.next();
			System.out.println("������۸�");
			 jiaGe = s.nextDouble();
			System.out.println("���������");
			shuhao = s.nextInt();
			list.add(new User(bookName, zuoZhe, chuBan, jiaGe, shuhao));
			for (User user : list) {
				System.out.println("������鼮����Ϣ"+user);
			}
			System.out.println("�Ƿ���Ӹ�ͼ�飺Y����   N����");
			String ss = s.next();
			switch (ss) {
			case "Y":
				System.out.println("��ӳɹ�");
				chakan();
				break;

			default:
				break;
			}
			break;
		case "C":

			break;
		case "D":

			break;

		default:
			break;
		}

	}

	private static void chakan() {
		List<User> list = new ArrayList<User>();
		list.add(new User("java���Ż���", "����", "���������", 50.0, 1234562));
		list.add(new User("XMLD����", "����", "����������", 75.0, 1234564));
		list.add(new User("javaWeb���Ż���", "����", "�廪��ѧ������", 85.0, 1234563));
		list.add(new User("javaScript���Ż���", "����", "���������", 100.0, 1234560));
		list.add(new User("javaEE��Ŀʵս", "����", "��е��ҵ������", 189.0, 1234561));
		list.add(new User(bookName, zuoZhe, chuBan, jiaGe, shuhao));
		for (User u : list) {
			System.out.println(u);
		}
		
	}

	// ��·�û�
	private static void guanliyuan() {
		Scanner scan = new Scanner(System.in);
		System.out.println("�������˺�");
		int acc = scan.nextInt();
		System.out.println("����������");
		int pwd = scan.nextInt();

	}

}
