package io.github.arquiteturaspring.arquiteturaspring.montadora.configuration;

import io.github.arquiteturaspring.arquiteturaspring.montadora.Montadora;
import io.github.arquiteturaspring.arquiteturaspring.montadora.Motor;
import io.github.arquiteturaspring.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MontadoraConfiguration {

    @Bean(name = "motorAspirado")
    @Primary
    public Motor motorAspirado() {
        Motor motor = new Motor();
        motor.setTipoMotor(TipoMotor.ASPIRADO);
        motor.setLitragem(1.8);
        motor.setCavalos(140);
        motor.setCilindros(4);
        motor.setMontadora(Montadora.HONDA);
        motor.setModelo("VTEC Aspirado");
        return motor;
    }
    @Bean(name = "motorTurbo")
    public Motor motorTurbo() {
        Motor motor = new Motor();
        motor.setTipoMotor(TipoMotor.TURBO);
        motor.setLitragem(2.0);
        motor.setCavalos(250);
        motor.setCilindros(4);
        motor.setMontadora(Montadora.TOYOTA);
        motor.setModelo("VTEC Turbo");
        return motor;
    }
    @Bean(name = "motorEletrico")
    public Motor motorEletrico() {
        Motor motor = new Motor();
        motor.setTipoMotor(TipoMotor.ELETRICO);
        motor.setLitragem(2.0);
        motor.setCavalos(200);
        motor.setCilindros(4);
        motor.setMontadora(Montadora.TOYOTA);
        motor.setModelo("VTEC Elétrico");
        return motor;
    }
}
