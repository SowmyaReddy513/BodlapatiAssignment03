package question21;

import java.io.*;

public class SerializationExample {
    public static void main(String[] args) {
        // create an object
        Person person = new Person("Sowmya", "Reddy", 25);

        // serialize the object
        try {
            FileOutputStream fileOut = new FileOutputStream("example.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(person);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in person.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

        // deserialize the object
        try {
            FileInputStream fileIn = new FileInputStream("person.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Person deserializedPerson = (Person) in.readObject();
            in.close();
            fileIn.close();
            System.out.println("Deserialized data: " + deserializedPerson.toString());
        } catch (IOException i) {
            i.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Person class not found");
            c.printStackTrace();
        }
    }
}

class Person implements Serializable {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String toString() {
        return "Name: " + this.firstName + " " + this.lastName + ", Age: " + this.age;
    }
}
