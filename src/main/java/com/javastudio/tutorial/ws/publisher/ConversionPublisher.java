package com.javastudio.tutorial.ws.publisher;

import com.javastudio.tutorial.ws.service.ConversionImpl;

import javax.xml.ws.Endpoint;

public class ConversionPublisher {
    public static void publish() {
        System.out.println("Publishing exposed apis of Conversion soap webservice");
        Endpoint.publish("http://localhost:9901/UC", new ConversionImpl());
        System.out.println("Endpoint published at http://localhost:9901/UC");
    }
}
