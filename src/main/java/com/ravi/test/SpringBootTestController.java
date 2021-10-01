package com.ravi.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootTestController {

    @GetMapping( "/hello-text/{name}/{company}")
    public HelloWorld doHelloWorld(
            @PathVariable String name,
            @PathVariable String company
    ) {

        return new HelloWorld(
                name, company, "Hello " + name + " from " + company
        );

    }

}
