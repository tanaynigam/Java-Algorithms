import java.util.*;

public class ConsecutiveZeros{
	public static void main(String[] args) {

		String data = "1111000011010101011100011101";
		int max = 0;
		int count = 0;

		for (int i=0; i<data.length() ; i++ ) {
			if(data.charAt(i) == '0'){
				count ++;
			}
			else{
				count = 0;
			}

			if(count > max)
				max = count;
		}
	
	System.out.print("Max Consecutive Zeros: "+ max);
	}
}