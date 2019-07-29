package code_cheff_problem;


import java.util.Scanner;
 class HP18 {
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
            int arry[]=new int[N];
            for (int i = 0; i < N; i++) {
                arry[i]=sc.nextInt();
            }
            if(a==b){
                System.out.println("BOB");
            }else if(b%a==0){
                System.out.println("BOB");
            }else if(b%a==0){
                System.out.println("ALICE");   
            }else{
                    int x = 0, y = 0, z = 0;
                for (int i = 0; i < N; i++) {
                    if (arry[i] % a == 0) {
                        x++;
                      }
                      if (arry[i] % b == 0) {
                        y++;
                      }
                      if (arry[i] % a == 0 && arry[i] % b == 0) {
                        z++;
                      }
                }
                    x -= z;
                    y -= z;
                    if (x < y) {
                        System.out.println("ALICE");
                    } else if (x == y) {
                      if (z!=0) {
                          System.out.println("BOB");
                      } else {
                          System.out.println("ALICE");
                      }
                    } else {
                        System.out.println("BOB");
                    }
            }
            //end of else
        }
     }
}