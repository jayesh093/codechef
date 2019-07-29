/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code_cheff_problem;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author jayesh
 */
public class FANCY {
    public static void main(String [] args) throws IOException{
       String ini;
       Scanner sc=new Scanner(System.in);
        int Test_case,flage;
         Test_case=Integer.parseInt(sc.nextLine()); 
        while(Test_case-- > 0)
        {
            ini=sc.nextLine();
            String[] array =ini.split(" ");
            
             flage=0;  
             for (int i = 0; i < array.length; i++) {
                 if(array[i].equals("not")){
                     flage=1;
                     break;
                 }
            }
            if(flage==1){
                System.out.println("Real Fancy");
            }else{
                System.out.println("regularly fancy");
            }
           
         
        }
    }
}
