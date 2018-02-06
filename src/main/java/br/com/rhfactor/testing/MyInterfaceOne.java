package br.com.rhfactor.testing;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MyInterfaceOne implements MyInterface {
    @Override
    public String getName() {
        return "One";
    }
}
