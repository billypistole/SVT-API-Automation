//Callee.groovy
class Callee {
 
  String hello() {
     return "Hello world! "
  }
 
  String hello(String who) {
     return "Hello $who"
  }
 
  def static salute( who, log ) { log.info "Hello again $who!" }
}