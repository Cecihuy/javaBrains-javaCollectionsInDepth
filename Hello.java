import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }
        
    // /* write equals */
    // public boolean equals(Object o){
    //     if(o == this){
    //         return true;
    //     }
    //     if(o == null || this.getClass() != o.getClass()){
    //         return false;
    //     }
    //     Person other = (Person) o;
    //     return 
    //         this.age == other.age
    //         && Objects.equals(this.firstName, other.firstName)
    //         && Objects.equals(this.lastName, other.lastName);
    // }
    // /* write hashCode */
    // public int hashCode(){
    //     return Objects.hash(firstName, lastName, age);
    // }
}
class PersonComparator implements Comparator<Person>{
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }    
}
class Hello{
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Foo", 45));
        people.add(new Person("Bar", 31));
        people.add(new Person("Baz", 22));

        System.out.println("sort using Comparable");
        Collections.sort(people);

        for(Person efl:people){
            System.out.println(efl);
        }

        System.out.println("sort using Comparator");
        PersonComparator nameComparator = new PersonComparator();
        Collections.sort(people, nameComparator);

        for(Person efl:people){
            System.out.println(efl);
        }
    }
}