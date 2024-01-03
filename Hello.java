import java.util.SortedSet;
import java.util.TreeSet;

class Hello{
    public static void main(String[] args) {
        SortedSet<String> vocab = new TreeSet<>();
        vocab.add("mango");
        vocab.add("banana");
        vocab.add("pineapple");
        vocab.add("apple");

        String firstWord = vocab.first();
        String lastWord = vocab.last();

        System.out.println("vocab = " + vocab);
        System.out.println("firstWord = " + firstWord);
        System.out.println("lastWord = " + lastWord);

        System.out.println(vocab.headSet("mango"));
        System.out.println(vocab.tailSet("mango"));
    }
}