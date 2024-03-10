/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploexcepciones;

/**
 *
 * @author ed
 */
public class EjemploExcepciones {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        try {
            printHelloWorld();
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            System.out.println("This will always be executed, regardless of whether an exception was thrown or not.");
        }
    }

    public static void printHelloWorld() throws Exception {
        // Simulamos una situación en la que podríamos lanzar una excepción.
        if (Math.random() < 0.5) {
            throw new Exception("An error occurred while printing Hello, World!");
        }
        System.out.println("Hello, World!");
    }
}