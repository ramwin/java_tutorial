import java.Array
public class BasicArray {
    public static void main(String[] args){
        int []a = new int[3];
        int []copya = new int[3];
        a[0] = 3;
        a[1] = 9;
        a[2] = 8;
        System.out.println(a[0]);    
        for (int element : a){
            System.out.println(element);    // Read-only operation
        }
        Array.Copy( a, 0, copya,0, a.length);

        double []b = new double[]{1.0,2.0,3.14};
        System.out.println(b.length);    
    }
}
