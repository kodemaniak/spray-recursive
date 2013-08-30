package km

import org.scalatest.WordSpec
import org.scalatest.matchers.ShouldMatchers

import com.typesafe.config.ConfigFactory

import spray.json._
import RestApiProtocol._
import akka.actor.ActorSystem
import spray.http.StatusCodes._
import spray.httpx.RequestBuilding._
import spray.httpx.SprayJsonSupport._
import spray.testkit.ScalatestRouteTest

class TreesResourceTest extends WordSpec with ShouldMatchers with ScalatestRouteTest with TreesResource {
  def actorRefFactory = system

  "The trees resource" should {
    "return the root branch" in {
      Get("/branches") ~> treesRoute ~> check {
        status.intValue should be(200)
        entityAs[Branch] should equal(rootBranch)
      }
    }
  }
}