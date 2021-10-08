package com.company;

import java.util.Scanner;

public class Dado {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("¿Cuantos veces quieres lanzar?");
        int vecesDado = 0;
        try {
            vecesDado = scan.nextInt();
        }catch (Exception e){
            System.out.println("¡Tienes que poner un numero no un texto!");
        }
        int dado1;
        int dado2;
        int dadoTotal;
        int contador[] = new int[11];
        for (int i = 0; i < vecesDado; i++) {
            dado1 = (int) (Math.random()*6+1);
            dado2 = (int) (Math.random()*6+1);
            dadoTotal= dado1 + dado2;

            for (int j = 0; j < contador.length; j++) {
                if (dadoTotal == j+2){
                    contador[j] = contador[j] + 1;
                }
            }
        }
        for (int i = 0; i < contador.length; i++) {
            System.out.println(i+2+" -->  "+ contador[i]+ " veces");
        }
    }
}

