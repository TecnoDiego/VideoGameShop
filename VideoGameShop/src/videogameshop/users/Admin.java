package videogameshop.users;

import java.util.Date;
import java.util.List;

public class Admin extends User{
    
    public Admin(String id, String name, Date birthdate) {
        super(id, name, birthdate);
    }
    
    public void addPartner(Partner p, List<User> l){
        
    }
    
    public void removePartner(Partner p, List<User> l){
        
    }

    @Override
    public String toString() {
        return "Admin " + super.toString();
    }
}
