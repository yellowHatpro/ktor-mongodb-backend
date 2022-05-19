package org.yellowhatpro

import io.ktor.server.application.*
import org.litote.kmongo.reactivestreams.KMongo
import org.yellowhatpro.plugins.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // application.conf references the main function. This annotation prevents the IDE from marking it as unused.
fun Application.module() {
    val mongoPw = System.getenv("MONGO_PW")
    val db = KMongo.createClient(
        connectionString = "mongodb+srv://yellowhatpro:$mongoPw@cluster0.ncotj.mongodb.net/?retryWrites=true&w=majority"
    )
    configureRouting()
    configureSecurity()
    configureMonitoring()
    configureSerialization()
}
