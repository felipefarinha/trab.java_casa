package Casa;

public class Teste {
    public Teste(){}

    public static void main(String[] args) {

        Casa CasaNova = new Casa();

        CasaNova.setCasacor("Azul");
        //String Casacor = "branco";

        CasaNova.setTamanho(250);

        Janela JanelaNova = new Janela();

        JanelaNova.setAltura(160f);
        JanelaNova.setLargura(160f);

        Porta PortaNova = new Porta();

        PortaNova.setAltura(210f);
        PortaNova.setLargura(80f);
        PortaNova.setMaterial("Madeira");

        Parede ParedeNova = new Parede();

        ParedeNova.setAltura(3f);
        ParedeNova.setLargura(5f);
        ParedeNova.setLocalizacao("Alvenaria");


        System.out.println("Cor da casa: " + CasaNova.getCasacor());
        System.out.println("Tamanho da casa: " + CasaNova.getTamanho() + "m²" );
        System.out.println("Janela tem: " + JanelaNova.getAltura() + " por "+ JanelaNova.getLargura() );
        System.out.println("Porta tem: " + PortaNova.getAltura() + " por "+ PortaNova.getLargura() + " feita de: " + PortaNova.getMaterial());
        System.out.println("Parede de: " + ParedeNova.getLocalizacao()+", " + "altura de : "+ ParedeNova.getAltura()+"m, " + "largura de: " + ParedeNova.getLargura()+ "m" );
        //        System.out.println(": " + CasaNova.get );

    }
}