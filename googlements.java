import java.io.*;
import java.util.*;

class googlements
{
public static void main(String[] args) throws IOException
    {		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
        int n = Integer.parseInt(br.readLine());

        String ans="";

        for( int i=0;i<n;i++)
        {
            String num = br.readLine();
            int[] index = new int[num.length()];
            

            int sum = 0;
            int numans=1;
            int fact0= fact(num.length());
            int fact=0;

            if(Integer.parseInt(num)!=1)
            {for( int j=0;j<num.length();j++)
            {
                index[j]= num.charAt(j)-48;
                sum+=index[j];
            }

            while(sum<=num.length())
            {  fact=fact0; 
                for(int j=0;j<num.length();j++)
                {
                    if(index[j]!=0)
                    fact /= fact(index[j]);
                }
                numans+=fact;

                int[] copy = new int[num.length()];
                int m =0;
                for(int j=0;j<num.length();j++)
                {
                    for(int q=0;q<index[j];q++)
                    {
                        copy[m++]=j+1;
                    }
                }
                sum=0;int flag=0;
                for(int j=0;j<num.length();j++)
                {   
                    if(index[j]!=copy[j])
                    flag=1;

                    index[j]=copy[j];
                    sum+=index[j];
                }

                if(flag==0)
                break;

            }}
            ans+=(numans)+"\n";
            
        }
        System.out.println(ans);
        
}
    }


    public static int fact(int n)
    {   if(n>1)
        return n*(n-1);
        else
        return 1;
    } 
}         
