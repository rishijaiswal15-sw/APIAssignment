package TestDemo;

public class enumExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (Level1 level2 : Level1.values()) {
		    System.out.println(level2);
		}
		Level1 level=Level1.High;
		//System.out.println(Level1.High);
		//System.out.println(level);
		String enumText=Level1.Medium.toString();
		//System.out.println(enumText);
		Level1 level1=Level1.valueOf("Low");
		System.out.println(level1);
		int num=level1.enumMethod(5);
		System.out.println(num);
		
		
	}

}
