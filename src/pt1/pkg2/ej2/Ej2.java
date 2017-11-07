package pt1.pkg2.ej2;

import java.util.Scanner;

/**
 * This program says if your word its a palindrome
 * @author Sergio
 */
public class Ej2 {
    
        public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Input your sentence: ");
        String s=sc.nextLine();
        
        s=s.replace(" ", "");
        s=s.replace(",", "");
        s=s.replace(".", "");
        System.out.print(s);
        int fin = s.length()-1;
        int ini=0;
        boolean espalin=true;
        
        while(ini < fin){
            if(s.charAt(ini)!=s.charAt(fin)){
                espalin=false;
            }
        ini++;
        fin--;
        }
                
        if(espalin)
            System.out.print("\nIt's palindrome.");
        else
            System.out.print("\nIt's not palindrome.");
        
    }
 
}