package br.diogo.forum.core.model

import java.time.LocalDateTime
import java.util.*

data class Topic(
    val id: UUID? = UUID.randomUUID(),
    val title: String,
    val message: String,
    val createdAt: LocalDateTime = LocalDateTime.now(),
    val course: Curse,
    val author: User,
    val status: TopicStatus = TopicStatus.UNANSWER,
    val answers: List<Answer>? = ArrayList<Answer>()
)