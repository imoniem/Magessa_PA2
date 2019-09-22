package magessa_p1;

import java.util.Scanner;

public class Encrypt 
{
	
	public static void main(String[] args)
	{
			//Getting my variables
			int numOne, numTwo, numThree, numFour, userNum, tmp;
			
			// create scanner
			Scanner input = new Scanner (System.in);
			
			//Asking user to enter number
			System.out.print("Please enter a four digit number: ");
	    	userNum = input.nextInt();
	    	
	    	// Dividing to individual digits
	    	numOne = userNum /1000;
	    	numTwo = userNum /100 %10;
	    	numThree = userNum /10 %10;
	    	numFour = userNum %10;
	    	
	    	// Adding 7 and getting the remainder
	    	numOne = (numOne +7) %10;
	    	numTwo = (numTwo +7) %10;
	    	numThree = (numThree +7) %10;
	    	numFour = (numFour +7) %10;
	    	
	    	//Switching numbers
	    	tmp = numOne;
	    	numOne = numThree;
	    	numThree = tmp;
	    	
	    	tmp = numTwo;
	        numTwo = numFour;
	        numFour = tmp;
	        
	        // Printing Final Output
	        System.out.printf("The Encrypted number is %d%d%d%d",numOne,numTwo,numThree,numFour);
	        
	        //close input
	        input.close();
	     	     
	      
	  } 
	
}
