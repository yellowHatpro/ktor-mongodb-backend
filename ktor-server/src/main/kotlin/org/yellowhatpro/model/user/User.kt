package org.yellowhatpro.model.user

@kotlinx.serialization.Serializable
data class User(
    val username: String?= null,
    val password: String? = null,
    val userQueries: List<String>? = null
)

