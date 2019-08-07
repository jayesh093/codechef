

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{

		  Scanner sc=new Scanner(System.in);
        int test=sc.nextInt();
        int N;
        while(test-->0){
            N=sc.nextInt();

            int A[]=new int[N];
            int B[]=new int[N];
            int F[]=new int[N];
            for (int i = 0; i < N; i++) {
                A[i]=sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                B[i]=sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                int sum=(A[i]*20)-(B[i]*10);
                if(sum<0){
                    F[i]=0;
                }else{
                   F[i]=sum;
                }
            }
             Arrays.sort(F);
             System.out.println(F[N-1]);
        }
	}
}
