package videogameshop.users;

import java.util.Date;

public class Costumer extends User{
    
    public Costumer(String id, String name, Date birthdate) {
        super(id, name, birthdate);
    }

    @Override
    public String toString() {
        return "Costumer " + super.toString();
    }
}
