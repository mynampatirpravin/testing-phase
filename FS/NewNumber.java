/*
Ramu was given the task of working with numbers. He will be given a number and he has to replace the number with its equivalent number. For example if he is given a number 123 he should give the output as 876. help him in writing the code
*/
import java.util.*;
class NewNumber
{
    //logic
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),sum=0,sum1=0;
        while(n>0)
        {
            int r=n%10;
            int f=9-r;
            sum=(sum*10)+f;
            n/=10;
        }
        while(sum>0)
        {
            int r=sum%10;
            sum1=(sum1*10)+r;
            sum/=10;
        }
        System.out.println(sum1);
        s.close();
    }
}
/*
input=23678
output=76321
*/