package kadai02;

public class IntegerArray3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] numbers = new int[] { 1, 7, 2, 7, 3 };

		int count = 0;
		for (int n : numbers) {
			if (n != 7) {
				continue;
			} else
				count++;
		}
		System.out.println(count + "個ありました");
	}
}
