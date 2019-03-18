
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

object project extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[models.Project],List[models.Category],models.users.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(project: List[models.Project],categories: List[models.Category], user: models.users.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.92*/(""",env: play.api.Environment
    """),_display_(/*2.6*/main("project", user)/*2.27*/ {_display_(Seq[Any](format.raw/*2.29*/("""
        """),format.raw/*3.9*/("""<div class="container">

            """),_display_(/*5.14*/if(flash.containsKey("success"))/*5.46*/ {_display_(Seq[Any](format.raw/*5.48*/("""
                """),format.raw/*6.17*/("""<div class="alert alert-success">
                """),_display_(/*7.18*/flash/*7.23*/.get("success")),format.raw/*7.38*/("""
                """),format.raw/*8.17*/("""</div>

            """)))}),format.raw/*10.14*/("""

            """),format.raw/*12.13*/("""<div class="row">

                <div class = "col-lg-6 col-md-6 col-sm-12 col-xs-12 col-centered">
                <h3 class = "text-center text-muted">  Project Categories</h3>

                        <a href=""""),_display_(/*17.35*/routes/*17.41*/.HomeController.Project(0)),format.raw/*17.67*/(""""><button class = "btn btn-lg btn-Dark">All Project Categories
                           </button></a>
                        """),_display_(/*19.26*/for(c <- categories) yield /*19.46*/{_display_(Seq[Any](format.raw/*19.47*/("""

                            """),format.raw/*21.29*/("""<a href = """"),_display_(/*21.41*/routes/*21.47*/.HomeController.Project(c.getId)),format.raw/*21.79*/(""""><button class = "btn btn-lg btn-Dark">"""),_display_(/*21.120*/c/*21.121*/.getName),format.raw/*21.129*/("""
                            """),format.raw/*22.29*/("""<span class = "badge">"""),_display_(/*22.52*/c/*22.53*/.getProject.size()),format.raw/*22.71*/("""</span></button>
                            </a>
                        """)))}),format.raw/*24.26*/("""
                """),format.raw/*25.17*/("""</div>

                <br>

                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" id="projectbounds">

                    """),_display_(/*31.22*/for(p <- project) yield /*31.39*/ {_display_(Seq[Any](format.raw/*31.41*/("""
                        """),format.raw/*32.25*/("""<div class="col-sm-6 col-md-4 col-xs-6 col-lg-4 project">
                            <div class="thumbnail">
                                   <img src="/assets/images/productImages/"""),_display_(/*34.76*/(p.getId + ".jpg")),format.raw/*34.94*/("""" alt="...">
                                <div class="caption">
                                    <h3 class="text-center">"""),_display_(/*36.62*/p/*36.63*/.getName),format.raw/*36.71*/("""</h3>
                                    <h4 class="text-center"><span class = "redtext"><b>&euro;</b></span> """),_display_(/*37.107*/("%.2f".format(p.getPrice))),format.raw/*37.134*/("""</h4>
                                    <p class="text-center"><b>Size:</b> """),_display_(/*38.74*/p/*38.75*/.getSize),format.raw/*38.83*/("""</p>
                                    <p class="text-center"><b>Stock:</b> """),_display_(/*39.75*/p/*39.76*/.getStock),format.raw/*39.85*/("""</p>
                                    <p class="text-center"><b>Brand:</b> """),_display_(/*40.75*/p/*40.76*/.getCategory.getName),format.raw/*40.96*/("""</p>
                                    """),_display_(/*41.38*/if((user != null) && ("manager".equals(user.getRole())))/*41.94*/ {_display_(Seq[Any](format.raw/*41.96*/("""
                                        """),format.raw/*42.41*/("""<p class = "text-center"><a href=""""),_display_(/*42.76*/routes/*42.82*/.HomeController.deleteProject(p.getId)),format.raw/*42.120*/(""""
                                        onclick="return confirmDel();">
                                            <button class = "btn btn-lg btn-dark"><span class="glyphicon glyphicon-trash thrashbutton"></span> </button>
                                        </a>
                                        </p>
                                        <p class = "text-center"><a href=""""),_display_(/*47.76*/routes/*47.82*/.HomeController.updateProject(p.getId)),format.raw/*47.120*/("""">
                                            <button class = "btn btn-lg btn-Dark"><span class="glyphicon glyphicon-pencil thrashbutton"></span> </button>
                                        </a>
                                        </p>
                                    """)))}),format.raw/*51.38*/("""
                                """),format.raw/*52.33*/("""</div>
                            </div>
                        </div>
                    """)))}),format.raw/*55.22*/(""" """),format.raw/*55.23*/("""<!--End of the loop-->
                </div><!--End of product bounds-->
                <!-- /.column-->
            </div>
                <!-- /.row-->
        </div>
            <!-- /.container-->
    """)))}),format.raw/*62.6*/("""
"""))
      }
    }
  }

  def render(project:List[models.Project],categories:List[models.Category],user:models.users.User): play.twirl.api.HtmlFormat.Appendable = apply(project,categories,user)

  def f:((List[models.Project],List[models.Category],models.users.User) => play.twirl.api.HtmlFormat.Appendable) = (project,categories,user) => apply(project,categories,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Mar 18 20:41:10 GMT 2019
                  SOURCE: /home/wdd/SdevCA1/app/views/project.scala.html
                  HASH: f8d56aa3168b0a382e44122aa44178049666316d
                  MATRIX: 1004->1|1189->91|1246->123|1275->144|1314->146|1349->155|1413->193|1453->225|1492->227|1536->244|1613->295|1626->300|1661->315|1705->332|1757->353|1799->367|2042->583|2057->589|2104->615|2260->744|2296->764|2335->765|2393->795|2432->807|2447->813|2500->845|2569->886|2580->887|2610->895|2667->924|2717->947|2727->948|2766->966|2872->1041|2917->1058|3085->1199|3118->1216|3158->1218|3211->1243|3423->1428|3462->1446|3617->1574|3627->1575|3656->1583|3796->1695|3845->1722|3951->1801|3961->1802|3990->1810|4096->1889|4106->1890|4136->1899|4242->1978|4252->1979|4293->1999|4362->2041|4427->2097|4467->2099|4536->2140|4598->2175|4613->2181|4673->2219|5092->2611|5107->2617|5167->2655|5482->2939|5543->2972|5668->3066|5697->3067|5935->3275
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|37->5|37->5|37->5|38->6|39->7|39->7|39->7|40->8|42->10|44->12|49->17|49->17|49->17|51->19|51->19|51->19|53->21|53->21|53->21|53->21|53->21|53->21|53->21|54->22|54->22|54->22|54->22|56->24|57->25|63->31|63->31|63->31|64->32|66->34|66->34|68->36|68->36|68->36|69->37|69->37|70->38|70->38|70->38|71->39|71->39|71->39|72->40|72->40|72->40|73->41|73->41|73->41|74->42|74->42|74->42|74->42|79->47|79->47|79->47|83->51|84->52|87->55|87->55|94->62
                  -- GENERATED --
              */
          