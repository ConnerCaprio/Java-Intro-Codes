/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package learning.loops;

import java.util.Scanner;

/**
 *
 * @author doublec
 */
public class LearningLoops {

    public static void main(String[] args) {
       // Scanner input = new Scanner(System.in);
        
        for(int i=1; i<11; i++){
           print("count is: " + i); 
          }
        for(int i=1; i<5; i++){
            for(int j=1;j <=i; j++)
                print(Integer.toString(i));
        }
        int count = 0;
        while(count <= 10){
            count= count + 1;
            if (count > 7) break;
            //above is break statement, cant be if(count = 7)
            print(Integer.toString(count));
                    }
        }
        
    public static void print(String s)
        {
        System.out.println(s);
        }
    
}

    
    

