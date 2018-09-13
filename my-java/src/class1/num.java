package class1;
import java.util.Scanner;
public class num {

	public static void main(String[] args) {
		System.out.println("ÇëÊäÈë5Î»Êı");
		Scanner number = new Scanner(System.in);
		int a = number.nextInt();
		int b = a/10000;
		int c =(a-(b*10000))/1000;
		int d =(a-(b*10000)-(c*1000))/100;
		int e =(a-(b*10000)-(c*1000)-(d*100))/10;
		int f =(a-(b*10000)-(c*1000)-(d*100)-(e*10))/1;
		System.out.println(b+" "+c+" "+d+" "+e+" "+f);
	}

}
