/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author Edgar
 */
public class teste {
    public static void main(String[] args) {
        Double valor = null, valor2 = null;
        String valorString = null;
        String valorString2 = null;
        
        Scanner rcb = new Scanner(System.in);
        try{
            //Double valor = null, valor2 = null;
            System.out.println("VALOR 1: ");
            valorString = rcb.nextLine();
            //rcb.nextLine();
            System.out.println("VALOR 2");
            valorString2 = rcb.nextLine();

            valor = Double.parseDouble(valorString.toUpperCase());
            valor2 = Double.parseDouble(valorString2.toUpperCase());
            
            System.out.println("Valor 1: " + valor);
            System.out.println("Valor 2: " + valor2);
            
        }catch(NumberFormatException e){
            System.out.println("entrou no catch");
            if(valorString.toUpperCase().matches("[A-Z]*")){
                System.out.println("VALOR 1 STRING");
            }
            if(valorString2.toUpperCase().matches("[A-Z]*")){
                System.out.println("VALOR 2 STRING");
            }
        }
        
        
        
    }
}
