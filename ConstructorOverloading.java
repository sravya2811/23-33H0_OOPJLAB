class Demo11
   {
	Demo11()
	{
	   System.out.println("Empty constructor");
	}
	Demo11(int a)
	{
	   System.out.println("a value is:"+a);
	}
	Demo11(int a,int b)
	{
	   System.out.println("a value is:"+a+"b value is:"+b);
	}
}
class ConstructorOverloading
{
	public static void main(String[] args)
	{
            Demo11 ob1=new Demo11();
            Demo11 ob2=new Demo11(2);    	    
            Demo11 ob3=new Demo11(28,4);
	}
}