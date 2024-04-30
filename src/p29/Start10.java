package p29;

public class Start10 {

	public static void main(String[] args) {
		try {
			throw new Exception("Caution");
		} catch (Exception e) {
			//			System.out.println("Error");
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("例外処理終了");
		}

		System.out.println("終了");
	}
}
