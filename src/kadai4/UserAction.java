package kadai4;

public class UserAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u1 = new User();
		
		u1.name = "山田太郎";
		u1.age = 20;
		
		u1.showInfo();
		
		System.out.println("---");
		
		User u2 = new User();
		
		u2.name = "鈴木一郎";
		u2.age = 25;
		
		u2.showInfo();
	}
}
