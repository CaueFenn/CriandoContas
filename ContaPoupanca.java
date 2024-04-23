/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class ContaPoupanca extends Conta {
    private double saldo;
    private double juros;

    public ContaPoupanca() {
        this("", 0.0, 0.0);
        
    }

    public ContaPoupanca( String nome, double saldo, double juros) {
        super(nome);
        this.saldo = saldo;
        this.juros = juros;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }
    
    public void setDeposito(double deposito){
        this.saldo = this.saldo + deposito;
    }
    
}
