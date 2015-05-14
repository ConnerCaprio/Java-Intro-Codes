/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dabasics;

import java.util.Scanner;

/**
 *
 * @author doublec
 */
public class DaBasics {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        System.out.println("Conner is awesome");
        Scanner input = new Scanner(System.in);
        
        print("NUM 1:");
        int thefirstnum = input.nextInt();
        print("");
        print("NUM 2");
        int thesecondnum = input.nextInt();
        
        print("");
        print("ANSWER IS:");
        System.out.println(sum(thefirstnum, thesecondnum));
        
//        System.out.println("YOU SAID: " + input.nextLine());
//        
//        System.out.println("yes");
//        
//        String startingLine = "happy birthday " + input.nextLine() + "!";
//        
//        for(int i=0; i<3; i++){
//            System.out.println(startingLine);
//        }
//        
    }
    
    public static int sum(int num1, int num2){
        int answer = num1 + num2;
        return answer;
    }
    
    public static void print(String s)
    {
        System.out.println(s);
    }
    
    
        
}
