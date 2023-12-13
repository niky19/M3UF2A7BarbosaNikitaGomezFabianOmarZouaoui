plugins {
    kotlin("jvm") version "1.9.21"
    application
    id("org.jetbrains.dokka") version "1.9.10"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    dokkaHtmlPlugin("org.jetbrains.dokka:kotlin-as-java-plugin:1.9.10")
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
}

tasks.test {
    useJUnitPlatform()
}
tasks.dokkaHtml.configure {
    outputDirectory.set(buildDir.resolve("dokka"))
}

kotlin {
    jvmToolchain(8)
}

application {
    mainClass.set("MainKt")
}