public class UseSuper {
    public static void main(String[] args){
        Student john = new Student();
        john.name = "john";
        john.school = "High School";
        john.score = 90;
        john.sayHello();
        john.sayHello(john);
        System.out.println(john.isGood());    
    }
}
class Student extends Person{   // A student must be a Person
    String school;
    int score;
    boolean isGood() {
        return score > 80;
        };
    @Override   // This also can be omitted
    void sayHello(){
        super.sayHello();   // use the sayHello of father class first, then use Students's self sayHello
        System.out.println("Hello! My name is "+ name+". My school is "+this.school);
        }
    void sayHello(Student anotherStudent){ // The signature is differen from sayHello (they have different parameters), So this will not override the sayHello function above
        System.out.println("Hi!");
        System.out.println("Hi, we are schoolmates");
        }
}
class Person {  // define a class named Person
    String name;    // define porperties of Person
    int age;
    void sayHello() {   // define a method of Person
        System.out.println("Hello! My name is "+name);
        }
}
