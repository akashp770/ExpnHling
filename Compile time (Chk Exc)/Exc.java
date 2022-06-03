				   // Compile Time exception (Checked Exception)
				   
//It will occur InterruptedException  if we not use  "THROWS EXCEPTION"

class A {
	public void hello() throws Exception
	{
		for(int i=0;i<=10;i++){
			if(i==5){
				Thread.sleep(5000);
			}
			System.out.println(i);
		}
	}
		
}

class Exc{
	public static void main (String agrs[])  throws Exception
	{
		
		A ao =new A();
		ao.hello();
	}
}
