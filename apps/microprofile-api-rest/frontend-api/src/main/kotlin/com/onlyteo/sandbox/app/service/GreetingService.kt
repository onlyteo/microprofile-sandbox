package com.onlyteo.sandbox.app.service

import com.onlyteo.sandbox.app.client.GreetingClient
import com.onlyteo.sandbox.app.config.buildLogger
import com.onlyteo.sandbox.app.model.Greeting
import com.onlyteo.sandbox.app.model.Person
import com.onlyteo.sandbox.app.properties.ApplicationProperties
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