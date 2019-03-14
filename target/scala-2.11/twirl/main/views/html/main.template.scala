
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,models.User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, user: models.User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import javax.swing.text.html.HTML

Seq[Any](format.raw/*1.51*/("""
"""),format.raw/*3.1*/("""<html>
    <head>
        <title>IT Project Management</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
            <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
        <script type="text/javascript" src="http://netdna.bootstrapcdn.com/bootstra/p3.3.4/js/bootstrap.min.js"></script>
        <link href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link href="http://cdn.phpoll.com/css/animate.css" rel="stylesheet">
            <!--Animated css file-->
            <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <link rel="stylesheet" type="text/css" href=""""),_display_(/*17.55*/routes/*17.61*/.Assets.versioned("stylesheets/stylesheet.css")),format.raw/*17.108*/("""">
        <link href="https://fonts.googleapis.com/css?family=Pacifico" rel="stylesheet">
    </head>

    <body>
        <nav class="navbar">
            <div class="container">
                    <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href=""""),_display_(/*32.52*/routes/*32.58*/.HomeController.index()),format.raw/*32.81*/("""" id="navbarlogo">IT Project Management &trade;</a>
                </div>
                    <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-right">
                        <li """),_display_(/*37.30*/if(title == "home")/*37.49*/ {_display_(Seq[Any](format.raw/*37.51*/("""
                            """),format.raw/*38.29*/("""class="active"""")))}),format.raw/*38.44*/("""><a href=""""),_display_(/*38.55*/routes/*38.61*/.HomeController.index()),format.raw/*38.84*/("""">Home</a></li>
                        <li """),_display_(/*39.30*/if(title == "products")/*39.53*/ {_display_(Seq[Any](format.raw/*39.55*/("""
                            """),format.raw/*40.29*/("""class="active"""")))}),format.raw/*40.44*/("""><a href=""""),_display_(/*40.55*/routes/*40.61*/.HomeController.products()),format.raw/*40.87*/("""">Projects</a></li>
                            """),_display_(/*41.30*/if(user != null)/*41.46*/ {_display_(Seq[Any](format.raw/*41.48*/("""
                                """),format.raw/*42.33*/("""<li """),_display_(/*42.38*/if(title == "Add Product")/*42.64*/ {_display_(Seq[Any](format.raw/*42.66*/("""class = "active"""")))}),format.raw/*42.83*/(""">
                                <a href=""""),_display_(/*43.43*/routes/*43.49*/.HomeController.addProduct()),format.raw/*43.77*/("""">Add A Project</a>
                                </li>
                            """)))}),format.raw/*45.30*/("""
                        """),format.raw/*46.25*/("""<li """),_display_(/*46.30*/if(title == "login")/*46.50*/{_display_(Seq[Any](format.raw/*46.51*/("""class = "active"""")))}),format.raw/*46.68*/(""">
                        """),_display_(/*47.26*/if(user == null)/*47.42*/ {_display_(Seq[Any](format.raw/*47.44*/("""
                            """),format.raw/*48.29*/("""<a href=""""),_display_(/*48.39*/routes/*48.45*/.LoginController.login()),format.raw/*48.69*/("""">Login</a>
                        """)))}/*49.27*/else/*49.32*/{_display_(Seq[Any](format.raw/*49.33*/("""
                            """),format.raw/*50.29*/("""<a href = """"),_display_(/*50.41*/routes/*50.47*/.LoginController.logout()),format.raw/*50.72*/("""">Logout """),_display_(/*50.82*/user/*50.86*/.getName()),format.raw/*50.96*/("""</a>
                        """)))}),format.raw/*51.26*/("""
                    """),format.raw/*52.21*/("""</ul>

                </div>
                    <!-- /.navbar-collapse -->
            </div>
                <!-- /.container-->
        </nav> <!--End of navbar--->
        """),_display_(/*59.10*/content),format.raw/*59.17*/("""
        """),format.raw/*60.9*/("""<footer id="footer">
            <div class="container">
                <div class="row footerinfo">
                    <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
                        <h4 contenteditable="true">COPYRIGHT © 2019 IT Porject Management</h4>
                        <p>Eoin Palmer - X00136028
                        <br>Paul Roche - X00140500
                        </p>
                    </div>
                    <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
                        <a href="#"><i class="fa fa-3x fa-fw fa-instagram text-inverse pull-right"></i></a>
                        <a href="#"><i class="fa fa-3x fa-fw fa-twitter text-inverse pull-right"></i></a>
                        <a href="#"><i class="fa fa-3x fa-fw fa-facebook text-inverse pull-right"></i></a>
                        <a href="#"><i class="fa fa-3x fa-fw fa-github text-inverse pull-right"></i></a>
                    </div>
                </div>
            </div>
        </footer>
    </body>
        <!--Javascript file to make footer always on bottom of page -->
    <script>

        function confirmDel()"""),format.raw/*82.30*/("""{"""),format.raw/*82.31*/("""
            """),format.raw/*83.13*/("""return confirm('Are you sure?');
        """),format.raw/*84.9*/("""}"""),format.raw/*84.10*/("""

            """),format.raw/*86.13*/("""$(document).ready(function () """),format.raw/*86.43*/("""{"""),format.raw/*86.44*/("""

                """),format.raw/*88.17*/("""var docHeight = $(window).height();
                var footerHeight = $('#footer').height();
                var footerTop = $('#footer').position().top + footerHeight;

                if (footerTop < docHeight) """),format.raw/*92.44*/("""{"""),format.raw/*92.45*/("""
                    """),format.raw/*93.21*/("""$('#footer').css('margin-top', 10 + (docHeight - footerTop) + 'px');
                """),format.raw/*94.17*/("""}"""),format.raw/*94.18*/("""
            """),format.raw/*95.13*/("""}"""),format.raw/*95.14*/(""");
    </script>

</html>
"""))
      }
    }
  }

  def render(title:String,user:models.User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,user)(content)

  def f:((String,models.User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,user) => (content) => apply(title,user)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Thu Mar 14 15:07:05 GMT 2019
                  SOURCE: /home/wdd/SdevCA1/app/views/main.scala.html
                  HASH: 482ccdfd1686bcf635e6db1f8901203e69f374ce
                  MATRIX: 760->1|937->50|964->86|2249->1344|2264->1350|2333->1397|3149->2186|3164->2192|3208->2215|3579->2559|3607->2578|3647->2580|3704->2609|3750->2624|3788->2635|3803->2641|3847->2664|3919->2709|3951->2732|3991->2734|4048->2763|4094->2778|4132->2789|4147->2795|4194->2821|4270->2870|4295->2886|4335->2888|4396->2921|4428->2926|4463->2952|4503->2954|4551->2971|4622->3015|4637->3021|4686->3049|4804->3136|4857->3161|4889->3166|4918->3186|4957->3187|5005->3204|5059->3231|5084->3247|5124->3249|5181->3278|5218->3288|5233->3294|5278->3318|5334->3356|5347->3361|5386->3362|5443->3391|5482->3403|5497->3409|5543->3434|5580->3444|5593->3448|5624->3458|5685->3488|5734->3509|5939->3687|5967->3694|6003->3703|7166->4838|7195->4839|7236->4852|7304->4893|7333->4894|7375->4908|7433->4938|7462->4939|7508->4957|7750->5171|7779->5172|7828->5193|7941->5278|7970->5279|8011->5292|8040->5293
                  LINES: 27->1|32->1|33->3|47->17|47->17|47->17|62->32|62->32|62->32|67->37|67->37|67->37|68->38|68->38|68->38|68->38|68->38|69->39|69->39|69->39|70->40|70->40|70->40|70->40|70->40|71->41|71->41|71->41|72->42|72->42|72->42|72->42|72->42|73->43|73->43|73->43|75->45|76->46|76->46|76->46|76->46|76->46|77->47|77->47|77->47|78->48|78->48|78->48|78->48|79->49|79->49|79->49|80->50|80->50|80->50|80->50|80->50|80->50|80->50|81->51|82->52|89->59|89->59|90->60|112->82|112->82|113->83|114->84|114->84|116->86|116->86|116->86|118->88|122->92|122->92|123->93|124->94|124->94|125->95|125->95
                  -- GENERATED --
              */
          