package guanli;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class yemian2 {
	static String a;
	static String bookName;
	static String zuoZhe;
	static String chuBan;
	static double jiaGe;
	static int shuhao;
	static Scanner scan = new Scanner(System.in);
	static List<User> list = new ArrayList<User>();

	public static void main(String[] args) {

		list.add(new User("java���Ż���", "����", "���������", 50.0, 1234562));
		list.add(new User("XMLD����", "����", "����������", 75.0, 1234564));
		list.add(new User("javaWeb���Ż���", "����", "�廪��ѧ������", 85.0, 1234563));
		list.add(new User("javaScript���Ż���", "����", "���������", 100.0, 1234560));
		list.add(new User("javaEE��Ŀʵս", "����", "��е��ҵ������", 189.0, 1234561));

		System.out.println("***************************");
		System.out.println("�������");
		System.out.println("�����۶����");
		System.out.println("***************************");
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

	// ��ͨ�û���½
	private static void putong() {

		System.out.println("ѡ���û���¼");
		System.out.println("A" + ":��ͨ�û���½");
		System.out.println("B" + ":����Ա��½");
		String in = scan.next();
		switch (in) {
		case "A":
			System.out.println("�������û���:");
			int acc = scan.nextInt();
			System.out.println("����������:");
			int pwd = scan.nextInt();
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

	// ����Ա��½
	private static void guanliyuan() {
		System.out.println("�������˺�");
		int acc = scan.nextInt();
		System.out.println("����������");
		int pwd = scan.nextInt();

	}

	// ����
	private static void gongneng() {

		System.out.println("��ѡ����:�鿴ͼ��(A)���ͼ��(B)�޸�ͼ��(C)ɾ��ͼ��(D)�޸��û���(E)�޸�����(F)�鿴�����û�(I)ע��(Q)");
		a = scan.next();
		List<User> list = new ArrayList<User>();

		switch (a) {
		case "A":
			chakan();

			break;
		case "B":
			tianjia();
			break;
		case "C":
			xiugai();
			break;
		case "D":

			break;

		default:
			break;
		}

	}

	// �޸�ͼ��
	private static void xiugai() {
		System.out.println("������Ҫ�޸ĵ���ţ�");
		shuhao = scan.nextInt();
		for (User user : list) {
			if (shuhao == user.getId()) {
				System.out.println(user);
				System.out.println("������Ҫ�޸ĵ����ԣ������޸�(A)�����޸�(B)�������޸�(C)�۸��޸�(D)����޸�(E)");
				a=scan.next();
				switch (a) {
				case "A":
					System.out.println("����������������");
					bookName = scan.next();
					list.set(0, user);
					
					break;
					
				default:
					break;
				}
			} else {
				System.out.println("û�б���");
			}
			
		}

	}

	// ���ͼ��
	private static void tianjia() {
		System.out.println("����������");
		bookName = scan.next();
		System.out.println("����������");
		zuoZhe = scan.next();
		System.out.println("�����������");
		chuBan = scan.next();
		System.out.println("������۸�");
		jiaGe = scan.nextDouble();
		System.out.println("���������");
		shuhao = scan.nextInt();
		list.add(new User(bookName, zuoZhe, chuBan, jiaGe, shuhao));
		for (User user : list) {
			System.out.println("������鼮����Ϣ" + user);
		}
		System.out.println("�Ƿ���Ӹ�ͼ�飺Y����   N����");
		a = scan.next();
		switch (a) {
		case "Y":
			System.out.println("��ӳɹ�");
			gongneng();
			break;

		default:
			break;
		}

	}

	// �鿴ͼ��
	private static void chakan() {
		// list.add(new User(bookName, zuoZhe, chuBan, jiaGe, shuhao));
		for (User u : list) {
			System.out.println(u);
		}
	}

}
