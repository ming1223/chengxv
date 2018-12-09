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

		list.add(new User("java入门基础", "老赵", "北大出版社", 50.0, 1234562));
		list.add(new User("XMLD入门", "老赵", "电力出版社", 75.0, 1234564));
		list.add(new User("javaWeb入门基础", "老钟", "清华大学出版社", 85.0, 1234563));
		list.add(new User("javaScript入门基础", "老赵", "北大出版社", 100.0, 1234560));
		list.add(new User("javaEE项目实战", "老汤", "机械工业出版社", 189.0, 1234561));

		System.out.println("***************************");
		System.out.println("艾特书城");
		System.out.println("回龙观东大街");
		System.out.println("***************************");
		System.out.println("请选择功能：");
		System.out.println("用户登录:" + "A");
		System.out.println("用户注册:" + "B");
		System.out.println("退出程序:" + "Q");
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

	// 普通用户登陆
	private static void putong() {

		System.out.println("选择用户登录");
		System.out.println("A" + ":普通用户登陆");
		System.out.println("B" + ":管理员登陆");
		String in = scan.next();
		switch (in) {
		case "A":
			System.out.println("请输入用户名:");
			int acc = scan.nextInt();
			System.out.println("请输入密码:");
			int pwd = scan.nextInt();
			if (acc == 111 && pwd == 123) {
				System.out.println("登陆成功");
			} else if (acc != 111) {
				System.out.println("账号错误");
			} else {
				System.out.println("密码错误");
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

	// 管理员登陆
	private static void guanliyuan() {
		System.out.println("请输入账号");
		int acc = scan.nextInt();
		System.out.println("请输入密码");
		int pwd = scan.nextInt();

	}

	// 功能
	private static void gongneng() {

		System.out.println("请选择功能:查看图书(A)添加图书(B)修改图书(C)删除图书(D)修改用户名(E)修改密码(F)查看所用用户(I)注销(Q)");
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

	// 修改图书
	private static void xiugai() {
		System.out.println("请输入要修改的书号：");
		shuhao = scan.nextInt();
		for (User user : list) {
			if (shuhao == user.getId()) {
				System.out.println(user);
				System.out.println("请输入要修改的属性：书名修改(A)作者修改(B)出版社修改(C)价格修改(D)书号修改(E)");
				a=scan.next();
				switch (a) {
				case "A":
					System.out.println("请输入此书的新书名");
					bookName = scan.next();
					list.set(0, user);
					
					break;
					
				default:
					break;
				}
			} else {
				System.out.println("没有本书");
			}
			
		}

	}

	// 添加图书
	private static void tianjia() {
		System.out.println("请输入书名");
		bookName = scan.next();
		System.out.println("请输入作者");
		zuoZhe = scan.next();
		System.out.println("请输入出版社");
		chuBan = scan.next();
		System.out.println("请输入价格");
		jiaGe = scan.nextDouble();
		System.out.println("请输入书号");
		shuhao = scan.nextInt();
		list.add(new User(bookName, zuoZhe, chuBan, jiaGe, shuhao));
		for (User user : list) {
			System.out.println("新添加书籍的信息" + user);
		}
		System.out.println("是否添加该图书：Y：是   N：否");
		a = scan.next();
		switch (a) {
		case "Y":
			System.out.println("添加成功");
			gongneng();
			break;

		default:
			break;
		}

	}

	// 查看图书
	private static void chakan() {
		// list.add(new User(bookName, zuoZhe, chuBan, jiaGe, shuhao));
		for (User u : list) {
			System.out.println(u);
		}
	}

}
