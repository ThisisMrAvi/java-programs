private class Super
{
	int a=0;
	public Super(int x)
	{
		a=x;
	}
	public void show()
	{
		System.out.println("A="+a);

	}

	public void getA(int a)
	{
		this.a=a;
	}

}

class Sub extends Super
{
	int b=0;
	public Sub(int y)
	{
		super(y*3); //super must be the first line
		b=y;
	}
	public void display()
	{
		show();
		System.out.println("B="+b);

	}

	public void getB(int y, int z)
	{
		getA(y);
		b=z;
		System.out.println("A+b="+(a+b));
	}
}

class Day3
{
	public static void main(String[] args)
	{
		Sub obj= new Sub(10);
		obj.display();
		obj.getB(10,20);
		obj.display();
	}

}
