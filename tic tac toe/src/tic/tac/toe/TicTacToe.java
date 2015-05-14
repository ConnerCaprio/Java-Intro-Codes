/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tic.tac.toe;

import java.util.Scanner;

/**
 *
 * @author doublec
 */
public class TicTacToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
     /*   int x= input.nextInt();
        int x2= input.nextInt();
        int x3= input.nextInt();
        int x4= input.nextInt();
        int x5= input.nextInt();
        int y = input.nextInt();
        int y2= input.nextInt();
        int y3= input.nextInt();
        int y4= input.nextInt(); */
       
      
        print("Player 1:");
        int x1 = input.nextInt();
        
        print("Player 2:");
        int y1 = input.nextInt();
        
        print("Player 1:");
        int x2 = input.nextInt();

        print("Player 2:");
        int y2 = input.nextInt();
        
        print("Player 1:");
        int x3 = input.nextInt();
        
        print("Player 2:");
        int y3 = input.nextInt();
 
       /* if(x1&&x2&&x3 ==1&&2&&3||1&&5&&9||1&&4&&7||2&&5&&8||3&&2&&1||3&&5&&7||3&&6&&9||4&&5&&6||9&&7&&8){
        print("Player 1 wins!");
        }*/
        
           
    }
    
 
       public static void print(String s){
        System.out.println(s);
       }
}
