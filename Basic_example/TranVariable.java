public class TranVariable {
    public static void main(String[] args){
        MyDate m = new MyDate(2003,9,22);
        MyDate n = m;
        n.addYear();
        m.display();
        n.display();
    }
}
class MyDate{
    int year=0;
    int month;
    int day;
    public void addYear(){
        year ++;
    }
    public void display(){
        System.out.println(year+"-"+month+"-"+day);
    }
    public MyDate(int a, int b, int c){
        year=a;
        month=b;
        day=c;
        }
}
