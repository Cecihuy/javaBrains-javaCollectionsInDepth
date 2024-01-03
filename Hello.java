import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

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
            try{
                if(iterator.next().equals("banana"))                
                    iterator.remove();
            }catch(NoSuchElementException e){
                System.out.println("skipCuy");
            }
            System.out.println("fruitStr = " + fruitStr);
        }
    }
}