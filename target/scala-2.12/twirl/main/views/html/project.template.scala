
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


Seq[Any](format.raw/*2.1*/("""    """),_display_(/*2.6*/main("project", user)/*2.27*/ {_display_(Seq[Any](format.raw/*2.29*/("""
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
                                    <img src= ("images/projectImages/("""),_display_(/*34.72*/p/*34.73*/.getId),format.raw/*34.79*/(""")" + ".jpg")  alt="...">
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
                  DATE: Mon Mar 18 17:15:31 GMT 2019
                  SOURCE: /home/wdd/SdevCA1/app/views/project.scala.html
                  HASH: cf192d196f774419b3c1177c41691b49b71b5fab
                  MATRIX: 1004->1|1188->92|1218->97|1247->118|1286->120|1321->129|1385->167|1425->199|1464->201|1508->218|1585->269|1598->274|1633->289|1677->306|1729->327|1771->341|2014->557|2029->563|2076->589|2232->718|2268->738|2307->739|2365->769|2404->781|2419->787|2472->819|2541->860|2552->861|2582->869|2639->898|2689->921|2699->922|2738->940|2844->1015|2889->1032|3057->1173|3090->1190|3130->1192|3183->1217|3391->1398|3401->1399|3428->1405|3595->1545|3605->1546|3634->1554|3774->1666|3823->1693|3929->1772|3939->1773|3968->1781|4074->1860|4084->1861|4114->1870|4220->1949|4230->1950|4271->1970|4340->2012|4405->2068|4445->2070|4514->2111|4576->2146|4591->2152|4651->2190|5070->2582|5085->2588|5145->2626|5460->2910|5521->2943|5646->3037|5675->3038|5913->3246
                  LINES: 28->1|33->2|33->2|33->2|33->2|34->3|36->5|36->5|36->5|37->6|38->7|38->7|38->7|39->8|41->10|43->12|48->17|48->17|48->17|50->19|50->19|50->19|52->21|52->21|52->21|52->21|52->21|52->21|52->21|53->22|53->22|53->22|53->22|55->24|56->25|62->31|62->31|62->31|63->32|65->34|65->34|65->34|67->36|67->36|67->36|68->37|68->37|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|73->42|73->42|73->42|73->42|78->47|78->47|78->47|82->51|83->52|86->55|86->55|93->62
                  -- GENERATED --
              */
          