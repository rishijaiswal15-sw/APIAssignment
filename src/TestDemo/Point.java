package TestDemo;

public class Point {

	double x;
	double y;
	
	public double distance()
	{
		double dist= (x*x)+(y*y);
		dist=Math.sqrt(dist);
		return dist;
		
	}
	public double distance(Point p1, Point p2)
	{
		double diffx=p2.x-p1.x;
		double diffy=p2.y-p1.y;
		;
		double dist= (diffx*diffx)+(diffy*diffy);
		dist=Math.sqrt(dist);
		return dist;
	}
	public void setX(double x)
	{
		this.x=x;
	}
	public void setY(double y)
	{
		this.y=y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dist;
		Point p1=new Point();
		p1.setX(2);
		p1.setY(3);
		dist=p1.distance();
		System.out.println("P1 dist= "+dist);
		Point p2=new Point();
		p2.setX(5);
		p2.setY(6);
		dist=p2.distance(p1,p2);
		System.out.println("P2 dist= "+dist);
		System.out.println(p1.x+" "+" "+p2.x );
		

	}

}
