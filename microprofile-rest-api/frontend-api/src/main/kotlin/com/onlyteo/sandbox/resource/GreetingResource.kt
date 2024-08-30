package com.onlyteo.sandbox.resource

import com.onlyteo.sandbox.model.Greeting
import com.onlyteo.sandbox.model.Person
import com.onlyteo.sandbox.service.GreetingService
import jakarta.inject.Inject
import jakarta.inject.Singleton
import jakarta.ws.rs.POST
import jakarta.ws.rs.Path

@Path("/api/greetings")
@Singleton
class GreetingResource @Inject constructor(private val greetingService: GreetingService) {

    @POST
    fun post(person: Person): Greeting {
        return greetingService.getGreeting(person)
    }
}