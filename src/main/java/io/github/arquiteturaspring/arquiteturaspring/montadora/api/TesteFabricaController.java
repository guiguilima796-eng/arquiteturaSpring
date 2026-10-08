package io.github.arquiteturaspring.arquiteturaspring.montadora.api;

import io.github.arquiteturaspring.arquiteturaspring.montadora.Carro;
import io.github.arquiteturaspring.arquiteturaspring.montadora.CarroStatus;
import io.github.arquiteturaspring.arquiteturaspring.montadora.HondaHRV;
import io.github.arquiteturaspring.arquiteturaspring.montadora.Motor;
import io.github.arquiteturaspring.arquiteturaspring.montadora.Chave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteFabricaController {

    @Autowired
    private Motor motor;

    public CarroStatus ligarCarro(@RequestBody Chave chave) {
        var carro = new HondaHRV(motor);
        return carro.darIgnição(chave);
    }
}
