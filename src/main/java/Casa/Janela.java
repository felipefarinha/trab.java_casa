// Janela possui: Dimensão e material;

package Casa;

public class Janela {
    //private Float altura = 2.6f;
    private Float altura;
    private Float largura;
    private String material;

    public Janela(){}

    public Float getAltura() {return altura;}
    public void setAltura(Float altura) {
        this.altura = altura;
    }


    public Float getLargura() {return largura;}
    public void setLargura(Float largura) {
        this.largura = largura;
    }


    public String getMaterial() {return material;}
    public void setMaterial(String material) {
        this.material = material;
    }
}
