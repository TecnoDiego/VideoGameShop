package videogameshop.Game;

import java.util.Date;

public class PreOwnedGame extends Game{
    
    public PreOwnedGame(String id, String title, double price, int stock, String platform, Date releaseDate) {
        super(id, title, price, stock, platform, releaseDate);
    }

    @Override
    public String toString() {
        return "PreOwnedGame " + super.toString();
    }  
}
