plugins {
    kotlin("jvm")
    kotlin("plugin.allopen")
    id("io.openliberty.tools.gradle.Liberty")
    war
}

dependencies {
    implementation(libs.microprofile)
    implementation(libs.bundles.jackson)
    implementation(libs.bundles.webjars)
    testImplementation(libs.bundles.kotest)
    testImplementation(libs.mockk)
}

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
