package org.ka.petr.runner;

import org.ka.petr.source.ScriptSource;

import java.util.Map;

public interface ScriptRunner {
    Object run(ScriptSource scriptSource, Map<String, Object> params);
    Object run(ScriptSource scriptSource);
}
