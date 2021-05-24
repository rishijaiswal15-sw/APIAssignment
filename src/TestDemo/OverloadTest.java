package TestDemo;

public class OverloadTest {

	
		// TODO Auto-generated method stub

		public void  evaluate(float a, float b) {
	        System.out.println((a+b));
	    }

	    public void evaluate(int a, int b) {
	        System.out.println((a+b));
	    }
	    
	    public static void main(String[] args) {
	        OverloadTest test = new OverloadTest();
	        test.evaluate(4, 2);
	    }
	


}