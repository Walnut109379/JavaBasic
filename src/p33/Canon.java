package p33;

public enum Canon {
	OKU(1, "奥"), ENDO(2, "遠藤"), KUDO(3, "工藤");

	private int id;
	private String name;

	Canon(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
