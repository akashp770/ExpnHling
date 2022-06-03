				//ArithmeticException 
class Excr2{
	public static void main (String args[]) throws Exception 
	{
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
	}
}