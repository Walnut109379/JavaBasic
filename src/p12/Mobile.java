package p12;

public class Mobile extends Camera {
	//フィールド
	private String telNum;

	//コンストラクタ
	public Mobile() {
		//super();
		super(10);
		System.out.println("Mobileコンストラクタ");
	}

	public Mobile(String telNum, String Maker) {

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
