public class Iterate {
    public static void main(String[] args){
        // for loop
        int result = 0;
        for(int i=1; i<=100; i++){
            result += i;
        }
        System.out.println("result=" + result);    

        // while loop
        int result2 = 0;
        int i2 = 1;
        while(i2<=100) {
            result2 += i2;
            i2++;
        }
        System.out.println("result2=" + result2);

        // do loop
        int result3 =0;
        int i3=1;
        do{
            result3 += i3;
            i3++;
        }while(i3<=100);
        System.out.println("result3=" + result3);
    }
}
