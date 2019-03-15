/*import java.util.*;
import javax.persistence.*;

import com.avaje.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

@Entity
public class Manager extends Model {

    //Attributes
    @Id
    private String email;
    @Constraints.Required
    private String role;
    @Constraints.Required
    private String name;
    @Constraints.Required
    private String password;

    public Manager(){
    }

    public static Finder<String,Manager> find = new Finder<String,Manager>(Manager.class);

    public static List<Manager> findAll(){
        return Manager.find.all();
    }

    public static Manager authenticate(String email,String password){
        return find.where().eq("email",email).eq("password",password).findUnique();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static Manager getManagerById(String id){
        if (id == null){
            return null;
        }else{
            return find.byId(id);
        }
    }
}*/