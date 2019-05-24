package videogameshop.users;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import videogameshop.Game.Game;

public class Partner extends User{
    
    protected int points;
    protected int strikes;
    protected double wallet;
    protected List<Game> boughtGames;
    protected List<Game> soldGames;
    protected List<Game> rentedGames;
    
    public Partner(String id, String name, Date birthdate, int points) {
        super(id, name, birthdate);
        this.points = points;
        strikes = 0;
        boughtGames = new ArrayList<>();
        soldGames = new ArrayList<>();
        rentedGames = new ArrayList<>();
    }
    
    
    public Partner(String id, String name, Date birthdate) {
        this(id, name, birthdate, 0);
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    
    public int getStrikes() {
        return strikes;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }
    
    public List<Game> getBoughtGames() {
        return boughtGames;
    }

    public void setBoughtGames(List<Game> boughtGames) {
        this.boughtGames = boughtGames;
    }

    public List<Game> getSoldGames() {
        return soldGames;
    }

    public void setSoldGames(List<Game> soldGames) {
        this.soldGames = soldGames;
    }

    public List<Game> getRentedGames() {
        return rentedGames;
    }

    public void setRentedGames(List<Game> rentedGames) {
        this.rentedGames = rentedGames;
    }
    
    public void addStrike(){
        strikes++;
    }
    
    public void buyGame(Game g){
        boughtGames.add(g);
    }
    
    public void rentGame(Game g){
        rentedGames.add(g);
    }
    
    public void sellGame(Game g){
        soldGames.add(g);
    }
    
    public void returnBoughtGame(Game g){
        boughtGames.remove(g);
    }
    
    public void returnRentedGame(Game g){
        rentedGames.remove(g);
    }
    
    public void returnSoldGame(Game g){
        soldGames.add(g);
    }

    @Override
    public String toString() {
        return "Status= Partner " + super.toString() + "points=" + points + " ";
    }
}
