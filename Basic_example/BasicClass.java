public class BasicClass {
    public static void main(String[] args){
        System.out.println("Hello World!");    
        Person p1 = new Person("john",18);    // p is a person
        Person2 p = new Person2();    // p is a person2
        p.name = "john";
        p.age = 18;
        System.out.println( p.name );
        p.sayHello();
        p1.sayHello();
    }
}

class Person {  // define a class named Person with constructor
    String name;    // define porperties of Person
    int age;
    void sayHello() {   // define a method of Person
        System.out.println("Hello! My name is "+name);
        System.out.println("Hello! I'm "+ this.age + " years old.");
        }
    Person( String n, int a){
        name = n;
        age = a;
        }
}
class Person2 {  // define a class named Person without constructor
    String name;    // define porperties of Person
    int age;
    void sayHello() {   // define a method of Person
        System.out.println("Hello! My name is "+name);
        System.out.println("Hello! I'm "+ this.age + " years old.");
        }
}
