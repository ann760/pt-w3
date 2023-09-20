package week03;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
		
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		int[] array = {1, 5, 2, 8, 13, 6};
		
		// 2. Print out the first element in the array
		System.out.println(array[0]);
		
		// 3. Print out the last element in the array without using the number 5
		System.out.println(array[array.length-1]);
		
		// 4. Print out the element in the array at position 6, what happens?
//		System.out.println(array[6]);
		
		// 5. Print out the element in the array at position -1, what happens?
//		System.out.println(array[-1]);
			
		// 6. Write a traditional for loop that prints out each element in the array
		for (int i =0; i < array.length; i++) {
			System.out.println(array[i]);
		}
			
		// 7. Write an enhanced for loop that prints out each element in the array
		for (int number : array) {
			System.out.println(number);
		}
		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
		int sum = 0;
		for (int number : array) {
			sum += number;
		}
		System.out.println(sum);	
		// 9. Create a new variable called average and assign the average value of the array to it
		double avg = sum / array.length;
		System.out.println(avg);
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
		for (int num : array) {
			if (num %2 ==0) {
				System.out.println(num);
			}
		}
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
		String[] names = {"Sam", "Sally", "Thomas", "Robert"};
		
		
		// 12. Calculate the sum of all the letters in the new array
		int sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length();
		}
		System.out.println(sumOfLetters);
		
		//
		// Methods:
		//	
		
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
		greet("Sara");

		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
		String name = "Sam";
		System.out.println(greetr(name)); 
		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		System.out.println("The methood can be used over and over");
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		System.out.println(isGreater("Annie", 4));
		System.out.println(isGreater2("Annie", 4));
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		System.out.println(inArray(names, "Sam"));
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
		System.out.println(getSmallest(array));
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		double[] array1 = {1.0, 5.0, 2.0, 8.0, 13.0, 6.0};
		System.out.println(getAvg(array1));

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position
		String[] array3 = {"strOne", "str2", "strThree3"};
		System.out.println(getEachLenth(array3));
		
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.
		System.out.println(evenIsLarger(array3));
	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome
		String word = "level";
		System.out.println(isPalindrome(word));
		
	}
	
	// Method 13:
	
	public static void greet(String name) {
		System.out.println("Hello, " + name);
	}

	// Method 14:
	public static String greetr(String name) {
		return "Hello, " + name;
	}
	
	// Method 15:
	public static boolean isGreater(String name, int num) {
		if (name.length() > num) {
			return true;
		} 
		return false;
	}
	
	public static boolean isGreater2(String string, int num) {
		return string.length() > num;		
	}
	
	// Method 16:
	public static boolean inArray(String[] array, String string) {
		for (String str : array){
			if (str.equals(string)) {
				return true;
			}
		}
		return false;
	}
	
	// Method 17:
	public static int getSmallest(int[] nums) {
		int smallest = nums[0];
		for (int num : nums) {
			if (num < smallest) {
				smallest = num;
			}
		}
		return smallest;
	}
	
	// Method 18:
	public static double getAvg(double[] array) {
		int sum = 0;
		for (double num : array) {
			sum += num;
		}
		return sum / array.length;
	}
	
	// Method 19:
	public static int[] getEachLenth(String[] strings) {
		int[] eachLength = new int[strings.length];
		for (int i =0; i < strings.length; i++) {
			eachLength[i] = strings[i].length();
//		for (String str : strings) {
//			int l = str.length();
//			eachLength[l] = strings[l].length();
			
		}
		return eachLength;
	}
	
	// Method 20:
	public static boolean evenIsLarger(String[] array) {
		int even = 0;
		int odd = 0;
		for (String string : array) {
			if (string.length() % 2 == 0) {
				even += string.length();
			} else {
				odd += string.length();
			}
		}

		return even > odd;
	}
	
	// Method 21:
	public static boolean isPalindrome(String string) {
		for (int i = 0; i < string.length() / 2; i++) {
			if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
	

}