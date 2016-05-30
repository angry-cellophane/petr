package org.ka.petr.runner;

import groovy.lang.Binding;
import groovy.lang.Script;
import org.ka.petr.source.ScriptSource;

import java.util.Collections;
import java.util.Map;

public class SimpleScriptRunner implements ScriptRunner {

    @Override
    public Object run(ScriptSource scriptSource, Map<String, Object> params) {
        final Script script = scriptSource.getScript();
        script.setBinding(new Binding(params));
        return script.run();
    }

    @Override
    public Object run(ScriptSource scriptSource) {
        return run(scriptSource, Collections.emptyMap());
    }
}
