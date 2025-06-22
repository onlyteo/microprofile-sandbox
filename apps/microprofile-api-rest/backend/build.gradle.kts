// PLUGINS
plugins {
    kotlin("jvm")
    kotlin("plugin.allopen")
    liberty
    war
}

// DEPENDENCIES
dependencies {
    providedCompile(libs.microprofile)
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
    liberty.server.`var`.setProperty("default.http.port", "8081")
    liberty.server.`var`.setProperty("project.name", project.name)
    liberty.server.`var`.setProperty("app.context.root", "/")
}

allOpen {
    annotation("jakarta.ws.rs.Path")
    annotation("jakarta.ws.rs.ApplicationPath")
    annotation("jakarta.enterprise.context.Dependent")
}
/*
tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "com.onlyteo.sandbox.app.RestApiBackendApplication"
    }
}
*/