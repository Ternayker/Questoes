/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questoes.job.rotation.questao3;

/**
 *
 * @author silga
 */
public class Logica {
    public static void main(String[] args) {
        int n = 1;
        int aux;
        
        System.out.print("A) Números ímpares: ");
        for(int i = 0; i<9;i++){
            System.out.print(n+" ");
            n+=2;
        }
        
        System.out.print("\nB) Números multiplicado por ele mesmo: ");
        n = 2;
        for(int i = 0; i<11;i++){
            System.out.print(n+" ");
            n*=2;
        }
        
        System.out.print("\nC) Números soamdo pela sequencia de numeros ímpares: ");
        n = 0;
        aux = 1;
        for(int i = 0; i<12;i++){
            System.out.print(n+" ");
            n+=aux;
            aux+=2;
        }
        
        System.out.print("\nD) Números soamdo pela razão da diferença: ");
        n = 4;
        aux = 12;
        for(int i = 0; i<8;i++){
            System.out.print(n+" ");
            n+=aux;
            aux+=8;
        }
        
        System.out.print("\nE) Números na sequencia de fibonacci : ");
        n = 1;
        aux = 1;
        for(int i = 0; i<10;i++){
            System.out.print(n+" ");
            aux += n;
            n = aux - n; 
        }
        
        System.out.print("\nF) Números que começão com a letra d: ");
        n = 16;
        aux = 1;
        int aux2 = 19;
            System.out.print("2 10 12 ");
            for(int i=0;i<=4;i++){
                System.out.print(n+" ");
                
                if(n == aux2){
                    aux2 = (aux2+1)*10;
                    aux *= 10;
                    n = (n+1)*10;
                    for(int j=0;i<=aux;i++){
                        System.out.print(n+" ");
                        n+=1;
                    }
                    
                }
                n+=1;
            }
            
            
    }
    
    
}
