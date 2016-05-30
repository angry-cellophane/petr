package org.ka.petr;

import java.util.Map;

public interface ScriptRunner {
    Object run(ScriptSource scriptSource, Map<String, Object> params);
}
