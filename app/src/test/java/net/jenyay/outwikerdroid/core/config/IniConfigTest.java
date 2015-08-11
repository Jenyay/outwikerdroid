package net.jenyay.outwikerdroid.core.config;

import junit.framework.TestCase;

/**
 * Created by jenyay on 11.08.15.
 */
public class IniConfigTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();

    }

    public void tearDown() throws Exception {

    }

    public void testGetString() throws Exception {
        String configName = "../tests/testconfig.ini";
        IniConfig config = new IniConfig(configName);

        String value = config.get("General", "datetimeformat", "defaultval");
        assertEquals("value is not %c", value, "%c");
    }
}