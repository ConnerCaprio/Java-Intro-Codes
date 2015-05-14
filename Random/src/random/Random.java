
package random;

import java.util.Scanner;


public class Random {

    public static int getRandomNumberBetween(int start, int end){
        
        
         int output = (int) (Math.random()*(end-start + 1)) + start;
             
             
        return output;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         print("Number 1:");
        int start = input.nextInt();
         print("Number 2:");
        int end = input.nextInt();
        print("Answers:");
        
        for(int i=0; i<200; i++){
        int answer = getRandomNumberBetween(start,end);
         print(Integer.toString(answer));
        
        }
        // Get user input and print a random number between the given 2 values
        
        // Once you run that and it works, make a program that prints out 200 numbers
        // based on that same range
        
    }
    
     public static void print(String s)
    {
        System.out.println(s);
    }
    
}
