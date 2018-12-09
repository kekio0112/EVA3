/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_2_todos_ciclos;

import java.util.Scanner;

/**
 *
 * @author temporal2
 */
public class EVA3_2_TODOS_CICLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int j=0;
        int f=101;
        int h=0;
        int y=101;
        for (int i=1; i <=100; i++) {
            System.out.print(i + "--");
        }
        System.out.println("");
        System.out.println("----------");
        for (int i=100; i >=1; i--) {
            System.out.print(i+ "--");
        }
        System.out.println("");
        System.out.println("----------");
        while (true) {
            j= j +1 ;
            System.out.print(j+ "--");
            if (j==100)
                break;
        }
        System.out.println("");
        System.out.println("----------");
        while (true){
            f=f-1;
            System.out.print(f+ "--");
            if (f==1)
                break;
        }
        System.out.println("");
        System.out.println("----------");
        do {
            h= h+1;
            System.out.print(h+ "--");
            if (h==100)
                break;
        }while(true);
        System.out.println("");
        System.out.println("----------");
        do {
            y= y-1;
            System.out.print(y+ "--");
            if (y==1)
                break;
        }while(true);
    }
    
}
