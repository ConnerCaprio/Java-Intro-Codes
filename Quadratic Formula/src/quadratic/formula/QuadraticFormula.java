/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quadratic.formula;
import java.util.Scanner;
/**
 *
 * @author doublec
 */
public class QuadraticFormula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        print("A?");
        int A = input.nextInt();
        
        print("B?");
        int B = input.nextInt();
        
        print("C?");
        int C = input.nextInt();
        
        double X = ((B *-1) + Math.sqrt(B*B - 4*A*C))/ (2*A);
        double X2 =  ((B *-1) - Math.sqrt(B*B - 4*A*C))/ (2*A);
        
        print(Double.toString(X));
        print(Double.toString(X2));
    }
    
    public static void print(String s){
        System.out.println(s);
    }


    
}
