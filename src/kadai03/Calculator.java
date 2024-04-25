package kadai03;

public class Calculator {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int a = add(3, 7);
		System.out.println(a);

		int b = sub(3, 7);
		System.out.println(b);

		double c = avg(3, 7);
		System.out.println(c);
	}

	static int add(int x, int y) {
		int result = (x + y);
		return result;
	}

	static int sub(int x, int y) {
		int result = (x - y);
		return result;
	}

	static double avg(int x, int y) {
		double result = ((x + y) / 2);
		return result;
	}

}
