package org.yellowhatpro.model.user

data class User(
    val username: String?= null,
    @Transient
    val password: String? = null,
    val userQueries: List<String>? = null

)
