package p03;

public class TV {
	//フィールドの定義
	int ch; //チャンネル

	//メソッドの定義
	void changeChannel(int c) {
		ch = c; //chにcを代入しろ
	}

	void displayChannel() {
		System.out.println("チャンネル：" + ch);
	}
}
