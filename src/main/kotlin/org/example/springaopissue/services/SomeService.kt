package org.example.springaopissue.services

import mu.KLogging
import org.example.springaopissue.model.SomeClass
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class SomeService : I<SomeClass> {

    @Transactional
    override suspend fun f1(a: SomeClass): String {
        logger.info { "Call f1" }
        return "F1"
    }

    override suspend fun f2(a: SomeClass): String {
        logger.info { "Call f2" }
        return "F2"
    }

    companion object : KLogging()
}