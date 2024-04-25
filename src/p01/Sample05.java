package p01;

public class Sample05 {
	//static int a; //メンバ変数

	public static void main(String[] args) {
		long a = 10;
		//long a = 10Lに暗黙的に型変換される

		float b = 3.14F;
		//double b = 3.14

		//int c = a; 
		//longからintには自動で変換されない

		int c = (int) a;
		//明示的に型変換している

		int d = (int) b; //小数から整数にできるが、精度が下がる

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
