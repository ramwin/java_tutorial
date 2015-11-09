public class HelloWorld {
    public static void main(String[] args){
        // static:  dont't belong to any instance, can access static variable by instance, or class. System.in, System.out 
        // final:   Can't be changed
        // abstract:    Can't be an instance, can't create a new one
        System.out.println("Hello World!");    
        double static final pi = 3.14159;    // this is a constant
        System.out.println(pi);
    }
}
class PersonStatic {
    static long totalNum; // Static, you can't say a person is totalNum, So, you can't use this and super.
    int age;
    String Name;
    }
class final Constant {
    // it can't be inheritaned or override
    }
