package class1;

import java.util.Scanner;

public class meil {
	static String userName;
	static String passWord;
	public static void main(String[] args) {
		System.out.println("��ӭ���ٵ��");
		System.out.println("����ע�����");
		int i=0;
		while(i!=1) {
			System.out.println("�û���");
			Scanner name = new Scanner(System.in);
			String nm = name.nextLine();
			System.out.println("����");
			Scanner firstPassword = new Scanner(System.in);
			String fp = firstPassword.nextLine();
			System.out.println("ȷ������");
			Scanner confirmPasseord = new Scanner(System.in);
			String cp = confirmPasseord.nextLine();
			int b = fp.length();
			int d = cp.length();
			if(b!=d) {
				System.out.println("�����������,����ע��");
				
			}else {
				System.out.println("��ȷ");
				userName = nm;
				passWord = fp;
				i = 1;
			}
		}
	
		System.out.println("��½");
		System.out.println("�û���");
		Scanner name = new Scanner(System.in);
		String nm = name.nextLine();
		System.out.println("����");
		Scanner firstPassword = new Scanner(System.in);
		String fp = firstPassword.nextLine();
		System.out.println("�ȴ�");
		if(nm == userName && fp == passWord) {
			System.out.println("��½�ɹ���׼�����");
			System.out.println("1��������2�����棬���������ò�");
			Scanner foodT = new Scanner(System.in);
			int foot = foodT.nextInt();
			if(foot == 1) {
				System.out.println("1�������㳴����2���������棬���������ò�");
				Scanner foods = new Scanner(System.in);
				int foos = foods.nextInt();
				if(foos == 1) {
					System.out.println("���㳴�������Ժ�");
				}else if(foos == 2) {
					System.out.println("�������������Ժ�");
				}else {
					System.out.println("��ӭ�´ι���");
				}
			}else if(foot == 2){
				System.out.println("1������˿���棬2�����߲˳��棬���������ò�");
				Scanner foods = new Scanner(System.in);
				int foos = foods.nextInt();
				if(foos == 1) {
					System.out.println("��˿���棬���Ժ�");
				}else if(foos == 2) {
					System.out.println("�߲˳��棬���Ժ�");
				}else {
					System.out.println("��ӭ�´ι���");
				}
				
			}else {
				System.out.println("��ӭ�´ι���");
			}
			
		}else {
			System.out.println("�û����������");
		}	
	}

}
