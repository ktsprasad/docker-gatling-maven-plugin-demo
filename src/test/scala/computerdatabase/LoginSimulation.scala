package computerdatabase

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import scala.concurrent.duration._
import io.gatling.jdbc.Predef._

class LoginSimulation extends Simulation {

  val httpProtocol = http
      .baseUrl("https://harman-0.ps.qa.digitalreasoning.com:9991") // Here is the root for all relative URLs
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
     		"Origin" -> "https://harman-0.ps.qa.digitalreasoning.com:9991",
     		"Upgrade-Insecure-Requests" -> "1",
     		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

     	val headers_3 = Map(
     		"Accept" -> "*/*",
     		"Accept-Encoding" -> "gzip, deflate, br",
     		"Accept-Language" -> "en-US,en;q=0.9",
     		"Connection" -> "keep-alive",
     		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

     	val headers_5 = Map(
     		"Accept" -> "text/css,*/*;q=0.1",
     		"Accept-Encoding" -> "gzip, deflate, br",
     		"Accept-Language" -> "en-US,en;q=0.9",
     		"Connection" -> "keep-alive",
     		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

     	val headers_8 = Map(
     		"Accept" -> "application/json, text/plain, */*",
     		"Accept-Encoding" -> "gzip, deflate, br",
     		"Accept-Language" -> "en-US,en;q=0.9",
     		"Connection" -> "keep-alive",
     		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36",
     		"X-Requested-With" -> "XMLHttpRequest")

     	val headers_12 = Map(
     		"Accept" -> "*/*",
     		"Accept-Encoding" -> "gzip, deflate, br",
     		"Accept-Language" -> "en-US,en;q=0.9",
     		"Connection" -> "keep-alive",
     		"Origin" -> "https://harman-0.ps.qa.digitalreasoning.com:9991",
     		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

     	val headers_17 = Map(
     		"Accept" -> "image/webp,image/apng,image/*,*/*;q=0.8",
     		"Accept-Encoding" -> "gzip, deflate, br",
     		"Accept-Language" -> "en-US,en;q=0.9",
     		"Connection" -> "keep-alive",
     		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

     	val headers_19 = Map(
     		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
     		"Accept-Encoding" -> "gzip, deflate, br",
     		"Accept-Language" -> "en-US,en;q=0.9",
     		"Connection" -> "keep-alive",
     		"Upgrade-Insecure-Requests" -> "1",
     		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/70.0.3538.77 Safari/537.36")

         val uri1 = "https://harman-0.ps.qa.digitalreasoning.com:9991/apps"

     	val scn = scenario("Login to digital reasoning application with valid credential, select the KG t_bush52_470_9991 and logout")
     		.exec(http("Loading application login page")
     			.post("/apps/login")
     			.headers(headers_0)
     			.formParam("username", "admin")
     			.formParam("password", "1234")
     			.formParam("hash", "")
     			.resources(http("request for profile assets load")
     			.get("/apps/assets/application-6642cd646943354ac97f7482dcca84bc.js"),
                 http("request for profile web-assets load")
     			.get("/apps/web-assets/images/0ffa0f908d349f507ca15457b45a2de3dr-logo-navbar.svg"),
                 http("request profiles load")
     			.get("/apps/profiles/app-5faef794d309aa2797e4.js")
     			.headers(headers_3),
                 http("request for profile web-assets load")
     			.get("/apps/web-assets/javascripts/322be7431942f46f1a6782081ba81098application.js"),
                 http("request for profile web-assets load")
     			.get("/apps/web-assets/stylesheets/a1c9f1bbd68c2c1648cba1bd5f59f43dapplication.css")
     			.headers(headers_5),
                 http("request for profile assets load")
     			.get("/apps/assets/application-bd56ea6264488632063557bdefe4bb42.css")
     			.headers(headers_5),
                 http("request for profile web-assets load")
     			.get("/apps/web-assets/branding/custom.css")
     			.headers(headers_5)))
     		.pause(1)
     		.exec(http("request KG")
     			.get("/apps/core/kgs")
     			.headers(headers_8)
     			.resources(http("request KG")
     			.get("/apps/profiles/api//preferences/kg")
     			.headers(headers_8),
                 http("request KG")
     			.get("/apps/users/permissions/glance%3Atab%3Aalert_analytics_dashboard%3Aview")
     			.headers(headers_8),
                 http("request KG t_bush52_470_9991")
     			.get("/apps/profiles/api//t_bush52_470_9991/key_indicators")
     			.headers(headers_8),
                 http("request KG t_bush52_470_9991 profiles")
     			.get("/apps/profiles/50145685042b4df07a1fd19957275b81.ttf")
     			.headers(headers_12),
                 http("request KG t_bush52_470_9991 messages")
     			.get("/apps/profiles/api//t_bush52_470_9991/messages/statuses")
     			.headers(headers_8),
                 http("request KG t_bush52_470_9991 concept")
     			.get("/apps/profiles/api//t_bush52_470_9991/concepts/concept_types?display_mode=messages")
     			.headers(headers_8)
     			.check(status.is(500)),
                 http("request KG t_bush52_470_9991 information")
     			.get("/apps/profiles/api//t_bush52_470_9991/concepts/most_active?end_date=2018-11-06T06:46:37.433Z&limit=100&scope=participant&start_date=2018-10-07T06:46:37.429Z")
     			.headers(headers_8),
                 http("request KG t_bush52_470_9991 profiles")
     			.get("/apps/profiles/629a55a7e793da068dc580d184cc0e31.ttf")
     			.headers(headers_12),
                 http("request KG t_bush52_470_9991 profiles")
     			.get("/apps/profiles/8231b569fdf281224cc0c949492a7d2b.svg")
     			.headers(headers_17),
                 http("request KG t_bush52_470_9991 profiles")
     			.get("/apps/profiles/570eb83859dc23dd0eec423a49e147fe.woff2")
     			.headers(headers_12)))
     		.pause(4)
     		.exec(http("request for logout")
     			.get("/apps/logout")
     			.headers(headers_19)
     			.resources(http("request_20")
     			.get("/apps/assets/application-6642cd646943354ac97f7482dcca84bc.js"),
                 http("request for logout web-assert")
     			.get("/apps/web-assets/images/0ffa0f908d349f507ca15457b45a2de3dr-logo-navbar.svg"),
                 http("request for logout web-assert")
     			.get("/apps/web-assets/javascripts/322be7431942f46f1a6782081ba81098application.js"),
                 http("request for logout web-assert")
     			.get("/apps/web-assets/stylesheets/a1c9f1bbd68c2c1648cba1bd5f59f43dapplication.css")
     			.headers(headers_5),
                 http("request for logout assert")
     			.get("/apps/assets/application-bd56ea6264488632063557bdefe4bb42.css")
     			.headers(headers_5),
                 http("request for logout web-assert")
     			.get("/apps/web-assets/branding/custom.css")
     			.headers(headers_5),
                 http("request for login logo")
     			.get("/apps/assets/dr-logo-login-7978868058770bf64b3c7fd158b4054e.jpg")
     			.headers(headers_17),
                 http("request for assert")
     			.get("/apps/assets/bootstrap/dist/js/bootstrap-ea58926545ba722cc634fe1e0f1ccedf.js")
     			.headers(headers_3),
                 http("request for assert")
     			.get("/apps/assets/bootstrap/dist/css/bootstrap.min-cb2e7f94fe1c79e74a43dd83f77b25a6.css")
     			.headers(headers_5),
                 http("request for assert")
     			.get("/apps/assets/jquery/dist/jquery-02b5f40c09efb14473a9ea8e53990376.js")
     			.headers(headers_3)))

      setUp(scn.inject(atOnceUsers(10)).protocols(httpProtocol))
    }
