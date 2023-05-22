package adaptAssignment.collectionAssignment;

import java.util.Map;
import java.util.TreeMap;

enum Gender {
    Male,
    Female
}

class Contact {
    Long phoneNumber;
    String name;
    String email;
    Gender gender;

    //constructor
    public Contact(long phoneNumber, String name, String email, Gender gender) {
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {

        return "Name : " + name +
                ",  PhoneNumber : " + phoneNumber +
                ",  Email : " + email +
                ",  Gender : " + gender;
    }

}
public class ques1 {
    public static void main(String[] args) {

        TreeMap<Long, Contact> map = new TreeMap<>((o1, o2) -> Long.compare(o2, o1));

        map.put((long) 994567892, new Contact(994567892, "TushAr", "tushar@gmail.com", Gender.Male));
        map.put((long) 994567893, new Contact(994567893, "aa", "aa@gmail.com", Gender.Male));
        map.put((long) 994567891, new Contact(994567891, "bb", "bb@gmail.com", Gender.Female));
        map.put((long) 994567895, new Contact(994567895, "cc", "cc@gmail.com", Gender.Female));
        map.put((long) 994567894, new Contact(994567894, "dd", "dd@gmail.com", Gender.Male));


        // Fetch all the keys and print them
        for (long key : map.keySet()) {
            System.out.println(key);
        }

        // Fetch all the values and print them
        for (Contact contact : map.values()) {
            System.out.println(contact.toString());
        }

        for (Map.Entry<Long, Contact> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue().toString());
        }
    }
}
