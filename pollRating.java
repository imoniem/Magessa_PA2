package magessa_p3;

import java.util.Scanner;

public class pollRating 
{
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		String topic[] = {"Food","Movies","TV Shows","Songs","Musicals"};
		int [][] responses = new int [5][11];
		for(int i=0; i<4; i++)
		{
	          
			for(int j=1; j<=10; j++)
			{
				responses[i][j]=0;
			}
		}
		for (int times=0; times<3; times++)
		{
			for(int j=0; j<5; j++)
			{ 
				System.out.print("Please rate "+topic[j]+": ");
		        int r=input.nextInt();
		        responses[j][r-1]++;
			}
		}
		
		int min=10000,max=0;
		String maxt = null; 
		
		String mint = null;
		int avg[]= new int[5];
        for(int x=0;x<5;x++)
        {
               avg[x]=0;
               for(int y=0;y<10;y++)
               {
            	   avg[x]= responses[x][y]*(y+1);            	   
               }   
               if(x ==0) 
               {
            	   max = avg[x];
            	   maxt= topic[x];
            	   min= avg[x];
            	   mint= topic[x];   
               }
               else
               {
            	   if(avg[x] > max)
                   {
                         maxt = topic[x];
                         max = avg[x];
                   }               
                   if(avg[x] < min)

                   {
                         mint = topic[x];
                         min= avg[x];
                   }
               }
               avg[x] = avg[x]/3;                            
               System.out.printf("\n%-20s","");
               for(x=0;x<10;x++)
               {
                      System.out.printf("%-10d",(x+1));
               }
               System.out.printf("%20s","Average Rating");
               System.out.println();
               for(x=0;x<5;x++)
               {
            	   System.out.printf("\n%-20s",topic[x]);
               }
               for(int y=0;y<10;y++)
               {
            	   System.out.printf("%-10d",responses[x][y]);
               }
               System.out.printf("%20d",avg[x]);
         } 
	
        input.close();
       	
	
	System.out.println("Highest Point total : "+max+" Topic : "+maxt);
        System.out.println("Lowest Point total : "+min+" Topic : "+mint);          
		
	}	
}	


