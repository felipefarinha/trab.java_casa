// Casa é constituida das clases: Janela, Porta e Parede.
// Casa possui atributo: Cor e tamanho (m²);

package Casa;

import java.util.ArrayList;
import java.util.List;

    public class Casa {
        private String Casacor;
        private Integer tamanho;
        private List<Janela> janela;
        private List<Parede> parede;
        private List<Porta> porta;

        public Casa(){
            Casacor = "";
            tamanho = 0;
            parede = new ArrayList<>();
            janela = new ArrayList<>();
            porta = new ArrayList<>();
        }

        public String getCasacor() {return Casacor;}

        public void setCasacor(String casacor) {
            Casacor = casacor;
        }

        public Integer getTamanho() {return tamanho;}

        public void setTamanho(Integer tamanho) {
            this.tamanho = tamanho;
        }

        public List<Janela> getJanela() {return janela;}

        public void setJanela(List<Janela> janela) {
            this.janela = janela;
        }

        public List<Parede> getParede() {return parede;}

        public void setParede(List<Parede> parede) {
            this.parede = parede;
        }

        public List<Porta> getPorta() {return porta;}

        public void setPorta(List<Porta> porta) {
            this.porta = porta;
        }
    }
