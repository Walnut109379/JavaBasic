package kadai6;

public class ItemAction {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Item i1 = new Item();
		i1.setName("ロボット掃除機");
		i1.setPrice(50000);

		i1.showInfo();

		System.out.println("---");

		Item i2 = new Item();
		i2.setName("洗濯機");
		i2.setPrice(200000);

		i2.showInfo();
	}

}
