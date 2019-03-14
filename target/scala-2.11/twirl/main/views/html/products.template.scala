
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object products_Scope0 {
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

class products extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[List[models.Product],List[models.Category],models.User,play.api.Environment,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(products: List[models.Product],categories: List[models.Category], user: models.User, env: play.api.Environment):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.114*/("""
    """),_display_(/*2.6*/main("products", user)/*2.28*/ {_display_(Seq[Any](format.raw/*2.30*/("""
        """),format.raw/*3.9*/("""<div class="container">

            """),_display_(/*5.14*/if(flash.containsKey("success"))/*5.46*/ {_display_(Seq[Any](format.raw/*5.48*/("""
                """),format.raw/*6.17*/("""<div class="alert alert-success">
                """),_display_(/*7.18*/flash/*7.23*/.get("success")),format.raw/*7.38*/("""
                """),format.raw/*8.17*/("""</div>

            """)))}),format.raw/*10.14*/("""

            """),format.raw/*12.13*/("""<div class="row">

                <div class = "col-lg-6 col-md-6 col-sm-12 col-xs-12 col-centered">
                <h3 class = "text-center text-muted">  Project Categories</h3>

                        <a href=""""),_display_(/*17.35*/routes/*17.41*/.HomeController.products(0)),format.raw/*17.68*/(""""><button class = "btn btn-lg btn-Dark">All Project Categories
                           </button></a>
                        """),_display_(/*19.26*/for(c <- categories) yield /*19.46*/{_display_(Seq[Any](format.raw/*19.47*/("""

                            """),format.raw/*21.29*/("""<a href = """"),_display_(/*21.41*/routes/*21.47*/.HomeController.products(c.getId)),format.raw/*21.80*/(""""><button class = "btn btn-lg btn-Dark">"""),_display_(/*21.121*/c/*21.122*/.getName),format.raw/*21.130*/("""
                            """),format.raw/*22.29*/("""<span class = "badge">"""),_display_(/*22.52*/c/*22.53*/.getProducts.size()),format.raw/*22.72*/("""</span></button>
                            </a>
                        """)))}),format.raw/*24.26*/("""
                """),format.raw/*25.17*/("""</div>

                <br>

                <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12" id="productbounds">

                    """),_display_(/*31.22*/for(p <- products) yield /*31.40*/ {_display_(Seq[Any](format.raw/*31.42*/("""
                        """),format.raw/*32.25*/("""<div class="col-sm-6 col-md-4 col-xs-6 col-lg-4 products">
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
                                        """),format.raw/*47.41*/("""<p class = "text-center"><a href=""""),_display_(/*47.76*/routes/*47.82*/.HomeController.deleteProduct(p.getId)),format.raw/*47.120*/(""""
                                        onclick="return confirmDel();">
                                            <button class = "btn btn-lg btn-dark"><span class="glyphicon glyphicon-trash thrashbutton"></span> </button>
                                        </a>
                                        </p>
                                        <p class = "text-center"><a href=""""),_display_(/*52.76*/routes/*52.82*/.HomeController.updateProduct(p.getId)),format.raw/*52.120*/("""">
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

  def render(products:List[models.Product],categories:List[models.Category],user:models.User,env:play.api.Environment): play.twirl.api.HtmlFormat.Appendable = apply(products,categories,user,env)

  def f:((List[models.Product],List[models.Category],models.User,play.api.Environment) => play.twirl.api.HtmlFormat.Appendable) = (products,categories,user,env) => apply(products,categories,user,env)

  def ref: this.type = this

}


}

/**/
object products extends products_Scope0.products
              /*
                  -- GENERATED --
                  DATE: Thu Mar 14 20:55:42 GMT 2019
                  SOURCE: /home/wdd/SdevCA1/app/views/products.scala.html
                  HASH: c5011686b9387554c95da9739a74558c1a8d8ee4
                  MATRIX: 820->1|1028->113|1059->119|1089->141|1128->143|1163->152|1227->190|1267->222|1306->224|1350->241|1427->292|1440->297|1475->312|1519->329|1571->350|1613->364|1856->580|1871->586|1919->613|2075->742|2111->762|2150->763|2208->793|2247->805|2262->811|2316->844|2385->885|2396->886|2426->894|2483->923|2533->946|2543->947|2583->966|2689->1041|2734->1058|2902->1199|2936->1217|2976->1219|3029->1244|3200->1388|3287->1465|3327->1466|3392->1503|3459->1543|3498->1561|3563->1607|3576->1611|3615->1612|3680->1649|3718->1660|3733->1666|3805->1716|3882->1762|3944->1796|4054->1879|4064->1880|4093->1888|4233->2000|4282->2027|4388->2106|4398->2107|4427->2115|4533->2194|4543->2195|4573->2204|4679->2283|4689->2284|4730->2304|4799->2346|4824->2362|4864->2364|4933->2405|4995->2440|5010->2446|5070->2484|5489->2876|5504->2882|5564->2920|5879->3204|5940->3237|6065->3331|6094->3332|6332->3540
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|36->5|36->5|36->5|37->6|38->7|38->7|38->7|39->8|41->10|43->12|48->17|48->17|48->17|50->19|50->19|50->19|52->21|52->21|52->21|52->21|52->21|52->21|52->21|53->22|53->22|53->22|53->22|55->24|56->25|62->31|62->31|62->31|63->32|65->34|65->34|65->34|66->35|66->35|66->35|67->36|67->36|67->36|68->37|68->37|68->37|68->37|69->38|71->40|72->41|72->41|72->41|73->42|73->42|74->43|74->43|74->43|75->44|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|78->47|83->52|83->52|83->52|87->56|88->57|91->60|91->60|98->67
                  -- GENERATED --
              */
          