/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questoes.job.rotation.questao5;
import java.util.Scanner;
/**
 *
 * @author silga
 */
public class inversao {
    public static void main(String[] args) {
        String text;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um texto:");
        text = sc.nextLine();
        
        char[] ch = text.toCharArray();

        for (int i = ch.length-1; i >= 0;i--){ 
                System.out.print(ch[i]);

            }
    }
    
}
