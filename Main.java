import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int[] num = new int[n+1]; 
        
        //将待筛选的数字存入数组，为了方便，将对应的数字存入编号相同的位置，比如2存入num[2]
        int i=0;
        for(i=1; i<n+1; i++)
            num[i]=i;
        num[0]=1;
        
        i = 1;
        int j = 1;
        //n_prime用于判断最后一个数字是否为合数，若为合数，赋值为1；
        int n_prime = 0;
        
        //循环的总体思路为，将2的倍数置为1,3的倍数置为1,5的倍数置为1...每次输出最前面的非1数值。
        //算法的思想为所有合数最终都可以转化为质因子相乘
        while(j<n) // j从1开始
        {
           
            i=j;
            
            while(j<n&num[j]==1)  // 
                j++;
            
            
            while(i<=n)  // 从i的位置开始用j去取余，如果能除就设置成1
            {
                if(num[i]%j==0)
                    num[i]=1;
                i++;
            }
            
            //循环的最后一次，需判断最后的一个数值是否为合数，若为合数则不必输出，直接跳出循环
            if (j==n)
            {
                for(i=2;i<=Math.sqrt(n);i++)
                {
                    if(j%i==0)
                    {
                        n_prime=1;
                        break;
                    }
                }   
            }
            if (n_prime==1)
                    break;
            
            System.out.println(j);
        } 
        
    }
}
