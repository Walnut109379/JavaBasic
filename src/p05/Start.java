package p05;

public class Start {

	public static void main(String[] args) {
		//Humanクラスのインスタンスを生成
		Human h = new Human();

		h.eat();
		h.eat(20000);
		h.eat("黒毛和牛弁当");
	}
}
