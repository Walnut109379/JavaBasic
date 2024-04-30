package p29;

public class Start8 {

	public static void main(String[] args) {
		try {
			System.out.println(10 / 0);
			System.out.println(Integer.parseInt("A100"));
		} catch (ArithmeticException e) {
			System.out.println("0で割れないよ！");
		} catch (Exception e) {
			System.out.println("Error！");
		} finally {
			System.out.println("例外処理終了");
		}

		System.out.println("終了");
	}
}
