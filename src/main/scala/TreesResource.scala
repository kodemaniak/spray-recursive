package km

import spray.routing.HttpService
import spray.http.EmptyEntity
import spray.json._
import spray.httpx.SprayJsonSupport._
import spray.routing.RequestContext
import akka.actor.Props
import akka.actor.ActorLogging
import akka.actor.Actor
import akka.actor.ActorRef
import scala.concurrent.duration._
import RestApiProtocol._

trait TreesResource extends HttpService {
  def treesRoute = {
    path("branches") {
      get { implicit ctx =>
        println("request was here")
        ctx.complete(rootBranch)
      }
    }
  }
  val leaf = Leaf("metric", Map("tagk" -> "tagv"), "000100010001", "metric")
  val otherBranch = Branch("00010123", "http://localhost:8888/v1/trees/1/branches/00010123", 1, "http://localhost:8888/v1/trees/1", "other", Seq(leaf), Seq(), Map("0" -> "ROOT", "1" -> "other"), 2)
  val rootBranch = Branch("0001", "http://localhost:8888/v1/trees/1/branches/0001", 1, "http://localhost:8888/v1/trees/1", "ROOT", Seq(), Seq("00010123"), Map("0" -> "ROOT"), 2)
}
