package streamsPractice;

import java.util.Arrays;
import java.util.List;


//the Stream API is a powerful set of tools used to process collections of objects.
// A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.
//A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.
//Streams don’t change the original data structure, they only provide the result as per the pipelined methods.
//if stream consume once you cannot use it again.
//A stream consists of source followed by zero or more intermediate methods combined together (pipelined) and
// a terminal method to process the objects obtained from the source as per the methods described.
//stream is a different view of collections.



public class streamsExample {
    static class Person{
        String firstName;
        String lastName;
        int age;

        public Person(String firstName, String lastName, int age) {
            this.firstName=firstName;
            this.lastName=lastName;
            this.age=age;
        }
    }
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("charles","dickens",60),
                new Person("lewis","carroll",42)
        );

        people.stream()
                .filter(p->p.lastName.startsWith("c"))
                .forEach(p-> System.out.println(p.firstName));
    }
}
