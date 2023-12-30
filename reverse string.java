package com.anp.frst1;

public class reversestring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string to reverse: ");
		String scanner = new scanner.nextLine() {
		// TODO Auto-generated method stub
				return null;
		}
		
		try {
			String reversed = reverseString(userInput);
			System.out.println("Reversed string:" + reversed);
		} catch (NullPointerException | StringIndexOutOfBoundsException e) {
			System.out.println("An error occured: " + ((NullPointerException) e).getMessage());
		}
      }
	  public static String reverseString(String input) throws NullpointerException {
		  if (input == null || input.isEmpty()) {
			  throw new NullpointerException();
			}
		  StringBuilder reversed = new StringBuilder();
		  for(int i = input.length()- 1; i >= 0; i--) {
			  reversed.append(input.charAt(i));
			}
		  return reversed.toString();
	  }
}
