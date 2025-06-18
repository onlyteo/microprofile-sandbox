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

rootProject.name = "microprofile-sandbox"

include(":apps:microprofile-rest-api:frontend")
include(":apps:microprofile-rest-api:frontend-api")
include(":apps:microprofile-rest-api:backend")
