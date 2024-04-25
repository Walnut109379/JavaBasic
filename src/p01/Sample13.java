package p01;

public class Sample13 {

	public static void main(String[] args) {
		long data = 2;

		//switch文
		switch (data) {
		case 1:
			System.out.println("1です");
			break;
		case 2:
			System.out.println("2です");
			break;
		case 3:
			System.out.println("3です");
			break;
		default:
			System.out.println("該当なし");
		}

		//if文
		if (data == 1) {
			System.out.println("1です");
		} else if (data == 2) {
			System.out.println("2です");
		} else if (data == 3) {
			System.out.println("3です");
		} else {
			System.out.println("該当なし");
		}
	}
}