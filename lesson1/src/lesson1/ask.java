package lesson1;

public class ask {

	public static void main(String[] args) {
		
		//Завдання 1
		 
		boolean a = true;
		char b = 'C';
		byte c = 1;
		short d = 2;
		int i = 3;
		long f = 2l;

		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		System.out.println("c = "+ c);
		System.out.println("d = "+ d);
		System.out.println("i = "+ i);
		System.out.println("f = "+ f);
		
		// Завданя 2
		
		System.out.println("Byte MAX = " + Byte.MAX_VALUE);
		System.out.println("Byte MIN = " + Byte.MIN_VALUE);
		
		System.out.println("Short MAX = "+ Short.MAX_VALUE);
		System.out.println("Short = "+ Short.MIN_VALUE);
	
		System.out.println("Integer MAX = "+ Integer.MAX_VALUE);
		System.out.println("Integer = "+ Integer.MIN_VALUE);
		
		System.out.println("Long MAX = "+ Long.MAX_VALUE);
		System.out.println("Long MIN = "+ Long.MIN_VALUE);
		
		System.out.println("Character MAX = "+ (int)Character.MAX_VALUE);
		System.out.println("Character MIN = "+ (int)Character.MIN_VALUE);
		
		System.out.println("Float MAX = "+ Float.MAX_VALUE);
		System.out.println("Float MIN = "+ Float.MIN_VALUE);
		
		System.out.println("Double MAX = "+ Double.MAX_VALUE);
		System.out.println("Double MIN = "+ Double.MIN_VALUE);
		
		
		// Завдання 3
		
		int [] array = {2, 5, 7, 10, 25, 48, 42, 1, 7, 100};
			
		int max = array[array.length - 1];
		int min = array[array.length - 1];
		
		for (int q=0; q < array.length; q++) {
		    if (array[q] > max) {
		        max = array[q]; 
		    } else if (array[q] < min) {
		        min = array[q];
		    }
		}
		System.out.println("Min: " + min);
		System.out.println("Max: " + max);
	}
}
