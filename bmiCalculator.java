package magessa_p2;

import java.util.Scanner;

public class bmiCalculator 
{
	public static void main(String[] args)
	{
		//declare variables
		float weight,height,bmi;
		int method;
		
		//create scanner
		Scanner input = new Scanner(System.in);
		
		//Ask for method
		System.out.print("What method would you like to use (lbs(1) or kgs(0))");
		method = input.nextInt();
		
		
			if (method == 1)
			{
				//ask user information
				System.out.print("Please enter your weight? (in pounds)");
				weight = input.nextFloat();
				System.out.print("Please enter your height? (in inches)");
				height = input.nextFloat();
		
				//calculate BMI
				bmi = (weight * 703)/(height*height);
		
				//display the BMI
				System.out.print("Your BMI is " + bmi);
				
				//categories
				 if (bmi < 18.5) 
				 {
					 System.out.println("underweight");
			     } 
				 else if (bmi < 25) 
				 {
					 System.out.println("normal");
			     } 
				 else if (bmi < 30)
				 {
					 System.out.println("overweight");
				 } 
				 else 
				 {
					 System.out.println("obese");
				 }
				
			}
			else 
			{
				//ask user information
				System.out.print("Please enter your weight? (in kilograms)");
				weight = input.nextFloat();
				System.out.print("Please enter your height? (in meters)");
				height = input.nextFloat();
		
				//calculate BMI
				bmi = weight /(height*height);
		
				//display the BMI
				System.out.print("Your BMI is " + bmi);
				
				//categories
				 if (bmi < 18.5) 
				 {
					 System.out.println("You are underweight");
			     } 
				 else if (bmi < 25) 
				 {
					 System.out.println("You are normal weight");
			     } 
				 else if (bmi < 30)
				 {
					 System.out.println("You are overweight");
				 } 
				 else 
				 {
					 System.out.println("You are obese");
				 }

			}
		
		//close input
        input.close();
		
	}

}
