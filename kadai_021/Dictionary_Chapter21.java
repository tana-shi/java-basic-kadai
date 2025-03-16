package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
    private HashMap<Integer,String> humanMap;

    public Dictionary_Chapter21() {
        humanMap = new HashMap<Integer,String>();
        humanMap.put(1,"りんご");
        humanMap.put(2,"桃");
        humanMap.put(3,"バナナ");
        humanMap.put(4,"レモン");
        humanMap.put(5,"梨");
        humanMap.put(6,"キウイ");
        humanMap.put(7,"いちご");
        humanMap.put(8,"ぶどう");
        humanMap.put(9,"マスカット");
        humanMap.put(10,"さくらんぼ");
    }

    public String getMeaning(int key) {
        return humanMap.get(key);
    }
}