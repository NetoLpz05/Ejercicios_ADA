package ejercicio01.analisis.de.algoritmos;

import java.util.Scanner; // La importación debe ir fuera de la clase

public class Ejercicio01AnalisisDeAlgoritmos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ejercicio 1: Tiempo Cúbico O(n^3)
        System.out.print("Ingrese un número para el ejercicio O(n^3): ");
        int n = scanner.nextInt();
        int contador = 0;
        
        for (int i = 0; i < n; i++) { // n iteraciones
            for (int j = 0; j < n; j++) { // n iteraciones
                for (int k = 0; k < n; k++) { // n iteraciones
                    contador++; // 1 operación elemental por cada iteración
                }
            }
        }
        
        System.out.println("Operaciones realizadas en O(n^3): " + contador);
        
        // Ejercicio 2: Algoritmo Exponencial O(2^n)
        System.out.print("Ingrese un número para el ejercicio O(2^n): ");
        int m = scanner.nextInt();
        
        int totalSubconjuntos = (int) Math.pow(2, m);
        int opExponencial = 0;
        
        for (int i = 0; i < totalSubconjuntos; i++) { // 2^n iteraciones
            System.out.print("{");
            for (int j = 0; j < m; j++) { // n iteraciones
                if ((i & (1 << j)) != 0) { // Verifica si el bit está activo
                    System.out.print((j + 1) + " ");
                }
                opExponencial++; // Operación elemental
            }
            System.out.println("}");
        }
        
        System.out.println("Operaciones realizadas en O(2^n): " + opExponencial);
        
        // Ejercicio 3: Cálculo del Factorial O(n)
        System.out.print("Ingrese un número para el cálculo del factorial: ");
        int p = scanner.nextInt();
        long factorial = 1;
        int opFactorial = 0;
        
        for (int i = 1; i <= p; i++) { // n iteraciones
            factorial *= i; // Multiplicación y asignación (2 operaciones elementales por iteración)
            opFactorial += 2;
        }
        
        System.out.println("Factorial de " + p + " es: " + factorial);
        System.out.println("Operaciones realizadas en O(n): " + opFactorial);
        
        scanner.close();
    }
}