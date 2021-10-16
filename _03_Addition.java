

//Method overloading concept
class _03_Addition 
{
	public static void main(String[] args) 
	{
		addition (10,20);
		addition(10,20,30);
		addition (30,40);
		addition (10,40,50);
		addition (10,40,50);
	}
	public static void addition(int x, int y)
	{
		int z=(x+y);
		System.out.println("the sum of "+x+" and "+y+" is:"  +z);
	}
	public static void addition(int x, int y,int z)
	{
		int sum=(x+y);
		System.out.println("the sum of "+x+" and "+y+" and "+z"  is:"  +sum);

}
