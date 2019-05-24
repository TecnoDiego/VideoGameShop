// Diego Aníbal Lezcano Reissner
package videogameshop;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import videogameshop.Game.Game;
import videogameshop.users.Admin;
import videogameshop.users.Partner;
import java.util.Date;

/*
Videogame shop management aplication.
The application requires a list of all the productos with their title, price, stock,
platform, release date and a unique ID. Costumers can only buy games without
benefits, but they can become a partner (paying 5€) to have acces to some special
services like selling and renting games. Futhermore, with every transaction, the
costumer gains points wich can use to buy games (every 1000 points is 5€). The
partners also have the option to reserve games wich are not on sale yet. The
important information we need of the costumers tu become partners is the
identification document, name and birthdate.
The application needs to keep track of every transaction made with the date and
assigning it a number for each costumer.
The products will be separated by new and pre-owned. At least 10% of the stock of
each game must be for renting. The pre-owned games will be the ones bought or
rented from the partners and the selling price must be below 85% the original price.
The workers have the admin status. They can add and delete people from the partner
list.
Rented games must be returned after 5 days and there is a limit of 3 games at the
same time. Whenever a partnert doesn’t return a game in time 5 times, the partner
status is lost.
Finally, a browser will be added to search both partners and games by every
parameter (price, name, etc). Only the admins have acces to this tool.

files needed:
-global file with: costumer generated id, admin info
-all games
-all partners: doesn't save bought, sold, rented games. Transaction file does.
-all transactions: this file is needed to load the previous file into the 
application.
*/

public class VideoGameShop {
    
    
    public static void menu(){
        System.out.println("1. Add partner");
        System.out.println("2. Add game");
        System.out.println("3. Add transaction");
        System.out.println("4. Search partner (by id)");
        System.out.println("5. Search game (by id)");
        System.out.println("6. Search transaction (by partner or game id)");
        System.out.println("7. Show all partners (filtered)");
        System.out.println("8. Show all games (filtered)");
        System.out.println("9. Show all transactions (filtered)");
        System.out.println("Q. Exit");
        System.out.print("Option: ");
    }
    
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop();
        // Login option not implemented yet
        String option;
        do{
            menu();
            option = sc.nextLine();
            switch(option){
                case "1":
                    shop.addPartner();
                    break;
                    
                case "2":
                    shop.addGame();
                    break;
                    
                case "3":
                    /*
                    To implement a method that searchs a partner and a game.
                    Asks to the type of transaction to finally save it on a list.
                    When the program shuts down it automatically saves the data 
                    into a file.
                    If we want to save a costumer transaction, we must generate
                    a predetermined costumer.
                    */
                    break;
                    
                case "4":
                    System.out.print("Enter partner id: ");
                    Partner p = shop.searchPartner(sc.nextLine());
                    if(p == null){
                        System.out.println("Partner not found");
                    }
                    else{
                        System.out.println(p);
                    }
                    
                    break;
                    
                case "5":
                    System.out.print("Enter game id: ");
                    Game g = shop.searchGame(sc.nextLine());
                    if(g == null){
                        System.out.println("Game not found");
                    }
                    else{
                        System.out.println(g);
                    }
                    break;
                    
                case "6":
                    // needs option 3
                    break;
                case "7":
                    shop.showAllPartners();
                    break;
                case "8":
                    shop.showAllGames();
                    break;
                case "9":
                    // needs option 3
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
            System.out.println();
        }while(!option.equals("Q"));
         
    }
}
