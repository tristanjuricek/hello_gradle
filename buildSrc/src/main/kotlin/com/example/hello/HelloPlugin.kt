package com.example.hello

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.task

class HelloPlugin : Plugin<Project> {

    override fun apply(project: Project?) {
        project?.let {
            it.task("sayHello", {
                group = "hello"
                doLast({
                    logger.lifecycle("HELLO")
                })
            })
        }
    }
}