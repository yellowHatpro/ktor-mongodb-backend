package org.yellowhatpro.model.query

import org.bson.codecs.pojo.annotations.BsonId
import org.bson.types.ObjectId
import org.yellowhatpro.model.user.User

data class Query(
    @BsonId
    val postID: String = ObjectId().toString(),
    val title: String? = null,
    val query: String? = null,
    val createdAt: String? = null,
    val updatedAt: String? =null,
    val replies: List<String> = emptyList(),
    val createdBy: User? = null
    ){

}
