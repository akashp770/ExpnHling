class Excr3{
	public static void main(String args[]) throws Exception{
		int x[]={10,20,30};
		
		try{
			System.out.println(x[4]);
			
		}
		catch (ArithmeticException e)
		{
			System.out.println("Arithmetic  Exception..");
		}
		catch (NullPointerException e)
		{
			System.out.println("Null Pointer Exception..");
		}
		catch (StringIndexOutOfBoundsException e)
		{
			System.out.println("String Index OutOf  Exception..");
		}
		catch (IllegalArgumentException e)
		{
			System.out.println("Illegal Access Exception..");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("my Given Exception.." + e);
		}
		
		
			System.out.println("Program continuos");
		
	}
}
