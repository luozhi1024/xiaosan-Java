package zz;
import java.util.Scanner;
public class game {
	public static void main(String[] args) {  
		System.out.println("������Ϸ����--------------------1��	wow   2��	����            3��	�λ�����   4��	����֮��    5��	������ol");
		System.out.println("��������ѡ�����Ϸ");
		Scanner number = new Scanner(System.in);
		int i = number.nextInt();
		switch ( i) { 
		  case 1:    System.out.println("��ѡ����*wow*");		  			
		  break;	
		  case 2:    System.out.println("��ѡ����*����*"); 
		  break;
		  case 3:    System.out.println("��ѡ����*�λ�����*"); 
		  break;
		  case 4:    System.out.println("��ѡ����*����֮��*"); 
		  break;
		  case 5:    System.out.println("��ѡ����*������ol*"); 
		  break;
		  default :
				System.out.println("���������Ϸ�����Ч����������룡��");

	} 
		System.out.println("�������������Ѿ��浽�ļ���");
		Scanner level = new Scanner(System.in);
		int l = level.nextInt();
		if(l<=20){
			System.out.println("�������³�é®��С���񣬼ӿ첽����ǰ��ɣ���");
	}else if(21<l&&l<=40){
		System.out.println("���Ѿ���ʼ���߽���������С�гɾ��ˣ����ͣ���");
	}else if(41<l&&l<=60){
		System.out.println("���Ѿ���ɨ�����ˣ��������޵л��в�࣬����Ŭ���ɣ���");
	}else{
		System.out.println("���Ѿ������޵��ˣ�̫ţ�ˣ���");
	}
}
}



