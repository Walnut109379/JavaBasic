package p29;

public class Start11 {

	public static void main(String[] args) {
		//		try {
		//			throw new Exception("Caution");
		//		} catch (Exception e) {
		//			//			System.out.println("Error");
		//			System.out.println(e.getMessage());
		//			e.printStackTrace();
		//		} finally {
		//			System.out.println("例外処理終了");
		//		}
		//
		//		System.out.println("終了");

		try {
			System.out.println(waru(10, 0));
		} catch (Exception e) {
			// TODO 自動生成された catch ブロック
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public static int waru(int x, int y) throws Exception {
		if (y == 0) {
			throw new Exception("0で割れないよ");
		}
		return x / y;
	}
}
