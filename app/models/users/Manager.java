package models.users;
import java.util.*;
import javax.persistence.*;
/*import io.ebean.*;*/
import play.data.format.*;
import play.data.validation.*;


@Table(name="User")
// the user type of this class is "Manager"
@DiscriminatorValue("m")
@Entity
public class Manager extends User {

    public Manager(){

    }
    public Manager(String email, String name,String role, String password) {
        super(email, name, role,password);
    }

    public static final Finder<Long, Manager> find = new Finder<>(Manager.class);
			    
    public static final List<Manager> findAll() {
       return Manager.find.all();
    }
}
