# Soap Web Services
[Java API for XML Web Services (JAX-WS)](https://javaee.github.io/metro-jax-ws/)

## Introduction to JAX-WS

### 1.Overview
[Java API for XML Web Services (JAX-WS)](http://jax-ws.java.net/) is a standardized API for creating and consuming SOAP (Simple Object Access Protocol) web services.

In this article, we'll create a SOAP web service and connect to it using JAX-WS.

### 2. SOAP
SOAP is an XML specification for sending messages over a network. SOAP messages are independent of any operating system and can use a variety of communication protocols including HTTP and SMTP.

SOAP is XML heavy, hence best used with tools/frameworks. JAX-WS is a framework that simplifies using SOAP. It is part of standard Java.

[Introduction to JAX-WS](https://www.baeldung.com/jax-ws)

#### 5.1. Generating Web Service Source Files from WSDL
There are several ways to generate web service source files from a WSDL document.

One way is to use the wsimport tool which is part of JDK (at $JAVA_HOME/bin) till JDK 8.

From the command prompt:

```
wsimport -s . -p com.baeldung.jaxws.server.topdown employeeservicetopdown.wsdl
```


[Introduction to JAX-WS](https://www.baeldung.com/jax-ws)
