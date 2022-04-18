package Thread_Local;

public class ThreadLocal_Concept {
	
	public static ThreadLocal<String> Tl = new ThreadLocal<String>();
	
	
	//The Java ThreadLocal class is used to create variables that can only be read and written by the same thread. 
	//Thus, even if two threads are executing the same code, and the code has a reference to the same ThreadLocal variable, 
	//the two threads cannot see each other's ThreadLocal variables.

	public static void main(String[] args) {
		
		
		ThreadLocal_Concept.T_Local();
		
		//Thread safety means when a method or class instance can be used by multiple threads..
		//at the same time without any problems occurring..
		//What are Java Threads. A thread is a: Facility to allow multiple activities within a single process..
		//Each thread has its own stack memory and local variables..
		//The usage of thread is better communication between multiple threads..
		//multiple threads are working on the same data, and the value of our data is changing, 
		//that scenario is not thread safe and we will get inconsistent results. Not sync..


	}
	
	public static void T_Local() {
		
		Tl.set("Ram");
		String TLQ = Tl.get();
		System.out.println(TLQ);
		
		Tl.remove();
		System.out.println(Tl.get());
		
		
		//System.out.println(Tl.get());
		
		
	}

}
