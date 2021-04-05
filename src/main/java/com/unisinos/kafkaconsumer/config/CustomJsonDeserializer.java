package com.unisinos.kafkaconsumer.config;

import org.springframework.kafka.support.serializer.JsonDeserializer;

public class CustomJsonDeserializer extends JsonDeserializer {

    public CustomJsonDeserializer(Class type) {
        super(type, false);
        this.addTrustedPackages("*");
    }
    /*
    * public CustomJsonDeserializer(Class type) {
        super(type, false);
        this.addTrustedPackages("*");
    }
    * */
}
