package Array_List;

public class TwoDarray {

	public static void main(String[] args) {
		//datatType arry[] = new dataType[];
		
		int arry[] = new int[3];
		arry[0] = 10;
		arry[1]=20;
		arry[2]=30;
		//arry[3]=40;
		//System.out.println(arry.length);
		
		//String obj[][] = new String[2][2];
		Object data[][] = null;
		
		data = new Object[3][2];
		
		data[0][0] = "Ram";
		data[0][1] = 12;
		
		data[1][0] = 'M';
		data[1][1] = 12.6;
		data[2][0] = 15;
		data[2][1] = "ss";
		
		
		System.out.println(data.length);
		System.out.println(data[0].length);
		
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[1].length;j++) {
				System.out.println(data[i][j]);
			}
		}
		

	}

}
