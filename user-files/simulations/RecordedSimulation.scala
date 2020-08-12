
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseUrl("http://127.0.0.1:19000")
		.inferHtmlResources()
		.acceptHeader("*/*")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.9")
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.97 Safari/537.36")

	val headers_0 = Map(
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_34 = Map(
		"Content-Type" -> "application/json",
		"Origin" -> "http://localhost:8080",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin")



	val scn = scenario("RecordedSimulation")
		.exec(http("request_0")
			.get("/products")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/products")
			.headers(headers_0),
            http("request_2")
			.get("/products")
			.headers(headers_0),
            http("request_3")
			.get("/products")
			.headers(headers_0)))
		.pause(10)
		.exec(http("request_34")
			.post("/products")
			.headers(headers_34)
			.resources(http("request_35")
			.post("/products")
			.headers(headers_34),
            http("request_36")
			.post("/products")
			.headers(headers_34),
            http("request_37")
			.post("/products")
			.headers(headers_34)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}