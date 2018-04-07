import org.gradle.kotlin.dsl.`kotlin-dsl`
import org.gradle.kotlin.dsl.kotlin

plugins {
    kotlin("jvm").version("1.2.31")
    `kotlin-dsl`
    id("hello_plugin")
}
