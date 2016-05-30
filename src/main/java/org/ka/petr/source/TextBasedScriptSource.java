package org.ka.petr.source;

import groovy.lang.GroovyShell;
import groovy.lang.Script;

public class TextBasedScriptSource implements ScriptSource {

    private final Script script;

    public TextBasedScriptSource(String scriptText){
        script = new GroovyShell().parse(scriptText);
    }


    @Override
    public Script getScript() {
        return script;
    }
}
