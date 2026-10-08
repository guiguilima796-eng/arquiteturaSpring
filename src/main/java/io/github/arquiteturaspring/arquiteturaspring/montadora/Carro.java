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
            return new CarroStatus("Carro ligado com sucesso :"+ toString());
        } else {
            return new CarroStatus("Não foi possível ligar o carro, chave incompatível com a montadora do veículo");
        }
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", motor=" + motor +
                ", montadora=" + montadora +
                '}';
    }
}
