package org.ka.petr.repository;

import org.ka.petr.source.ScriptSource;

import java.util.Map;
import java.util.Optional;

public class InMemoryScriptsRepository implements ScriptsRepository {

    private final Map<String, ScriptSource> scripts;

    public InMemoryScriptsRepository(Map<String, ScriptSource> scripts) {
        this.scripts = scripts;
    }

    @Override
    public Optional<ScriptSource> findScriptByName(String scriptName) {
        return Optional.ofNullable(scripts.get(scriptName));
    }
}
