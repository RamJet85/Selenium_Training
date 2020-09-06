package DropDownSelection;

public class ThreeDot {

	public static void main(String[] args) {

		threeDots("Ram","Charn","RRR");
		
		
	}
	
	//variable arguments varargs this will allows the method to accept zero or muliple parameters, 
		//If we don't know how many argument we will have to pass in the method, varargs is the better approach.
		//return_type method_name(data_type... variableName){}  
		// At a time we can check mult dd's using 3 dot parameter, this String... behave as like String[]
		// It means you can pass in an array of parameters without explicitly creating the array.
	
	
	
	public static void threeDots(String... value) {
		System.out.println(value.length);
		for (String str : value) {
			System.out.println(str);
			
		}
	}

}
