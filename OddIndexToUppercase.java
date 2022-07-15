package week1.day2;


public class OddIndexToUppercase {
	public static void main(String[] args) {
		
		String test = "changeme";
		char[] change = test.toCharArray();
		for (int i = 0; i< test.length(); i++) {
			if (i%2!=0) {
				char j = Character.toUpperCase(change[i]);
				System.out.print(j);

			} else {
				System.out.print(change[i]);
			}
    }

	}}


