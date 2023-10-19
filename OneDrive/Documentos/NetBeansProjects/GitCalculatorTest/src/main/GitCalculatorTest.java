package main;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author andre
 */
public class GitCalculatorTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;
        int op;
        
        System.out.println("Digite o num1: ");
        num1 = input.nextDouble();
        System.out.println("Digite o num2: ");
        num2 = input.nextDouble();
        
        System.out.println("Selecione uma peração: ");
        System.out.println("1 - soma");
        System.out.println("2 - subtracao");
        System.out.println("3 - multiplicacao");
        System.out.println("4 - divisao");
        System.out.println("Op: ");
        op = input.nextInt();
        
        switch(op) {
            case 1 :
                double soma = 0;
                soma = num1 + num2;
                System.out.println("Resultado: " + soma);
                break;
            case 2 :
                double subtracao = 0;
                subtracao = num1 - num2;
                System.out.println("Resultado: " + subtracao);
                break;
            case 3 :
                double multip = 0;
                multip = num1 * num2;
                System.out.println("Resultado: " + multip);
                break;
            case 4 :
                double divisao = 0;
                divisao = num1 / num2;
                System.out.println("Resultado: " + divisao);
                break;
            default :
                System.out.println("Opcao invalida.");
                break;
        }
    }
}
