package TestDemo;

public class ControlStructureDemo1 {

	public static void main(String[] args) {
	
		 int sum = 0, count = 0;
	        int[] sales = { 6, 9, 7, 10, 11, 9, 7, 12, 14, 15, 13, 11 };
	        
	        // Using while loop
		/*	int index = 0;
	        while(index < sales.length) {
				sum += sales[index];
				index++;
			}*/
			
			// Using do-while loop
			int index = 0;
			do {
				sum += sales[index];
				index++;
			} while(index < sales.length);
	        
	        float average = (float) sum / sales.length;
	        for (int sale : sales) {
	            if (sale > average) count++;
	        }
	        System.out.println("Average sale: " + average);
	        System.out.println("Sales above average: " + count);
	}

}
