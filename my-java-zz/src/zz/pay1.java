package zz;
import java.util.Scanner;
public class pay1 {
	public static void main(String[] args) {
		System.out.println("是否继续为下一位顾客结账");
		String next ="y" ;
		Scanner con = new Scanner(System.in);
		String cont = con.nextLine();
		do{
			System.out.println("你的原消费金额");
		Scanner price = new Scanner(System.in);
		double pri = price.nextDouble();
		if(pri<2000) {
			System.out.println("实际消费金额："+pri);
			
			
		}else if(pri>=2000) {
			System.out.println("你是否是会员，是请输入“1”,不是请输入“0”");
			Scanner vip = new Scanner(System.in);
			int v = vip.nextInt();
			if(v==1) {
				System.out.println("尊敬的会员您好，请选择你的支付方式（输入1-3选择），1现金，2信用卡，3借记卡");
				Scanner pay = new Scanner(System.in);
				int paymeil =  pay.nextInt();
				switch(paymeil) {
				case 1:
					System.out.println("实际消费金额为："+(pri*0.8));
					
					
					break;
				case 2:
					System.out.println("实际消费金额为："+(pri*0.85));
					
					break;
				case 3:
					System.out.println("实际消费金额为："+(pri*0.9));
					
					break;
					default :
						System.out.println("请选择1-3");
				}
			}else if(v==0) {
				double zz =pri*0.95;
				System.out.println("您不是本店会员，你只能使用现金支付");
				System.out.println("实际消费金额："+zz);
				
			}else {
				System.out.println("输入错误");
			}
		}else {
			System.out.println("输入错误");
		}
	
		}while(cont.equals(next));
		

	}

}



