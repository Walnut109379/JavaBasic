package p29;

public class Start2 {

	public static void main(String[] args) {
		String s1 = "ABCXYZABC";
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.charAt(5));
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(2, 5));
		System.out.println(s1.indexOf(""));
		System.out.println(s1.lastIndexOf("B"));
		System.out.println(s1.startsWith("ABC, 6"));
	}
}
