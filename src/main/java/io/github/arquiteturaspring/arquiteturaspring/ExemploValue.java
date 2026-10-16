package io.github.arquiteturaspring.arquiteturaspring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ExemploValue {
    private String valeu;

    @Value("${app.config.variable}")
    private String variable;

    public void imprimirVariable() {
        System.out.println("Valor da variável: " + variable);
    }
}
