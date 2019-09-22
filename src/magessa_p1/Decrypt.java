package magessa_p1;

import java.util.Scanner;

public class Decrypt 
{
	public static void main(String[] args)
	{
			//Getting variables
		 	int numOne, numTwo, numThree, numFour, userNum, tmp;
		 	
		 	// create scanner 
			Scanner input = new Scanner (System.in);
			
	        //Asking for user entry
			System.out.print("Please enter a four digit encyrpted number: ");
	    	userNum = input.nextInt();
	    	
	    	//Separate digits
	    	numOne = userNum /1000;
	    	numTwo = userNum /100 %10;
	    	numThree = userNum /10 %10;
	    	numFour = userNum %10;
	    	
	    	// Adding 3 as a way to reverse the 7 then getting remainders
	    	numOne = (numOne +3) %10;
	    	numTwo = (numTwo +3) %10;
	    	numThree = (numThree +3) %10;
	    	numFour = (numFour +3) %10;
	    	
	    	//Switching Numbers
	    	tmp = numOne;
	    	numOne = numThree;
	    	numThree = tmp;
	    	
	    	tmp = numTwo;
	        numTwo = numFour;
	        numFour = tmp;
	        
	        //Original Output
	        System.out.printf("The Original Number is %d%d%d%d",numOne,numTwo,numThree,numFour);
	        
	        //close input
	        input.close();
	}

}
