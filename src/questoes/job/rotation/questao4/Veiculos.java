/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questoes.job.rotation.questao4;

/**
 *
 * @author silga
 */
public class Veiculos {
    public static void main(String[] args) {
        double Tempocarro = 110.0;
        double Tempocaminhao = 80.0;
        double distancia = 100.0;
        double t= 0.0;
        
        /**
        * utilizaei a fomula S(t) = Po ou Pf + Sa ou Sb para achar o tempo 
        * porém simplifiquei a função 
        */
        t = distancia/(Tempocarro + Tempocaminhao);
        
        /**
        * para a posiçao de encontro eu diminuir os 0,10 que equivale aos 10min gastos no pedagio pelo caminhão
        */
        System.out.println("posiçao de encontro "+((t-0.10)*Tempocaminhao));
        System.out.println("O carro faltara "+((t-0.10)*Tempocaminhao) +" km, enquanto o caminhão faltara "+(100-((t-0.10)*Tempocaminhao))+" km");
        
    }
}
