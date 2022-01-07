/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Ejemplo041 {

    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el primer valor");
        int primerValor = entrada.nextInt();
        System.out.println("Ingrese el segundo valor");
        int segundoValor = entrada.nextInt();
        obtenerMultiplicacion(primerValor, segundoValor);
        
        
    }
        
    public static void obtenerMultiplicacion(int a, int b){
        int multi;
        multi = a * b;
        System.out.printf("El valor de la multiplicacion es: %d\n", multi);
        
    }

    
}
