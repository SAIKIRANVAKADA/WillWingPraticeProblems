import java.util.Arrays;

public class IncreasingNumber {

	static boolean checkNumber(int numbers) {
		boolean bool = false;
		String temp = Integer.toString(numbers);
		int[] arr = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++)
		{
		    arr[i] = temp.charAt(i) - '0';
		   
		    
		}
		
		int[] newarr = new int[arr.length];
		for (int i1 =0 ; i1<arr.length;i1++) {
			newarr[i1] = arr[i1];
			
		}
		Arrays.sort(newarr);
		bool = Arrays.equals(arr,newarr);
		return bool;
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(checkNumber(123585));
	}

}
