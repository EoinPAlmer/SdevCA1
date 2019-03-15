package controllers;

import play.mvc.*;

import views.html.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import models.*;
import models.users.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    private FormFactory formFactory;

    @Inject
    public HomeController(FormFactory f) {
        this.formFactory = f;
}
    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result Project(Long cat) {
        List<Project> projectList = null;
        List<Category> categoryList = Category.findAll();

        if(cat ==0){
            itemList = Project.findAll();
        }else {
            itemList = Category.find.ref(cat).getItems();
        }
        return ok(project.render(projectList, categoryList,User.getUserById(session().get("email"))));

     }

    public Result index() {
        return ok(index.render(User.getUserById(session().get("email"))));
    }

    public Result about() {
        return ok(about.render(User.getUserById(session().get("email"))));
    }
    @Security.Authenticated(Secured.class)
    public Result addProject() {
        Form<Project> itemForm = formFactory.form(Project.class);
        return ok(addProject.render(itemForm,User.getUserById(session().get("email"))));
}
@Security.Authenticated(Secured.class)
@Transactional
public Result addProjectSubmit() {
    Form<ItemOnSale> newItemForm = formFactory.form(Projects.class).bindFromRequest();

    if (newItemForm.hasErrors()) {
        return badRequest(addProject.render(newItemForm,User.getUserById(session().get("email"))));
    } else {
        ItemOnSale newItem = newItemForm.get();
        
        if(newProject.getId()==null){
        newProject.save();
        }else{
            newProject.update();
        }
        flash("success", "Project " + newItem.getName() + " was added/updated.");
        return redirect(controllers.routes.HomeController.onsale(0));
    }
}
@Security.Authenticated(Secured.class)
@Transactional
@With(AuthAdmin.class)
public Result deleteProject(Long id) {

    // The following line of code finds the item object by id, then calls the delete() method
    // on it to have it removed from the database.
    Project.find.ref(id).delete();

    // Now write to the flash scope, as we did for the successful item creation.
    flash("success", "Project has been deleted.");
    // And redirect to the onsale page
    return redirect(controllers.routes.HomeController.project(0));
}
@Security.Authenticated(Secured.class)
public Result updateProject(Long id) {
    Project i;
    Form<Project> projectForm;

    try {
        // Find the item by id
        i = project.find.byId(id);

        // Populate the form object with data from the item found in the database
        projectForm = formFactory.form(Project.class).fill(i);
    } catch (Exception ex) {
        return badRequest("error");
    }

    // Display the "add item" page, to allow the user to update the item
    return ok(project.render(itemForm,User.getUserById(session().get("email"))));
}
@Security.Authenticated(Secured.class)
public Result addEmployee() {
    Form<Employee> eForm = formFactory.form(Employee.class);
    return ok(addEmployee.render(eForm,User.getUserById(session().get("email"))));
}
@Security.Authenticated(Secured.class)
@Transactional
public Result addEmployeeSubmit() {
Form<Employee> newUserForm = formFactory.form(Employee.class).bindFromRequest();
if (newUserForm.hasErrors()) {
    
    return badRequest(addEmployee.render(newUserForm,User.getUserById(session().get("email"))));
} else {
    Employee newUser = newUserForm.get();
    
    if(User.getUserById(newUser.getEmail())==null){
        newUser.save();
    }else{
        newUser.update();
    }
    flash("success", "Employee" + newUser.getName() + " was added/updated.");
    return redirect(controllers.routes.HomeController.usersEmployee()); 
    }
}
@Security.Authenticated(Secured.class)
@Transactional
@With(AuthAdmin.class)
public Result deleteEmployee(String email) {

    // The following line of code finds the item object by id, then calls the delete() method
    // on it to have it removed from the database.

    Employee u = (Employee) User.getUserById(email);
    u.delete();

    // Now write to the flash scope, as we did for the successful item creation.
    flash("success", "Employee has been deleted.");
    // And redirect to the onsale page
    return redirect(controllers.routes.HomeController.usersEmployee());
}
@Security.Authenticated(Secured.class)
public Result updateEmployee(String email) {
    Employee u;
    Form<Employee> userForm;

    try {
        // Find the item by email
        u = (Employee) User.getUserById(email);
        u.update();

        // Populate the form object with data from the user found in the database
        userForm = formFactory.form(Employee.class).fill(u);
    } catch (Exception ex) {
        return badRequest("error");
    }

    // Display the "add item" page, to allow the user to update the item
    return ok(addEmployee.render(userForm,User.getUserById(session().get("email"))));
}
public Result usersmanager() {
    List<Manager> userList = null;

    userList = Manager.findAll();

    return ok(manager.render(userList,User.getUserById(session().get("email"))));

 }

 public Result usersCustomer() {
    List<Employee> eList = null;

    eList = Employee.findAll();

    return ok(Employee.render(eList,User.getUserById(session().get("email"))));

 }

}
