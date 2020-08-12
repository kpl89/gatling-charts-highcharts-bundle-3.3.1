
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation1 extends Simulation {

	val httpProtocol = http
		.baseUrl("http://localhost:8080")
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

	val headers_30 = Map(
		"Content-Type" -> "application/json",
		"Origin" -> "http://localhost:8080",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin")



	val scn = scenario("RecordedSimulation1")
		.exec(http("request_0")
			.get("/v1/products")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/v1/products")
			.headers(headers_0),
            http("request_2")
			.get("/v1/products")
			.headers(headers_0),
            http("request_3")
			.get("/v1/products")
			.headers(headers_0),
            http("request_4")
			.get("/v1/products")
			.headers(headers_0),
            http("request_5")
			.get("/v1/products")
			.headers(headers_0),
            http("request_6")
			.get("/v1/products")
			.headers(headers_0),
            http("request_7")
			.get("/v1/products")
			.headers(headers_0),
            http("request_8")
			.get("/v1/products")
			.headers(headers_0),
            http("request_9")
			.get("/v1/products")
			.headers(headers_0),
            http("request_10")
			.get("/v1/products")
			.headers(headers_0),
            http("request_11")
			.get("/v1/products")
			.headers(headers_0),
            http("request_12")
			.get("/v1/products")
			.headers(headers_0),
            http("request_13")
			.get("/v1/products")
			.headers(headers_0),
            http("request_14")
			.get("/v1/products")
			.headers(headers_0),
            http("request_15")
			.get("/v1/products")
			.headers(headers_0),
            http("request_16")
			.get("/v1/products")
			.headers(headers_0),
            http("request_17")
			.get("/v1/products")
			.headers(headers_0),
            http("request_18")
			.get("/v1/products")
			.headers(headers_0),
            http("request_19")
			.get("/v1/products")
			.headers(headers_0),
            http("request_20")
			.get("/v1/products")
			.headers(headers_0),
            http("request_21")
			.get("/v1/products")
			.headers(headers_0),
            http("request_22")
			.get("/v1/products")
			.headers(headers_0),
            http("request_23")
			.get("/v1/products")
			.headers(headers_0),
            http("request_24")
			.get("/v1/products")
			.headers(headers_0),
            http("request_25")
			.get("/v1/products")
			.headers(headers_0),
            http("request_26")
			.get("/v1/products")
			.headers(headers_0),
            http("request_27")
			.get("/v1/products")
			.headers(headers_0),
            http("request_28")
			.get("/v1/products")
			.headers(headers_0),
            http("request_29")
			.get("/v1/products")
			.headers(headers_0)))
		.pause(5)
		.exec(http("request_30")
			.post("/v1/products")
			.headers(headers_30)
			.resources(http("request_31")
			.post("/v1/products")
			.headers(headers_30),
            http("request_32")
			.post("/v1/products")
			.headers(headers_30),
            http("request_33")
			.post("/v1/products")
			.headers(headers_30),
            http("request_34")
			.post("/v1/products")
			.headers(headers_30),
            http("request_35")
			.post("/v1/products")
			.headers(headers_30),
            http("request_36")
			.post("/v1/products")
			.headers(headers_30),
            http("request_37")
			.post("/v1/products")
			.headers(headers_30),
            http("request_38")
			.post("/v1/products")
			.headers(headers_30),
            http("request_39")
			.post("/v1/products")
			.headers(headers_30),
            http("request_40")
			.post("/v1/products")
			.headers(headers_30),
            http("request_41")
			.post("/v1/products")
			.headers(headers_30),
            http("request_42")
			.post("/v1/products")
			.headers(headers_30),
            http("request_43")
			.post("/v1/products")
			.headers(headers_30),
            http("request_44")
			.post("/v1/products")
			.headers(headers_30),
            http("request_45")
			.post("/v1/products")
			.headers(headers_30),
            http("request_46")
			.post("/v1/products")
			.headers(headers_30),
            http("request_47")
			.post("/v1/products")
			.headers(headers_30),
            http("request_48")
			.post("/v1/products")
			.headers(headers_30),
            http("request_49")
			.post("/v1/products")
			.headers(headers_30),
            http("request_50")
			.post("/v1/products")
			.headers(headers_30),
            http("request_51")
			.post("/v1/products")
			.headers(headers_30),
            http("request_52")
			.post("/v1/products")
			.headers(headers_30),
            http("request_53")
			.post("/v1/products")
			.headers(headers_30),
            http("request_54")
			.post("/v1/products")
			.headers(headers_30),
            http("request_55")
			.post("/v1/products")
			.headers(headers_30),
            http("request_56")
			.post("/v1/products")
			.headers(headers_30),
            http("request_57")
			.post("/v1/products")
			.headers(headers_30),
            http("request_58")
			.post("/v1/products")
			.headers(headers_30),
            http("request_59")
			.post("/v1/products")
			.headers(headers_30),
            http("request_60")
			.post("/v1/products")
			.headers(headers_30),
            http("request_61")
			.post("/v1/products")
			.headers(headers_30),
            http("request_62")
			.post("/v1/products")
			.headers(headers_30),
            http("request_63")
			.post("/v1/products")
			.headers(headers_30),
            http("request_64")
			.post("/v1/products")
			.headers(headers_30),
            http("request_65")
			.post("/v1/products")
			.headers(headers_30),
            http("request_66")
			.post("/v1/products")
			.headers(headers_30),
            http("request_67")
			.post("/v1/products")
			.headers(headers_30),
            http("request_68")
			.post("/v1/products")
			.headers(headers_30)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}