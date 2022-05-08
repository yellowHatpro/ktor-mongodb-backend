package org.yellowhatpro.db

import org.litote.kmongo.coroutine.CoroutineClient
import org.litote.kmongo.coroutine.CoroutineCollection
import org.litote.kmongo.coroutine.CoroutineDatabase
import org.litote.kmongo.coroutine.coroutine
import org.litote.kmongo.reactivestreams.KMongo
import org.yellowhatpro.model.user.User

class DatabaseImpl(private val clientName: String): Database {
    override val initializeName: String
        get() = clientName
    override val client: CoroutineClient
        get() = KMongo.createClient().coroutine
    override val database: CoroutineDatabase
        get() = client.getDatabase(initializeName)
    override val userCollection: CoroutineCollection<User>
        get() = database.getCollection()
}