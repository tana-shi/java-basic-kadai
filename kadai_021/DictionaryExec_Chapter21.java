package kadai_021;

public class DictionaryExec_Chapter21 {
    public static void main(String[] args) {
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
        
        // 検索する単語のリスト
        String[] searchWords = {"apple", "banana", "grape", "orange"};

        for (String word : searchWords) {
            if ("orange".equals(word)) {
                System.out.println("orangeは辞書に存在しません");
                continue;
            }

            // 辞書で意味を検索して出力
            String meaning = dictionary.getMeaning(word);
            if (meaning != null) {
                System.out.println(word + "の意味は" + meaning);
            } else {
                System.out.println(word + "は辞書に存在しません");
            }
        }
    }
}