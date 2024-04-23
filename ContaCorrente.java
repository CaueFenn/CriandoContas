/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class ContaCorrente extends Conta {
    private double saldo;
    private double taxaServico;

    public ContaCorrente() {
        this("", 0.0, 0.0);
        
    }

    public ContaCorrente(String nome, double saldo, double taxaServico) {
        super(nome);
        this.saldo = saldo;
        this.taxaServico = taxaServico;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTaxaServico() {
        return taxaServico;
    }

    public void setTaxaServico(double taxaServico) {
        this.taxaServico = taxaServico;
    }
    
    @Override
    public void setDeposito(double deposito){
        this.saldo = this.saldo + deposito;
    }
    
    
}
