package TestDemo;

public class DataTypeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;                      // Declaring variable
		//System.out.println(i);    // Uncomment and see if java allows us work with variables which are not initialized  
	
		//boolean isOut = 'true';
		i = 25;                     // Assigning value to the variable
		i = 50;                     // Re-assigning value to the variable
		
		//i = "hello";              // Uncomment and try to assign a String value to i
		
		i = 'c';                  // See how ASCII value of a char is stored as an int
		
		System.out.println(i);      // This statement will print the value of i
		
		float radius=10;
		float pi = 3.14f;
		float circleArea=pi*radius*radius;      //to calculate the area of circle
		float circlePerimeter= 2*pi*radius;     //to calculate the perimeter of circle
	/*	float squareArea=radius*radius;         //to calculate the area of square
		float squarePerimeter=4*radius;*/       //to calculate the perimeter of square
		System.out.println("Circle Area:"+circleArea);
		System.out.println("Circle Perimeter:"+circlePerimeter);
/*		System.out.println("Square Area:"+squareArea);
		System.out.println("Square Perimeter"+squarePerimeter);*/
		
	    char ch = 'c';
        int num = 88;
        ch =(char) num; 
        System.out.println("Ch value is"+ch);
        
        
        
	}

}
