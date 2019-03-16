
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

     object login_Scope1 {
import helper._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Form[models.Login],models.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(loginForm: Form[models.Login], user: models.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.52*/("""

"""),_display_(/*4.2*/main("login",user)/*4.20*/ {_display_(Seq[Any](format.raw/*4.22*/("""

    """),format.raw/*6.5*/("""<div class="container">
        <div class="row">
            <div class = "col-lg-6 col-md-6 col-sm-8 col-xs-12 col-centered" id = "loginbounds">
                <h2 class = "text-center text-muted">Login into <span class = "logo">IT Project Management</span></h2>

                """),_display_(/*11.18*/if(loginForm.hasGlobalErrors)/*11.47*/{_display_(Seq[Any](format.raw/*11.48*/("""
                    """),format.raw/*12.21*/("""<p class = "alert alert-warning">
                        """),_display_(/*13.26*/loginForm/*13.35*/.globalError.message),format.raw/*13.55*/("""
                    """),format.raw/*14.21*/("""</p>
                """)))}),format.raw/*15.18*/("""

                """),_display_(/*17.18*/if(flash.containsKey("error"))/*17.48*/{_display_(Seq[Any](format.raw/*17.49*/("""
                    """),format.raw/*18.21*/("""<p class = "alert alert-warning">
                    """),_display_(/*19.22*/flash/*19.27*/.get("loginRequired")),format.raw/*19.48*/("""
                    """),format.raw/*20.21*/("""</p>
                """)))}),format.raw/*21.18*/("""

                """),_display_(/*23.18*/helper/*23.24*/.form(action = controllers.routes.LoginController.loginSubmit())/*23.88*/ {_display_(Seq[Any](format.raw/*23.90*/("""
                    """),_display_(/*24.22*/inputText(loginForm("email"), '_label -> "", 'class -> "form-control", 'placeholder -> "Email")),format.raw/*24.117*/("""
                    """),_display_(/*25.22*/inputPassword(loginForm("password"), '_label -> "", 'class -> "form-control", 'placeholder -> "Password")),format.raw/*25.127*/("""
                    """),format.raw/*26.21*/("""<div class="form-actions">
                        <br>
                        <p class="text-center">
                            <input type="submit" value = "Login" class="btn btn-md btn-dark" placeholder="Login">
                        </p>
                    </div>
                </div>
        </div>
    </div>
""")))}),format.raw/*35.2*/(""" """),format.raw/*35.18*/("""
""")))}))
      }
    }
  }

  def render(loginForm:Form[models.Login],user:models.User): play.twirl.api.HtmlFormat.Appendable = apply(loginForm,user)

  def f:((Form[models.Login],models.User) => play.twirl.api.HtmlFormat.Appendable) = (loginForm,user) => apply(loginForm,user)

  def ref: this.type = this

}


}
}

/**/
object login extends login_Scope0.login_Scope1.login
              /*
                  -- GENERATED --
                  DATE: Sat Mar 16 13:41:20 GMT 2019
                  SOURCE: /home/wdd/SdevCA1/app/views/login.scala.html
                  HASH: 4b51407cbcd0d9b5883ed4ef35451f14cd213f7a
                  MATRIX: 813->18|958->68|986->71|1012->89|1051->91|1083->97|1394->381|1432->410|1471->411|1520->432|1606->491|1624->500|1665->520|1714->541|1767->563|1813->582|1852->612|1891->613|1940->634|2022->689|2036->694|2078->715|2127->736|2180->758|2226->777|2241->783|2314->847|2354->849|2403->871|2520->966|2569->988|2696->1093|2745->1114|3099->1438|3128->1454
                  LINES: 30->2|35->2|37->4|37->4|37->4|39->6|44->11|44->11|44->11|45->12|46->13|46->13|46->13|47->14|48->15|50->17|50->17|50->17|51->18|52->19|52->19|52->19|53->20|54->21|56->23|56->23|56->23|56->23|57->24|57->24|58->25|58->25|59->26|68->35|68->35
                  -- GENERATED --
              */
          