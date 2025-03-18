package kadai_021;

public class DictionaryExec_Chapter21 {
    public static void main(String[] args) {
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

        // 単語と意味のペアを追加
        dictionary.addWord("apple", "りんご");
        dictionary.addWord("peach", "桃");
        dictionary.addWord("banana", "バナナ");
        dictionary.addWord("lemon", "レモン");
        dictionary.addWord("pear", "梨");
        dictionary.addWord("kiwi", "キウイ");
        dictionary.addWord("strawberry", "いちご");
        dictionary.addWord("grapes", "ぶどう");
        dictionary.addWord("muscat", "マスカット");
        dictionary.addWord("cherry", "さくらんぼ");

        // 各単語の意味を取得して表示
        System.out.println("appleの意味は" + dictionary.getMeaning("apple"));
        System.out.println("peachの意味は" + dictionary.getMeaning("peach"));
        System.out.println("bananaの意味は" + dictionary.getMeaning("banana"));
        System.out.println("lemonの意味は" + dictionary.getMeaning("lemon"));
        System.out.println("pearの意味は" + dictionary.getMeaning("pear"));
        System.out.println("kiwiの意味は" + dictionary.getMeaning("kiwi"));
        System.out.println("strawberryの意味は" + dictionary.getMeaning("strawberry"));
        System.out.println("grapesの意味は" + dictionary.getMeaning("grapes"));
        System.out.println("muscatの意味は" + dictionary.getMeaning("muscat"));
        System.out.println("cherryの意味は" + dictionary.getMeaning("cherry"));
    }
}