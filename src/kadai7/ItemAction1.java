package kadai7;

public class ItemAction1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Item[] itemList = new Item[3];

		itemList[0] = new Item("ロボット掃除機", 50000);
		itemList[1] = new Item("ドラム式洗濯機", 200000);
		itemList[2] = new Item("液晶テレビ", 100000);

		for (Item i : itemList) {
			i.showInfo();
		}
	}

}
