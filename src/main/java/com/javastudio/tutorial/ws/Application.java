package com.javastudio.tutorial.ws;

import com.javastudio.tutorial.ws.publisher.ConversionPublisher;

public class Application {
    public static void main(String[] args) {
        new Thread(ConversionPublisher::publish).start();
    }
}
