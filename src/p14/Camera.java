package p14;

public class Camera {
	//フィールド
	protected String maker;

	//コンストラクタ
	public Camera() {
		System.out.println("Cameraコンストラクタ1");
	}

	public Camera(String maker) {
		this.maker = maker;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	//メソッド
	public void takePicture() {
		System.out.println("メーカー：" + maker);
		System.out.println("写真撮影中です！");
	}

}
