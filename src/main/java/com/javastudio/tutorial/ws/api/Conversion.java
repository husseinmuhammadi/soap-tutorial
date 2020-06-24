package com.javastudio.tutorial.ws.api;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * This interface describes a Service Endpoint Interface (SEI), which is a Java interface
 * that exposes a Web service interface's operations in terms of abstract Java methods.
 * Clients communicate with SOAP-based Web services via their SEIs.
 */
@WebService
public interface Conversion {
    @WebMethod
    double c2f(double degrees);

    @WebMethod
    double cm2in(double cm);

    @WebMethod
    double f2c(double degrees);

    @WebMethod
    double in2cm(double in);
}
