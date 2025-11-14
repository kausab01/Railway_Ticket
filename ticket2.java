package Pack1;

class Railway1 implements Runnable
{ 
	int available=1;
	int wanted;
  Railway1(int i)
  {
	  wanted=i;
  }
	@Override
	public void run() {
		System.out.println("available birth ="+available );
		
		if(available>=wanted){
			String name=Thread.currentThread().getName();
			
			System.out.println(wanted+" reserved available for "+name);
		try{
			Thread.sleep(15000);
			available-=wanted;
		}
		catch(InterruptedException a){}	
		}
		else
		{
			System.out.println("No Reserved seat ");
		}
	}
	
}
public class ticket2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Railway1 obj=new Railway1(1);
      
      Thread t=new Thread(obj);
      Thread t1=new Thread(obj);
      
      
      t.setName("kausab");
      t1.setName("Rohit");
      
      t.start();
      t1.start();
		
		
	}

}
