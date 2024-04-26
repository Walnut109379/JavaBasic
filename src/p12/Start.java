package p12;

public class Start {

	public static void main(String[] args) {
		//Cameraクラスを継承したMoblieクラスのインスタンスを生成
		Mobile m = new Mobile("070-2348-1003", "Cannon");

		//フィールドとメソッドにアクセス
		//m.setTelNum("070-2348-1003");
		//m.setMaker("Canon");

		m.call();
		m.takePicture();
	}
}
