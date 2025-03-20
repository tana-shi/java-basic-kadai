package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	// 自分のじゃんけんの手を入力する
	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		while(true) {
			// 入力した内容を取得する
			String choice = scanner.next();
			if(!(choice.equals("r") || choice.equals("s") || choice.equals("p"))) {
				System.out.println("グーのr、またはチョキのs、またはパーのpを入力してください。");
				continue;
			}else {
				scanner.close();
				return choice;
			}
		}
	}
	
	// 対戦相手のじゃんけんの手が乱数で選ばれる
	public String getRandom() {
		// 配列にじゃんけんの手をセットする
		String[] jyanken = { "r", "s", "p" };
		// 乱数で相手の手を決める
		int index = (int)Math.floor(Math.random() * 3);
		System.out.println("乱数は " + index);
		String choice = jyanken[index];
		return choice;
	}
	
	// じゃんけんを行う
	public void playGame(String myChoice, String randomChoice) {
		String result = "";	//結果をいれる
		// じゃんけんの手を保持する
		HashMap<String, String> jyanken = new HashMap<>();
		jyanken.put("r", "グー");
		jyanken.put("s", "チョキ");
		jyanken.put("p", "パー");
		System.out.println("自分の手は" + jyanken.get(myChoice) + ",対戦相手の手は" + jyanken.get(randomChoice));
		
		// じゃんけんの判定
		// 自分が勝つ条件
		if ((myChoice.equals("r") && randomChoice.equals("s"))
				|| (myChoice.equals("s") && randomChoice.equals("p"))
				|| (myChoice.equals("p") && randomChoice.equals("r"))) {
			result = ("自分の勝ちです");
		// 自分が負ける条件
		} else if ((myChoice.equals("r") && randomChoice.equals("p"))
				|| (myChoice.equals("s") && randomChoice.equals("r"))
				|| (myChoice.equals("p") && randomChoice.equals("s"))) {
			result = "自分の負けです";
		} else {
		// あいこの条件
			result = "あいこです";
		}
		
		// 結果を表示
		System.out.println(result);
		
	}
}
