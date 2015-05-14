/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hello.world.test;

import java.util.Scanner;

/**
 *
 * @author doublec
 */
public class HelloWorldTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in) ;
        print ("Hello World!");
        print("Number 1:");
        int num1 = input.nextInt();
         
        print("Number 2:");
        int num2 = input.nextInt();
        
        print("The answer is:");
        print(Integer.toString (num1 * num2));
        
        print("yay hah wayne I did it!");
    
    }
    
    
    public static void print(String s)
    {
       System.out.println(s);
    }
    
}
