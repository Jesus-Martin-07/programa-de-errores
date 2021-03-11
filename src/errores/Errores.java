/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package errores;
import java.util.Scanner;
/**
 *
 * @author martin aguilar
 */
public class Errores {
 private double valorReal;
 private double valorAproximado;
  public Errores(double valorReal, double valorAproximado) {
        this.valorReal = valorReal;
        this.valorAproximado = valorAproximado;
    }
    
    
    
    public static double errorapsoluto(double valorReal, double valorAproximado){
        double resultado, va;
        
        resultado=valorReal-valorAproximado;
        va=resultado>0?resultado:-resultado;
        
        return va;
    }
    
    public static double errorRelativo(double valorReal, double valorAproximado){
        double resultado=0, vr;
        
        resultado=Errores.errorapsoluto(valorReal, valorAproximado);
        vr=(resultado/valorReal)*100;
        return vr;
    }
    public static double errorpocentual(double valorReal, double valorAproximado){
        double resultado;
        resultado=((valorReal-valorAproximado)/valorReal)*100;
        return resultado;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double valorReal, valorAproximado, v;
        System.out.println("valor real");
        valorReal=teclado.nextDouble();
        System.out.println("valor aproximado");
        valorAproximado=teclado.nextDouble();
        System.out.println("el valor apsoluto es: "+Errores.errorapsoluto(valorReal, valorAproximado)); 
        
        System.out.println("el valor relativo es: "+ Errores.errorRelativo(valorReal, valorAproximado) +"%");
        
        System.out.println("el valor relativo porcentual es: "+Errores.errorpocentual(valorReal, valorAproximado));
    }
   
}
