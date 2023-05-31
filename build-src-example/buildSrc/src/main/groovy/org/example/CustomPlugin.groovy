package org.example

import org.gradle.api.Plugin
import org.gradle.api.Project

class CustomPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.tasks.register("my-task") {
            it.doLast {

                System.out.println("Hello from the CustomPlugin")
            }
        }
    }
}
