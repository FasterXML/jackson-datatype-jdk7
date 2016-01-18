Project for [Jackson](https://github.com/FasterXML/jackson) module (jar)
that adds supports for JDK datatypes included in version 7 which can not be directly
supported by core databind due to baseline being JDK 6.


## Status

[![Build Status](https://travis-ci.org/FasterXML/jackson-datatype-jdk7.svg?branch=master)](https://travis-ci.org/FasterXML/jackson-datatype-jdk7)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.fasterxml.jackson.datatype/jackson-datatype-jdk7/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.fasterxml.jackson.datatype/jackson-datatype-jdk7/)
[![Javadoc](https://javadoc-emblem.rhcloud.com/doc/com.fasterxml.jackson.datatype/jackson-datatype-jdk7/badge.svg)](http://www.javadoc.io/doc/com.fasterxml.jackson.datatype/jackson-datatype-jdk7)

Starting with Jackson 2.7, this module will be **DEPRECATED**, as its handlers will be
incorporated directly in [core Databind](../../jackson-databind).

Module is supported up until Jackson 2.6.

## Usage

### Maven dependency

To use module on Maven-based projects, use following dependency:

```xml
<dependency>
  <groupId>com.fasterxml.jackson.datatype</groupId>
  <artifactId>jackson-datatype-jdk7</artifactId>
  <version>2.6.2</version>
</dependency>    
```

### Registering module

Like all standard Jackson modules (libraries that implement Module interface), registration is done as follows:

```java
ObjectMapper mapper = new ObjectMapper();
mapper.registerModule(new Jdk7Module());
```

after which functionality is available for all normal Jackson operations:
you can read JSON into supported JDK7 types, as well as write values of such types as JSON, so that for example:

```java
// TODO: real example
Path p = ...;
String json = mapper.writeValueAsString(p);
```
