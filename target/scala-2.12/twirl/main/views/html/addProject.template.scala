
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._
/*1.2*/import helper._

object addProject extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Form[models.Project],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(addProjectForm: Form[models.Project])(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""

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


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 17:15:31 GMT 2019
                  SOURCE: /home/wdd/SdevCA1/app/views/addProject.scala.html
                  HASH: 5d49b3b9c9f8ac4dc945f8dfb8e1a8e042631863
                  MATRIX: 651->1|1008->18|1165->82|1197->89|1229->113|1268->115|1304->125|1608->402|1754->538|1795->540|1845->563|1940->637|1989->659|2089->737|2138->759|2240->839|2289->861|2389->939|2438->961|2540->1041|2589->1063|2691->1143|2741->1166|2829->1233|2879->1256|3198->1554|3248->1576|3568->1973|3621->1998|3658->2008|3673->2014|3719->2039|3877->2167
                  LINES: 24->1|29->2|34->3|36->5|36->5|36->5|38->7|46->15|46->15|46->15|48->17|48->17|49->18|49->18|50->19|50->19|51->20|51->20|52->21|52->21|53->22|53->22|55->24|55->24|57->26|62->31|64->33|73->42|74->43|74->43|74->43|74->43|82->51
                  -- GENERATED --
              */
          