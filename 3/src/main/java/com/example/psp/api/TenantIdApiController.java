package com.example.psp.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T13:36:52.004410700+02:00[Europe/Vilnius]")
@Controller
@RequestMapping("${openapi.pointOfSaleSystem.base-path:}")
public class TenantIdApiController implements TenantIdApi {

    private final TenantIdApiDelegate delegate;

    public TenantIdApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) TenantIdApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new TenantIdApiDelegate() {});
    }

    @Override
    public TenantIdApiDelegate getDelegate() {
        return delegate;
    }

}
