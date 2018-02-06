package br.com.rhfactor.testing;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("two")
public class MyInterfaceTwo implements MyInterface {
    @Override
    public String getName() {
        return "Two";
    }
}
