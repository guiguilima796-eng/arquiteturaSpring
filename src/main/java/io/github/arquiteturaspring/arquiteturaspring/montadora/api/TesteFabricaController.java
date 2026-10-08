package io.github.arquiteturaspring.arquiteturaspring.montadora.api;

import io.github.arquiteturaspring.arquiteturaspring.montadora.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carros")
public class TesteFabricaController {

    @Autowired
    private Motor motor;

    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave) {
        var carro = new HondaHRV(motor);
        return carro.darIgnição(chave);
    }
}
