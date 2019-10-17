public class Test {
	/*In Java, the string tokenizer class allows an application to break a string into tokens
    */

	public static void main(String[] args) {
		
		String delims = ",";
		String splitString = "one,two,,three,four,,five";
 
		System.out.println("StringTokenizer Example: \n");
		StringTokenizer st = new StringTokenizer(splitString, delims);
		while (st.hasMoreElements()) {
			System.out.println("StringTokenizer Output: " + st.nextElement());
		}
 
		System.out.println("\n\nSplit Example: \n");
		String[] tokens = splitString.split(delims);
		int tokenCount = tokens.length;
		for (int j = 0; j < tokenCount; j++) {
			System.out.println("Split Output: "+ tokens[j]);
		}

		
	}

/*
Result:-
StringTokenizer Example: 

StringTokenizer Output: one
StringTokenizer Output: two
StringTokenizer Output: three
StringTokenizer Output: four
StringTokenizer Output: five


Split Example: 

Split Output: one
Split Output: two
Split Output: 
Split Output: three
Split Output: four
Split Output: 
Split Output: five
*/
