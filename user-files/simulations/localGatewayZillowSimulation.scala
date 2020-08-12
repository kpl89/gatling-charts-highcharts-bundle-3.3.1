
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class localGatewayZillowSimulation extends Simulation {

	val httpProtocol = http
		.baseUrl("http://localhost:19001")
		.inferHtmlResources()
		.acceptHeader("*/*")
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/83.0.4103.97 Safari/537.36")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "none",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_1 = Map(
		"Accept-Encoding" -> "gzip, deflate",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Origin" -> "http://localhost:19001",
		"Pragma" -> "no-cache")

	val headers_4 = Map(
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"cache-control" -> "no-cache",
		"pragma" -> "no-cache",
		"sec-fetch-dest" -> "script",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site")

	val headers_9 = Map(
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"cache-control" -> "no-cache",
		"origin" -> "http://localhost:19001",
		"pragma" -> "no-cache",
		"sec-fetch-dest" -> "font",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site")

	val headers_15 = Map(
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"cache-control" -> "no-cache",
		"pragma" -> "no-cache",
		"sec-fetch-dest" -> "script",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site",
		"x-client-data" -> "CIu2yQEIpLbJAQjBtskBCKmdygEI0KDKAQiRrMoBCP+8ygEI58bKARibvsoB")

	val headers_16 = Map(
		"accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"cache-control" -> "no-cache",
		"pragma" -> "no-cache",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site")

	val headers_20 = Map(
		"accept" -> "application/signed-exchange;v=b3;q=0.9,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"cache-control" -> "no-cache",
		"pragma" -> "no-cache",
		"purpose" -> "prefetch",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site")

	val headers_21 = Map(
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"cache-control" -> "no-cache",
		"content-type" -> "text/plain;charset=UTF-8",
		"origin" -> "http://localhost:19001",
		"pragma" -> "no-cache",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site")

	val headers_22 = Map(
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9",
		"Content-Type" -> "text/plain;charset=UTF-8",
		"Origin" -> "http://localhost:19001",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin")

	val headers_28 = Map(
		"accept" -> "text/css,*/*;q=0.1",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"cache-control" -> "no-cache",
		"pragma" -> "no-cache",
		"sec-fetch-dest" -> "style",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site",
		"x-client-data" -> "CIu2yQEIpLbJAQjBtskBCKmdygEI0KDKAQiRrMoBCP+8ygEI58bKARibvsoB")

	val headers_29 = Map(
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"cache-control" -> "no-cache",
		"origin" -> "http://localhost:19001",
		"pragma" -> "no-cache",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site",
		"x-client-data" -> "CIu2yQEIpLbJAQjBtskBCKmdygEI0KDKAQiRrMoBCP+8ygEI58bKARibvsoB")

	val headers_30 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"Upgrade-Insecure-Requests" -> "1")

	val headers_32 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"cache-control" -> "no-cache",
		"pragma" -> "no-cache",
		"sec-fetch-dest" -> "iframe",
		"sec-fetch-mode" -> "navigate",
		"sec-fetch-site" -> "cross-site",
		"upgrade-insecure-requests" -> "1")

	val headers_34 = Map(
		"accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"cache-control" -> "no-cache",
		"pragma" -> "no-cache",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site",
		"x-client-data" -> "CIu2yQEIpLbJAQjBtskBCKmdygEI0KDKAQiRrMoBCP+8ygEI58bKARibvsoB")

	val headers_46 = Map(
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"cache-control" -> "no-cache",
		"origin" -> "http://localhost:19001",
		"pragma" -> "no-cache",
		"sec-fetch-dest" -> "script",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site")

	val headers_64 = Map(
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9",
		"cache-control" -> "no-cache",
		"origin" -> "http://localhost:19001",
		"pragma" -> "no-cache",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site")

    val uri01 = "https://static.candidate.zillow.net/static-zsg/LATEST/static-zsg/zsg/z-fonts/ivar/IvarHeadline-SemiBold-core.woff"
    val uri02 = "4704202.fls.doubleclick.net"
    val uri03 = "https://accounts.google.com/gsi"
    val uri04 = "https://js.sentry-cdn.com/76d0360710d64dd0b9918689d9b9fa4b.min.js"
    val uri05 = "http://3973258.fls.doubleclick.net"
    val uri06 = "https://analytics-zg-api.test.zillow.net"
    val uri08 = "www.googletagmanager.com"
    val uri09 = "https://adservice.google.com/ddm/fls/z"
    val uri10 = "http://fonts.gstatic.com/s/opensans/v17"
    val uri11 = "https://s.zillow.net/s3"
    val uri12 = "https://negbar.ad-blocker.org/chrome/adblocker-chromeglobalinjectjs.js"

	val scn = scenario("localGatewayZillowSimulation")
		.exec(http("request_0")
			.get("/")
			.headers(headers_0)
			.resources(http("request_1")
			.get(uri10 + "/mem5YaGs126MiZpBA-UNirkOUuhpKKSTjw.woff2")
			.headers(headers_1),
            http("request_2")
			.get(uri10 + "/mem8YaGs126MiZpBA-UFVZ0bf8pkAg.woff2")
			.headers(headers_1),
            http("request_3")
			.get("http://" + uri08 + "/gtm.js?id=GTM-WTRMC7"),
            http("request_4")
			.get(uri11 + "/homepage/_next/static/8ybhMRX3eugRy8cP5mdrj/lazyComponents/pageFrame.js")
			.headers(headers_4),
            http("request_5")
			.get(uri11 + "/homepage/_next/static/8ybhMRX3eugRy8cP5mdrj/lazyComponents/signInComponents.js")
			.headers(headers_4),
            http("request_6")
			.get(uri11 + "/homepage/_next/static/8ybhMRX3eugRy8cP5mdrj/pages/buy.js")
			.headers(headers_4),
            http("request_7")
			.get(uri11 + "/homepage/_next/static/runtime/webpack-1a8e5a5.js")
			.headers(headers_4),
            http("request_8")
			.get(uri11 + "/homepage/_next/static/8ybhMRX3eugRy8cP5mdrj/pages/_app.js")
			.headers(headers_4),
            http("request_9")
			.get(uri01)
			.headers(headers_9),
            http("request_10")
			.get(uri11 + "/homepage/_next/static/runtime/main-5db85ce.js")
			.headers(headers_4),
            http("request_11")
			.get(uri11 + "/homepage/_next/static/8ybhMRX3eugRy8cP5mdrj/lazyComponents/homepageComponents.js")
			.headers(headers_4),
            http("request_12")
			.get(uri11 + "/homepage/_next/static/chunks/commons.56289e6.js")
			.headers(headers_4),
            http("request_13")
			.get(uri11 + "/homepage/_next/static/8ybhMRX3eugRy8cP5mdrj/lazyComponents/searchBox.js")
			.headers(headers_4),
            http("request_14")
			.get(uri06 + "/a/z/js/v1/analytics.js")
			.headers(headers_4),
            http("request_15")
			.get(uri03 + "/client")
			.headers(headers_15),
            http("request_16")
			.get(uri11 + "/homepage/static/_Desktop_Overlay_Covid.jpg")
			.headers(headers_16),
            http("request_17")
			.get("https://" + uri08 + "/gtm.js?id=GTM-WTRMC7")
			.headers(headers_4),
            http("request_18")
			.get(uri11 + "/homepage/_next/static/chunks/HomeCardList.224af02.js")
			.headers(headers_4),
            http("request_19")
			.get(uri12)
			.headers(headers_4),
            http("request_20")
			.get(uri11 + "/homepage/_next/static/chunks/SearchBar.0dd5604.js")
			.headers(headers_20),
            http("request_21")
			.post(uri06 + "/click/z_test/4d6a152c-eba0-4ed7-8a3f-68f133822e06")
			.headers(headers_21)
			.body(RawFileBody("/localgatewayzillowsimulation/0021_request.txt")),
            http("request_22")
			.post("/ui/ClientProfile.htm?pageName=HOPS:Homepage&hostId=_xaypCHahQjYMjgkxBSQ7A&requestId=e9bc9d53-1ebd-411c-b3b9-fc1bef601e50&profile=397%20TTFB,921%20DOMContentLoaded")
			.headers(headers_22),
            http("request_23")
			.post("/ui/JavascriptEnabled.htm?zPage=HOPS:Homepage&hostId=_xaypCHahQjYMjgkxBSQ7A&guid=4d6a152c-eba0-4ed7-8a3f-68f133822e06&time=1594859887236")
			.headers(headers_22),
            http("request_24")
			.get(uri11 + "/homepage/static/Resource_center.png")
			.headers(headers_16),
            http("request_25")
			.get(uri11 + "/homepage/static/3D_home_tours.png")
			.headers(headers_16),
            http("request_26")
			.get(uri11 + "/homepage/static/Managing_finances.png")
			.headers(headers_16),
            http("request_27")
			.post(uri06 + "/click/z_test/4d6a152c-eba0-4ed7-8a3f-68f133822e06")
			.headers(headers_21)
			.body(RawFileBody("/localgatewayzillowsimulation/0027_request.txt")),
            http("request_28")
			.get(uri03 + "/style")
			.headers(headers_28),
            http("request_29")
			.get(uri03 + "/status?client_id=238648973530-phn3l5mlqc61qms7m76qjta4mpubcedu.apps.googleusercontent.com&as=AN5MSLQPj67co%2FoYgFuOvQ")
			.headers(headers_29)
			.check(status.is(403)),
            http("request_30")
			.get(uri05 + "/activityi;src=3973258;type=homep516;cat=zillo008;ord=5785552610685;gtm=2wg783;auiddc=1193724320.1594848165;u6=undefined;u7=;u8=;~oref=http%3A%2F%2Flocalhost%3A19001%2F?")
			.headers(headers_30),
            http("request_31")
			.get("http://" + uri02 + "/activityi;src=4704202;type=homep0;cat=homep0;ord=3407866195075;gtm=2wg783;auiddc=1193724320.1594848165;u3=undefined;u2=undefined;u1=undefined;u5=undefined;u4=undefined;u6=undefined;u7=;u8=undefined;~oref=http%3A%2F%2Flocalhost%3A19001%2F?")
			.headers(headers_30),
            http("request_32")
			.get("https://" + uri02 + "/activityi;dc_pre=CPSy-IjE0OoCFakFrQYdh-8JKg;src=4704202;type=homep0;cat=homep0;ord=3407866195075;gtm=2wg783;auiddc=1193724320.1594848165;u3=undefined;u2=undefined;u1=undefined;u5=undefined;u4=undefined;u6=undefined;u7=;u8=undefined;~oref=http%3A%2F%2Flocalhost%3A19001%2F?")
			.headers(headers_32),
            http("request_33")
			.post("/ui/ClientProfile.htm?pageName=HOPS:Homepage&hostId=_xaypCHahQjYMjgkxBSQ7A&requestId=e9bc9d53-1ebd-411c-b3b9-fc1bef601e50&profile=1107%20AFT%20Interactive,1107%20AFT%20Interactive,1767%20loaded%20HOPS:Homepage,1767%20loaded%20HOPS:Homepage,1768%20onload%20completed,1768%20onload%20completed")
			.headers(headers_22),
            http("request_34")
			.get(uri09 + "/dc_pre=CPSy-IjE0OoCFakFrQYdh-8JKg;src=4704202;type=homep0;cat=homep0;ord=3407866195075;gtm=2wg783;auiddc=*;u3=undefined;u2=undefined;u1=undefined;u5=undefined;u4=undefined;u6=undefined;u7=;u8=undefined;~oref=http%3A%2F%2Flocalhost%3A19001%2F")
			.headers(headers_34),
            http("request_35")
			.get(uri09 + "/dc_pre=CNng9IjE0OoCFYcYrQYd3Y0Ftg;src=3973258;type=homep516;cat=zillo008;ord=5785552610685;gtm=2wg783;auiddc=*;u6=undefined;u7=;u8=;~oref=http%3A%2F%2Flocalhost%3A19001%2F")
			.headers(headers_34)))
		.pause(2)
		.exec(http("request_36")
			.post("/ui/ClientProfile.htm?pageName=HOPS:Homepage&hostId=_xaypCHahQjYMjgkxBSQ7A&requestId=e9bc9d53-1ebd-411c-b3b9-fc1bef601e50&profile=6102%20usernavigated,6102%20usernavigated,2738%20fullyLoaded")
			.headers(headers_22)
			.resources(http("request_37")
			.get("/")
			.headers(headers_0),
            http("request_38")
			.get(uri10 + "/mem8YaGs126MiZpBA-UFVZ0bf8pkAg.woff2")
			.headers(headers_1),
            http("request_39")
			.get(uri10 + "/mem5YaGs126MiZpBA-UNirkOUuhpKKSTjw.woff2")
			.headers(headers_1),
            http("request_40")
			.get("http://" + uri08 + "/gtm.js?id=GTM-WTRMC7"),
            http("request_41")
			.get(uri11 + "/homepage/_next/static/8ybhMRX3eugRy8cP5mdrj/lazyComponents/searchBox.js")
			.headers(headers_4),
            http("request_42")
			.get(uri11 + "/homepage/_next/static/8ybhMRX3eugRy8cP5mdrj/lazyComponents/pageFrame.js")
			.headers(headers_4),
            http("request_43")
			.get(uri11 + "/homepage/_next/static/8ybhMRX3eugRy8cP5mdrj/lazyComponents/homepageComponents.js")
			.headers(headers_4),
            http("request_44")
			.get(uri11 + "/homepage/_next/static/8ybhMRX3eugRy8cP5mdrj/pages/buy.js")
			.headers(headers_4),
            http("request_45")
			.get(uri11 + "/homepage/_next/static/8ybhMRX3eugRy8cP5mdrj/pages/_app.js")
			.headers(headers_4),
            http("request_46")
			.get(uri04)
			.headers(headers_46),
            http("request_47")
			.get(uri11 + "/homepage/_next/static/runtime/main-5db85ce.js")
			.headers(headers_4),
            http("request_48")
			.get(uri11 + "/homepage/_next/static/runtime/webpack-1a8e5a5.js")
			.headers(headers_4),
            http("request_49")
			.get(uri01)
			.headers(headers_9),
            http("request_50")
			.get(uri06 + "/a/z/js/v1/analytics.js")
			.headers(headers_4),
            http("request_51")
			.get(uri11 + "/homepage/_next/static/chunks/commons.56289e6.js")
			.headers(headers_4),
            http("request_52")
			.get(uri03 + "/client")
			.headers(headers_15),
            http("request_53")
			.get("https://" + uri08 + "/gtm.js?id=GTM-WTRMC7")
			.headers(headers_4),
            http("request_54")
			.get(uri11 + "/homepage/static/_Desktop_Overlay_Covid.jpg")
			.headers(headers_16),
            http("request_55")
			.get(uri12)
			.headers(headers_4),
            http("request_56")
			.get(uri11 + "/homepage/_next/static/chunks/SearchBar.0dd5604.js")
			.headers(headers_20),
            http("request_57")
			.get(uri11 + "/homepage/_next/static/chunks/HomeCardList.224af02.js")
			.headers(headers_4),
            http("request_58")
			.post(uri06 + "/click/z_test/4d6a152c-eba0-4ed7-8a3f-68f133822e06")
			.headers(headers_21)
			.body(RawFileBody("/localgatewayzillowsimulation/0058_request.txt")),
            http("request_59")
			.post("/ui/ClientProfile.htm?pageName=HOPS:Homepage&hostId=_xaypCHahQjYMjgkxBSQ7A&requestId=0c01e4e1-4eed-40c0-9cda-03cee9aa44b5&profile=274%20TTFB,734%20DOMContentLoaded")
			.headers(headers_22),
            http("request_60")
			.post("/ui/JavascriptEnabled.htm?zPage=HOPS:Homepage&hostId=_xaypCHahQjYMjgkxBSQ7A&guid=4d6a152c-eba0-4ed7-8a3f-68f133822e06&time=1594859893193")
			.headers(headers_22),
            http("request_61")
			.get(uri11 + "/homepage/static/Resource_center.png")
			.headers(headers_16),
            http("request_62")
			.get(uri11 + "/homepage/static/3D_home_tours.png")
			.headers(headers_16),
            http("request_63")
			.get(uri11 + "/homepage/static/Managing_finances.png")
			.headers(headers_16),
            http("request_64")
			.get(uri11 + "/homepage/static/manifest.json")
			.headers(headers_64),
            http("request_65")
			.get(uri05 + "/activityi;src=3973258;type=homep516;cat=zillo008;ord=4301421092121;gtm=2wg783;auiddc=1193724320.1594848165;u6=undefined;u7=;u8=;~oref=http%3A%2F%2Flocalhost%3A19001%2F?")
			.headers(headers_30),
            http("request_66")
			.get("https://" + uri02 + "/activityi;dc_pre=CIbK14vE0OoCFWcurQYdOHIHYg;src=4704202;type=homep0;cat=homep0;ord=8823312122864;gtm=2wg783;auiddc=1193724320.1594848165;u3=undefined;u2=undefined;u1=undefined;u5=undefined;u4=undefined;u6=undefined;u7=;u8=undefined;~oref=http%3A%2F%2Flocalhost%3A19001%2F?")
			.headers(headers_32),
            http("request_67")
			.get(uri09 + "/dc_pre=CM-91ovE0OoCFVgBrQYdUp8ArQ;src=3973258;type=homep516;cat=zillo008;ord=4301421092121;gtm=2wg783;auiddc=*;u6=undefined;u7=;u8=;~oref=http%3A%2F%2Flocalhost%3A19001%2F")
			.headers(headers_34),
            http("request_68")
			.post("/ui/ClientProfile.htm?pageName=HOPS:Homepage&hostId=_xaypCHahQjYMjgkxBSQ7A&requestId=0c01e4e1-4eed-40c0-9cda-03cee9aa44b5&profile=876%20AFT%20Interactive,876%20AFT%20Interactive,1544%20loaded%20HOPS:Homepage,1544%20loaded%20HOPS:Homepage,1545%20onload%20completed,1545%20onload%20completed")
			.headers(headers_22),
            http("request_69")
			.get(uri09 + "/dc_pre=CIbK14vE0OoCFWcurQYdOHIHYg;src=4704202;type=homep0;cat=homep0;ord=8823312122864;gtm=2wg783;auiddc=*;u3=undefined;u2=undefined;u1=undefined;u5=undefined;u4=undefined;u6=undefined;u7=;u8=undefined;~oref=http%3A%2F%2Flocalhost%3A19001%2F")
			.headers(headers_34),
            http("request_70")
			.post("/ui/ClientProfile.htm?pageName=HOPS:Homepage&hostId=_xaypCHahQjYMjgkxBSQ7A&requestId=0c01e4e1-4eed-40c0-9cda-03cee9aa44b5&profile=2106%20usernavigated,2106%20usernavigated")
			.headers(headers_22),
            http("request_71")
			.get("/")
			.headers(headers_0),
            http("request_72")
			.get(uri10 + "/mem5YaGs126MiZpBA-UNirkOUuhpKKSTjw.woff2")
			.headers(headers_1),
            http("request_73")
			.get(uri10 + "/mem8YaGs126MiZpBA-UFVZ0bf8pkAg.woff2")
			.headers(headers_1),
            http("request_74")
			.get(uri11 + "/homepage/_next/static/8ybhMRX3eugRy8cP5mdrj/lazyComponents/searchBox.js")
			.headers(headers_4),
            http("request_75")
			.get(uri11 + "/homepage/_next/static/8ybhMRX3eugRy8cP5mdrj/lazyComponents/signInComponents.js")
			.headers(headers_4),
            http("request_76")
			.get(uri11 + "/homepage/_next/static/8ybhMRX3eugRy8cP5mdrj/lazyComponents/pageFrame.js")
			.headers(headers_4),
            http("request_77")
			.get(uri11 + "/homepage/_next/static/8ybhMRX3eugRy8cP5mdrj/lazyComponents/homepageComponents.js")
			.headers(headers_4),
            http("request_78")
			.get(uri11 + "/homepage/_next/static/8ybhMRX3eugRy8cP5mdrj/pages/buy.js")
			.headers(headers_4),
            http("request_79")
			.get(uri11 + "/homepage/_next/static/8ybhMRX3eugRy8cP5mdrj/pages/_app.js")
			.headers(headers_4),
            http("request_80")
			.get(uri04)
			.headers(headers_46),
            http("request_81")
			.get(uri06 + "/a/z/js/v1/analytics.js")
			.headers(headers_4),
            http("request_82")
			.get(uri11 + "/homepage/_next/static/runtime/webpack-1a8e5a5.js")
			.headers(headers_4),
            http("request_83")
			.get(uri11 + "/homepage/_next/static/runtime/main-5db85ce.js")
			.headers(headers_4),
            http("request_84")
			.get(uri11 + "/homepage/_next/static/chunks/commons.56289e6.js")
			.headers(headers_4),
            http("request_85")
			.get(uri01)
			.headers(headers_9),
            http("request_86")
			.get(uri03 + "/client")
			.headers(headers_15),
            http("request_87")
			.get("http://" + uri08 + "/gtm.js?id=GTM-WTRMC7"),
            http("request_88")
			.get(uri11 + "/homepage/static/_Desktop_Overlay_Covid.jpg")
			.headers(headers_16),
            http("request_89")
			.get(uri11 + "/homepage/_next/static/chunks/SearchBar.0dd5604.js")
			.headers(headers_20),
            http("request_90")
			.get(uri11 + "/homepage/_next/static/chunks/HomeCardList.224af02.js")
			.headers(headers_4),
            http("request_91")
			.get(uri12)
			.headers(headers_4),
            http("request_92")
			.post(uri06 + "/click/z_test/4d6a152c-eba0-4ed7-8a3f-68f133822e06")
			.headers(headers_21)
			.body(RawFileBody("/localgatewayzillowsimulation/0092_request.txt")),
            http("request_93")
			.post("/ui/ClientProfile.htm?pageName=HOPS:Homepage&hostId=_xaypCHahQjYMjgkxBSQ7A&requestId=4d06a598-1707-4b31-acb7-a3ae2d264b38&profile=914%20DOMContentLoaded")
			.headers(headers_22),
            http("request_94")
			.post("/ui/JavascriptEnabled.htm?zPage=HOPS:Homepage&hostId=_xaypCHahQjYMjgkxBSQ7A&guid=4d6a152c-eba0-4ed7-8a3f-68f133822e06&time=1594859895433")
			.headers(headers_22),
            http("request_95")
			.get(uri11 + "/homepage/static/Resource_center.png")
			.headers(headers_16),
            http("request_96")
			.get(uri11 + "/homepage/static/3D_home_tours.png")
			.headers(headers_16),
            http("request_97")
			.get(uri11 + "/homepage/static/Managing_finances.png")
			.headers(headers_16),
            http("request_98")
			.post("/ui/ClientProfile.htm?pageName=HOPS:Homepage&hostId=_xaypCHahQjYMjgkxBSQ7A&requestId=4d06a598-1707-4b31-acb7-a3ae2d264b38&profile=915%20AFT%20Interactive,915%20AFT%20Interactive,933%20Loading-HomeCardList,704%20Loading-HomeCardList_intervalDuration,353%20TTFB")
			.headers(headers_22),
            http("request_99")
			.get(uri11 + "/homepage/static/manifest.json")
			.headers(headers_64),
            http("request_100")
			.get(uri05 + "/activityi;src=3973258;type=homep516;cat=zillo008;ord=5654643941879;gtm=2wg783;auiddc=1193724320.1594848165;u6=undefined;u7=;u8=;~oref=http%3A%2F%2Flocalhost%3A19001%2F?")
			.headers(headers_30),
            http("request_101")
			.get("https://" + uri02 + "/activityi;dc_pre=CPu464zE0OoCFdEsrQYdKdgBKw;src=4704202;type=homep0;cat=homep0;ord=195415490879;gtm=2wg783;auiddc=1193724320.1594848165;u3=undefined;u2=undefined;u1=undefined;u5=undefined;u4=undefined;u6=undefined;u7=;u8=undefined;~oref=http%3A%2F%2Flocalhost%3A19001%2F?")
			.headers(headers_32),
            http("request_102")
			.get(uri09 + "/dc_pre=CJC-6IzE0OoCFVMerQYd77AFiw;src=3973258;type=homep516;cat=zillo008;ord=5654643941879;gtm=2wg783;auiddc=*;u6=undefined;u7=;u8=;~oref=http%3A%2F%2Flocalhost%3A19001%2F")
			.headers(headers_34),
            http("request_103")
			.post("/ui/ClientProfile.htm?pageName=HOPS:Homepage&hostId=_xaypCHahQjYMjgkxBSQ7A&requestId=4d06a598-1707-4b31-acb7-a3ae2d264b38&profile=1745%20loaded%20HOPS:Homepage,1745%20loaded%20HOPS:Homepage,1745%20onload%20completed,1745%20onload%20completed")
			.headers(headers_22),
            http("request_104")
			.get(uri09 + "/dc_pre=CPu464zE0OoCFdEsrQYdKdgBKw;src=4704202;type=homep0;cat=homep0;ord=195415490879;gtm=2wg783;auiddc=*;u3=undefined;u2=undefined;u1=undefined;u5=undefined;u4=undefined;u6=undefined;u7=;u8=undefined;~oref=http%3A%2F%2Flocalhost%3A19001%2F")
			.headers(headers_34),
            http("request_105")
			.post("/ui/ClientProfile.htm?pageName=HOPS:Homepage&hostId=_xaypCHahQjYMjgkxBSQ7A&requestId=4d06a598-1707-4b31-acb7-a3ae2d264b38&profile=2285%20usernavigated,2285%20usernavigated")
			.headers(headers_22),
            http("request_106")
			.get("/")
			.headers(headers_0),
            http("request_107")
			.get(uri10 + "/mem5YaGs126MiZpBA-UNirkOUuhpKKSTjw.woff2")
			.headers(headers_1),
            http("request_108")
			.get(uri10 + "/mem8YaGs126MiZpBA-UFVZ0bf8pkAg.woff2")
			.headers(headers_1),
            http("request_109")
			.get(uri04)
			.headers(headers_46),
            http("request_110")
			.get(uri11 + "/homepage/_next/static/8ybhMRX3eugRy8cP5mdrj/lazyComponents/searchBox.js")
			.headers(headers_4),
            http("request_111")
			.get(uri11 + "/homepage/_next/static/8ybhMRX3eugRy8cP5mdrj/lazyComponents/signInComponents.js")
			.headers(headers_4),
            http("request_112")
			.get(uri11 + "/homepage/_next/static/8ybhMRX3eugRy8cP5mdrj/lazyComponents/pageFrame.js")
			.headers(headers_4),
            http("request_113")
			.get(uri11 + "/homepage/_next/static/8ybhMRX3eugRy8cP5mdrj/lazyComponents/homepageComponents.js")
			.headers(headers_4),
            http("request_114")
			.get(uri11 + "/homepage/_next/static/8ybhMRX3eugRy8cP5mdrj/pages/buy.js")
			.headers(headers_4),
            http("request_115")
			.get(uri11 + "/homepage/_next/static/8ybhMRX3eugRy8cP5mdrj/pages/_app.js")
			.headers(headers_4),
            http("request_116")
			.get(uri11 + "/homepage/_next/static/runtime/webpack-1a8e5a5.js")
			.headers(headers_4),
            http("request_117")
			.get(uri06 + "/a/z/js/v1/analytics.js")
			.headers(headers_4),
            http("request_118")
			.get(uri11 + "/homepage/_next/static/runtime/main-5db85ce.js")
			.headers(headers_4),
            http("request_119")
			.get(uri01)
			.headers(headers_9),
            http("request_120")
			.get("http://" + uri08 + "/gtm.js?id=GTM-WTRMC7"),
            http("request_121")
			.get(uri11 + "/homepage/_next/static/chunks/commons.56289e6.js")
			.headers(headers_4),
            http("request_122")
			.get("https://" + uri08 + "/gtm.js?id=GTM-WTRMC7")
			.headers(headers_4),
            http("request_123")
			.get(uri11 + "/homepage/static/_Desktop_Overlay_Covid.jpg")
			.headers(headers_16),
            http("request_124")
			.get(uri11 + "/homepage/_next/static/chunks/HomeCardList.224af02.js")
			.headers(headers_4),
            http("request_125")
			.get(uri11 + "/homepage/_next/static/chunks/SearchBar.0dd5604.js")
			.headers(headers_20),
            http("request_126")
			.get(uri12)
			.headers(headers_4),
            http("request_127")
			.post(uri06 + "/click/z_test/4d6a152c-eba0-4ed7-8a3f-68f133822e06")
			.headers(headers_21)
			.body(RawFileBody("/localgatewayzillowsimulation/0127_request.txt")),
            http("request_128")
			.post("/ui/ClientProfile.htm?pageName=HOPS:Homepage&hostId=_xaypCHahQjYMjgkxBSQ7A&requestId=dff93893-dc5e-45d2-ad99-c24d7968d432&profile=360%20TTFB,998%20DOMContentLoaded")
			.headers(headers_22),
            http("request_129")
			.post("/ui/JavascriptEnabled.htm?zPage=HOPS:Homepage&hostId=_xaypCHahQjYMjgkxBSQ7A&guid=4d6a152c-eba0-4ed7-8a3f-68f133822e06&time=1594859897798")
			.headers(headers_22),
            http("request_130")
			.get(uri11 + "/homepage/static/Resource_center.png")
			.headers(headers_16),
            http("request_131")
			.get(uri11 + "/homepage/static/3D_home_tours.png")
			.headers(headers_16),
            http("request_132")
			.get(uri11 + "/homepage/static/Managing_finances.png")
			.headers(headers_16),
            http("request_133")
			.get(uri11 + "/homepage/static/manifest.json")
			.headers(headers_64),
            http("request_134")
			.get(uri05 + "/activityi;src=3973258;type=homep516;cat=zillo008;ord=9656515832245;gtm=2wg783;auiddc=1193724320.1594848165;u6=undefined;u7=;u8=;~oref=http%3A%2F%2Flocalhost%3A19001%2F?")
			.headers(headers_30),
            http("request_135")
			.get("http://" + uri02 + "/activityi;src=4704202;type=homep0;cat=homep0;ord=1622390308651;gtm=2wg783;auiddc=1193724320.1594848165;u3=undefined;u2=undefined;u1=undefined;u5=undefined;u4=undefined;u6=undefined;u7=;u8=undefined;~oref=http%3A%2F%2Flocalhost%3A19001%2F?")
			.headers(headers_30),
            http("request_136")
			.get("https://" + uri02 + "/activityi;dc_pre=CMXl943E0OoCFTkmrQYd1IAKWw;src=4704202;type=homep0;cat=homep0;ord=1622390308651;gtm=2wg783;auiddc=1193724320.1594848165;u3=undefined;u2=undefined;u1=undefined;u5=undefined;u4=undefined;u6=undefined;u7=;u8=undefined;~oref=http%3A%2F%2Flocalhost%3A19001%2F?")
			.headers(headers_32),
            http("request_137")
			.get(uri09 + "/dc_pre=CMXl943E0OoCFTkmrQYd1IAKWw;src=4704202;type=homep0;cat=homep0;ord=1622390308651;gtm=2wg783;auiddc=*;u3=undefined;u2=undefined;u1=undefined;u5=undefined;u4=undefined;u6=undefined;u7=;u8=undefined;~oref=http%3A%2F%2Flocalhost%3A19001%2F")
			.headers(headers_34),
            http("request_138")
			.post("/ui/ClientProfile.htm?pageName=HOPS:Homepage&hostId=_xaypCHahQjYMjgkxBSQ7A&requestId=dff93893-dc5e-45d2-ad99-c24d7968d432&profile=1144%20AFT%20Interactive,1144%20AFT%20Interactive,1771%20loaded%20HOPS:Homepage,1771%20loaded%20HOPS:Homepage,1771%20onload%20completed,1771%20onload%20completed")
			.headers(headers_22)))
		.pause(9)
		.exec(http("request_139")
			.get(uri11 + "/homepage/_next/static/chunks/SearchBar.0dd5604.js")
			.headers(headers_4)
			.resources(http("request_140")
			.get(uri11 + "/homepage/_next/static/chunks/PageScroll.a8cf79d.js")
			.headers(headers_4),
            http("request_141")
			.get(uri11 + "/pfs/topnav-4d03146a1da505a77cb7.js")
			.headers(headers_4),
            http("request_142")
			.post("/ui/ClientProfile.htm?pageName=HOPS:Homepage&hostId=_xaypCHahQjYMjgkxBSQ7A&requestId=dff93893-dc5e-45d2-ad99-c24d7968d432&profile=12315%20Loading-LazySearchBar,12317%20Loading-LazyTopNav,12318%20Loading-ScrollIndicator,54%20Loading-LazySearchBar_intervalDuration,2166%20TTI,2477%20fullyLoaded")
			.headers(headers_22),
            http("request_143")
			.post("/ui/ClientProfile.htm?pageName=HOPS:Homepage&hostId=_xaypCHahQjYMjgkxBSQ7A&requestId=dff93893-dc5e-45d2-ad99-c24d7968d432&profile=77%20Loading-ScrollIndicator_intervalDuration")
			.headers(headers_22)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}