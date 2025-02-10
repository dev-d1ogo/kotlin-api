package br.diogo.forum.application.useCase.topics

import br.diogo.forum.application.services.TopicService
import br.diogo.forum.core.model.Topic
import org.springframework.stereotype.Component

@Component
class GetTopics(private val topicService: TopicService) {
    fun exec(): List<Topic> {
        return this.topicService.getAll()
    }
}