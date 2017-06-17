import java.io.*;
import java.util.*;



static int sum(String num)
{
    int sum=0;
    for(int i=0;i<num.length();i++)
    {
        sum += num.charAt(i)-48;
    }
    return sum;
}

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

            for( int j=0;j<num.length();j++)
            {
                index[j]= num.charAt(j)-48;
            }
            while(sum(index)<index.length)
            {
                
            }


        }
