package videogameshop.users;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Admin extends User{
    
    public Admin(String id, String name, Date birthdate) {
        super(id, name, birthdate);
        
    }
    
    @Override
    public String toString() {
        return "Status= Admin " + super.toString() + " ";
    }
}
