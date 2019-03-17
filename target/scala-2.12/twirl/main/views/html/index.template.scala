
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
                <p class="text-muted">For over a decade, Sneaker Sanctuary has changed the landscape of sneaker retail. Carrying every brand name on the market, Sneaker Sanctuary has evolved from a one-stop sneaker destination, to a cultural hub for sneaker enthusiasts and novices alike.</p>
                <p class="text-muted"> Sneaker Sanctuary remains as the premiere source for everything sneakers.</p>
                <p class="text-muted"> From Yeeƶys to Nike, adidas, Balenciaga and more, we have it all.</p>
            </div>
            <div class="col-md-6">
                <img src=""""),_display_(/*17.28*/routes/*17.34*/.Assets.versioned("images/SDevProHome.png")),format.raw/*17.77*/("""" class="img-responsive">
            </div>
        </div>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <h3 class="text-center">Sign Up For Our Weekly News Letter</h3>
            </div>
        </div>
        <div class="row text-center">
            <div class="col-md-offset-3 col-md-6">
                <form role="form">
                    <div class="form-group">
                        <label class="control-label" for="exampleInputEmail1">Name</label>
                        <input class="form-control" id="exampleInputEmail1" placeholder="Name" type="text">
                    </div>
                    <div class="form-group">
                        <label class="control-label" for="exampleInputPassword1">Email Address</label>
                        <input class="form-control" id="exampleInputPassword1" placeholder="Example@Example.com" type="email">
                    </div>
                    <div class="form-group">
                        <label class="control-label" for="exampleInputPassword1">Phone Number</label>
                        <input class="form-control" id="exampleInputPassword1" placeholder="Phone Number" type="text">
                    </div>
                    <button type="submit" class="btn btn-dark btn-lg">Submit
                        <i class="-o fa fa-fw fa-send"></i>
                    </button>
                </form>
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
                  DATE: Sun Mar 17 13:56:57 GMT 2019
                  SOURCE: /home/wdd/SdevCA1/app/views/index.scala.html
                  HASH: 31f478863fe0e81905ad2af792fc9ff09f42a99a
                  MATRIX: 651->1|1000->36|1119->63|1144->80|1182->81|1219->92|2052->898|2067->904|2131->947
                  LINES: 24->1|29->2|34->3|34->3|34->3|37->6|48->17|48->17|48->17
                  -- GENERATED --
              */
          