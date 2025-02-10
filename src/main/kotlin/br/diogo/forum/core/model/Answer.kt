package br.diogo.forum.core.model

import java.time.LocalDateTime
import java.util.*

data class Answer(
    val id: UUID,
    val message: String,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val autor: User,
    val topic: Topic,
    val isTheSolution: Boolean
)


