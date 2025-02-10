package br.diogo.forum.application.controller

import br.diogo.forum.application.useCase.topics.GetTopics
import br.diogo.forum.core.model.Topic
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

data class GetTopicInput(
    val page: Int = 1,
    val limit: Int = 10
)

@RestController
@RequestMapping("/topics")
class TopicController(private val getTopicsUseCase: GetTopics) {
    @GetMapping
    fun getTopics(@ModelAttribute params: GetTopicInput): List<Topic> {
        val topics = this.getTopicsUseCase.exec()

        return topics
    }
}