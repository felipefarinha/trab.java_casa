package Casa;

public class Parede {
    private String localizacao;
    private Float altura;
    private Float largura;

    public Parede(){}

    public String getLocalizacao() {return localizacao;}

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }


    public Float getAltura() {return altura;}
    public void setAltura(Float altura) {
        this.altura = altura;
    }


    public Float getLargura() {return largura;}
    public void setLargura(Float largura) {
        this.largura = largura;
    }
}
