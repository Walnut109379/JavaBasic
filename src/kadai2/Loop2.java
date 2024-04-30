package kadai2;

public class Loop2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for (int n = 1; n <= 10; n++) {
			if ((n % 2) == 1)
				continue;
			System.out.println(n);
		}
	}
}
