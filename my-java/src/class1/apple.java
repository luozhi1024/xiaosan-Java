package class1;

import java.util.Scanner;
public class apple {
	public static void main(String[] args) {
		int sum = 0;
		int i;
		for(i=1;i<=4;i++) {
			System.out.println("请输入你摘的苹果数");
			Scanner apple = new Scanner(System.in);
			sum = sum + apple.nextInt();
			switch(i) {
			case 1:
				System.out.println("当前小红一共有苹果"+sum+"个");
				break;
			case 2:
				System.out.println("当前小红，小刚一共有苹果"+sum+"个");
				break;
			case 3:
				System.out.println("当前小红，小刚，小丽一共有苹果"+sum+"个");
				break;
			case 4:
				System.out.println("当前小红，小刚，小丽，小玉一共有苹果"+sum+"个");
				break;
				
			}
		}
	}

}
