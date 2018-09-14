package zz;
import java.util.Scanner;
public class fb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =1;
		int b =1;
		int sum = 0;
		System.out.println(b);
		for(int i = 0;i<19;i++){
			sum = a + sum;
			a=b;
			b=sum;
			System.out.println(sum);
		}
	}

}
