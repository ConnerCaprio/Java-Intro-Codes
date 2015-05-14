/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dinnerplaces;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author doublec
 */
public class DinnerPlaces {

    
    public static void main(String[] args) {
        String [] restaurants= {"crispers", "sans pizza", "anthonys pizza", "safety harbor pizzeria", "whistle stop",
            "chilis", "applebees", "burger monger", "subway", "jimmy johns", "wok-n-roll", "pizza hut",
            "boston market", "bella kouzina", "louis papas", "panera", "ozona pig", "safety harbor bar-b-q",
            "wing house", "buffalo wild wings", "hooters", "tgi fridays", "chik fil a", "tropical smoothie", "varsity club",
            "olive garden", "kobes", "macorroni grill", "little ceasers", "wendys", "ruby tuesday", "steak and shake", "greek city"
        , "five guys", "red elephant", "firehouse subs", "quiznos", "marcos", "first watch", "frenchys", "ozona blue", "red robin"
        , "grimaldies", "chipotle", "moes", "beef-o-brades", "einstein bagels", "checkers", "jason's deli", "pf cahngs", "brown boxer"
        , "Bj's Steakhouse"};
        
        ArrayList<String> rests = new ArrayList<String>();
        
        for(int i=0; i < restaurants.length; i++){
            rests.add(restaurants[i]);
            
        }
        
        Scanner scan = new Scanner(System.in);
        
        while(true){
            Random random = new Random();
            int select = random.nextInt(rests.size());
            print(rests.get(select));
            
            String input = scan.nextLine();
            
            System.out.println();
            rests.remove(select);
        }
        
        
    }
    public static void print(String s){
        System.out.println(s);
    }
}
