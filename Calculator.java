/**
 * 
 */
package hw04.aufgabe;

import java.util.Scanner;
import hw04.aufgabe.Fraction;

/**
 * @author emill
 *
 */
public class Calculator {

	public Calculator() {}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		try {
			printResult(calc.calculate(args));
		}catch(Exception e){
			System.err.println("Error: " + e.getMessage());
			
			System.exit(1);
		}
	}
	
	/**
    * Extracts the two Fractions and the operator of the String 
    * and then calculates them according to the given operator
    *
    * @param input String
    * @return result Fraction
    */
	public Fraction calculate(String input) {

	  Fraction frist = parse_String_to_Fraction(input.substring(0,2));
      Fraction second = parse_String_to_Fraction(input.substring(4,6));
      String operator = input.substring(3);
      
      Fraction result;
      
      try {
	      if(input.contains("*")) {
	   	   result = first.multiply(second);
	      }else if(input.contains("/")){
	       result =  first.multiply(second);
	      }else if(input.contains("+")){
	       result =  first.add(second);
	      }else if(input.contains("-")){
	       result = first.substract(second);
	      }
      }catch(Exception e) {
    	  throw new IllegalArgumentException("Please enter a valid operator and not " + operator);
      }finally {
    	  return result;
      }
      
   }
	
	
	
	public void printResult(Fraction calFraction) {
		System.out.println(calFraction.toString());
	}

}
