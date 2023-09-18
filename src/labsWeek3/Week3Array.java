package labsWeek3;

public class Week3Array {

	public static void main(String[] args) {
		
		String[] students = new String[3];
		students[0] = "Tom Sawyer";
		students[1] = "Jack Smith";
		students[2] = "Bill Tuner";
		
		for (int i =0; i < students.length; i++) {
			System.out.println(students[i]);
		}
		
		System.out.println("Enhance for loop");
		for (String student : students) {
			System.out.println(student);
		}
		
		String[] products = new String[5];
		products[0] = "Carrots";
		products[1] = "Pinapples";
		products[2] = "Tomatoes";
		products[3] = "Potatoes";
		products[4] = "Cereal";
		
		System.out.println("Enhance for loop");
		for (String product : products) {
			System.out.println(product);
		}
		
		int[] multiplesOf3 = new int[10];
		
		for (int i =1; i<= multiplesOf3.length; i++) {
			multiplesOf3[i -1] = i * 3;
			System.out.println("number: " + multiplesOf3[i-1]);
		}
		
		int[] multiplesOf5 = new int[10];
		for (int i = 0; i < multiplesOf5.length; i++) {
			multiplesOf5[i] = (i + 1) * 5;
			System.out.println("number: " + multiplesOf5[i]);
		}
		
		
	}

}
