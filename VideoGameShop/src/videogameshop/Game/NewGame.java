package videogameshop.Game;

import java.util.Date;

public class NewGame extends Game{
    
    public NewGame(String id, String title, double price, int stock, String platform, Date releaseDate) {
        super(id, title, price, stock, platform, releaseDate);
    }

    @Override
    public String toString() {
        return "NewGame - " + super.toString();
    }
    
    
}
