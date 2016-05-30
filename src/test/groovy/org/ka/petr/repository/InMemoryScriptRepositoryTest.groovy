package org.ka.petr.repository

import org.ka.petr.runner.SimpleScriptRunner
import org.ka.petr.source.TextBasedScriptSource
import spock.lang.Specification


class InMemoryScriptRepositoryTest extends Specification {

    def 'execute one script two times with different parameters'() {
        given:
        String scriptText = '''
    return x * y
'''
        def runner = new SimpleScriptRunner()
        def scriptSource = new TextBasedScriptSource(scriptText);
        def repository = new InMemoryScriptsRepository(['multiplier': scriptSource])

        when:
        def optScript = repository.findScriptByName('multiplier')
        then:
        optScript.isPresent()

        when:
        def script = optScript.get()
        then:
        runner.run(script, ['x':1, 'y': 2]) == 2
        runner.run(script, ['x':3, 'y': 5]) == 15
    }

}
