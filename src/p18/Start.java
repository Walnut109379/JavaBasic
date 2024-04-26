package p18;

public class Start {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Human[] canon = new Human[2];

		canon[0] = new Oku();
		canon[1] = new Kudo();

		canon[0].eat();
		canon[1].eat();

		System.out.println("---------------------");

		for (int i = 0; i < canon.length; i++) {
			canon[i].eat();
		}

		System.out.println("---------------------");

		for (Human h : canon) {
			h.eat();
		}
	}

}
