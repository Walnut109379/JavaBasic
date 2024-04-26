package kadai6;

public class BookAction2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Item[] item = new Item[3];

		item[0] = new Item("ロボット掃除機", 50000);
		item[1] = new Book("鬼滅の包丁", 450, "GO峠こよはる");
		item[2] = new Book("1ピース", 500, "尾田A一郎");

		for (Item i : item) {
			i.showInfo();
			System.out.println("---");
		}
	}
}
