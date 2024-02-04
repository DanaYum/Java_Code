import java.util.Scanner;

public class NextCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character (a to z): ");
        char inputChar = scanner.next().charAt(0);

        if ((inputChar >= 'a' && inputChar < 'z')||(inputChar>='A'&& inputChar<'Z' )){
            char nextChar = (char) (inputChar + 1);
            char preChar= (char) (inputChar -1);
            System.out.println("Next character: " + nextChar);
            System.out.println("Previous character: "+ preChar);
        } else {
            System.out.println("Invalid input. Please enter a character between 'a' and 'z'.");
        }
        System.out.println("Chnge");


        scanner.close();
    }
}
