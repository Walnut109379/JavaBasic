package kadai7;

public class ItemAction2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Item[] itemList = new Item[3];

		itemList[0] = new Item("ロボット掃除機", 50000);
		itemList[1] = new Book("鬼滅の包丁", 500, "Go峠");
		itemList[2] = new Book("1ピース", 500, "小田");

		for (Item i : itemList) {
			i.showInfo();
			System.out.println("---");
		}
	}

}
