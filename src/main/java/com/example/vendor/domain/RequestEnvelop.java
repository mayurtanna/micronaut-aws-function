package com.example.vendor.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.SerializationFeature;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.jackson.annotation.JacksonFeatures;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS;

@Introspected
public class RequestEnvelop {
    public RequestEnvelop() {
    }

    private String testInput;
    public String getTestInput() {
        return testInput;
    }

    public void setTestInput(String testInput) {
        this.testInput = testInput;
    }
}
