
package videogameshop.users;

import java.util.Date;

abstract public class User {
   protected String id;
   protected String name;
   protected Date birthdate;
   
   public User(String id, String name, Date birthdate){
       this.id = id;
       this.name = name;
       this.birthdate = birthdate;
   }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name=" + name + ", birthdate=" + birthdate;
    }
   
   
}
