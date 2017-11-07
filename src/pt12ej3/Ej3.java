/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt12ej3;

import java.util.Scanner;

/**
 * This program converts ADN to ARN and viceversa
 * @author Sergio
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome, choose an option\nOption 1->convert ADN to ARN\nOption 2->convert ARN to ADN");
        int option = sc.nextInt();
        switch(option){
            case 1:
                ADN_Conversion();
                break;
            case 2:
                ARN_Conversion();
                break;
            default:
                System.out.println("Bye!");
                break;
        
        }
        
    }

     /**
      * Converts ARN to ADN.
      * @author Sergio
      */
    private static void ADN_Conversion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input ADN: ");
        String ADN = sc.nextLine();
        ADN = ADN.replace('A','T');
        ADN = ADN.replace('G','C');
        ADN = ADN.replace('C','G');
        ADN = ADN.replace('T','U');
        System.out.println(ADN);
    }
    
    /**
     * 
     * Converts ADN to ARN.
     * @author Sergio
     */
    private static void ARN_Conversion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input ARN: ");
        String ARN = sc.nextLine();
        ARN = ARN.replace('T','A');
        ARN = ARN.replace('C','G');
        ARN = ARN.replace('G','C');
        ARN = ARN.replace('U','T');
        System.out.println(ARN);
    }
    
}
