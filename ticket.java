package Pack1;

class Railway implements Runnable
{
	int available=1;
	 int wanted;
   Railway(int a)
   {
	  int wanted=a; 
   }
	@Override
	public void run() {
		System.out.println("Available Birth : "+available);
		if(available>= wanted)
		{
			String name= Thread.currentThread().getName();	
			System.out.println(wanted+ " birth reserved Successfully to "+name);
			
			try{
				Thread.sleep(1500);
		
				available = available - wanted;
			}
			catch(InterruptedException ie){}
		}
		else
		{
			System.out.println("their is no reserved seat ");
		}
		
	}
	
}
public class ticket {

	public static void main(String[] args) {
		
		Railway r=new Railway(2);
		
		
		Thread t=new Thread(r);
		Thread t1=new Thread(r);
		t.setName("Ishwar");
		t1.setName("Omkar");
		t.start();

	}

}
