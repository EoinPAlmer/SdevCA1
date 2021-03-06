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
            projectList = Project.findAll();
        }else {
            projectList = Category.find.ref(cat).getProject();
        }
        return ok(project.render(projectList, categoryList,(User.getUserById(session().get("email")))));

     }

    public Result index() {
        return ok(index.render(User.getUserById(session().get("email"))));
    }

    @Security.Authenticated(Secured.class)
    public Result addProject() {
        Form<Project> itemForm = formFactory.form(Project.class);
        return ok(addProject.render(itemForm,User.getUserById(session().get("email"))));
}
@Security.Authenticated(Secured.class)
@Transactional
public Result addProjectSubmit() {
    Form<Project> newProjectForm = formFactory.form(Project.class).bindFromRequest();

    if (newProjectForm.hasErrors()) {
        return badRequest(addProject.render(newProjectForm,User.getUserById(session().get("email"))));
    } else {
        Project newProject = newProjectForm.get();
        
        if(newProject.getId()==null){
        newProject.save();
        }else{
            newProject.update();
        }
        flash("success", "Project " + newProject.getName() + " was added/updated.");
        return redirect(controllers.routes.HomeController.Project(0));
    }
}
@Security.Authenticated(Secured.class)
@Transactional
@With(AuthManager.class)
public Result deleteProject(Long id) {

    // The following line of code finds the item object by id, then calls the delete() method
    // on it to have it removed from the database.
    Project.find.ref(id).delete();

    // Now write to the flash scope, as we did for the successful item creation.
    flash("success", "Project has been deleted.");
    // And redirect to the onsale page
    return redirect(controllers.routes.HomeController.Project(0));
}
@Security.Authenticated(Secured.class)
public Result updateProject(Long id) {
    Project i;
    Form<Project> projectForm;

    try {
        // Find the item by id
        i = Project.find.byId(id);

        // Populate the form object with data from the item found in the database
        projectForm = formFactory.form(Project.class).fill(i);
    } catch (Exception ex) {
        return badRequest("error");
    }

    // Display the "add item" page, to allow the user to update the item
    return ok(addProject.render(projectForm,User.getUserById(session().get("email"))));
}


 public Result usersEmployee() {
    List<Employee> eList = null;

    eList = Employee.findAll();

    return ok(Employees.render(eList,User.getUserById(session().get("email"))));

 }

}
