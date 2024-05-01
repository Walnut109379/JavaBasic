package p32;

import java.util.ArrayList;
import java.util.List;

public class Start {

	public static void main(String[] args) {
		//Controller c = new Controller();
		//抽象クラスはインスタンスを生成できない

		//Controller[] list = new Controller[2];
		List<Controller> list = new ArrayList<>();

		list.add(new Baseball());
		list.add(new Mario());

		for (Controller con : list) {
			con.pushA();
			con.pushB();
			System.out.println("---------");
		}

	}
}
