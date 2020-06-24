package com.javastudio.tutorial.ws;

import com.javastudio.tutorial.ws.publisher.ConversionPublisher;

public class Application {
    public static void main(String[] args) {
        System.out.println("Application starts ...");
        new Thread(ConversionPublisher::publish).start();
        System.out.println("Application started");
    }
}
