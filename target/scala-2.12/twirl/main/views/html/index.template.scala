
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
/*1.2*/import javax.swing.text.html.HTML

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.2*/main("home",user)/*3.19*/{_display_(Seq[Any](format.raw/*3.20*/("""

    
    """),format.raw/*6.5*/("""</div>
    <div class="container">
        <div class="row">
            <div class="col-md-6">
                <h1>Who Are We?</h1>
                <h3 class="text-muted">We are IT-Project-Management</h3>
            </div>
            <div class="col-md-6">
                <img src=""""),_display_(/*14.28*/routes/*14.34*/.Assets.versioned("images/SDevProHome.png")),format.raw/*14.77*/("""" class="img-responsive">
            </div>
        </div>
    </div>
""")))}))
      }
    }
  }

  def render(user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 15:36:53 GMT 2019
                  SOURCE: /home/wdd/SdevCA1/app/views/index.scala.html
                  HASH: 951be6617ae54a69e55437f93970926bb30e69b1
                  MATRIX: 651->1|1000->36|1119->63|1144->80|1182->81|1219->92|1533->379|1548->385|1612->428
                  LINES: 24->1|29->2|34->3|34->3|34->3|37->6|45->14|45->14|45->14
                  -- GENERATED --
              */
          