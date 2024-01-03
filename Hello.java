import java.util.HashMap;
import java.util.Map;

class Key{
    private int id;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Key other = (Key) obj;
        if (id != other.id)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Key [id=" + id + "]";
    }

    public Key(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
class Value{
    private String data;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Value other = (Value) obj;
        if (data == null) {
            if (other.data != null)
                return false;
        } else if (!data.equals(other.data))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Value [data=" + data + "]";
    }

    public Value(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
}
class Hello{
    public static void main(String[] args) {
        Map<Key, Value> myMap = new HashMap<>();
        myMap.put(new Key(1), new Value("Hello"));
        myMap.put(new Key(2), new Value("World"));
        System.out.println("my map = " + myMap);

        for(Map.Entry<Key, Value> keyValueEntry:myMap.entrySet()){
            System.out.println("key value entry = " + keyValueEntry);
        }
    }
}