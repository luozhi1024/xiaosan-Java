package class1;

import java.util.Scanner;
public class pic {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入计算1.长方形  2。正方形 3.圆形  4。三角形");
		int num = scan.nextInt();
		switch(num){
		   case 1:
			   Scanner sc =new Scanner(System.in);
			   System.out.println("请输入长方形的长");
			   int length = sc.nextInt();
			   System.out.println("请输入长方形的宽");
			   int width = sc.nextInt();
			   int perimeter = (length + width) *2; 
			   int area = length * width ;
			   System.out.println("长方形的周长是；"+ perimeter);
			   System.out.println("长方形的面积是；"+ area);
			   break;
		   case 2:
			   Scanner sc1 =new Scanner(System.in);
			   System.out.println("请输入正方形的长");
			   int length1 = sc1.nextInt();
			   int perimeter1 = length1  *4; 
			   int area1 = length1 * length1 ;
			   System.out.println("正方形的周长是；"+ perimeter1);
			   System.out.println("正方形的面积是；"+ area1);
			   break;
		   case 3:
			   Scanner sc2 =new Scanner(System.in);
			   System.out.println("请输入圆形的半径");
			   double r = sc2.nextInt();
			   double perimeter2 = Math.PI *r *4; 
			   double area2 =  Math.PI *r *r ;
			   System.out.println("圆形的周长是；"+ perimeter2);
			   System.out.println("圆形的面积是；"+ area2);
			   break;
		   case 4:
			   Scanner sc3 =new Scanner(System.in);
			   System.out.println("请输入三角形的三边");
			   double a = sc3.nextInt();
			   double b = sc3.nextInt();
			   double c = sc3.nextInt();
			   double perimeter3 =(a+b+c)/2; 
			   double area3 =  Math.sqrt(perimeter3*(perimeter3-a)*(perimeter3-b)*(perimeter3-c));
			   System.out.println("三角形的周长是；"+ perimeter3);
			   System.out.println("三角形的面积是；"+ area3);
			   break;
		   default :
			   System.out.println("请输入1到4数字");
		
	}
}
}
