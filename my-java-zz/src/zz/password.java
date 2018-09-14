package zz;
import java.util.Scanner;
public class password {
	public static void main(String[] args) {
		String userName = "admin";
		String password = "asjy";
		
		for(int i = 0;i<3;i++){
			System.out.println("ÊäÈëÓÃ»§Ãû");
			Scanner UserName = new Scanner(System.in);
			String un = UserName.nextLine();
			if(un.equals(userName)){
			System.out.println("ÊäÈëÃÜÂë");
			Scanner Password = new Scanner(System.in);
			String pa = Password.nextLine();
			if(pa.equals(password)){
				System.out.println("µÇÂ¼³É¹¦");
				break;
				
			}else {
				System.out.println("µÇÂ¼Ê§°Ü");
				
			}
		}else{
			System.out.println("µÇÂ¼Ê§°Ü");
		}
			
		}
		System.out.println("Á¬Ðø3´ÎµÇÂ¼Ê§°Ü£¬²»ÔÊÐíÔÙµÇÂ¼");
		
		
}
}
