public class Interface implements Collection{   // Interface is a class which use Collection interface
    public static void main(String[] args){
        // all the interface is public and abstract
        System.out.println("Hello World!");    
    }
    public void add (Object obj){
        }
    public void delete (Object obj){
        }
    public Object find (Object objj){
        }
    public int currentCount {
        }
}
interface Collection {
    void add (Object obj);
    void delete(Object obj);
    Object find (Object obj);
    int size ();
    }
