package br.diogo.forum.application.services

import br.diogo.forum.application.repository.ITopicRepository
import br.diogo.forum.core.model.Topic
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Service

@Service
class TopicService(@Qualifier("mockedTopicRepository") private val topicRepository: ITopicRepository) {
    fun getAll(): List<Topic> {
        return this.topicRepository.findAll()
    }
}