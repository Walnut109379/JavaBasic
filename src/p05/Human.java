package p05;

public class Human {
	//メソッドの定義
	void eat() {
		System.out.println("しゃーなし自腹で食べる…");
	}

	void eat(int money) {
		System.out.println(money + "円もらったよ！");
		System.out.println("叙々苑行くぞ～＾＾");
	}

	void eat(String bento) {
		System.out.println(bento + "もらったよ！");
		System.out.println("弁当うま！");
	}
}
