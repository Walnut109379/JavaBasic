package kadaiadd4;

public class Customer {
	int id;
	String name;

	void setData(String name) {
		this.id = 0;
		this.name = name;
	}

	void setData(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void showData() {
		System.out.println(id + "：" + name);
	}
}
