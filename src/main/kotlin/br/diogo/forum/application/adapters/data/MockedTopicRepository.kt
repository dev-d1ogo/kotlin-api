package br.diogo.forum.application.adapters.data

import br.diogo.forum.application.repository.ITopicRepository
import br.diogo.forum.core.model.Topic
import br.diogo.forum.core.model.mockTopics
import org.springframework.stereotype.Repository
import java.util.*

@Repository
class MockedTopicRepository : ITopicRepository {
    private val topics = mockTopics().toMutableList()

    override fun findAll(): List<Topic> {
        val topicList = this.topics.toList()
        return topicList
    }

    override fun findById(id: UUID): Topic? {
        val uniqueTopic = this.topics.single { it.id == id }

        return uniqueTopic
    }

    override fun save(topic: Topic): Unit {
        this.topics.add(topic)
    }

}