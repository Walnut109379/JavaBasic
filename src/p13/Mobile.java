package p13;

public class Mobile extends Camera {
	//フィールド
	private String telNum;

	//コンストラクタ
	public Mobile() {
	}

	public Mobile(String telNum, String maker) {
		this.telNum = telNum;
		super.maker = maker;
	}

	public String getTelNum() {
		return telNum;
	}

	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}

	//メソッド
	public void call() {
		System.out.println("電話番号：" + telNum);
		System.out.println("話し中です！");
	}

}
