/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas1;

import java.util.Scanner;

/**
 *
 * @author Ana Karen
 */
public class Pilas1 {

    /**
     * @param args the command line arguments
     */
 char pila2[] = new char [26];
    int tope = 0;
    public void llenarpila(){
        char letra = 'A';
        for (int i=0; i<26; i++){
            pila2[tope]=letra;
            tope++; 
            letra++;
        }
        
    }
   
    public void mostraspila(){
        int k= 0;
        for (int i=tope-1; i>=0; i--){
            System.out.print(" "+pila2[k]);
            k++;
        }
    }
     public void desornerarpila(){
        for (int i=tope-1; i>=0; i--){
            System.out.print(" "+pila2[(int) (Math.random() * (26))]);
        }
    }
    public void eliminarpila(){
        tope--;
        System.out.println("dato eliminado");
    }
    public void agregarpila(){
        pila2[tope]='&';
        tope++;
        System.out.println("dato agregado");
    }
    
    public static void main(String[] args){
        Pilas1 p = new Pilas1();
        Scanner sc = new Scanner(System.in);
        int opt;
        do{
            System.out.println("\n1 llenar\n"
            + "2 mostrar\n"
            + "3 eliminar\n"
            + "4 agregar\n"
            + "5 ordenar\n"
            + "6 salir");
            switch(opt=sc.nextInt()){
                case 1:
                    p.llenarpila();
                    break;
                case 2:
                    p.desornerarpila();
                    break;
                case 3:
                    p.eliminarpila();
                    break;
                case 4:
                    p.agregarpila();
                    break;
                case 5:
                    p.mostraspila();
                    break;
            }
        } while(opt !=6);
    }
}

