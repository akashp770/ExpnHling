				//ArithmeticException 
class A {
	public void hello(){
int x,y,z;
		x=10;
		y=0;    
		try{
		z= x/y;
		System.out.println(z);   
		}
		catch(Exception e){
			System.out.println("Its not possble" + e);    // whn Divide by 0
		}
		System.out.println("Programm Continues....."); 
		System.out.println(" ");
	}
}

					//ArrayIndexOutOfBoundsException
class B {
public void hello(){
	int x[]={10,20,30};
	
	try{
			System.out.println(x[4]);
			
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("my Given Exception.." + e);
			System.out.println(" ");
		}
}
}

						//Throw Keyword 
class C{
	public  void hello ()
	{
		int bal=5000;
		int witd=6000;
		try{
			if(bal<=witd)
				throw new ArithmeticException("Insufficient Balance...Don't be over smart");
				bal=bal-witd;
				System.out.println("Transaction completed....");
		}
		
		catch (Exception e){
			System.out.println(e.getMessage());
			
		}
		System.out.println("program Continuess...");
		System.out.println(" ");
	}
}

class D{
	public  void hello ()
	{
		try{
		String ch =null;
		System.out.println(ch.charAt(0));
		}
		catch (NullPointerException e)
		{
			System.out.println("Null Pointer Exception..");
			System.out.println(" ");
		}
		
	}	
}


						//StringIndexOutOfBoundsException
class E{
	public  void hello ()
	{
		try{
String str = "Hello how are you";
      System.out.println(str.charAt(40));
      }
	  catch (StringIndexOutOfBoundsException e)
		{
			System.out.println("String Index OutOf  Exception..");
		}
	}
}	
	  
	  





class Exc{
	public static void main (String args[]) throws Exception 
	{
		A ao=new A();
		ao.hello();
		
		B bo = new B();
		bo.hello();
		
		C co = new C();
		co.hello();
		
		D d = new D();
		d.hello();
		
		E eo = new E();
		eo.hello();
	}
}