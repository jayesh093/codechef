package code_cheff_problem;


import java.util.Scanner;
 class HP181 {
     public static void main(String [] args){
       
         Scanner sc=new Scanner(System.in);
        
         int Test_case;
        
         Test_case = sc.nextInt();
         while(Test_case-- > 0)
        {
            int BOB=0,ALICE=0; 
            int N,a,b;
            N=sc.nextInt();
            a=sc.nextInt();
            b=sc.nextInt();
            long  arry[]=new long[N];
            for (int i = 0; i < N; i++) {
                arry[i]=sc.nextLong();
            }
            if(a==b){
                System.out.println("BOB");
            }else if(b%a==0){
                System.out.println("BOB");
            }else if(b%a==0){
                System.out.println("ALICE");   
            }else{
                int C_BOB = 0,C_ALICE=0,C_AB=0;
                for (int i = 0; i < N; i++) {
                    if(arry[i]%a==0 && arry[i]%b==0){
                    C_AB++;
                    }
                    else if(arry[i]%a==0){
                        C_BOB++;
                    }else if(arry[i]%b==0){
                        C_ALICE++;
                    }
                }
               if(C_BOB==C_ALICE){
                   if(C_AB%2==0){
                       System.out.println("ALICE");
                   }else{
                       System.out.println("BOB");
                   }
               }else if(C_BOB > C_ALICE){
                   if(C_BOB-C_ALICE==1){
                       if(C_AB%2!=0){
                           System.out.println("ALICE");
                       }else{
                           System.out.println("BOB");
                       }
                   }else{
                         System.out.println("BOB");
                   }
                }else{
                   if(C_ALICE-C_BOB==1){
                       if(C_AB%2!=0){
                           System.out.println("BOB");
                       }else{
                           System.out.println("ALICE");
                       }
                   }else{
                         System.out.println("ALICE");
                   }
               }
               
         }
            
        }
     }
}