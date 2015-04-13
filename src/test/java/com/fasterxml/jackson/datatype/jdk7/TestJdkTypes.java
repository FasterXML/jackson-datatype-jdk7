package com.fasterxml.jackson.datatype.jdk7;

import java.io.File;
import java.nio.file.Path;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TestJdkTypes extends ModuleTestBase
{
    public void testPaths() throws Exception
    {
        ObjectMapper mapper = mapperWithModule();

        String sep = File.pathSeparator;
        String JSON = quote(sep+"tmp"+sep+"foo.txt");

        Path p = mapper.readValue(JSON, Path.class);
        String output = mapper.writeValueAsString(p);

        assertEquals(JSON, output);
    }
}
