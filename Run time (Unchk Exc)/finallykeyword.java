			// try and finally keyword
			class F{
	public static void main (String args[])  
	{
		int x,y,z;
		x=10;
		y=2;    
		try{
		z= x/y;
		System.out.println(z);   
		}
		finally{
			System.out.println("I m in finally block");
		}
		System.out.println("Programm Continues.....");
	}
}
