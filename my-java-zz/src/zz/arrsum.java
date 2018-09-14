package zz;
import java.util.Scanner;
public class arrsum {
	public static void main(String[] args) {
		System.out.println("输入一个数");
		Scanner number = new Scanner(System.in);
		double i = number.nextDouble();
		if(i%2 ==0 ){
			double sumev =0.0;
		for(int a=2;a<=i;a+=2){
			sumev = 1.0/a + sumev;
			
		}
		System.out.println(sumev);
		}else{
			double sumodd =0;
			for(int a=1;a<=(i+1);a+=2){
				sumodd = 1.0/a + sumodd;
				
			}
			System.out.println(sumodd);
		}
}
}
