package adaptAssignment.genericsAssignment;

import java.util.Date;

class Pair<T> {
    String key;
    T value;

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

public class ques4 {
    public static void main(String[] args) {

        // Restriction is provided by passing date type as generics
        Pair<String> Obj1 = new Pair<>();
        Obj1.setKey("1");
        Obj1.setValue("Hello");

        Pair<Date> Obj2 = new Pair<>();
        Obj2.setKey("Today is");
        Obj2.setValue(new Date());


    }
}
