import java.io.*;

				//ClassNotFoundException
class A {
	public void hello() throws Exception
	{
		try {
			Class temp= Class.forName("exc3");
		}
		catch (ClassNotFoundException e){
			System.out.println("Class does not exist check the name of the class");
		}
	}
		
}


class B

class Exc2{
	public static void main (String agrs[])  throws Exception
	{
		
		A ao =new A();
		ao.hello();
	}
}