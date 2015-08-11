package net.jenyay.outwikerdroid.core.config;

import java.io.File;
import java.io.IOException;

import org.ini4j.Wini;


/**
 * Created by jenyay on 11.08.15.
 *
 * Class for storing and reading options in ini format.
 */
public class IniConfig {
    boolean _readonly;

    Wini _ini;

    public IniConfig (String filename, boolean readonly) throws IOException {
        _readonly = readonly;
        _ini = new Wini (new File(filename));
    }

    public IniConfig(String fname) throws IOException {
        this (fname, false);
    }

    public String get (String section, String param, String defaultValue) {
        String result = _ini.get(section, param, String.class);

        return result;
    }
}
