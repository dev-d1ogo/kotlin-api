package br.diogo.forum.core.model

import br.diogo.forum.core.valueObjects.Email
import java.util.*


fun mockTopics(): List<Topic> {
    val user1 = User(
        id = UUID.randomUUID(),
        name = "João Silva",
        email = Email("joao@exemplo.com")
    )

    val user2 = User(
        id = UUID.randomUUID(),
        name = "Maria Oliveira",
        email = Email("maria@exemplo.com")
    )

    val user3 = User(
        id = UUID.randomUUID(),
        name = "Carlos Santos",
        email = Email("carlos@exemplo.com")
    )

    val course1 = Curse(
        id = UUID.randomUUID(),
        name = "Matemática",
        category = "Ciências Exatas"
    )

    val course2 = Curse(
        id = UUID.randomUUID(),
        name = "Programação",
        category = "Tecnologia"
    )

    val course3 = Curse(
        id = UUID.randomUUID(),
        name = "Física",
        category = "Ciências Naturais"
    )


    val topic1 = Topic(
        title = "Como resolver equações quadráticas?",
        message = "Estou com dificuldades para resolver equações quadráticas. Alguém pode ajudar?",
        course = course1,
        author = user1,
        status = TopicStatus.UNANSWER,
    )

    val topic2 = Topic(
        title = "Dúvida sobre arrays em Kotlin",
        message = "Estou com uma dúvida sobre como manipular arrays em Kotlin. Alguém pode me ajudar?",
        course = course2,
        author = user2,
        status = TopicStatus.ANSWER,
    )

    val topic3 = Topic(
        title = "Experimentos para entender a gravidade",
        message = "Alguém tem alguma sugestão de experimentos simples para entender melhor a gravidade?",
        course = course3,
        author = user3,
        status = TopicStatus.CLOSED,
        answers = emptyList()
    )

    return listOf(topic1, topic2, topic3)
}


