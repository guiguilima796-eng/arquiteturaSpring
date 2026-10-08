package io.github.arquiteturaspring.arquiteturaspring.montadora;

public class HondaHRV extends  Carro {
    public HondaHRV(Motor motor) {
        super(motor);
        setModelo("HondaHRV");
        setCor("Prata");
        setMontadora(Montadora.HONDA);
    }
}
