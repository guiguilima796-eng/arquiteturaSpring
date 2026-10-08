package io.github.arquiteturaspring.arquiteturaspring.montadora.configuration;

import io.github.arquiteturaspring.arquiteturaspring.montadora.Motor;
import io.github.arquiteturaspring.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean
    public Motor motor() {
        Motor motor = new Motor();
        motor.setTipoMotor(TipoMotor.TURBO);
        motor.setLitragem(2.0);
        motor.setCavalos(250);
        motor.setCilindros(4);
        motor.setModelo("VTEC Turbo");
        return motor;
    }
}
