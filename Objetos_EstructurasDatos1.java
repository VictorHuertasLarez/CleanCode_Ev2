/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.objetos_estructurasdatos1;

/**
 *
 * @author ed
 */
public class Objetos_EstructurasDatos1 {

    public static void main(String[] args) {
     Coches coche1 = new Coches("509497lpg", 4500, 100);
        System.out.println(coche1);
        coche1.arrancarMotor();
        coche1.acelerar(30);
        System.out.println(coche1);
        coche1.frenarApagarMotor();
        System.out.println(coche1);
        
        Coches[] listaCoches = {
            new Coches("78073jbl", 5000, 115),
            coche1,
            new Coches("85328DOV", 10000, 140),
        };
        
        System.out.println("Se muestra la lista de coches");
        for(Coches cocheNuevo : listaCoches){
            System.out.println(cocheNuevo);
        }
    }
}
