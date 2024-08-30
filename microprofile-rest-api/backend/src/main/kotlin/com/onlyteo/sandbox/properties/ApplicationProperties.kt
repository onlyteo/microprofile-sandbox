package com.onlyteo.sandbox.properties

import jakarta.enterprise.context.Dependent
import jakarta.inject.Inject
import org.eclipse.microprofile.config.inject.ConfigProperty

@Dependent
class ApplicationProperties @Inject constructor(
    @ConfigProperty(name = "app.resources.prefixes-file")
    val prefixesFile: String
)
