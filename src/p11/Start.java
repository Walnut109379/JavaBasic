package p11;

public class Start {

	public static void main(String[] args) {
		//Cameraクラスを継承したMoblieクラスのインスタンスを生成
		Mobile m = new Mobile();

		//フィールドとメソッドにアクセス
		m.telNum = "070-2348-1003";
		m.maker = "Canon";

		m.call();
		m.takePicture();
	}
}
