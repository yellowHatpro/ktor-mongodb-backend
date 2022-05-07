package org.yellowhatpro.db

import org.litote.kmongo.coroutine.CoroutineClient
import org.litote.kmongo.coroutine.CoroutineCollection
import org.litote.kmongo.coroutine.CoroutineDatabase
import org.yellowhatpro.model.user.User

interface Database {
    val initializeName: String
    val client: CoroutineClient
    val database: CoroutineDatabase
    val userCollection: CoroutineCollection<User>
//    val queryCollection: CoroutineCollection<UserQuery>
//    val replyCollection: CoroutineCollection<UserReply>
}