import java.util.Scanner;

public class ForLoopsPractice {

	public static void main(String [] args){

	       Scanner input = new Scanner(System.in);

	        //ask for number, then count to that number from zero and output what we counted to
	        System.out.println("Enter a number:");
	        int numberOne = Integer.parseInt(input.nextLine());
	        int beginCountOne;

	        for(beginCountOne =0; beginCountOne <=numberOne; beginCountOne++) {
	            System.out.println(beginCountOne);
	        }
	        System.out.println("I counted to " + numberOne);


	        //traverse a string, output the number of a's in the name
	        System.out.println("Enter a name");
	        String name = input.nextLine();

	        //made a variable for the character we are checking
	        char checkLowerA= 'a';
	        char checkUpperA = 'A';
	        //made a variable for the count of the character, starting at 0
	        int count = 0;
	        //starting index of zero, as long as the index is less than the total length of the name, we increment the index by one and looping
	        for (int index =0; index < name.length(); index++ ){

	        //simultaneously, we are checking each index during each loop for the character a, if it evaluates as true, then the count of a's goes up
	            if (name.charAt(index) == checkLowerA) {
	                count++;
	            }
	            if (name.charAt(index)== checkUpperA) {
	            	count++;
	            }
	        }
	        //outputting the number of a's in the name
	        System.out.println(name + " has "+ count + " a's");


	        //name backwards,
	        for( int i = name.length()-1; i >= 0; i--){
	            System.out.println(name.charAt(i));
	        }

	        //max and min values, ask for 5 integers and then loop to find max and min
	        System.out.println("Enter five numbers:");
	        System.out.println("Enter first number:");
	        int firstNumber = input.nextInt();
	        System.out.println("Enter second number:");
	        int secondNumber = input.nextInt();
	        System.out.println("Enter third number:");
	        int thirdNumber = input.nextInt();
	        System.out.println("Enter fourth number:");
	        int fourthNumber = input.nextInt();
	        System.out.println("Enter fifth number:");
	        int fifthNumber = input.nextInt();


	        int [] inputNumbers = new int [5];
	        inputNumbers [0] = firstNumber;
	        inputNumbers [1] = secondNumber;
	        inputNumbers [2] = thirdNumber;
	        inputNumbers [3] = fourthNumber;
	        inputNumbers [4] = fifthNumber;

	        int maxValue = inputNumbers [0];
	        int minValue = inputNumbers [0];


	        // going through the indexes of the array
	        for (int i = 0; i < inputNumbers.length; i++ )
	        {

	            //going through to find max value of the array
	            if(inputNumbers[i] > maxValue )
	            {
	                maxValue = inputNumbers[i];
	            }

	           //finding the minimum value of the array
	            if (inputNumbers[i] < minValue)
	            {
	                minValue = inputNumbers[i];
	            }
	            input.close();

	        }
	                System.out.println(maxValue);
	                System.out.println(minValue);

	    }
			
	

	}
	
	
	
	

