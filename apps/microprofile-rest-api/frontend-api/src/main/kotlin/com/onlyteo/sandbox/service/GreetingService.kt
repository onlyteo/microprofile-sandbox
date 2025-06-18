package com.onlyteo.sandbox.service

import com.onlyteo.sandbox.client.GreetingClient
import com.onlyteo.sandbox.config.buildLogger
import com.onlyteo.sandbox.model.Greeting
import com.onlyteo.sandbox.model.Person
import com.onlyteo.sandbox.properties.ApplicationProperties
import jakarta.enterprise.context.Dependent
import jakarta.inject.Inject
import org.eclipse.microprofile.rest.client.RestClientBuilder
import java.net.URI

@Dependent
class GreetingService @Inject constructor(applicationProperties: ApplicationProperties) {

    private val logger = buildLogger
    private val client = RestClientBuilder.newBuilder()
        .baseUri(URI.create(applicationProperties.backendUrl))
        .build(GreetingClient::class.java)

    fun getGreeting(person: Person): Greeting {
        logger.info("Fetching greeting for \"{}\"", person.name)
        return client.getGreeting(person)
    }
}