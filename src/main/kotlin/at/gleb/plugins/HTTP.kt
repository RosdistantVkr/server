package at.gleb.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.plugins.cors.routing.*
import io.ktor.server.plugins.defaultheaders.*

fun Application.configureHTTP() {
   /* routing {
        swaggerUI(path = "openapi")
    }
    routing {
        openAPI(path = "openapi")
    }

    */
    install(DefaultHeaders) {
        header("X-Engine", "Ktor")
        header("Access-Control-Allow-Origin", "*")
    }

    install(CORS) {
        anyHost()
        allowMethod(HttpMethod.Options)
        allowMethod(HttpMethod.Put)
        allowMethod(HttpMethod.Delete)
        allowMethod(HttpMethod.Patch)
        allowHeader(HttpHeaders.Authorization)
        allowHeader("MyCustomHeader")

        allowHost("*.cleanhub.app", schemes = listOf("https"))
        allowHost("cleanhub.app", schemes = listOf("https"))
        allowHeader("accesstoken")
        allowHeader("googletoken")
        allowHeader("deviceId")
        allowHeader("lang")
        allowMethod(HttpMethod.Post)
        allowMethod(HttpMethod.Get)
        allowMethod(HttpMethod.Delete)
        allowMethod(HttpMethod.Put)
        allowMethod(HttpMethod.Options)
        allowHeader(HttpHeaders.AccessControlAllowHeaders)
        allowHeader(HttpHeaders.ContentType)
        allowHeader(HttpHeaders.AccessControlAllowOrigin)
    }
}
