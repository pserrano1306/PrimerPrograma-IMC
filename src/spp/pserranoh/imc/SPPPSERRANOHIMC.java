/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.pserranoh.imc;
import java.util. Scanner;

/**
 *
 * @author alumno
 */
public class SPPPSERRANOHIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("CALCULADORA IMC");
        //declaracon de las variables (identificadores)
        double w, l , imc;
        String eIMC;
        //en la siguiente linea, le indico a Java que utilizare un teclado
        Scanner teclado = new Scanner (System.in);
        //asignar valores a los valores
        System.out.println("INTRODUCE PESO");
        w=teclado.nextDouble();
        System.out.println("Introduce Estatura");
        l=teclado.nextDouble();
        //resolver el problema
        imc= w/Math.pow(l,2);
       
        //evaluacion de imc
        if(imc>25){
            eIMC=("Sobre Peso");
        }else 
            if(imc<19){
               eIMC=("Desnutrición");
        }else {
          eIMC=("Normal");
                }
         //mostrar el resultado
        System.out.println("Peso = "+w);
        System.out.println("Estatura = "+l);
        System.out.println("IMC = "+imc);
        System.out.println(eIMC);
    }
    
}
