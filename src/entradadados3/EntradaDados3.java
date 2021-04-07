/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradadados3;

/**
 *
 * @author JONAS
 */

import java.util.Scanner;

public class EntradaDados3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Treinamento - Aula entrada de dados tipo string, concatenacao
        //Jonas valereo - Téncico em informática 
        
        //Declarando as variaveis
        
        String nome;
        String sobrenome;
        
        //Declarando o codigo Scanner entrada de dados
        
        Scanner entrada = new Scanner(System.in);
        
        
    //Declarando o codigo entrada de dado, next imprimir uma palavra no console
        
        System.out.println("Digite seu nome: ");
        nome = entrada.next();
        
        System.out.println("Digite seu sobrenome: ");
        sobrenome = entrada.next();
        
        
        //Declarando o codigo imprimir na tela , console
        
        System.out.println("Seu nome: " + nome + " e " + "Sobrenome: "
                + sobrenome);
        
        //Declarando saida da aplicação e descarrega a memoria
        
        System.exit(0);
        
        //Fim do programa 
        
        
        
       
    }
    
}
