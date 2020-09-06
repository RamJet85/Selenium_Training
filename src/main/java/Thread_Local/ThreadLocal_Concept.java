package Thread_Local;

public class ThreadLocal_Concept {
	
	public static ThreadLocal<String> Tl = new ThreadLocal<String>();

	public static void main(String[] args) {
		
		ThreadLocal_Concept concept = new ThreadLocal_Concept();
		concept.T_Local();
		
		
		 
		

	}
	
	public void T_Local() {
		Tl.set("Ram");
		String TLQ = Tl.get();
		System.out.println(TLQ);
		Tl.remove();
		System.out.println(Tl.get());
	}

}
