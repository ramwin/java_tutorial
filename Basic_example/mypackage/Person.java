package mypackage;  // The Person class is included in the mypackage
public class Person {  // define a class named Person
    public String name;    // define porperties of Person
    public int age;
    void sayHello() {   // define a method of Person
        System.out.println("Hello! My name is "+name);
        System.out.println("Hello! I'm "+ this.age + " years old.");
        }
}
