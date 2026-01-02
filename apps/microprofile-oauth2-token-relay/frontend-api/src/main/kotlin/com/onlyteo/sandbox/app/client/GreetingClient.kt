package com.onlyteo.sandbox.app.client

import com.onlyteo.sandbox.app.model.Greeting
import com.onlyteo.sandbox.app.model.Person
import jakarta.ws.rs.POST
import jakarta.ws.rs.Path

@Path("/api/greetings")
interface GreetingClient {

    @POST
    fun getGreeting(person: Person): Greeting
}