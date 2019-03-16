
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object project_Scope0 {
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

class project extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[List[models.Project],List[models.Category],models.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(project: List[models.Project],categories: List[models.Category], user: models.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.113*/("""
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
                                """),_display_(/*34.34*/if(env.resource("public/images/productImages/" + p.getId + ".jpg").isDefined)/*34.111*/{_display_(Seq[Any](format.raw/*34.112*/("""
                                    """),format.raw/*35.37*/("""<img src="/assets/images/productImages/"""),_display_(/*35.77*/(p.getId + ".jpg")),format.raw/*35.95*/("""" alt="...">
                                """)))}/*36.34*/else/*36.38*/{_display_(Seq[Any](format.raw/*36.39*/("""
                                    """),format.raw/*37.37*/("""<img src=""""),_display_(/*37.48*/routes/*37.54*/.Assets.versioned("images/productplaceholder.svg")),format.raw/*37.104*/("""" alt="...">
                                """)))}),format.raw/*38.34*/("""

                                """),format.raw/*40.33*/("""<div class="caption">
                                    <h3 class="text-center">"""),_display_(/*41.62*/p/*41.63*/.getName),format.raw/*41.71*/("""</h3>
                                    <h4 class="text-center"><span class = "redtext"><b>&euro;</b></span> """),_display_(/*42.107*/("%.2f".format(p.getPrice))),format.raw/*42.134*/("""</h4>
                                    <p class="text-center"><b>Size:</b> """),_display_(/*43.74*/p/*43.75*/.getSize),format.raw/*43.83*/("""</p>
                                    <p class="text-center"><b>Stock:</b> """),_display_(/*44.75*/p/*44.76*/.getStock),format.raw/*44.85*/("""</p>
                                    <p class="text-center"><b>Brand:</b> """),_display_(/*45.75*/p/*45.76*/.getCategory.getName),format.raw/*45.96*/("""</p>
                                    """),_display_(/*46.38*/if(user != null)/*46.54*/ {_display_(Seq[Any](format.raw/*46.56*/("""
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

  def render(project:List[models.Project],categories:List[models.Category],user:models.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(project,categories,user,env)

  def f:((List[models.Project],List[models.Category],models.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (project,categories,user,env) => apply(project,categories,user,env)

  def ref: this.type = this

}


}

/**/
object project extends project_Scope0.project
              /*
                  -- GENERATED --
                  DATE: Sat Mar 16 13:41:20 GMT 2019
                  SOURCE: /home/wdd/SdevCA1/app/views/project.scala.html
                  HASH: 4b80944329b3ef14b20dc0568d7b4e8840726307
                  MATRIX: 818->1|1025->112|1056->118|1085->139|1124->141|1159->150|1223->188|1263->220|1302->222|1346->239|1423->290|1436->295|1471->310|1515->327|1567->348|1609->362|1852->578|1867->584|1914->610|2070->739|2106->759|2145->760|2203->790|2242->802|2257->808|2310->840|2379->881|2390->882|2420->890|2477->919|2527->942|2537->943|2576->961|2682->1036|2727->1053|2895->1194|2928->1211|2968->1213|3021->1238|3191->1381|3278->1458|3318->1459|3383->1496|3450->1536|3489->1554|3554->1600|3567->1604|3606->1605|3671->1642|3709->1653|3724->1659|3796->1709|3873->1755|3935->1789|4045->1872|4055->1873|4084->1881|4224->1993|4273->2020|4379->2099|4389->2100|4418->2108|4524->2187|4534->2188|4564->2197|4670->2276|4680->2277|4721->2297|4790->2339|4815->2355|4855->2357|4924->2398|4986->2433|5001->2439|5061->2477|5480->2869|5495->2875|5555->2913|5870->3197|5931->3230|6056->3324|6085->3325|6323->3533
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|36->5|36->5|36->5|37->6|38->7|38->7|38->7|39->8|41->10|43->12|48->17|48->17|48->17|50->19|50->19|50->19|52->21|52->21|52->21|52->21|52->21|52->21|52->21|53->22|53->22|53->22|53->22|55->24|56->25|62->31|62->31|62->31|63->32|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|68->37|69->38|71->40|72->41|72->41|72->41|73->42|73->42|74->43|74->43|74->43|75->44|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|78->47|83->52|83->52|83->52|87->56|88->57|91->60|91->60|98->67
                  -- GENERATED --
              */
          