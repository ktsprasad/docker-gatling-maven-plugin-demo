package computerdatabase

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._

class BasicSimulation extends Simulation {

  val httpProtocol = http
    .baseUrl("https://harman-0.ps.qa.digitalreasoning.com:8999") // Here is the root for all relative URLs
    .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8") // Here are the common headers
    .acceptEncodingHeader("gzip, deflate")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:16.0) Gecko/20100101 Firefox/16.0")
    .inferHtmlResources()

  val headers_0 = Map(
  		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
  		"Accept-Encoding" -> "gzip, deflate, br",
  		"Accept-Language" -> "en-US,en;q=0.9",
  		"Connection" -> "keep-alive",
  		"Origin" -> "https://harman-0.ps.qa.digitalreasoning.com:8999",
  		"Upgrade-Insecure-Requests" -> "1",
  		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

  val headers_3 = Map(
  		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
  		"Accept-Encoding" -> "gzip, deflate, br",
  		"Accept-Language" -> "en-US,en;q=0.9",
  		"Connection" -> "keep-alive",
  		"Upgrade-Insecure-Requests" -> "1",
  		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

  	val headers_4 = Map(
  		"Accept" -> "text/css,*/*;q=0.1",
  		"Accept-Encoding" -> "gzip, deflate, br",
  		"Accept-Language" -> "en-US,en;q=0.9",
  		"Connection" -> "keep-alive",
  		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

  	val headers_6 = Map(
  		"Accept" -> "*/*",
  		"Accept-Encoding" -> "gzip, deflate, br",
  		"Accept-Language" -> "en-US,en;q=0.9",
  		"Connection" -> "keep-alive",
  		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

  	val headers_7 = Map(
  		"Accept" -> "application/json, text/plain, */*",
  		"Accept-Encoding" -> "gzip, deflate, br",
  		"Accept-Language" -> "en-US,en;q=0.9",
  		"Connection" -> "keep-alive",
  		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36",
  		"X-Requested-With" -> "XMLHttpRequest")

  	val headers_9 = Map(
  		"Accept" -> "*/*",
  		"Accept-Encoding" -> "gzip, deflate, br",
  		"Accept-Language" -> "en-US,en;q=0.9",
  		"Connection" -> "keep-alive",
  		"Origin" -> "https://harman-0.ps.qa.digitalreasoning.com:8999",
  		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

  	val headers_14 = Map(
  		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
  		"Accept-Encoding" -> "gzip, deflate, br",
  		"Accept-Language" -> "en-US,en;q=0.9",
  		"Connection" -> "keep-alive",
  		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

      val uri1 = "https://harman-0.ps.qa.digitalreasoning.com:8999/apps"

  val scn = scenario("test")
  		.exec(http("request_0")
  			.post("/apps/login")
  			.headers(headers_0)
  			.formParam("username", "admin")
  			.formParam("password", "1234")
  			.formParam("hash", "#search")
  			.resources(http("request_1")
  			.get("/apps/web-assets/images/0ffa0f908d349f507ca15457b45a2de3dr-logo-navbar.svg"),
              http("request_2")
  			.get("/apps/web-assets/javascripts/322be7431942f46f1a6782081ba81098application.js"),
              http("request_3")
  			.get("/apps/profiles/")
  			.headers(headers_3),
              http("request_4")
  			.get("/apps/web-assets/stylesheets/a1c9f1bbd68c2c1648cba1bd5f59f43dapplication.css")
  			.headers(headers_4),
              http("request_5")
  			.get("/apps/assets/application-11278ee5c33208b81fcc8d7d7e21f7d3.css")
  			.headers(headers_4),
              http("request_6")
  			.get("/apps/profiles/app-3ca1394f0f35b8765856.js")
  			.headers(headers_6),
              http("request_7")
  			.get("/apps/core/kgs")
  			.headers(headers_7),
              http("request_8")
  			.get("/apps/profiles/api//preferences/kg")
  			.headers(headers_7),
              http("request_9")
  			.get("/apps/profiles/50145685042b4df07a1fd19957275b81.ttf")
  			.headers(headers_9),
              http("request_10")
  			.get("/apps/users/permissions/glance%3Atab%3Aalert_analytics_dashboard%3Aview")
  			.headers(headers_7),
              http("request_11")
  			.get("/apps/profiles/api//zz_bush52_9113_470/key_indicators")
  			.headers(headers_7),
              http("request_12")
  			.get("/apps/profiles/api//zz_bush52_9113_470/concepts/most_active?limit=100&scope=participant")
  			.headers(headers_7),
              http("request_13")
  			.get("/apps/users/permissions/glance%3Atab%3Aalert_analytics_dashboard%3Aview")
  			.headers(headers_7),
              http("request_14")
  			.get("/apps/profiles/8231b569fdf281224cc0c949492a7d2b.svg")
  			.headers(headers_14),
              http("request_15")
  			.get("/apps/users/permissions/glance%3Atab%3Aalert_analytics_dashboard%3Aview")
  			.headers(headers_7),
              http("request_16")
  			.get("/apps/profiles/api//zz_bush52_9113_470/messages/statuses")
  			.headers(headers_7),
              http("request_17")
  			.get("/apps/profiles/api//zz_bush52_9113_470/key_indicators")
  			.headers(headers_7),
              http("request_18")
  			.get("/apps/profiles/api//zz_bush52_9113_470/key_indicators")
  			.headers(headers_7),
              http("request_19")
  			.get("/apps/profiles/api//zz_bush52_9113_470/key_indicators")
  			.headers(headers_7),
              http("request_20")
  			.get("/apps/profiles/api//zz_bush52_9113_470/key_indicators")
  			.headers(headers_7),
              http("request_21")
  			.get("/apps/profiles/api//zz_bush52_9113_470/key_indicators")
  			.headers(headers_7),
              http("request_22")
  			.get("/apps/profiles/api//zz_bush52_9113_470/concepts/concept_types?display_mode=messages")
  			.headers(headers_7),
              http("request_23")
  			.get("/apps/profiles/api//zz_bush52_9113_470/key_indicators")
  			.headers(headers_7),
              http("request_24")
  			.get("/apps/users/permissions/glance%3Atab%3Aalert_analytics_dashboard%3Aview")
  			.headers(headers_7),
              http("request_25")
  			.get("/apps/profiles/api//zz_bush52_9113_470/concepts/most_active?limit=100&scope=participant")
  			.headers(headers_7),
              http("request_26")
  			.get("/apps/profiles/api//zz_bush52_9113_470/concepts/most_active?limit=100&scope=participant")
  			.headers(headers_7),
              http("request_27")
  			.get("/apps/profiles/api//zz_bush52_9113_470/concepts/most_active?limit=100&scope=participant")
  			.headers(headers_7),
              http("request_28")
  			.get("/apps/profiles/api//zz_bush52_9113_470/concepts/most_active?limit=100&scope=participant")
  			.headers(headers_7),
              http("request_29")
  			.get("/apps/profiles/api//zz_bush52_9113_470/concepts/most_active?limit=100&scope=participant")
  			.headers(headers_7),
              http("request_30")
  			.get("/apps/users/permissions/glance%3Atab%3Aalert_analytics_dashboard%3Aview")
  			.headers(headers_7),
              http("request_31")
  			.get("/apps/profiles/api//zz_bush52_9113_470/messages/statuses")
  			.headers(headers_7),
              http("request_32")
  			.get("/apps/profiles/api//zz_bush52_9113_470/messages/statuses")
  			.headers(headers_7),
              http("request_33")
  			.get("/apps/profiles/api//zz_bush52_9113_470/messages/statuses")
  			.headers(headers_7),
              http("request_34")
  			.get("/apps/profiles/api//zz_bush52_9113_470/messages/statuses")
  			.headers(headers_7),
              http("request_35")
  			.get("/apps/profiles/api//zz_bush52_9113_470/messages/statuses")
  			.headers(headers_7),
              http("request_36")
  			.get("/apps/profiles/api//zz_bush52_9113_470/concepts/most_active?limit=100&scope=participant")
  			.headers(headers_7),
              http("request_37")
  			.get("/apps/profiles/api//zz_bush52_9113_470/concepts/most_active?limit=100&scope=participant")
  			.headers(headers_7),
              http("request_38")
  			.get("/apps/profiles/api//zz_bush52_9113_470/messages/statuses")
  			.headers(headers_7),
              http("request_39")
  			.get("/apps/profiles/api//zz_bush52_9113_470/messages/statuses")
  			.headers(headers_7),
              http("request_40")
  			.get("/apps/profiles/api//zz_bush52_9113_470/messages/statuses")
  			.headers(headers_7),
              http("request_41")
  			.get("/apps/profiles/api//zz_bush52_9113_470/messages/statuses")
  			.headers(headers_7),
              http("request_42")
  			.get("/apps/profiles/api//zz_bush52_9113_470/messages/statuses")
  			.headers(headers_7),
              http("request_43")
  			.get("/apps/profiles/api//zz_bush52_9113_470/messages/statuses")
  			.headers(headers_7),
              http("request_44")
  			.get("/apps/profiles/api//zz_bush52_9113_470/messages/statuses")
  			.headers(headers_7),
              http("request_45")
  			.get("/apps/profiles/api//zz_bush52_9113_470/messages/statuses")
  			.headers(headers_7),
              http("request_46")
  			.get("/apps/profiles/api//zz_bush52_9113_470/messages/statuses")
  			.headers(headers_7),
              http("request_47")
  			.get("/apps/profiles/api//zz_bush52_9113_470/key_indicators")
  			.headers(headers_7),
              http("request_48")
  			.get("/apps/profiles/api//zz_bush52_9113_470/messages/statuses")
  			.headers(headers_7),
              http("request_49")
  			.get("/apps/profiles/api//zz_bush52_9113_470/key_indicators")
  			.headers(headers_7),
              http("request_50")
  			.get("/apps/profiles/api//zz_bush52_9113_470/concepts/concept_types?display_mode=messages")
  			.headers(headers_7),
              http("request_51")
  			.get("/apps/profiles/api//zz_bush52_9113_470/concepts/concept_types?display_mode=messages")
  			.headers(headers_7),
              http("request_52")
  			.get("/apps/profiles/api//zz_bush52_9113_470/key_indicators")
  			.headers(headers_7),
              http("request_53")
  			.get("/apps/profiles/api//zz_bush52_9113_470/concepts/concept_types?display_mode=messages")
  			.headers(headers_7),
              http("request_54")
  			.get("/apps/profiles/api//zz_bush52_9113_470/concepts/concept_types?display_mode=messages")
  			.headers(headers_7),
              http("request_55")
  			.get("/apps/profiles/api//zz_bush52_9113_470/concepts/concept_types?display_mode=messages")
  			.headers(headers_7),
              http("request_56")
  			.get("/apps/profiles/api//zz_bush52_9113_470/concepts/concept_types?display_mode=messages")
  			.headers(headers_7),
              http("request_57")
  			.get("/apps/profiles/api//zz_bush52_9113_470/concepts/concept_types?display_mode=messages")
  			.headers(headers_7),
              http("request_58")
  			.get("/apps/profiles/api//zz_bush52_9113_470/concepts/concept_types?display_mode=messages")
  			.headers(headers_7),
              http("request_59")
  			.get("/apps/profiles/api//zz_bush52_9113_470/concepts/concept_types?display_mode=messages")
  			.headers(headers_7),
              http("request_60")
  			.get("/apps/profiles/api//zz_bush52_9113_470/concepts/concept_types?display_mode=messages")
  			.headers(headers_7),
              http("request_61")
  			.get("/apps/profiles/api//zz_bush52_9113_470/concepts/concept_types?display_mode=messages")
  			.headers(headers_7),
              http("request_62")
  			.get("/apps/profiles/api//zz_bush52_9113_470/concepts/concept_types?display_mode=messages")
  			.headers(headers_7),
              http("request_63")
  			.get("/apps/profiles/api//zz_bush52_9113_470/concepts/concept_types?display_mode=messages")
  			.headers(headers_7),
              http("request_64")
  			.get("/apps/users/permissions/glance%3Atab%3Aalert_analytics_dashboard%3Aview")
  			.headers(headers_7),
              http("request_65")
  			.get("/apps/profiles/api//zz_bush52_9113_470/concepts/concept_types?display_mode=messages")
  			.headers(headers_7),
              http("request_66")
  			.get("/apps/profiles/api//zz_bush52_9113_470/concepts/concept_types?display_mode=messages")
  			.headers(headers_7),
              http("request_67")
  			.get("/apps/profiles/api//zz_bush52_9113_470/key_indicators")
  			.headers(headers_7),
              http("request_68")
  			.get("/apps/profiles/api//zz_bush52_9113_470/key_indicators")
  			.headers(headers_7),
              http("request_69")
  			.get("/apps/profiles/api//zz_bush52_9113_470/key_indicators")
  			.headers(headers_7),
              http("request_70")
  			.get("/apps/profiles/api//zz_bush52_9113_470/key_indicators")
  			.headers(headers_7),
              http("request_71")
  			.get("/apps/profiles/api//zz_bush52_9113_470/key_indicators")
  			.headers(headers_7),
              http("request_72")
  			.get("/apps/profiles/api//zz_bush52_9113_470/concepts/most_active?limit=100&scope=participant")
  			.headers(headers_7),
              http("request_73")
  			.get("/apps/profiles/api//zz_bush52_9113_470/key_indicators")
  			.headers(headers_7),
              http("request_74")
  			.get("/apps/profiles/api//zz_bush52_9113_470/concepts/most_active?limit=100&scope=participant")
  			.headers(headers_7),
              http("request_75")
  			.get("/apps/users/permissions/glance%3Atab%3Aalert_analytics_dashboard%3Aview")
  			.headers(headers_7),
              http("request_76")
  			.get("/apps/users/permissions/glance%3Atab%3Aalert_analytics_dashboard%3Aview")
  			.headers(headers_7),
              http("request_77")
  			.get("/apps/profiles/api//zz_bush52_9113_470/concepts/most_active?limit=100&scope=participant")
  			.headers(headers_7),
              http("request_78")
  			.get("/apps/profiles/api//zz_bush52_9113_470/concepts/most_active?limit=100&scope=participant")
  			.headers(headers_7),
              http("request_79")
  			.get("/apps/profiles/api//zz_bush52_9113_470/concepts/most_active?limit=100&scope=participant")
  			.headers(headers_7),
              http("request_80")
  			.get("/apps/users/permissions/glance%3Atab%3Aalert_analytics_dashboard%3Aview")
  			.headers(headers_7),
              http("request_81")
  			.get("/apps/users/permissions/glance%3Atab%3Aalert_analytics_dashboard%3Aview")
  			.headers(headers_7),
              http("request_82")
  			.get("/apps/users/permissions/glance%3Atab%3Aalert_analytics_dashboard%3Aview")
  			.headers(headers_7),
              http("request_83")
  			.get("/apps/users/permissions/glance%3Atab%3Aalert_analytics_dashboard%3Aview")
  			.headers(headers_7),
              http("request_84")
  			.get("/apps/users/permissions/glance%3Atab%3Aalert_analytics_dashboard%3Aview")
  			.headers(headers_7),
              http("request_85")
  			.get("/apps/users/permissions/glance%3Atab%3Aalert_analytics_dashboard%3Aview")
  			.headers(headers_7),
              http("request_86")
  			.get("/apps/users/permissions/glance%3Atab%3Aalert_analytics_dashboard%3Aview")
  			.headers(headers_7),
              http("request_87")
  			.get("/apps/users/permissions/glance%3Atab%3Aalert_analytics_dashboard%3Aview")
  			.headers(headers_7),
              http("request_88")
  			.get("/apps/profiles/api//zz_bush52_9113_470/concepts/most_active?limit=100&scope=participant")
  			.headers(headers_7),
              http("request_89")
  			.get("/apps/profiles/api//zz_bush52_9113_470/concepts/most_active?limit=100&scope=participant")
  			.headers(headers_7),
              http("request_90")
  			.get("/apps/profiles/570eb83859dc23dd0eec423a49e147fe.woff2")
  			.headers(headers_9),
              http("request_91")
  			.get("/apps/profiles/e590a1f2c9374820eb6674abd24fe8da.svg")
  			.headers(headers_14),
              http("request_92")
  			.get("/apps/profiles/629a55a7e793da068dc580d184cc0e31.ttf")
  			.headers(headers_9),
              http("request_93")
  			.get("/apps/profiles/api//zz_bush52_9113_470/concepts/most_active?limit=100&scope=participant")
  			.headers(headers_7)))

  setUp(scn.inject(atOnceUsers(2)).protocols(httpProtocol))
}
