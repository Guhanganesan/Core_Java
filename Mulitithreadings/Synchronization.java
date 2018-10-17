package MultiThread1;

class Calc
{
	static int count=0;
	public static synchronized void count()
	{
		count++;
	}
}


public class Mulitthread11 {
	
	public static void main(String[] args) throws InterruptedException{
		
		
   Runnable  obj1 = ()->{
				  		
				for(int i=1; i<=1000;i++)
				{
					Calc.count();
												
			    }
				};
  Runnable  obj2 = ()->{
			  		
					for(int i=1; i<=1000;i++)
					{
						Calc.count();
													
					}
					};
			 
			 Thread time1 = new Thread(obj1);
			 Thread time2 = new Thread(obj2);
			        time1.start();
			        time2.start();
			        time1.join();//to wait main thread
			        time2.join();
			        System.out.println(Calc.count);
		}
}

Result:-
2000
