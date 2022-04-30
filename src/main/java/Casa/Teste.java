package Casa;

public class Teste {
    public Teste(){}

    public static void main(String[] args) {

        // Casa possui atributo: Cor e tamanho;
        Casa CasaNova = new Casa();

        //String Casacor = "branco";
        CasaNova.setCasacor("azul");
        CasaNova.setTamanho(250);
        System.out.println("Casa de " + CasaNova.getTamanho() + "m² " + "na cor " + CasaNova.getCasacor());

        // Parede poossui: altura, largura e Localização (cômodo)
        Parede ParedeNova = new Parede();

        ParedeNova.setAltura(3f);
        ParedeNova.setLargura(5f);
        ParedeNova.setLocalizacao("sala");
        System.out.println("Parede da " + ParedeNova.getLocalizacao() + " tem "+ ParedeNova.getAltura() + " por: " + ParedeNova.getLargura() + "m" );

        // Janela possui: altura, largura e material;
        Janela JanelaNova = new Janela();

        JanelaNova.setAltura(160f);
        JanelaNova.setLargura(160f);
        JanelaNova.setMaterial("Madeira");
        System.out.println("Janela de " + JanelaNova.getMaterial() + " com " + JanelaNova.getAltura() + " por "+ JanelaNova.getLargura() + "m " );

        // Porta possui: altura, largura e material;
        Porta PortaNova = new Porta();

        PortaNova.setAltura(210f);
        PortaNova.setLargura(80f);
        PortaNova.setMaterial("Madeira");
        System.out.println("Porta feita de "  + PortaNova.getMaterial() + " com " + PortaNova.getAltura() + " por "+ PortaNova.getLargura() + "m");



    }
}