/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package thingstodo;

import java.util.Random;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
 
 //* @author doublec

public class ThingsToDo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] ideas= {"fire", "movies", "causeway","golf", "tennis", "code",
            "swimming", "beach", "go kart", "bow range", "yogurt spot", "buffalo wild wings",
            "free skate", "build something", "explosion day", "gun range", "walmart pranks",
            "forest adventure", "lightning game", "threshers game", "drinking","conert", 
        "hard rock casino", "universal", "put put golf", "chuck e cheese", "water war",
        "walk downtown", "go to mall", "make a movie", "chill at skatepark", "biking", "mudding", "race",
        "cards against humanity", "boat", "kayaking", "boardgame", "fishing", "break in", "get on the roof/dtc"
        , "wing house", "paintball", "exercise", "train/race/ triatholon", "instrument", "flea market"
        , "sports", "any skill(knife throwing)", "scuba dive", "theme park", "road trip", "pier", "brookstone chairs",
        "wii", "xbox", "entertainment show", "quadcopter", "vertical ventures", "sponge docks", "volleyball", "poker",
        "laser tag", "trap shooting", "bake"};
        
                ArrayList<String> rests = new ArrayList<String>();
                
                for(int i=0; i < ideas.length; i++){
            rests.add(ideas[i]);
            
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
