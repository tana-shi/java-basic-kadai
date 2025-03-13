package kadai_018;

public abstract class Kato_Chapter18 {
	// フィールド
	public String familyName = "加藤";
	public String givenName = "";
	public String address = "東京都中野区〇×";
	
	//【メソッド】共通の紹介
	public void commonIntroduce() {
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
	}
	
	//【メソッド】自己紹介
	public abstract void introduce();
	
	//【メソッド】紹介を実行
	public void execute() {
		this.commonIntroduce();
		this.introduce();
	}
	
}

