package p14;

public class Mobile extends Camera {
	//フィールド
	private String telNum;

	//コンストラクタ
	public Mobile() {
	}

	public Mobile(String telNum, String maker) {
		super(maker);
		this.telNum = telNum;
		//setMaker(maker);
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
