/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author ThinkPad
 */
public class test {
           public static void main (String[] args)
           {
                    circunferencia c1 = new circunferencia(5.5);
                    circunferencia c2 = new circunferencia(10.1);
                    circunferencia c3 = new circunferencia(10.9);
 
                    if (c2.esIgual(c3, false))
                   {
                            System.out.println("c2 y c3: iguales sin considerar decimales");
                   }
 
                    if (c2.esIgual(c3, true))
                   {
                            System.out.println("c2 y c3: iguales considerando decimales");
                   }
          }
}