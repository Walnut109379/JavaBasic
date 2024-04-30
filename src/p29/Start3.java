package p29;

public class Start3 {

	public static void main(String[] args) {
		String s1 = "ABCDTHC";
		String s2 = "ABCXYZ";
		String s3 = " STU ";
		String s4 = "stu";

		System.out.println(s1.equals("ABCDTHC"));
		System.out.println(s1.equals("ABCXYZ"));

		System.out.println(s1 + s2);
		System.out.println(s1.concat(s2));
		System.out.println(s3);
		System.out.println(s3.trim());

		System.out.println(s1.toLowerCase());
		System.out.println(s4.toUpperCase());
	}
}
