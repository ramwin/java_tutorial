public class IfElse {
    public static void main(String[] args){
        int year=2003;
        if ( (year%4==0 && year%100 !=0) || (year%400==0) )
            System.out.println(year+"is a leap year.");    
        else
            System.out.println(year+"is not a leap year.");    
        int year2=2000;
        if ( (year2%4==0 && year2%100 !=0) || (year2%400==0) )
            System.out.println(year2+"is a leap year.");    
        else
            System.out.println(year2+"is not a leap year.");    
    }
}
