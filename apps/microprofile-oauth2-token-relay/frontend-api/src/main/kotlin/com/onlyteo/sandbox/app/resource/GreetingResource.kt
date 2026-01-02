package com.onlyteo.sandbox.app.resource

import com.onlyteo.sandbox.app.model.Greeting
import com.onlyteo.sandbox.app.model.Person
import com.onlyteo.sandbox.app.service.GreetingService
import jakarta.inject.Inject
import jakarta.inject.Singleton
import jakarta.ws.rs.Consumes
import jakarta.ws.rs.POST
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType

@Path("/api/greetings")
@Singleton
class GreetingResource @Inject constructor(private val greetingService: GreetingService) {

    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @POST
    fun post(person: Person): Greeting {
        return greetingService.getGreeting(person)
    }
}