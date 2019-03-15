
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/SdevCA1/conf/routes
// @DATE:Fri Mar 15 12:37:05 GMT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:10
  LoginController_2: controllers.LoginController,
  // @LINE:30
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:10
    LoginController_2: controllers.LoginController,
    // @LINE:30
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, LoginController_2, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, LoginController_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Project""", """controllers.HomeController.Project(cat:Long ?= 0L)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.LoginController.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """loginSubmit""", """controllers.LoginController.loginSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.LoginController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addProject""", """controllers.HomeController.addProject"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addProjectSubmit""", """controllers.HomeController.addProjectSubmit"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delProject/""" + "$" + """id<[^/]+>""", """controllers.HomeController.deleteProject(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """updateProject/""" + "$" + """id<[^/]+>""", """controllers.HomeController.updateProject(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Manager""", """controllers.HomeController.usersManager"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Employee""", """controllers.HomeController.usersEmployee"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_Project1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Project")))
  )
  private[this] lazy val controllers_HomeController_Project1_invoker = createInvoker(
    HomeController_0.Project(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "Project",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """Project"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_LoginController_login2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_LoginController_login2_invoker = createInvoker(
    LoginController_2.login,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "login",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_LoginController_loginSubmit3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("loginSubmit")))
  )
  private[this] lazy val controllers_LoginController_loginSubmit3_invoker = createInvoker(
    LoginController_2.loginSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "loginSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """loginSubmit"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_LoginController_logout4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_LoginController_logout4_invoker = createInvoker(
    LoginController_2.logout,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.LoginController",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_addProject5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addProject")))
  )
  private[this] lazy val controllers_HomeController_addProject5_invoker = createInvoker(
    HomeController_0.addProject,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addProject",
      Nil,
      "GET",
      """""",
      this.prefix + """addProject"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_addProjectSubmit6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addProjectSubmit")))
  )
  private[this] lazy val controllers_HomeController_addProjectSubmit6_invoker = createInvoker(
    HomeController_0.addProjectSubmit,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "addProjectSubmit",
      Nil,
      "POST",
      """""",
      this.prefix + """addProjectSubmit"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_HomeController_deleteProject7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delProject/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_deleteProject7_invoker = createInvoker(
    HomeController_0.deleteProject(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "deleteProject",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """delProject/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_updateProject8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("updateProject/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_updateProject8_invoker = createInvoker(
    HomeController_0.updateProject(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "updateProject",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """updateProject/""" + "$" + """id<[^/]+>"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_HomeController_usersManager9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Manager")))
  )
  private[this] lazy val controllers_HomeController_usersManager9_invoker = createInvoker(
    HomeController_0.usersManager,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "usersManager",
      Nil,
      "GET",
      """""",
      this.prefix + """Manager"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_HomeController_usersEmployee10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Employee")))
  )
  private[this] lazy val controllers_HomeController_usersEmployee10_invoker = createInvoker(
    HomeController_0.usersEmployee,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "usersEmployee",
      Nil,
      "GET",
      """""",
      this.prefix + """Employee"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Assets_versioned11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned11_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index)
      }
  
    // @LINE:8
    case controllers_HomeController_Project1_route(params) =>
      call(params.fromQuery[Long]("cat", Some(0L))) { (cat) =>
        controllers_HomeController_Project1_invoker.call(HomeController_0.Project(cat))
      }
  
    // @LINE:10
    case controllers_LoginController_login2_route(params) =>
      call { 
        controllers_LoginController_login2_invoker.call(LoginController_2.login)
      }
  
    // @LINE:12
    case controllers_LoginController_loginSubmit3_route(params) =>
      call { 
        controllers_LoginController_loginSubmit3_invoker.call(LoginController_2.loginSubmit)
      }
  
    // @LINE:14
    case controllers_LoginController_logout4_route(params) =>
      call { 
        controllers_LoginController_logout4_invoker.call(LoginController_2.logout)
      }
  
    // @LINE:16
    case controllers_HomeController_addProject5_route(params) =>
      call { 
        controllers_HomeController_addProject5_invoker.call(HomeController_0.addProject)
      }
  
    // @LINE:18
    case controllers_HomeController_addProjectSubmit6_route(params) =>
      call { 
        controllers_HomeController_addProjectSubmit6_invoker.call(HomeController_0.addProjectSubmit)
      }
  
    // @LINE:20
    case controllers_HomeController_deleteProject7_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_deleteProject7_invoker.call(HomeController_0.deleteProject(id))
      }
  
    // @LINE:22
    case controllers_HomeController_updateProject8_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_HomeController_updateProject8_invoker.call(HomeController_0.updateProject(id))
      }
  
    // @LINE:24
    case controllers_HomeController_usersManager9_route(params) =>
      call { 
        controllers_HomeController_usersManager9_invoker.call(HomeController_0.usersManager)
      }
  
    // @LINE:26
    case controllers_HomeController_usersEmployee10_route(params) =>
      call { 
        controllers_HomeController_usersEmployee10_invoker.call(HomeController_0.usersEmployee)
      }
  
    // @LINE:30
    case controllers_Assets_versioned11_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned11_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
