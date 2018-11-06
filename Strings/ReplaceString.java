package MyString;

public class ReplaceString {

	public static void main(String[] args) {
		
		String letters ="ABC";
		letters=letters.replace("B", "Z");
		System.out.println(letters);
		
		letters=letters.replaceAll("AZC", "PQR");
		System.out.println(letters);
		
        String text = "He is my dear friend";
        text=text.replaceAll("\\s", "_");
        System.out.println(text);
        
	}

}


Result:-
AZC
PQR
He_is_my_dear_friend
