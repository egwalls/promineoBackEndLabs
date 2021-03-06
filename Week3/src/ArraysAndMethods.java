import java.util.Scanner;

public class ArraysAndMethods {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// TODO Auto-generated method stub
		//create an array with the following values 1, 5, 2, 8, 13, 6
        int[] intArray = {1, 5, 2, 8, 13, 6};

        //print out the first element in the array
        System.out.println(intArray[0]);
        
        //print out the last element in the arrya without using the number 5
        System.out.println(intArray[intArray.length-1]);

        //print out the element in the array at position 6, what happens?
        //System.out.println(intArray[6]);
       
        //print out the elect in the array at position -1, what happens?
        //System.out.println(intArray[-1]);

        //write a traditional for loop that prints out each element in the array
        
        for (int i = 0; i < intArray.length; i++) {
        	System.out.println(intArray[i]);
        }

        //write an enhanced for loop that prints out each element in the array
        for (int i : intArray) {
        	System.out.println(i);
        }
        
        //create a new variable sum, write a loop that adds each element in the array to the sum
        double sum = 0;
        for (int i = 0; i < intArray.length; i++) {
        	sum += intArray[i];
        }
        System.out.println(sum);

        //create a new variable called average and assign the average value of the array
        double average = sum / intArray.length;
        System.out.println(average);

        //write an enhanced for loop that prints out each number in the array only if the number is odd
        for (int i : intArray) {
        	if (i % 2 != 0) {
        		System.out.println(i);
        	}
      
        }
        
        //create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
        
        String[] names = {"Sam", "Sally", "Thomas", "Robert"}; 

        //calculate the sum of all the letters in the new array
        
        int letterSum = 0;
        
        for (int i = 0; i < names.length; i++ ) {
        	letterSum += names[i].length();
        }
        System.out.println(letterSum);
        
        //write and test a method that takes a String name and prints out a greeting, this method returns nothing
        
        System.out.print("Enter a name: ");
        String name = s.next();
        Greeting1(name);
        
        //write and test a method that takes a String name and returns a greeting, do not print in the method
        System.out.print("Enter a name: ");
        String name2 = s.next();
        String greeting2 = Greeting2(name2);
        System.out.println(greeting2);
        //analyze the difference between these two methods - what do you find? How are they different?
        	//both look the same in the terminal but the second method allows the result to be stored in a variable and used later
        
        //write and test a method that takes a String and an int and returns true if the number of letter in the string is greater than the int
        System.out.println("Is string length larger than number?");
        System.out.print("Enter a string: ");
		String testString = s.next();
		System.out.print("Enter a number: ");
        int number = s.nextInt();
        System.out.println("String is longer than number: " + isStringLonger(testString, number));
        
        //write and test a method that takes an array of string and a string and returns true if the string passed exists in the array
        
        String[] sampleArray = {"a", "b", "c", "d"};
        System.out.print("Enter a string to see if it is in the array: ");
        String testString2 = s.next(); 
        System.out.println("String is in sample array: " + isStringInArray(sampleArray, testString2));
        
        //write and test a method that takes an array of int and returns the smallest number in the array
        int[] sampleIntArray = {39, 53, 2, 12};
        
        System.out.println("The smallest number in the array is: " + findSmallestNumber(sampleIntArray));
        
        //write and test a method that takes an array of double and returns the average
		double[] doubleArray = {23.9, 32.4, 39.2, 51.8};
		
		System.out.println("Average of the array is: " + calculateArrayAverage(doubleArray));
		
        
        //write and test a method that takes an array of Strings and returns an array of int where each element matches the length 
		//of the string at that position
		
		String[] stringArray = {"Sally", "Bob", "Harvey", "Hank", "Andrea"};
		int[] lengthsArray = extractStringLengths(stringArray);
		for (int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i] + " : " + lengthsArray[i]);
		}
		
		//write and test a method that take an array of strings and returns true if the sum of letters for all strings with an 
		//even amount of letters is greater than those with an odd amount of letters
		System.out.println("Is the sum of even words in the array greater than odd? " + isEvenSumLarger(stringArray));
		
		
		//write and test a method that takes a string and returns true if the string is a palindrome
		System.out.print("Enter a string to check for palindrome: ");
		String testPalindrome = s.next();
		testPalindrome = testPalindrome.toLowerCase();
		System.out.println("The word you entered is a palindrome: " + isPalindrome(testPalindrome));
	
		s.close();
	}
	
	
	public static void Greeting1(String name) {
		System.out.println("Hello " + name);
	}
	
	public static String Greeting2(String name) {
		return "Hello " + name;
	}
	
	public static boolean isStringLonger(String word, int number) {
		return (word.length() > number);
	}
	
	public static boolean isStringInArray(String[] array, String testString) {
		for (String arrayItem : array) {
			if (arrayItem.equals(testString)) {
				return true;
			}
		}
		return false;
	}
	
	public static int findSmallestNumber(int[] intArray) {
		int smallest = intArray[0];
		for (int number : intArray) {
			if (number < smallest) {
				smallest = number;
			}
		}
		return smallest;
	}
	
	public static double calculateArrayAverage(double[] doubleArray) {
		double sum = 0;
		
		for (double number : doubleArray) {
			sum += number;
		}
		return sum / doubleArray.length;
	}
	
	public static int[] extractStringLengths(String[] stringArray) {
		int[] lengthsArray = new int[stringArray.length];
		int i = 0;
		for (String string : stringArray) {
			lengthsArray[i++] = string.length();
		}
		return lengthsArray;
	}
   
	public static boolean isEvenSumLarger(String[] stringArray) {
		int sumEven = 0;
		int sumOdd = 0;
		
		for (String arrayItem : stringArray) {
			if (arrayItem.length() % 2 == 0) {
				sumEven += arrayItem.length();
			} else {
				sumOdd += arrayItem.length();
			}
		}
		return (sumEven > sumOdd);
	}
	
	public static boolean isPalindrome(String test) {
		int beginning = 0;
		int end = test.length() - 1;
		while (beginning < end) {
			if (test.charAt(beginning++) != test.charAt(end--)) {
				return false;
			}
		} 
		return true;
	}

}
