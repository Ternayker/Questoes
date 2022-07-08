/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questoes.job.rotation.questao2;

/**
 *
 * @author silga
 */
import java.util.Scanner;

public class Fibonacci {
     public static void main(String[] args) {
         int num = 0;
         
         Scanner sc = new Scanner(System.in); 
         
         System.out.print("Digite o numero: ");
         num = sc.nextInt();
        
         
         if(conta(num) == 1){
             System.out.println("O número informado pertence sequência.");
         }else{
             System.out.println("O número informado não pertence a sequência.");
         }
                

     }
     
     public static int conta(int n){
         int fiboAtual = 0;
         int fiboPosterior = 1;
         int i = 0;
         
         while(fiboAtual <= n){

            if(fiboAtual == n){
               i= 1;
           }else{
               i= 0;
           }
            
             fiboPosterior += fiboAtual;
             fiboAtual = fiboPosterior - fiboAtual;
 
         }
         return i;
     }
     
}
