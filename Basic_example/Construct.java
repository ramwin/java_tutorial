import mypackage.Person;
public class Construct {
    public static void main(String[] args){
        Person p = new Person(){{ age=18; name="liming"; }};
        System.out.println("Hello World!");    
    }
}
