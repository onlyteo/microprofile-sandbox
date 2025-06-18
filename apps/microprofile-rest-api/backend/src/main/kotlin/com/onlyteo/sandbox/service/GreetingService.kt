package com.onlyteo.sandbox.service

import com.onlyteo.sandbox.config.buildLogger
import com.onlyteo.sandbox.model.Greeting
import com.onlyteo.sandbox.model.Person
import com.onlyteo.sandbox.repository.PrefixRepository
import jakarta.enterprise.context.Dependent
import jakarta.inject.Inject

@Dependent
class GreetingService @Inject constructor(private val prefixRepository: PrefixRepository) {

    private val logger = buildLogger

    fun getGreeting(person: Person): Greeting {
        logger.info("Returning greeting to \"{}\"", person.name)
        val prefix = prefixRepository.getPrefix()
        return Greeting("${prefix.greeting} ${person.name}!")
    }
}