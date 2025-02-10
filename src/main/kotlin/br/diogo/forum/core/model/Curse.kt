package br.diogo.forum.core.model

import java.time.LocalDateTime
import java.util.*

data class Curse(
    val id: UUID? = null,
    val name: String,
    val category: String,
    val createdAt: LocalDateTime = LocalDateTime.now()
)
