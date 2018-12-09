
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author temporal2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       int iMes ;
        /*int iMes = 0;
        while ((iMes <1) || (iMes >12)) {
             System.out.println("Introduce el numero de mes");
             iMes = input.nextInt();
             
        }*/
        do{
            System.out.println("Introduce el numero de mes");
            iMes = input.nextInt();
        }while((iMes <1) || (iMes >12)); //mientras la condicion se cumpla
        
        switch (iMes){
            case 1:
                System.out.println("Enero");
                break;
                case 2:
                System.out.println("Febrero");
                break;
                case 3:
                System.out.println("Mazo");
                break;
                case 4:
                System.out.println("Abril");
                break;
                case 5:
                System.out.println("Mayo");
                break;
                case 6:
                System.out.println("Junio");
                break;
                case 7:
                System.out.println("Julio");
                break;
                case 8:
                System.out.println("Agosto");
                break;
                case 9:
                System.out.println("Spetiembre");
                break;
                case 10:
                System.out.println("Octubre");
                break;
                case 11:
                System.out.println("Noviembre");
                break;
                case 12:
                System.out.println("Diciembre");
                break;
                
                
        } 
        
    }
    
}
