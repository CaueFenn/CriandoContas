/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public abstract class Conta {
    private String nome;
    private double saldo;
    
    
    public Conta(){
        this("");
    }

    public Conta(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
     public void setDeposito(double deposito){
        this.saldo = this.saldo + deposito;
    }
    
    
}
