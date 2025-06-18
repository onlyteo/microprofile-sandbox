// PROJECT
rootProject.name = "microprofile-sandbox"

// MANAGEMENT
pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

// PLUGINS
plugins {
    kotlin("jvm") version "2.1.21" apply false
    kotlin("plugin.allopen") version "2.1.21" apply false
    kotlin("plugin.spring") version "2.1.21" apply false
    kotlin("plugin.serialization") version "2.1.21" apply false
    id("org.springframework.boot") version "3.5.0" apply false
    id("io.spring.dependency-management") version "1.1.7" apply false
    id("com.google.cloud.tools.jib") version "3.4.5" apply false
    id("org.jooq.jooq-codegen-gradle") version "3.20.4" apply false
    id("com.expediagroup.graphql") version "8.4.0" apply false
    id("io.openliberty.tools.gradle.Liberty") version "3.8.3" apply false
}

// APPS
include(":apps:microprofile-rest-api:frontend")
include(":apps:microprofile-rest-api:frontend-api")
include(":apps:microprofile-rest-api:backend")
