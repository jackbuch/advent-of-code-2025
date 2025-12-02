plugins {
    application
    kotlin("jvm") version "2.2.20"
}

group = "com.github.jackbuch.aoc2025"
version = "1.0-SNAPSHOT"

application {
    mainClass.set("$group.MainKt")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(19)
}