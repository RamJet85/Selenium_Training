package Practice;

public class practice {

	public static void main(String[] args) {
		
		int Vcount =0;
		int Ccount =0;

		
		String str = "Ramakrishnau";
		
		int length = str.length();
		
		System.out.println(length);
		
		
		String str1 = str.toLowerCase();
		
		for(int i=0;i<length;i++) {
			
			if(str1.charAt(i)=='a'|| str1.charAt(i)=='e'|| str1.charAt(i)=='i'|| str1.charAt(i)=='o'|| str1.charAt(i)=='u') {
				
				Vcount++;
				
			}
			
			else if(str1.charAt(i)>='a' && str1.charAt(i)<='z') {
				Ccount++;
				
			}
			
			
			
		}
		System.out.println(Vcount);
		System.out.println(Ccount);
		
		
		
	}

}
