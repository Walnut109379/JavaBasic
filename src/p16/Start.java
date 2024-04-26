package p16;

public class Start {

	public static void main(String[] args) {

		Animal a1 = new Animal();

		Bird b1 = new Bird();

		Animal a2 = new Bird();
		//親クラスの参照変数で、子クラスのオブジェクトを参照できる

		Bird b2 = new Animal();
		//子クラスの参照変数では、親クラスのオブジェクトを参照できない

		Bird b3 = a1;
		//子に親を入れているのでNG

		Bird b4 = (Bird) a1;
		//実行時にエラーになる.

		Bird b5 = (Bird) a1;
		//(Bird)でキャストしているのでOK
	}
}
