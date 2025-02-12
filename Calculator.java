
import java.util.Scanner;
import java.lang.Math;
public class Calculator {
  public static void main(String[] args) {
	  
	  // Scanner initialization for user input
    Scanner scnr = new Scanner(System.in);
    
    // Variable initialize to control program loop
    String program = "y";
    
    //main loop of the program
    while(program.equals("y")){
    	
    	//selecting calculator mode
      System.out.println("Enter the calculator mode: Standard/Scientific?");
      String mode = scnr.next();
      String operation;
      
      // Standard mode
      if(mode.toLowerCase().equals("standard")){
        String operand;
        
        // shows information about the selected mode 
        System.out.println("The calculator will operate in standard mode.");
        System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
        
        //Get the selected operation from the user
        operation = scnr.next();
        
        //Verify the operation input
        for(int i = 0; i < 100; i++){
          if(operation.equals("+") || operation.equals("-") || operation.equals("/") || operation.equals("*")){
            break;
          }else{
        	  
        	  //Prompt the user for a valid operation
            System.out.println("Invalid operator " + operation);
            System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
            operation = scnr.next();
          }
        }
        //Determine the operation in words
        if(operation.equals("+")){
          operand = "add";
        }else if(operation.equals("-")){
          operand = "subtract";
        }else if(operation.equals("*")){
          operand = "multiply";
        }else{
          operand = "divide";
        }
        
        //Ask how many numbers the user want to operate on
        System.out.println("How many numbers do you want to "+ operand +"?");
        int total = scnr.nextInt();
        double temp;
        double answer = 0;
        int count = 0;
        
        //Get the numbers from user and perform the operation
        System.out.println("Enter " + total + " numbers");
        for (int i = 0; i < total; i++){
          temp =scnr.nextDouble();
          if(operation.equals("+")){
            if(i == 0){
              answer = temp;
            }else{
              answer = answer + temp;
            }
          }else if(operation.equals("-")){
            if(i == 0){
              answer = temp;
            }else{
              answer = answer - temp;
            }
          }else if (operation.equals("*")){
            if(i == 0){
              answer = temp;
            }else{
              answer *= temp;
            }
          }else if (operation.equals("/")){
            if(i == 0 && count == 0){
              answer = temp;
              count += 1;
            }else{
              answer = answer / temp;
              count += 1;
            }
          }
          
        }
        
        // Shows the results
        System.out.println("Result: " + answer);
        System.out.println("Do you want to start over? (Y/N)");
        program = scnr.next().toLowerCase();

      }
      // SCIENTIFIC MODE
      else if(mode.toLowerCase().equals("scientific")){
        System.out.println("The calculator will operate in scientific mode.");
        System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
        operation = scnr.next();
        String operand;
        
        //Verifies the operation input for scientific mode
        for(int i = 0; i < 100; i++){
          if(operation.equals("+") || operation.equals("-") || operation.equals("/") || operation.equals("*") || operation.equals("tan") || operation.equals("sin") || operation.equals("cos")){
            break;
          }else{
        	  
        	  //Prompt the user for a valid operations
            System.out.println("Invalid operator " + operation);
            System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
            operation = scnr.next();
          }
        }
        int total;
        double temp;
        double answer = 0;
        
        //Determines the operation in words for scientific mode
        if(operation.equals("+")){
          operand = "add";
          System.out.println("How many numbers do you want to " + operand + "?");
          total = scnr.nextInt();
          System.out.println("Enter " + total + " numbers");
          for (int i = 0; i < total; i++){
            temp =scnr.nextDouble();
            
            //Perform scientific addition operation
            if(operation.equals("+")){
              if(i == 0){
                answer = temp;
              }else{
                answer = answer + temp;
              }
            }else if(operation.equals("-")){
            	//Perform scientific subtraction operation
              if(i == 0){
                answer = temp;
              }else{
                answer = answer - temp;
              }
            }else if (operation.equals("*")){
            	//Perform scientific multiplication operation
              if(i == 0){
                answer = temp;
              }else{
                answer *= temp;
              }
            }else if (operation.equals("/")){
            	//Perform scientific division operation
              if(i == 0){
                answer = temp;
              }else{
                answer = answer / temp;
              }
            }
            
          }
        }else if(operation.equals("-")){
          operand = "subtract";
          System.out.println("How many numbers do you want to " + operand + "?");
          total = scnr.nextInt();
          System.out.println("Enter " + total + " numbers");
          for (int i = 0; i < total; i++){
            temp =scnr.nextDouble();
            if(operation.equals("+")){
              if(i == 0){
                answer = temp;
              }else{
                answer = answer + temp;
              }
            }else if(operation.equals("-")){
              if(i == 0){
                answer = temp;
              }else{
                answer = answer - temp;
              }
            }else if (operation.equals("*")){
              if(i == 0){
                answer = temp;
              }else{
                answer *= temp;
              }
            }else if (operation.equals("/")){
              if(i == 0){
                answer = temp;
              }else{
                answer = answer / temp;
              }
            }
            
          }
        }else if(operation.equals("*")){
          operand = "multiply";
          System.out.println("How many numbers do you want to " + operand + "?");
          total = scnr.nextInt();
          System.out.println("Enter " + total + " numbers");
          for (int i = 0; i < total; i++){
            temp =scnr.nextDouble();
            if(operation.equals("+")){
              if(i == 0){
                answer = temp;
              }else{
                answer = answer + temp;
              }
            }else if(operation.equals("-")){
              if(i == 0){
                answer = temp;
              }else{
                answer = answer - temp;
              }
            }else if (operation.equals("*")){
              if(i == 0){
                answer = temp;
              }else{
                answer *= temp;
              }
            }else if (operation.equals("/")){
              if(i == 0){
                answer = temp;
              }else{
                answer = answer / temp;
              }
            }
            
          }
        }else if(operation.equals("/")){
          operand = "divide";
          System.out.println("How many numbers do you want to " + operand + "?");
          total = scnr.nextInt();
          System.out.println("Enter " + total + " numbers");
          for (int i = 0; i < total; i++){
            temp =scnr.nextDouble();
            if(operation.equals("+")){
              if(i == 0){
                answer = temp;
              }else{
                answer = answer + temp;
              }
            }else if(operation.equals("-")){
              if(i == 0){
                answer = temp;
              }else{
                answer = answer - temp;
              }
            }else if (operation.equals("*")){
              if(i == 0){
                answer = temp;
              }else{
                answer *= temp;
              }
            }else if (operation.equals("/")){
              if(i == 0){
                answer = temp;
              }else{
                answer = answer / temp;
              }
            }
            
          }
        }else{
        	
        	//Perform trigonometric operations (sin, cos, tan)
          if (operation.equals("sin") ){
            operand = "sine";
            System.out.println("Enter a number in radians to find the " + operand);
            double radian = scnr.nextDouble();
            answer = Math.sin(radian);
            
          }else if(operation.equals("cos")){
            operand = "cosine";
            System.out.println("Enter a number in radians to find the " + operand);
            double radian = scnr.nextDouble();
            answer = Math.cos(radian);
            
          }else if (operation.equals("tan")){
            operand = "tangent";
            System.out.println("Enter a number in radians to find the " + operand);
            double radian = scnr.nextDouble();
            answer = Math.tan(radian);
            
          }
        }
        System.out.println("Result: " + answer);
        
        //Prompt the user if they want to start over again
        System.out.println("Do you want to start over? (Y/N)");
        program = scnr.next().toLowerCase();
      }
    }
    System.out.println("Goodbye");
  }
}