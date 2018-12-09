
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SERGIO IVAN PIÑON PEÑA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        System.out.println("inicia main");
       A();
       System.out.println("termina main");
    }
   public static void A() {
       System.out.println("inicia A");
       B();
       System.out.println("termina A");
       
   } 
   public static void B() {
       System.out.println("inicia B");
       C();
       System.out.println("termina B");
       
   }
   public static void C() {
       System.out.println("inicia C");
       
        System.out.println("termina C");
       
   } 
}
