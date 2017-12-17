import java.util.*;

public class binarySubstring{
	public static void main(String[] args) {
		String data = "1111000011010101011100011101";
		int pos[] = new int[100];
		int len = 0;

		for (int i=0; i<data.length()-1; i++ ) {
			if(data.charAt(i) == '1' && data.charAt(i+1) == '0' && data.charAt(i+2) == '1'){
				pos[len] = i+1;
				len++;
			}
		}

		System.out.print("Number of 101: " + len + "\nFound at these specific locations: ");

		for (int i=0; i<len; i++) {
			System.out.print(pos[i] + " ");
		}

	}
}