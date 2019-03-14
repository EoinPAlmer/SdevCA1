
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

     object index_Scope1 {
import javax.swing.text.html.HTML

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: models.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.21*/("""
"""),_display_(/*3.2*/main("home",user)/*3.19*/{_display_(Seq[Any](format.raw/*3.20*/("""

        """),format.raw/*5.9*/("""<a class="left carousel-control" href="#mycarousel" role="button" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#mycarousel" role="button" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-md-6">
                <h1>Who Are We?</h1>
                <h3 class="text-muted">We are Sneaker Sanctuary</h3>
                <p class="text-muted">For over a decade, Sneaker Sanctuary has changed the landscape of sneaker retail. Carrying every brand name on the market, Sneaker Sanctuary has evolved from a one-stop sneaker destination, to a cultural hub for sneaker enthusiasts and novices alike.</p>
                <p class="text-muted"> Sneaker Sanctuary remains as the premiere source for everything sneakers.</p>
                <p class="text-muted"> From Yeeƶys to Nike, adidas, Balenciaga and more, we have it all.</p>
            </div>
            <div class="col-md-6">
                <img src=""""),_display_(/*24.28*/routes/*24.34*/.Assets.versioned("images/SDevProHome.png")),format.raw/*24.77*/("""" class="img-responsive">
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

  def render(user:models.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}
}

/**/
object index extends index_Scope0.index_Scope1.index
              /*
                  -- GENERATED --
                  DATE: Thu Mar 14 15:00:14 GMT 2019
                  SOURCE: /home/wdd/SdevCA1/app/views/index.scala.html
                  HASH: 974aeefe9b9156e23fe6ea9c33bc5f3e44bc4821
                  MATRIX: 812->36|926->55|953->57|978->74|1016->75|1052->85|2359->1365|2374->1371|2438->1414
                  LINES: 30->2|35->2|36->3|36->3|36->3|38->5|57->24|57->24|57->24
                  -- GENERATED --
              */
          