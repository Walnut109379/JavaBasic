package kadai4;

import java.util.Scanner;

public class UserAction2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("会員を登録します");
	
		User u = new User();
		System.out.print("名前：");
		u.name =scan.next(); 
				
		System.out.print("年齢：");
		u.age = scan.nextInt();
		
		System.out.println("---");
		
		System.out.println("会員を登録しました");
		
		u.showInfo();
	}
}

