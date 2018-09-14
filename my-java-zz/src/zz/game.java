package zz;
import java.util.Scanner;
public class game {
	public static void main(String[] args) {  
		System.out.println("现有游戏如下--------------------1、	wow   2、	传奇            3、	梦幻西游   4、	永恒之塔    5、	七龙珠ol");
		System.out.println("请输入您选择的游戏");
		Scanner number = new Scanner(System.in);
		int i = number.nextInt();
		switch ( i) { 
		  case 1:    System.out.println("您选择了*wow*");		  			
		  break;	
		  case 2:    System.out.println("您选择了*传奇*"); 
		  break;
		  case 3:    System.out.println("您选择了*梦幻西游*"); 
		  break;
		  case 4:    System.out.println("您选择了*永恒之塔*"); 
		  break;
		  case 5:    System.out.println("您选择了*七龙珠ol*"); 
		  break;
		  default :
				System.out.println("您输入的游戏编号无效，请继续输入！！");

	} 
		System.out.println("请输入您现在已经玩到的级别：");
		Scanner level = new Scanner(System.in);
		int l = level.nextInt();
		if(l<=20){
			System.out.println("您还是新出茅庐的小菜鸟，加快步伐向前冲吧！！");
	}else if(21<l&&l<=40){
		System.out.println("您已经开始行走江湖，算是小有成就了，加油！！");
	}else if(41<l&&l<=60){
		System.out.println("您已经横扫天下了，离天下无敌还有差距，继续努力吧！！");
	}else{
		System.out.println("您已经天下无敌了，太牛了！！");
	}
}
}



