package p33;

public class Sample01 {

	public static void main(String[] arg) {
		//		Canon c = Canon.OKU;
		//
		//		System.out.println(c);

		for (Canon c : Canon.values()) {
			System.out.println(c.getId() + "---" + c.getName());
		}
	}

}
