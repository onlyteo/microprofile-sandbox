package com.onlyteo.sandbox.app.repository

import com.onlyteo.sandbox.app.config.readCsvFile
import com.onlyteo.sandbox.app.model.Prefix
import com.onlyteo.sandbox.app.properties.ApplicationProperties
import jakarta.enterprise.context.Dependent
import jakarta.inject.Inject
import kotlin.random.Random

@Dependent
class PrefixRepository @Inject constructor(private val applicationProperties: ApplicationProperties) {

    fun getPrefix(): Prefix {
        val prefixes = readCsvFile<Prefix>(applicationProperties.prefixesFile)
        val index = Random.nextInt(prefixes.size)
        return prefixes[index]
    }
}