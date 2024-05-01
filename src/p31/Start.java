package p31;

import java.util.ArrayList;
import java.util.List;

public class Start {

	public static void main(String[] args) {
		//Canon[] list = new Canon[2];

		List<Canon> list = new ArrayList<>();

		list.add(new Oku());
		list.add(new Kudo());

		for (Canon c : list) {
			c.work();
			c.salary();
		}
	}
}
