/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example

import org.gradle.testfixtures.ProjectBuilder
import org.gradle.api.Project
import spock.lang.Specification

/**
 * A simple unit test for the 'org.example.greeting' plugin.
 */
class TestApiPluginTest extends Specification {
    def "plugin registers task"() {
        given:
        def project = ProjectBuilder.builder().build()

        when:
        project.plugins.apply("org.example.greeting")

        then:
        project.tasks.findByName("greeting") != null
    }
}
