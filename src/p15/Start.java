package p15;

public class Start {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Oku o = new Oku();
		o.name = "奥";
		o.age = 22;
		o.eat(); //親のHumanクラスのeatメソッドが先に実行される
		o.cook();

		Kudo k = new Kudo();
		k.name = "工藤";
		k.age = 23;
		k.eat();
		k.listen();
	}

}
