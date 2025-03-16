package kadai_021;

public class DictionaryExec_Chapter21 {
    public static void main(String[] args) {
        Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();

        System.out.println("appleの意味は" + dictionary.getMeaning(1));
        System.out.println("peachの意味は" + dictionary.getMeaning(2));
        System.out.println("bananaの意味は" + dictionary.getMeaning(3));
        System.out.println("lemonの意味は" + dictionary.getMeaning(4));
        System.out.println("pearの意味は" + dictionary.getMeaning(5));
        System.out.println("kiwiの意味は" + dictionary.getMeaning(6));
        System.out.println("strawberryの意味は" + dictionary.getMeaning(7));
        System.out.println("grapesの意味は" + dictionary.getMeaning(8));
        System.out.println("muscatの意味は" + dictionary.getMeaning(9));
        System.out.println("cherryの意味は" + dictionary.getMeaning(10));
    }
}