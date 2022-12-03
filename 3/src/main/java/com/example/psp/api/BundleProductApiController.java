package com.example.psp.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
@Controller
@RequestMapping("${openapi.pointOfSaleSystem.base-path:}")
public class BundleProductApiController implements BundleProductApi {

    private final BundleProductApiDelegate delegate;

    public BundleProductApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) BundleProductApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new BundleProductApiDelegate() {});
    }

    @Override
    public BundleProductApiDelegate getDelegate() {
        return delegate;
    }

}