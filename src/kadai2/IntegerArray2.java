package kadai2;

public class IntegerArray2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] numbers = new int[] { 1, 7, 2, 7, 3 };

		int sum = 0;
		for (int n : numbers) {
			sum += n;
		}
		System.out.println("合計：" + sum);
	}
}
