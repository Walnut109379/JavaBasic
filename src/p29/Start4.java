package p29;

public class Start4 {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("ABC");

		//		sb.append("12345678910123456");

		sb.insert(2, "XYZ");

		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.capacity());

	}
}
