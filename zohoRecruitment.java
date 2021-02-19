package zohoRecruitmnet;

import java.util.Scanner;

public class zohoRecruitment {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//Reading input String
		String input=sc.nextLine(); 
		//Splitting it to char Array
		char[] splittedInput=input.toCharArray();
		
		//Loop to go for nyumber of lines
		for(int i=1;i<=splittedInput.length;i++) {
			int middleElement=splittedInput.length/2;//to get middle element index
			int startElement=0; //to iniatialize start index
			
		  //Loop for printing empty characters
		  for(int j=1;j<splittedInput.length-1;j++) {
			  System.out.print("  ");
		  }
		  
		  //Loop for Printing string in asked format
		  for(int k=splittedInput.length-i;k<=splittedInput.length;k++) {
			  if(middleElement+1>splittedInput.length) {
			  System.out.print(" "+splittedInput[middleElement]);
			  middleElement++;
			  }
			  else {
				  System.out.print(" "+splittedInput[startElement]);
				  startElement++;
			  }
		  }
		 System.out.println();
		}
	}

}
