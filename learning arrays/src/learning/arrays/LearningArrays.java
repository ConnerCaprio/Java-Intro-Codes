/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package learning.arrays;

/**
 *
 * @author doublec
 */
public class LearningArrays {

    
    public static void main(String[] args) {
        String [] alphabet= {"a" , "b", "c" , "d" , "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        
        for(int i=0; i< alphabet.length; i++){
            print(alphabet[i]);
    }
            
    }

    
    public static void print(String s){
        System.out.println(s);
    }
}

