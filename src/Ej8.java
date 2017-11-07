/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej8;



import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This program reads errors from some variables input for keyboard.
 * @author Sergio
 */
public class Ej8 {
    
    static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
      name();
      nif();
      age();
      weight();
      email();

    }
    
//FUNCTIONS

    /**
     * This function gets your name.
     */
public static void name(){     
    
        System.out.println("Input your name");
        String name = sc.nextLine();         
        Pattern patron = Pattern.compile("[^A-Za-z ]");
        Matcher encaja = patron.matcher(name);
            if(!encaja.find()){
                System.out.println("Your name is "+name);
            }
            else{
             System.out.println("Your name only can contains letters and blank spaces.");
            }     
}    

/**
 * This function gets your nif.
 */
public static void nif(){
    
    System.out.println("Input your NIF: (exemple: 12345678Z)");
    String NIF = sc.nextLine();
    validateNif(NIF);
    if(validateNif(NIF) == true){
        System.out.println("Your NIF is "+NIF);
    } else {
        System.out.println("Incorrect NIF");
    }
}

/**
 * This function validate your NIF.
 * @param NIF
 * @return 
 */
public static boolean validateNif(String NIF){
        boolean correcto=false;
        Pattern pattern=Pattern.compile("(\\d{1,8})([TRWAGMYFPDXBNJZSQVHLCKEtrwagmyfpdxbnjzsqvhlcke])");
        Matcher matcher=pattern.matcher(NIF);
        if(matcher.matches()){
            String letra=matcher.group(2);
            String letras="TRWAGMYFPDXBNJZSQVHLCKE";
            int index=Integer.parseInt(matcher.group(1));
            index=index%23;
            String reference=letras.substring(index,index+1);
            if(reference.equalsIgnoreCase(letra)){
                correcto=true;
            }else{
                correcto=false;
            }
        }else{
            correcto=false;
        }
        return correcto;
    }
/**
 * This function gets your age.
 */
public static void age() {
     System.out.println("Input your age: ");
     int age = sc.nextInt();
     if(age > 1 && age<100){
         System.out.println("Your age is "+age);
     }
     else {
         System.out.println("Incorrect age");
     }
     
    }

/**
 * This function gets your weight.
 */
public static void weight(){
     System.out.println("Input your weight: ");
     double weight = sc.nextDouble();
     if(weight > 30 && weight<200){
         System.out.println("Your weight is "+weight);
     }
     else {
         System.out.println("Incorrect weight");
     }

}

/**
 * This function gets your email.
 */
public static void email(){
    System.out.println("Input your mail: ");
    String email = sc.nextLine(); 
    validateEmail(email);
    
 
 
    }

/**
 * This function validate your email.
 * @param email
 * @return 
 */
public static boolean validateEmail(String email) {
     String PATTERN_EMAIL = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
 
        // Compiles the given regular expression into a pattern.
        Pattern pattern = Pattern.compile(PATTERN_EMAIL);
 
        // Match the given input against this pattern
        Matcher matcher = pattern.matcher(email);
        
           if (matcher.find()== true) {
            System.out.println("Email valid");
        } else {
            System.out.println("Invalid email");
        } 
             
         return matcher.matches();
    }

}