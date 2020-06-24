package com.javastudio.tutorial.ws.publisher;

import com.javastudio.tutorial.ws.service.ConversionImpl;

import javax.xml.ws.Endpoint;

public class ConversionPublisher {
    public static void publish() {
        Endpoint.publish("http://localhost:9901/UC", new ConversionImpl());
    }
}
