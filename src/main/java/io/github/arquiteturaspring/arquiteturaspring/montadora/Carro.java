package io.github.arquiteturaspring.arquiteturaspring.montadora;

public class Carro {
    private String modelo;
    private String cor;
    private Motor motor;
    private Montadora montadora;

    public Carro(Motor motor) {
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }

    public CarroStatus darIgnição(Chave chave) {
        if (chave.getMontadora() == this.montadora) {
            return new CarroStatus("Não foi Possivel Ligar o Carro, Chave Invalida");
        } else {
            return new CarroStatus("Carro Desligado");
        }
    }
}
