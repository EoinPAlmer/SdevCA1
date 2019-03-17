package models.users;
import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Table(name = "user")
@DiscriminatorValue("e")

// Employee inherits from the User class
@Entity
public class Employee extends User{
    
    public Employee(){

    }
	
	public Employee(String email, String role, String name, String password)/*, String street1, String street2, String town, String postCode)*/
	{
        super(email, role, name, password);
    }

    public static final Finder<Long, Employee> find = new Finder<>(Employee.class);
			    
    public static final List<Employee> findAll() {
       return Employee.find.all();
    }
}