/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package code_cheff_problem;

import java.util.LinkedList; 
import java.util.Queue; 
import java.util.Scanner;

/**
 *
 * @author jayesh
 */
// Java orogram to demonstrate working of Queue 
// interface in Java 

public class upGrade 
{ 
public static void main(String[] args) 
{   
     
        class list{
         int id;
         String  name;
         float marks;
        }
        
        
	Queue<list> q = new LinkedList<>(); 
        list list = null;
        Scanner sc=new Scanner(System.in);

        int test_cases=sc.nextInt();
	String name = null;
        float marks;
        
        for(int i=0;i<test_cases; i++) 
        {
            name=sc.next();
            if(name.equals("SERVED"))
            {
                int size = q.size(); 
                for (int j = 0; j < size; j++) {
                    
                }
            }else{
            list.id=i;
            list.marks=sc.nextFloat();
            list.name=name;
            q.add(list);
            }
            
        }
    } 
} 

