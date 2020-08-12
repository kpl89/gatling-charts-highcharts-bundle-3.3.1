
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class WebFluxDemo extends Simulation {

	val httpProtocol = http
		.baseUrl("http://orc-ac0-gat-001:8080")
		.inferHtmlResources()
		.acceptHeader("text/event-stream")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.9")
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/84.0.4147.89 Safari/537.36")

	val headers_0 = Map("Pragma" -> "no-cache")

	val headers_3 = Map(
		"Origin" -> "http://orc-ac0-gat-001:8080",
		"Pragma" -> "no-cache")



	val scn = scenario("WebFluxDemo")
		.exec(http("getWith100msLatency")
			.get("/v1/getWith100msLatency")
			.headers(headers_0))
		.exec(http("getWith25msLatency")
			.get("/v1/getWith25msLatency")
			.headers(headers_0)
			.resources(http("getWith10sLatency")
			.get("/v1/getWith10sLatency")
			.headers(headers_0)))
		.exec(http("postWith200msLatency")
			.post("/v1/postWith200msLatency")
			.headers(headers_3))
		.exec(http("postWith300msLatency")
			.post("/v1/postWith300msLatency")
			.headers(headers_3))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}