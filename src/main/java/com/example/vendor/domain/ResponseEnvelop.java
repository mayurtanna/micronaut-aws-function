package com.example.vendor.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.SerializationFeature;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.jackson.annotation.JacksonFeatures;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS;

@Introspected
@JsonInclude(ALWAYS)
@JacksonFeatures(enabledSerializationFeatures = SerializationFeature.WRITE_NULL_MAP_VALUES)
public class ResponseEnvelop {

    public ResponseEnvelop(Integer testInt, String testStr) {
        this.testInt = testInt;
        this.testStr = testStr;
    }

    public ResponseEnvelop() {
    }

    @JsonInclude(ALWAYS)
    private Integer testInt;

    private String testStr;

    public Integer getTestInt() {
        return testInt;
    }

    public String getTestStr() {
        return testStr;
    }

    public void setTestInt(Integer testInt) {
        this.testInt = testInt;
    }

    public void setTestStr(String testStr) {
        this.testStr = testStr;
    }

    @Override
    public String toString() {
        return "ResponseEnvelop{" +
                "testInt=" + testInt +
                ", testStr='" + testStr + '\'' +
                '}';
    }
}
