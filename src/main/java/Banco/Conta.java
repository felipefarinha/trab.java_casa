package Banco;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    private double saldo;
    private Date dataCriacao;
    
    public ContaBancaria() {
        this.saldo = 0.0;
        this.dataCriacao = new Date();
    }
    
    public String getDataAberturaFormatada() {
        SimpleDateFormat formato = new  SimpleDateFormat("dd/MM/yyyy");
        return formato.format(this.dataCriacao);
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    public String getSaldoFormatado(){
        Locale localeBR = new Locale("pt","BR");
        NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);
        return dinheiro.format(this.saldo);
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public Date getDataCriacao() {
        return dataCriacao;
    }
    
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
        System.out.println("Depositado com sucesso! " + valor);
    }
    public double sacar(double valor) throws Exception {
        if(valor > this.saldo) {
            throw new Exception("Voce não tem saldo em conta.");
        }else {
            this.saldo = this.saldo - valor;
            System.out.println("Saque realizado. Valor:  R$ "+ valor +" Saldo em conta: " + this.getSaldoFormatado());
            return valor;
        }
    }
}