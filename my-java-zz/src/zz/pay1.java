package zz;
import java.util.Scanner;
public class pay1 {
	public static void main(String[] args) {
		System.out.println("�Ƿ����Ϊ��һλ�˿ͽ���");
		String next ="y" ;
		Scanner con = new Scanner(System.in);
		String cont = con.nextLine();
		do{
			System.out.println("���ԭ���ѽ��");
		Scanner price = new Scanner(System.in);
		double pri = price.nextDouble();
		if(pri<2000) {
			System.out.println("ʵ�����ѽ�"+pri);
			
			
		}else if(pri>=2000) {
			System.out.println("���Ƿ��ǻ�Ա���������롰1��,���������롰0��");
			Scanner vip = new Scanner(System.in);
			int v = vip.nextInt();
			if(v==1) {
				System.out.println("�𾴵Ļ�Ա���ã���ѡ�����֧����ʽ������1-3ѡ�񣩣�1�ֽ�2���ÿ���3��ǿ�");
				Scanner pay = new Scanner(System.in);
				int paymeil =  pay.nextInt();
				switch(paymeil) {
				case 1:
					System.out.println("ʵ�����ѽ��Ϊ��"+(pri*0.8));
					
					
					break;
				case 2:
					System.out.println("ʵ�����ѽ��Ϊ��"+(pri*0.85));
					
					break;
				case 3:
					System.out.println("ʵ�����ѽ��Ϊ��"+(pri*0.9));
					
					break;
					default :
						System.out.println("��ѡ��1-3");
				}
			}else if(v==0) {
				double zz =pri*0.95;
				System.out.println("�����Ǳ����Ա����ֻ��ʹ���ֽ�֧��");
				System.out.println("ʵ�����ѽ�"+zz);
				
			}else {
				System.out.println("�������");
			}
		}else {
			System.out.println("�������");
		}
	
		}while(cont.equals(next));
		

	}

}



