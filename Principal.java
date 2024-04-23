/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;
import javax.swing.*;
public class Principal {
    public static void main (String[] args){
        Conta conta = null;
        
        int opcao1 = -1;
        
        while (opcao1 != 9){
        opcao1 = Integer.parseInt(JOptionPane.showInputDialog("## Cadastro de Conta ##"
          + "\n1 - Criar Conta (Conta Corrente ou Conta Poupança)"
          + "\n2 - Consultar Saldo (Conta Corrente ou Conta Poupança)"
          + "\n3 - Depositar (Conta Corrente ou Conta Poupança)"
          + "\n9 - Sair"
        
        ));
        
        switch (opcao1){
            case 1:
                int opcao2 = -1;
                
                while(opcao2 != 9){
                    opcao2 = Integer.parseInt(JOptionPane.showInputDialog("## Tipo de Conta ##"
                      +"\n1 - Conta Corrente "
                      +"\n2 - Conta Poupança "
                      +"\n9 - Voltar "));
                    
                    if(opcao2 == 1){
                        ContaCorrente cc = new ContaCorrente();
                        cc.setNome("Conta Corrente");
                        cc.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inicial da conta corrente:")));
                        cc.setTaxaServico(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da Taxa de Serviço :")));
                        conta = cc;
                        System.out.println("Conta Corrente Criada Com Sucesso!");
                    } else {
                        if(opcao2 == 2){
                            ContaPoupanca cp = new ContaPoupanca();
                            cp.setNome("Conta Poupança");
                            cp.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo inicial da Conta Poupança:")));
                            cp.setJuros(Double.parseDouble(JOptionPane.showInputDialog("Digite a taxa de juros da Conta Poupança:")));
                            conta = cp;
                            System.out.println("Conta Poupança Criada Com Sucesso!");
                        }
                    }    
                }
                
                break;
            case 2:
                System.out.println("A Conta: " + conta.getNome() + "Possui o saldo de: " + conta.getSaldo());
                break;
            case 3:
                conta.setDeposito(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de deposito: ")));
                break;
            default:
                System.out.println("Opção Invalida!");
                break;
            
                
                
        }
        
    }
    }
}
