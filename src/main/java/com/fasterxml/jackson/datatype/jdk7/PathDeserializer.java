package com.fasterxml.jackson.datatype.jdk7;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer;

public class PathDeserializer extends StdScalarDeserializer<Path>
{
    private static final long serialVersionUID = 1;

    public PathDeserializer() { super(Path.class); }
    
    @Override
    public Path deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException, JsonProcessingException
    {
        return Paths.get(jp.getValueAsString());
    }
}
