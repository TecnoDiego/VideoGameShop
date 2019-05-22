// Diego Aníbal Lezcano Reissner
package videogameshop;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import videogameshop.Game.Game;
import videogameshop.users.Partner;

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
-all partners
-all transactions
*/

public class VideoGameShop {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        List<Game> allGames = new ArrayList<>();
        List<Partner> allPartners = new ArrayList<>();
        
        System.out.println("1. Add partner");
        System.out.println("2. Search partner");
        System.out.println("3. Search game");
        System.out.println("4. Add transaction");
        System.out.println("5. Search transaction");
        System.out.println("6.");
        System.out.println("7.");
        
    }
}
