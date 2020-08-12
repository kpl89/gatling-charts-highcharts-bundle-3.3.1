
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class WebFluxDemoGateway extends Simulation {

	val httpProtocol = http
		.baseUrl("http://orb-ac0-gat-001:19001")
		.inferHtmlResources()
		.acceptHeader("text/event-stream")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.9")

	val headers_0 = Map("Pragma" -> "no-cache")

	val headers_3 = Map(
		"Origin" -> "http://orb-ac0-gat-001:19001",
		"Pragma" -> "no-cache")



	val scn = scenario("WebFluxDemoGateway")
		.exec(http("getWith100msLatency")
			.get("/webFluxDemo/getWith100msLatency")
			.headers(headers_0))
		.exec(http("getWith25msLatency")
			.get("/webFluxDemo/getWith25msLatency")
			.headers(headers_0)
			.resources(http("getWith10sLatency")
			.get("/webFluxDemo/getWith10sLatency")
			.headers(headers_0)))
		.exec(http("postWith200msLatency")
			.post("/webFluxDemo/postWith200msLatency")
			.headers(headers_3))
		.exec(http("postWith300msLatency")
			.post("/webFluxDemo/postWith300msLatency")
			.headers(headers_3))

	setUp(scn.inject(atOnceUsers(2))).protocols(httpProtocol)
}