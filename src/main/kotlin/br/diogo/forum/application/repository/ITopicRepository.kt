package br.diogo.forum.application.repository

import br.diogo.forum.core.model.Topic
import java.util.*

interface ITopicRepository {
    fun findAll(): List<Topic>
    fun findById(id: UUID): Topic?
    fun save(topic: Topic): Unit
}