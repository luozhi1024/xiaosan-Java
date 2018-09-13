package class1;

import java.util.Scanner;

public class meil {
	static String userName;
	static String passWord;
	public static void main(String[] args) {
		System.out.println("欢迎光临点餐");
		System.out.println("请先注册后点餐");
		int i=0;
		while(i!=1) {
			System.out.println("用户名");
			Scanner name = new Scanner(System.in);
			String nm = name.nextLine();
			System.out.println("密码");
			Scanner firstPassword = new Scanner(System.in);
			String fp = firstPassword.nextLine();
			System.out.println("确认密码");
			Scanner confirmPasseord = new Scanner(System.in);
			String cp = confirmPasseord.nextLine();
			int b = fp.length();
			int d = cp.length();
			if(b!=d) {
				System.out.println("密码输入错误,重新注册");
				
			}else {
				System.out.println("正确");
				userName = nm;
				passWord = fp;
				i = 1;
			}
		}
	
		System.out.println("登陆");
		System.out.println("用户名");
		Scanner name = new Scanner(System.in);
		String nm = name.nextLine();
		System.out.println("密码");
		Scanner firstPassword = new Scanner(System.in);
		String fp = firstPassword.nextLine();
		System.out.println("等待");
		if(nm == userName && fp == passWord) {
			System.out.println("登陆成功，准备点餐");
			System.out.println("1代表炒饼，2代表炒面，其他放弃用餐");
			Scanner foodT = new Scanner(System.in);
			int foot = foodT.nextInt();
			if(foot == 1) {
				System.out.println("1代表鱿鱼炒饼，2代表鸡蛋炒面，其他放弃用餐");
				Scanner foods = new Scanner(System.in);
				int foos = foods.nextInt();
				if(foos == 1) {
					System.out.println("鱿鱼炒饼，请稍后！");
				}else if(foos == 2) {
					System.out.println("鸡蛋炒饼，请稍后！");
				}else {
					System.out.println("欢迎下次光临");
				}
			}else if(foot == 2){
				System.out.println("1代表肉丝炒面，2代表蔬菜炒面，其他放弃用餐");
				Scanner foods = new Scanner(System.in);
				int foos = foods.nextInt();
				if(foos == 1) {
					System.out.println("肉丝炒面，请稍后！");
				}else if(foos == 2) {
					System.out.println("蔬菜炒面，请稍后！");
				}else {
					System.out.println("欢迎下次光临");
				}
				
			}else {
				System.out.println("欢迎下次光临");
			}
			
		}else {
			System.out.println("用户或密码错误");
		}	
	}

}
