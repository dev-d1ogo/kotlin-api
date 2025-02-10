package br.diogo.forum.core.model

import br.diogo.forum.core.valueObjects.Email
import java.time.LocalDateTime
import java.util.*

data class User(
    val id: UUID? = null,
    val name: String,
    val email: Email,
    val createdAt: LocalDateTime = LocalDateTime.now()
)
