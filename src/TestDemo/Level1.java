package TestDemo;

public enum Level1 {
	High,
	Medium,
	Low;
	private int num;
	public int enumMethod(int num)
	{
		this.num=num;
		System.out.println("Method Inside enum");
		return num;
	}

}
