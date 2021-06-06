/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fizzbuzz;

import java.util.Scanner;

/**
 *
 * @author hp1
 */
public class divisible {
    public static void main(String[] args) {
        
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
        String stroutput="";
        if((num%3==0)||(num%5==0))
        {
         if(num%3==0)
        {
            stroutput=stroutput+"FIZZ";
            
        }
        if(num%5==0)
        {
            stroutput=stroutput+"BUZZ";
        }   
        }
        else{
            stroutput=stroutput+"NOT DIVISIBLE";
        }
         System.out.println(stroutput);
         
                 
                 
    }
    
}
