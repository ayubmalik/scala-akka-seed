package example

import akka.testkit.TestKit
import akka.testkit.ImplicitSender
import org.scalatest.BeforeAndAfterAll
import akka.testkit.TestActors
import akka.actor.ActorSystem
import org.scalatest.Matchers
import org.scalatest.WordSpec
import akka.testkit.TestActorRef
import org.scalatest.fixture.WordSpec
import org.scalatest.WordSpecLike

class HelloActorSpec extends TestKit(ActorSystem("helloActorSys"))
    with ImplicitSender
    with Matchers
    with WordSpecLike {

  "Hello actor" must {
    "say hello in message" in {
      val actorRef = TestActorRef[HelloActor]
      actorRef ! "akka"
      expectMsg("Hello akka")
    }
  }

}