import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class IteratorExercise{
    public Collection<String> getFruits(){
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        return list;
    }
}
class Hello{
    public static void main(String[] args) {
        IteratorExercise fruitSupply = new IteratorExercise();
        Collection<String> fruits = fruitSupply.getFruits();
        Iterator<String> iterator = fruits.iterator();
        
        while(iterator.hasNext()){
            String fruitStr = iterator.next();
            System.out.println("fruitStr = " + fruitStr);
        }
    }
}