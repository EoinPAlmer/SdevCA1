
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object addProject_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

     object addProject_Scope1 {
import helper._

class addProject extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.Project],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(addProjectForm: Form[models.Project])(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.65*/("""


    """),_display_(/*5.6*/main("AddProject", user)/*5.30*/ {_display_(Seq[Any](format.raw/*5.32*/("""

        """),format.raw/*7.9*/("""<div class="container">
            <h2 class = "text-center text-muted">Add A Project To <span class = "logo">IT-Project-Management</span></h2>

            <div class="row">

                <div class="col-lg-8 col-md-8 col-sm-10 col-xs-12 col-centered">


                """),_display_(/*15.18*/form(action = routes.HomeController.addProjectSubmit(), 'class -> "form-horizontal", 'role -> "form", 'enctype -> "multipart/form-data")/*15.154*/ {_display_(Seq[Any](format.raw/*15.156*/("""

                    """),_display_(/*17.22*/inputText(addProjectForm("id"), '_label -> "ID", 'class -> "form-control")),format.raw/*17.96*/("""
                    """),_display_(/*18.22*/inputText(addProjectForm("name"), '_label -> "Name", 'class -> "form-control")),format.raw/*18.100*/("""
                    """),_display_(/*19.22*/inputText(addProjectForm("brand"), '_label -> "Brand", 'class -> "form-control")),format.raw/*19.102*/("""
                    """),_display_(/*20.22*/inputText(addProjectForm("size"), '_label -> "Size", 'class -> "form-control")),format.raw/*20.100*/("""
                    """),_display_(/*21.22*/inputText(addProjectForm("stock"), '_label -> "Stock", 'class -> "form-control")),format.raw/*21.102*/("""
                    """),_display_(/*22.22*/inputText(addProjectForm("price"), '_label -> "Price", 'class -> "form-control")),format.raw/*22.102*/("""

                    """),_display_(/*24.22*/inputText(addProjectForm("id"), '_label -> "", 'hidden -> "hidden")),format.raw/*24.89*/("""

                    """),_display_(/*26.22*/select(
                        addProjectForm("category.id"),
                        options(Category.options),
                        '_label -> "Category", '_default -> "-- Choose A Category--",
                        '_showConstraints -> false, 'class -> "form-control"
                    )),format.raw/*31.22*/("""

                    """),format.raw/*33.21*/("""<label>Image Upload</label>
                    <input class = "btn btn-dark" type = "file" name = "upload">

                    <br>

                    <div class="actions">
                        <input type="submit" value="Add Project" class="btn btn-dark">


                        """),format.raw/*42.131*/("""
                        """),format.raw/*43.25*/("""<a href=""""),_display_(/*43.35*/routes/*43.41*/.HomeController.Project()),format.raw/*43.66*/("""" class="btn btn-danger">Cancel</a>


                    </div>
                </div>
            </div>
        </div>

    """)))}),format.raw/*51.6*/("""

    """)))}))
      }
    }
  }

  def render(addProjectForm:Form[models.Project],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(addProjectForm)(user)

  def f:((Form[models.Project]) => (models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (addProjectForm) => (user) => apply(addProjectForm)(user)

  def ref: this.type = this

}


}
}

/**/
object addProject extends addProject_Scope0.addProject_Scope1.addProject
              /*
                  -- GENERATED --
                  DATE: Sat Mar 16 13:45:18 GMT 2019
                  SOURCE: /home/wdd/SdevCA1/app/views/addProject.scala.html
                  HASH: f960eb653360cd0fceb81fea4bcdf365c7247fa8
                  MATRIX: 836->18|994->81|1027->89|1059->113|1098->115|1134->125|1438->402|1584->538|1625->540|1675->563|1770->637|1819->659|1919->737|1968->759|2070->839|2119->861|2219->939|2268->961|2370->1041|2419->1063|2521->1143|2571->1166|2659->1233|2709->1256|3028->1554|3078->1576|3398->1973|3451->1998|3488->2008|3503->2014|3549->2039|3707->2167
                  LINES: 30->2|35->2|38->5|38->5|38->5|40->7|48->15|48->15|48->15|50->17|50->17|51->18|51->18|52->19|52->19|53->20|53->20|54->21|54->21|55->22|55->22|57->24|57->24|59->26|64->31|66->33|75->42|76->43|76->43|76->43|76->43|84->51
                  -- GENERATED --
              */
          