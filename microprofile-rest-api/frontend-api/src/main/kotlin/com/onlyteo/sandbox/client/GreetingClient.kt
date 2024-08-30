package com.onlyteo.sandbox.client

import com.onlyteo.sandbox.model.Greeting
import com.onlyteo.sandbox.model.Person
import jakarta.ws.rs.POST
import jakarta.ws.rs.Path

@Path("/api/greetings")
interface GreetingClient {

    @POST
    fun getGreeting(person: Person): Greeting
}