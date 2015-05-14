/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package guessthenumber;

import java.util.Scanner;

/**
 *
 * @author doublec
 */
public class Guessthenumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
       
        for(int numlist=1; numlist <= 12; numlist++)
        {
            print(Integer.toString(numlist));
        }
        print("Pick One....MWAHAHAHAHAHA");
        
       int guess; 
       while (true) {
           if (input.hasNextInt()) {
               guess = input.nextInt();
               if (guess == 10)
               {
                   print("YOU WIN!!!");
                   break;
               }
               else if  (guess <= 0 || guess > 12) {
                   print("You're stupid.");
               }
               
               print ("YOU LOSE!!!");
               break;
           }
           else {
               input.nextLine();
               print("Really. Play the game");
           }
        }
       

             
    }
    
    public static void print(String s)
    {
        System.out.println(s);
    }
    
}
