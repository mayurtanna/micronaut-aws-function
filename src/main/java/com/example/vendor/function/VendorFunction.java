package com.example.vendor.function;

import com.example.vendor.domain.RequestEnvelop;
import com.example.vendor.domain.ResponseEnvelop;
import io.micronaut.function.aws.MicronautRequestHandler;
import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VendorFunction extends MicronautRequestHandler<RequestEnvelop, ResponseEnvelop> {
  private static final Logger logger = LoggerFactory.getLogger(VendorFunction.class);

  @Override
  public ResponseEnvelop execute(RequestEnvelop input) {

      ResponseEnvelop myEnvelop = new ResponseEnvelop();
      myEnvelop.setTestInt(null);
      myEnvelop.setTestStr("testStr");
      return myEnvelop;

  }

}
