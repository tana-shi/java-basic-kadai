package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
    private HashMap<String, String> wordMap;

    public Dictionary_Chapter21() {
        wordMap = new HashMap<>();
    }

    // 単語とその意味を辞書に追加するメソッド
    public void addWord(String word, String meaning) {
        wordMap.put(word, meaning);
    }

    // 単語の意味を取得するメソッド
    public String getMeaning(String word) {
        return wordMap.get(word);
    }
}