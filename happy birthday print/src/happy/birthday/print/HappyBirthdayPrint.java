/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package happy.birthday.print;

import java.util.Scanner;

/**
 *
 * @author doublec
 */
public class HappyBirthdayPrint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //        System.out.println("YOU SAID: " + input.nextLine());
//        
//        System.out.println("yes");
//        
//        String startingLine = "happy birthday " + input.nextLine() + "!";
//        
//        for(int i=0; i<3; i++){
//            System.out.println(startingLine);
//        }
      for(int i=1; i<400;i+=4*i)
        System.out.println("happy birthday to you");
     
      System.out.println("happy birthday to " + input.nextLine());
      System.out.println("happy birthday to you" + "!!!");
      
     
    }
    
}
  