package p11;

public class Mobile extends Camera {
	//フィールド
	String telNum;

	//メソッド
	void call() {
		System.out.println("電話番号：" + telNum);
		System.out.println("話し中です！");
	}

}
