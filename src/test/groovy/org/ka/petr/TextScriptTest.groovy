package org.ka.petr

import org.ka.petr.runner.SimpleScriptRunner
import org.ka.petr.source.TextBasedScriptSource
import spock.lang.Specification

class TextScriptTest extends Specification {

    def 'hello world'() {
        given:
        def scriptText = '''
    return 'hello world'
'''
        def scriptSource = new TextBasedScriptSource(scriptText)
        def runner = new SimpleScriptRunner()

        when:
        def result = runner.run(scriptSource)
        then:
        result == 'hello world'
    }

}
