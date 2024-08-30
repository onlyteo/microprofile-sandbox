package com.onlyteo.sandbox.properties

import jakarta.enterprise.context.Dependent
import jakarta.inject.Inject
import org.eclipse.microprofile.config.inject.ConfigProperty

@Dependent
data class ApplicationProperties @Inject constructor(
    @ConfigProperty(name = "app.integrations.backend.url")
    val backendUrl: String
)