package kadaiadd6;

public class Warrior extends Human {
	private String type;

	public Warrior() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public Warrior(String type, String name) {
		super(name);
		this.type = type;
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void info() {
		System.out.println("種別：" + type + "　名前：" + getName());
	}

	public void attack() {
		System.out.println("「" + type + "」は攻撃した");
	}

}
