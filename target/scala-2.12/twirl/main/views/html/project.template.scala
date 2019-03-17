
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

object project extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[models.Project],List[models.Category],models.users.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(project: List[models.Project],categories: List[models.Category], user: models.users.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
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
                                """),_display_(/*34.34*/if(env.resource("public/images/projectImages/" + p.getId + ".jpg").isDefined)/*34.111*/{_display_(Seq[Any](format.raw/*34.112*/("""
                                    """),format.raw/*35.37*/("""<img src="/assets/images/projectImages/"""),_display_(/*35.77*/(p.getId + ".jpg")),format.raw/*35.95*/("""" alt="...">
                                """)))}/*36.34*/else/*36.38*/{_display_(Seq[Any](format.raw/*36.39*/("""
                                    """),format.raw/*37.37*/("""<img src=""""),_display_(/*37.48*/routes/*37.54*/.Assets.versioned("images/projectplaceholder.svg")),format.raw/*37.104*/("""" alt="...">
                                """)))}),format.raw/*38.34*/("""

                                """),format.raw/*40.33*/("""<div class="caption">
                                    <h3 class="text-center">"""),_display_(/*41.62*/p/*41.63*/.getName),format.raw/*41.71*/("""</h3>
                                    <h4 class="text-center"><span class = "redtext"><b>&euro;</b></span> """),_display_(/*42.107*/("%.2f".format(p.getPrice))),format.raw/*42.134*/("""</h4>
                                    <p class="text-center"><b>Size:</b> """),_display_(/*43.74*/p/*43.75*/.getSize),format.raw/*43.83*/("""</p>
                                    <p class="text-center"><b>Stock:</b> """),_display_(/*44.75*/p/*44.76*/.getStock),format.raw/*44.85*/("""</p>
                                    <p class="text-center"><b>Brand:</b> """),_display_(/*45.75*/p/*45.76*/.getCategory.getName),format.raw/*45.96*/("""</p>
                                    """),_display_(/*46.38*/if((user != null) && ("manager".equals(user.getRole())))/*46.94*/ {_display_(Seq[Any](format.raw/*46.96*/("""
                                        """),format.raw/*47.41*/("""<p class = "text-center"><a href=""""),_display_(/*47.76*/routes/*47.82*/.HomeController.deleteProject(p.getId)),format.raw/*47.120*/(""""
                                        onclick="return confirmDel();">
                                            <button class = "btn btn-lg btn-dark"><span class="glyphicon glyphicon-trash thrashbutton"></span> </button>
                                        </a>
                                        </p>
                                        <p class = "text-center"><a href=""""),_display_(/*52.76*/routes/*52.82*/.HomeController.updateProject(p.getId)),format.raw/*52.120*/("""">
                                            <button class = "btn btn-lg btn-Dark"><span class="glyphicon glyphicon-pencil thrashbutton"></span> </button>
                                        </a>
                                        </p>
                                    """)))}),format.raw/*56.38*/("""
                                """),format.raw/*57.33*/("""</div>
                            </div>
                        </div>
                    """)))}),format.raw/*60.22*/(""" """),format.raw/*60.23*/("""<!--End of the loop-->
                </div><!--End of product bounds-->
                <!-- /.column-->
            </div>
                <!-- /.row-->
        </div>
            <!-- /.container-->
    """)))}),format.raw/*67.6*/("""
"""))
      }
    }
  }

  def render(project:List[models.Project],categories:List[models.Category],user:models.users.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(project,categories,user,env)

  def f:((List[models.Project],List[models.Category],models.users.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (project,categories,user,env) => apply(project,categories,user,env)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Mar 17 13:56:57 GMT 2019
                  SOURCE: /home/wdd/SdevCA1/app/views/project.scala.html
                  HASH: a7d119539f78598185ee3e20ccf92f9713e7e204
                  MATRIX: 1025->1|1236->119|1266->124|1295->145|1334->147|1369->156|1433->194|1473->226|1512->228|1556->245|1633->296|1646->301|1681->316|1725->333|1777->354|1819->368|2062->584|2077->590|2124->616|2280->745|2316->765|2355->766|2413->796|2452->808|2467->814|2520->846|2589->887|2600->888|2630->896|2687->925|2737->948|2747->949|2786->967|2892->1042|2937->1059|3105->1200|3138->1217|3178->1219|3231->1244|3401->1387|3488->1464|3528->1465|3593->1502|3660->1542|3699->1560|3764->1606|3777->1610|3816->1611|3881->1648|3919->1659|3934->1665|4006->1715|4083->1761|4145->1795|4255->1878|4265->1879|4294->1887|4434->1999|4483->2026|4589->2105|4599->2106|4628->2114|4734->2193|4744->2194|4774->2203|4880->2282|4890->2283|4931->2303|5000->2345|5065->2401|5105->2403|5174->2444|5236->2479|5251->2485|5311->2523|5730->2915|5745->2921|5805->2959|6120->3243|6181->3276|6306->3370|6335->3371|6573->3579
                  LINES: 28->1|33->2|33->2|33->2|33->2|34->3|36->5|36->5|36->5|37->6|38->7|38->7|38->7|39->8|41->10|43->12|48->17|48->17|48->17|50->19|50->19|50->19|52->21|52->21|52->21|52->21|52->21|52->21|52->21|53->22|53->22|53->22|53->22|55->24|56->25|62->31|62->31|62->31|63->32|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|68->37|69->38|71->40|72->41|72->41|72->41|73->42|73->42|74->43|74->43|74->43|75->44|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|78->47|83->52|83->52|83->52|87->56|88->57|91->60|91->60|98->67
                  -- GENERATED --
              */
          