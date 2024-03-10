/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objetos_estructurasdatos1;

import java.util.Objects;

/**
 *
 * @author ed
 */
public class Coches {
     // Constantes públicas 
    public static final int VELOCIDAD_MAXIMA = 200;

    // Constantes privadas 
    private static final int VELOCIDAD_MINIMA = 0;
    
    private String matricula;
    private int precio;
    private int potencia;
    private int velocidad;
    private boolean arrancado;

    public Coches(String matricula, int precio, int potencia) {
        this.matricula = matricula;
        this.precio = precio;
        this.potencia = potencia;
        velocidad = 0;
        arrancado = false;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    public boolean isArrancado(){
        return arrancado;
    }
    
   public int getVelocidad(){
       return velocidad;
   } 

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.matricula);
        hash = 97 * hash + this.precio;
        hash = 97 * hash + this.potencia;
        hash = 97 * hash + this.velocidad;
        hash = 97 * hash + (this.arrancado ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Coches other = (Coches) obj;
        if (this.precio != other.precio) {
            return false;
        }
        if (this.potencia != other.potencia) {
            return false;
        }
        if (this.velocidad != other.velocidad) {
            return false;
        }
        if (this.arrancado != other.arrancado) {
            return false;
        }
        return Objects.equals(this.matricula, other.matricula);
    }

    @Override
    public String toString() {
        return "Coches{" + "matricula=" + matricula + ", precio=" + precio + ", potencia=" + potencia + ", velocidad=" + velocidad + ", arrancado=" + arrancado + '}';
    }

    
    public void arrancarMotor(){
        this.arrancado = true;
    }
    
    public void apagarMotor(){
        this.arrancado = false;
    }
    
    public void acelerar(int incrementacion){
        this.velocidad += incrementacion;
    }
    
    public void frenar(int frenado){
        this.velocidad -= frenado;
    }
    
    public void frenarApagarMotor(){
        if(this.velocidad != 0){
            this.frenar(this.velocidad);//EJEMPLO DE LLAMADA A FUNCION DENTRO DE FUNCION QUE NO INCUMPLE LA LEY DE DEMETER
        }
        if(this.arrancado != false){
            this.apagarMotor();
        }
    }
}
