
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
        Scanner input = new Scanner (System.in);
        int iA1, iNum;
        String sNum;
        System.out.println("Dame un numero del mes");
        iA1 = input.nextInt();
        input.nextLine();
        A(iA1); 
        System.out.println("Dame una letra para la calificación");
        sNum = input.nextLine();
        B(sNum);
        System.out.println("Dame una califa del 60 al 100");
        iNum = input.nextInt();
        input.nextLine();
        C(iNum);
        System.out.println("dime tu edad");
        int iEdad = 0 ; 
        System.out.println(suma(5,8));
        
    }
    public static int suma(int iMensaje,int i){
        Scanner input = new Scanner (System.in);
        System.out.println(iMensaje);
        int iResu = input.nextInt(); //cambiar a algo que acepte como un String
        input.nextLine(); //quitar esto en los demas
        return iResu; //copia esto y repetirlo solo cambiar las  variables de la clase
        
    }
    public static int suma(String sMensaje , String sCadena){
        Scanner input = new Scanner (System.in);
        System.out.println(sMensaje);
        String sResu = input.nextLine(); 
        return sResu + sCadena; 
        
    }
    public static void A(int x){
        switch(x) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
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
                System.out.println("Septiembre");
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
            default:
                System.out.println("Numero invalido");
                break;
        }  
    }
    public static void B(String X){
        switch (X) {
            case "a":
                System.out.println("100");
                break;
            case "b":
                System.out.println("90");
                break;
            case "c":
                System.out.println("80");
                break;
            case "d":
                System.out.println("70");
                break;
            case "f":
                System.out.println("60");
                break;
            default:
                System.out.println("Letra invalida");
                break;
        }
    }
    public static void C(int I){
        switch (I){
            case 100:
                System.out.println("A");
                break;
            case 90:
                System.out.println("B");
                break;
            case 80:
                System.out.println("C");
                break;
            case 70:
                System.out.println("D");
                break;
            case 60:
                System.out.println("F");
            default:
                System.out.println("Escribe exactamente el numero");
                break;
        }
        
    }
   
}
