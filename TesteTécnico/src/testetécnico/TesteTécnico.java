/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testetécnico;

import java.util.Scanner;

/**
 *
 * @author cardo
 */
public class TesteTécnico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int n = scanner.nextInt();
        int primeiroTermo = 1 ;
        int segundoTermo = 1;
        
        for (int i = 1; i <= n; i++) {
            System.out.println(primeiroTermo);
            
            int soma = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = soma;
            
        }
        

        }

       
}
    

