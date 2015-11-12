public class SwitchCase {
    public static void main(String[] args){
        int x=2;
        switch(x){
            case 1:
                System.out.println("x is equal to 1");
                break;
            case 2:
                System.out.println("x is equal to 2");
                break;
            case 3:
                System.out.println("x is equal to 3");
                break;
            default:    // this can be None
                System.out.println("x is not belong to 1,2,3");
                break;
        }
    }
}
