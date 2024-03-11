/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author ThinkPad
 */
public class circunferencia {
           private double radio;
           public circunferencia(double radio)
           {
                      this.radio = radio;
           }
           public void imprimir()
           {
                        String color = "rojo";
                        System.out.println("Diámetro: " + 2*radio);
                        System.out.println("Color: " + color);
                        double area = 2 * 3.1416 * radio * radio;
                         System.out.println(area);
           }
           public boolean esIgual (circunferencia otro, boolean conDecimales)
           {
                          double radio1 = this.radio;
                          double radio2 = otro.getRad();
                          if (conDecimales)
                          {
              if (radio1 == radio2)
                    return true;
              else
                    return false;
          }
          else
                          {
              if (Math.abs(radio1-radio2)<1)
                    return true;
              else
                    return false;
          }
    }

    private double getRad() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
