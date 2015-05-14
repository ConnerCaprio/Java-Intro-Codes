/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package helllo.world.app;

import java.util.Scanner;

/**
 *
 * @author doublec
 */
public class HellloWorldApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
       
        System.out.println("hello world");
        // See: How to properly Hello World.
        print("let's do some math!");
        
       // print("hello world!");
        //two above lines are same but one uses variable to shorten
     
        print("Number 1:");
      int num1= input.nextInt();
     // print(Integer.toString(num1));
     //above is printing num1 but as text not an integer
     print("Number 2:");
      int num2=input.nextInt();
      print("The answer is........");
      
      print(Integer.toString(num1 + num2));
      print("Sebass I can do math! TeeHee I'm a computer");
      
              }
    
    public static void print(String s)
    {
     System.out.println(s)  ;
    }
}
