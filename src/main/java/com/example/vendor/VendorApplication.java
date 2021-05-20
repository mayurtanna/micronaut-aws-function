package com.example.vendor;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.SerializationFeature;
import io.micronaut.context.annotation.Factory;
import io.micronaut.context.annotation.Replaces;
import io.micronaut.context.event.BeanCreatedEvent;
import io.micronaut.context.event.BeanCreatedEventListener;
import io.micronaut.discovery.event.ServiceReadyEvent;
import io.micronaut.jackson.JacksonConfiguration;
import io.micronaut.jackson.ObjectMapperFactory;
import io.micronaut.runtime.Micronaut;
import io.micronaut.runtime.event.annotation.EventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.Optional;

public class VendorApplication {

  private static final Logger logger = LoggerFactory.getLogger(VendorApplication.class);

  public static void main(String[] args) {
    Micronaut.run(VendorApplication.class, args);
  }


  @Singleton
  static class ObjectMapperBeanEventListener implements BeanCreatedEventListener<ObjectMapper> {

    @Override
    public ObjectMapper onCreated(BeanCreatedEvent<ObjectMapper> event) {
      logger.info("vendor oncreated objectmapper");
      ObjectMapper mapper = event.getBean();
      mapper.setSerializationInclusion(JsonInclude.Include.ALWAYS);
      mapper.configure(SerializationFeature.WRITE_NULL_MAP_VALUES, true);
      mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
      logger.info("vendor oncreated objectmapper exited");
      return mapper;
    }
  }
}