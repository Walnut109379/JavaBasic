package exam10;

public class Exam3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int a1 = getSquareArea(3, 3);
		System.out.println(a1);

		double a2 = getTriangleArea(3, 3);
		System.out.println(a2);
	}

	public static int getSquareArea(int x, int y) {
		return x * y;
	}

	public static double getTriangleArea(int x, int y) {
		return (double) x * (double) y / 2;
	}
}
