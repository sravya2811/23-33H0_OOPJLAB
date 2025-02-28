public class MethodOverWriting{
       public int add(int a,int b)
       {
          return a+b;
       }
       public int add(int a,int b,int c){
          return a+b+c;
       }
	public double add(double a,double b){
	      return a+b;
	}
	public static void main(String[] args)
	{
	    MethodOverWriting obj=new MethodOverWriting();
	    System.out.println("sum of 5 and 10:"+obj.add(5,10));
	    System.out.println("sum of 2,3 and 7:"+obj.add(2,3,7));
	    System.out.println("sum of 10.5 and 6.5:"+obj.add(10.5,6.5));
	}
  }