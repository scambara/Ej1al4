package pt1.pkg2.ej1;

import java.io.*;

/**
 * This program count vocals and consonants.
 * @author Sergio
 */
public class Ej1 { 	
 static String vec [] = new String [5];

  
{
  vec [0] = "a";
  vec [1] = "e";
  vec [2] = "i";
  vec [3] = "o";
  vec [4] = "u";  
}
	public static void main(String[] args) throws IOException {
 
		int counterA=0,counterE=0,counterI=0,counterO=0,counterU=0;
                int counter_consonants = 0;
 
		System.out.println("Input your name: ");
                
                   BufferedReader object = new BufferedReader(new InputStreamReader(System.in));
                     String vec =  object.readLine();
                    
                  for (int i = 0; i < vec.length(); i++){
                      //VOWELS
			if (vec.charAt(i) == 'a'){
                             System.out.println(vec.charAt(i));
                             counterA++;
			}
			if (vec.charAt(i) == 'e'){
				 System.out.println(vec.charAt(i));
                                 counterE++;
			}
			if (vec.charAt(i) == 'i'){
				 System.out.println(vec.charAt(i));
                                 counterI++;
			}   
			if (vec.charAt(i) == 'o'){
				 System.out.println(vec.charAt(i));
                                 counterO++;
			}
			if (vec.charAt(i) == 'u'){
				 System.out.println(vec.charAt(i));
                                 counterU++;
                        }
                        
                        //CONSONANTS
                        if(vec.charAt(i)!= 'a'){
                            counter_consonants++;
                        }
                         if(vec.charAt(i)!= 'e'){
                            counter_consonants++;
                        }
                          if(vec.charAt(i)!= 'i'){
                            counter_consonants++;
                        }
                           if(vec.charAt(i)!= 'o'){
                            counter_consonants++;
                        }
                            if(vec.charAt(i)!= 'u'){
                            counter_consonants++;
                        }
 
		   }
                               
             System.out.println("The letter A appears "+counterA+" times");
             System.out.println("The letter E appears "+counterE+" times");
             System.out.println("The letter I appears "+counterI+" times");
             System.out.println("The letter O appears "+counterO+" times");
             System.out.println("The letter U appears "+counterU+" times");
             System.out.println("Has "+counter_consonants+" consonants.");
                  
       
    }

                
                
                
 
		}
   