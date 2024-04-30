package p29;

public class Start5 {

	public static void main(String[] args) {
		int a = 100;

		//Integer x = new Integer(a);
		Integer x = a;

		//int b = x.intValue();
		int b = x;

		System.out.println(x);

		System.out.println(b);

		System.out.println(Integer.toBinaryString(b));
	}
}
