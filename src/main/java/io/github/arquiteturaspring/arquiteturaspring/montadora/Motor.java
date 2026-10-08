package io.github.arquiteturaspring.arquiteturaspring.montadora;

public class Motor {
    private TipoMotor tipoMotor;
    private Montadora montadora;
    private Double litragem;
    private int cavalos;
    private int cilindros;
    private String modelo;



    public TipoMotor getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }

    public Double getLitragem() {
        return litragem;
    }

    public void setLitragem(Double litragem) {
        this.litragem = litragem;
    }

    public int getCavalos() {
        return cavalos;
    }

    public void setCavalos(int cavalos) {
        this.cavalos = cavalos;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "tipoMotor=" + tipoMotor +
                ", montadora=" + montadora +
                ", litragem=" + litragem +
                ", cavalos=" + cavalos +
                ", cilindros=" + cilindros +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
