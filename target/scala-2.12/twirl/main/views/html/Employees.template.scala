
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

object Employees extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[models.users.Employee],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(employees: List[models.users.Employee],user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Employees",user)/*2.24*/{_display_(Seq[Any](format.raw/*2.25*/("""
    """),format.raw/*3.5*/("""<h1>Current Employees</h1>

<div class="col-sm-9">
    <h4>Here are all the current Employees in the system</h4>
        <table class ="table table-boardered table-vover table-condensed">
        <thead>

        <tr>
            <th>Email</th>
            <th>Role</th>
            <th>Name</th>
            <th>Password</th>
        </tr>
        </thead>
        <tbody>
            """),_display_(/*18.14*/for(e<-employees) yield /*18.31*/{_display_(Seq[Any](format.raw/*18.32*/("""
                """),format.raw/*19.17*/("""<tr>
                    <td>e.getEmail</td>
                    <td>e.getRole</td>
                    <td>e.getName</td>
                    <td>e.getPassword</td>
            """)))}),format.raw/*24.14*/("""
        """),format.raw/*25.9*/("""</tbody>
    </table>
</div>
""")))}))
      }
    }
  }

  def render(employees:List[models.users.Employee],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(employees,user)

  def f:((List[models.users.Employee],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (employees,user) => apply(employees,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 15:08:51 GMT 2019
                  SOURCE: /home/wdd/SdevCA1/app/views/Employees.scala.html
                  HASH: db91c59458c447406b7087d3242f7de1ee7e79f3
                  MATRIX: 991->1|1149->67|1179->89|1217->90|1248->95|1662->482|1695->499|1734->500|1779->517|1989->696|2025->705
                  LINES: 28->1|33->2|33->2|33->2|34->3|49->18|49->18|49->18|50->19|55->24|56->25
                  -- GENERATED --
              */
          