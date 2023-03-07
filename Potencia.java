/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package C4toSem;

import java.util.Scanner;

/**
 *
 * @author juand
 */
public class Potencia {
        private static Scanner sc =new Scanner(System.in);
        public static void main(String []args){
            
            System.out.println("Digite el numero que desea potenciar: ");
            int base=sc.nextInt();
            System.out.println("Digite el numero exponente: ");
            int exponente=sc.nextInt();
            
            System.out.println("El resultado de elevar "+base+" a la "+ exponente + "es: "+Potencia(base, exponente));
        
        }
        public static int Potencia(int base, int exponente){
            if(exponente==0)
                return 1;
             else
                return base * Potencia(base, exponente -1);



}}