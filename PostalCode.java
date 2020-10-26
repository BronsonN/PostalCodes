import java.util.Scanner;

public class PostalCode {

  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    boolean leng;
    boolean digit;
    boolean letter;
    char x;

    do {

      leng = true;
      digit = true;
      letter = true;

    System.out.print("Enter a postal code: ");
    String PostalCode = keyboard.nextLine();

    for (int i = 0; i < PostalCode.length(); i++) {
       x= PostalCode.charAt(i);
       System.out.println(x);
     }


    if(PostalCode.length() != 6) {
      System.out.println("Postal code wrong length, Format L9L9L9");
      leng = false;
    }
    else if (!Character.isDigit(PostalCode.charAt(1)) || !Character.isDigit(PostalCode.charAt(3)) || !Character.isDigit(PostalCode.charAt(5))) {
      System.out.println("Postal code has letters where there are supposed to be digits");
      digit = false;
    }
    else if (!Character.isLetter(PostalCode.charAt(0)) || !Character.isLetter(PostalCode.charAt(2)) || !Character.isLetter(PostalCode.charAt(4))) {
      System.out.println("Postal code has digits where there are supposed to be letters");
      letter = false;
    }

    } while (leng == false || digit == false || letter == false);


    if (leng && digit && letter) {
      System.out.print("Postal code is valid!");
    }

  }

}
