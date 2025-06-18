val jvmMajorVersion: String by project
val jvmVersion = JavaVersion.toVersion(jvmMajorVersion)

buildscript {
    dependencies {
        classpath(libs.liberty.gradle.plugin)
    }
}

plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlin.allopen)
    alias(libs.plugins.liberty)
    war
}

dependencies {
    implementation(libs.microprofile)
    implementation(libs.bundles.jackson)
    implementation(libs.bundles.webjars)
    testImplementation(libs.bundles.kotest)
    testImplementation(libs.mockk)
}

ext {
    liberty.server.`var`.setProperty("artifactId", project.name)
}

allOpen {
    annotation("jakarta.ws.rs.Path")
    annotation("jakarta.ws.rs.ApplicationPath")
    annotation("jakarta.enterprise.context.Dependent")
}
