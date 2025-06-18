// PLUGINS
plugins {
    kotlin("jvm")
    kotlin("plugin.allopen")
    id("io.openliberty.tools.gradle.Liberty")
    war
}

// DEPENDENCIES
dependencies {
    implementation(libs.microprofile)
    implementation(libs.bundles.jackson)
    implementation(libs.jackson.dataformat.csv)
    implementation(libs.bundles.webjars)
    testImplementation(libs.bundles.kotest)
    testImplementation(libs.mockk)
}

// BUILD
buildscript {
    dependencies {
        classpath(libs.liberty.gradle.plugin)
    }
}

ext {
    liberty.server.`var`.setProperty("artifactId", project.name)
}

allOpen {
    annotation("jakarta.ws.rs.Path")
    annotation("jakarta.ws.rs.ApplicationPath")
    annotation("jakarta.enterprise.context.Dependent")
}
