// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/SdevCA1/conf/routes
// @DATE:Mon Mar 18 16:51:05 GMT 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
