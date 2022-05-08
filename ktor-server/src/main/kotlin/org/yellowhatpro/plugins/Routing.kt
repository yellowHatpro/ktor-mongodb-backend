package org.yellowhatpro.plugins

import io.ktor.server.routing.*
import io.ktor.server.http.content.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import org.yellowhatpro.model.user.User

fun Application.configureRouting() {

    val user = listOf(User("ashu","hello", listOf("hello","hello")))
    routing {
        get("/") {
            call.respond(user)
        }
        // Static plugin. Try to access `/static/index.html`
        static("/static") {
            resources("static")
        }
    }
}
