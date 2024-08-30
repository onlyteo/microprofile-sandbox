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

include(":microprofile-rest-api:frontend")
include(":microprofile-rest-api:frontend-api")
include(":microprofile-rest-api:backend")
