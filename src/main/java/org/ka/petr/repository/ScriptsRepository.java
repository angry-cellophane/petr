package org.ka.petr.repository;


import org.ka.petr.source.ScriptSource;

import java.util.Optional;

public interface ScriptsRepository {
    Optional<ScriptSource> findScriptByName(String scriptName);
}
