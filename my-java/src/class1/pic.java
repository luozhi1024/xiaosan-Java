package class1;

import java.util.Scanner;
public class pic {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���������1.������  2�������� 3.Բ��  4��������");
		int num = scan.nextInt();
		switch(num){
		   case 1:
			   Scanner sc =new Scanner(System.in);
			   System.out.println("�����볤���εĳ�");
			   int length = sc.nextInt();
			   System.out.println("�����볤���εĿ�");
			   int width = sc.nextInt();
			   int perimeter = (length + width) *2; 
			   int area = length * width ;
			   System.out.println("�����ε��ܳ��ǣ�"+ perimeter);
			   System.out.println("�����ε�����ǣ�"+ area);
			   break;
		   case 2:
			   Scanner sc1 =new Scanner(System.in);
			   System.out.println("�����������εĳ�");
			   int length1 = sc1.nextInt();
			   int perimeter1 = length1  *4; 
			   int area1 = length1 * length1 ;
			   System.out.println("�����ε��ܳ��ǣ�"+ perimeter1);
			   System.out.println("�����ε�����ǣ�"+ area1);
			   break;
		   case 3:
			   Scanner sc2 =new Scanner(System.in);
			   System.out.println("������Բ�εİ뾶");
			   double r = sc2.nextInt();
			   double perimeter2 = Math.PI *r *4; 
			   double area2 =  Math.PI *r *r ;
			   System.out.println("Բ�ε��ܳ��ǣ�"+ perimeter2);
			   System.out.println("Բ�ε�����ǣ�"+ area2);
			   break;
		   case 4:
			   Scanner sc3 =new Scanner(System.in);
			   System.out.println("�����������ε�����");
			   double a = sc3.nextInt();
			   double b = sc3.nextInt();
			   double c = sc3.nextInt();
			   double perimeter3 =(a+b+c)/2; 
			   double area3 =  Math.sqrt(perimeter3*(perimeter3-a)*(perimeter3-b)*(perimeter3-c));
			   System.out.println("�����ε��ܳ��ǣ�"+ perimeter3);
			   System.out.println("�����ε�����ǣ�"+ area3);
			   break;
		   default :
			   System.out.println("������1��4����");
		
	}
}
}
