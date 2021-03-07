package com.javastudio.ws;

import com.javastudio.ws.api.Conversion;
import com.javastudio.ws.service.ConversionImpl;

import javax.xml.ws.Endpoint;

public class Application {
    public static void main(String[] args) {
        Conversion conversion = new ConversionImpl();

        System.out.println("Publishing exposed apis of Conversion soap webservice");
        Endpoint.publish("http://localhost:9901/UC", conversion);
        System.out.println("Endpoint published at http://localhost:9901/UC");
    }
}
