package zz;
import java.util.Scanner;
public class password {
	public static void main(String[] args) {
		String userName = "admin";
		String password = "asjy";
		
		for(int i = 0;i<3;i++){
			System.out.println("�����û���");
			Scanner UserName = new Scanner(System.in);
			String un = UserName.nextLine();
			if(un.equals(userName)){
			System.out.println("��������");
			Scanner Password = new Scanner(System.in);
			String pa = Password.nextLine();
			if(pa.equals(password)){
				System.out.println("��¼�ɹ�");
				break;
				
			}else {
				System.out.println("��¼ʧ��");
				
			}
		}else{
			System.out.println("��¼ʧ��");
		}
			
		}
		System.out.println("����3�ε�¼ʧ�ܣ��������ٵ�¼");
		
		
}
}
