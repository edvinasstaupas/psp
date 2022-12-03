package com.example.psp.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-12-03T17:27:47.624170900+02:00[Europe/Vilnius]")
@Controller
@RequestMapping("${openapi.pointOfSaleSystem.base-path:}")
public class EmployeeApiController implements EmployeeApi {

    private final EmployeeApiDelegate delegate;

    public EmployeeApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) EmployeeApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new EmployeeApiDelegate() {});
    }

    @Override
    public EmployeeApiDelegate getDelegate() {
        return delegate;
    }

}
