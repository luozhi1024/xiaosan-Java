package class1;

import java.util.Scanner;
public class apple {
	public static void main(String[] args) {
		int sum = 0;
		int i;
		for(i=1;i<=4;i++) {
			System.out.println("��������ժ��ƻ����");
			Scanner apple = new Scanner(System.in);
			sum = sum + apple.nextInt();
			switch(i) {
			case 1:
				System.out.println("��ǰС��һ����ƻ��"+sum+"��");
				break;
			case 2:
				System.out.println("��ǰС�죬С��һ����ƻ��"+sum+"��");
				break;
			case 3:
				System.out.println("��ǰС�죬С�գ�С��һ����ƻ��"+sum+"��");
				break;
			case 4:
				System.out.println("��ǰС�죬С�գ�С����С��һ����ƻ��"+sum+"��");
				break;
				
			}
		}
	}

}
