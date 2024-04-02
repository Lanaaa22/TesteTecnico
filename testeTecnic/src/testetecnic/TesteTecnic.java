/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testetecnic;

import java.util.Scanner;

/**
 *
 * @author cardo
 */
public class TesteTecnic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in); //scanner para conseguir digitar uma entrada
        
        System.out.print("Digite uma palavra: "); //entrada digitada
        String palavra = scanner.next(); //entrada lida
        String invertida = ""; //inicializando a variavel invertida que vai comecar vazia
        
        for (int i = palavra.length() - 1; i >= 0; i--) { //loop que pega a quantidade de termos contrarios (...,5,4,3,2,1,0) da palavra e coloca no i
            //enquanto o i nao chegar a -1, ele continua e diminui sempre 1 (i--)
            invertida += palavra.charAt(i); //o charAt pega exatamente o indice i do momento e procura na variavel palavra e adiciona ele na variavel invertida         
        }//ex: arroz: indice 4 = z e coloca esse indice na vaariavel invertida, e assim até o final
        System.out.println(invertida); //printando a variavel
    }
    
}
