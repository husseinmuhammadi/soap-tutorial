package com.javastudio.ws.service;

import com.javastudio.ws.api.Conversion;

import javax.jws.WebService;

/**
 * This class describes a Service Implementation Bean (SIB), which provides an implementation of the SEI.
 * This class is declared to be a SIB via the @WebService(endpointInterface = "...") annotation.
 * The endpointInterface element connects this SIB to its SEI, and is necessary to avoid undefined
 * port type errors when running the client application presented later.
 */
@WebService(endpointInterface = "com.javastudio.ws.api.Conversion")
public class ConversionImpl implements Conversion {
    @Override
    public double c2f(double degrees) {
        return degrees * 9.0 / 5.0 + 32;
    }

    @Override
    public double cm2in(double cm) {
        return cm / 2.54;
    }

    @Override
    public double f2c(double degrees) {
        return (degrees - 32) * 5.0 / 9.0;
    }

    @Override
    public double in2cm(double in) {
        return in * 2.54;
    }
}
