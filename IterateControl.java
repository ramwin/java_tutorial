public class IterateControl {
    public static void main(String[] args){
        /*
        label1: { ......
        label2:     { ......
        label3:         { ......
                            break label2;   // return to loop label 2 ;
                            ....
                        }
                        continue label1;   // go to label1 and 
                    }
                }
            */
        System.out.println(" print the prime between 100 and 200");
        int n=0;
        outlabel: for(int i=100;i<=200;i++){
            for(int j=2;j<i;j++){
                if ( i%j==0 )
                    continue outlabel;
            }
            System.out.println(" "+i);
        }
    }
}
