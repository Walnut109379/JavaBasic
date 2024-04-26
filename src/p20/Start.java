package p20;

public class Start {

	public static void main(String[] args) {
		//Controller c = new Controller();
		//抽象クラスはインスタンスを生成できない

		Controller[] list = new Controller[2];

		list[0] = new Baseball();
		list[1] = new Mario();

		for (Controller con : list) {
			con.pushA();
			con.pushB();
			System.out.println("---------");
		}

	}
}
