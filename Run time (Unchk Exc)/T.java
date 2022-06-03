			//Throw Keyword 

class T{
	public static void main (String args[])  
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
	}
}