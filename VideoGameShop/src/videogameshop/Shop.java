package videogameshop;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;
import java.util.List;
import videogameshop.Game.Game;
import videogameshop.Game.NewGame;
import videogameshop.Game.PreOwnedGame;
import videogameshop.users.Partner;

public class Shop {
    
    public static List<Game> allGames;
    public static List<Partner> allPartners;
    //public static List<Transaction> allTransactions;
    
    public Shop(){
        allGames = new ArrayList<>();
        allPartners = new ArrayList<>();
    }
    
    public void addPartner(){
        
        Calendar cal = Calendar.getInstance();
        cal.setLenient(false);
        boolean validDate = true;
        
        Scanner sc = new Scanner(System.in);
        
        Partner newPartner;
        System.out.print("Id: ");
        String id = sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        String birthdate;
        do{
            System.out.print("Birthdate(dd/mm/yyyy): ");
            birthdate = sc.nextLine();
            cal.setTime(new Date(birthdate));
            try {
                cal.getTime();
            } catch (Exception e) {
                validDate = false;
                System.out.println("Invalid date");
            }
        }while(!validDate);
        
        newPartner = new Partner(id, name, new Date(birthdate));
        
        allPartners.add(newPartner);
    }
    
    public void addGame(){
        
        Calendar cal = Calendar.getInstance();
        cal.setLenient(false);
        boolean validDate = true;
        
        Scanner sc = new Scanner(System.in);
        
        Game newGame;
        String gameType;
        do{
            System.out.print("New game (n) | Preowned game (p): ");
            gameType = sc.nextLine();
            if(!gameType.equals("n") && !gameType.equals("p")){
                System.out.println("Invalid type. Enter it again.");
            }
        }while(!gameType.equals("n") && !gameType.equals("p"));
        
        System.out.print("Id: ");
        String id = sc.nextLine();
        System.out.print("Title: ");
        String title = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextFloat();
        sc.nextLine();
        System.out.print("Stock: ");
        int stock = sc.nextInt();
        sc.nextLine();
        System.out.print("Platform: ");
        String platform = sc.nextLine();
        String releaseDate;
        do{
            System.out.print("Release date(dd/mm/yyyy): ");
            releaseDate = sc.nextLine();
            cal.setTime(new Date(releaseDate));
            try {
                cal.getTime();
            } catch (Exception e) {
                validDate = false;
                System.out.println("Invalid date");
            }
        }while(!validDate);
        
        if(gameType.equals("n")){
            newGame = new NewGame(id, title, price, stock, platform, 
                    new Date(releaseDate));
        }
        else{
            newGame = new PreOwnedGame(id, title, price, stock, platform, 
                    new Date(releaseDate));
        }
        
        allGames.add(newGame);
    }
    
    public Partner searchPartner(String id){
        boolean found = false;
        Partner returnPartner = null;
        for(int i = 0;i < allPartners.size() && !found;i++){
            if(allPartners.get(i).getId().equals(id)){
                returnPartner = allPartners.get(i);
                found = true;
            }
        }
        return returnPartner;
    }
    
    public Game searchGame(String id){
        boolean found = false;
        Game returnGame = null;
        for(int i = 0;i < allGames.size() && !found;i++){
            if(allGames.get(i).getId().equals(id)){
                returnGame= allGames.get(i);
                found = true;
            }
        }
        return returnGame;
    }
    
    public void showAllPartners(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the words you want to find separated by space.");
        System.out.println("Precede the word by - to exclude that result.");
        System.out.print("Search: ");
        String[] searchOptions = sc.nextLine().split(" ");
        
        for(int i = 0;i < allPartners.size();i++){
            for(int j = 0;j < searchOptions.length;j++){
                boolean exclude = false;
                if(searchOptions[j].contains("-")){
                    searchOptions[j] = searchOptions[j].
                            substring(searchOptions[j].indexOf("-") + 1);
                    exclude = true;
                }
                if(allPartners.get(i).toString().contains(searchOptions[j]) && !exclude){
                    System.out.println(allPartners.get(i));
                }
            }
        }
    }
        
    public void showAllGames(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the words you want to find separated by space.");
        System.out.println("Precede the word by - to exclude that result.");
        System.out.print("Search: ");
        String[] searchOptions = sc.nextLine().split(" ");
        
        for(int i = 0;i < allGames.size();i++){
            for(int j = 0;j < searchOptions.length;j++){
                boolean exclude = false;
                if(searchOptions[j].contains("-")){
                    searchOptions[j] = searchOptions[j].
                            substring(searchOptions[j].indexOf("-") + 1);
                    exclude = true;
                }
                if(allGames.get(i).toString().contains(searchOptions[j]) && !exclude){
                    System.out.println(allPartners.get(i));
                }
            }
        }
    }
}
