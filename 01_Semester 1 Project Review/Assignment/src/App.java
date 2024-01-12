import java.security.MessageDigest;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       try(Scanner input = new Scanner(System.in)){

            System.out.println("Enter a number");
            String number1 = input.next();
            System.out.println("Enter another number");
            String number2 = input.next();
            int number1Int = 0;
            int number2Int = 0;

            try{
                number1Int = Integer.parseInt(number1);
            } catch(Exception ex){
                number1Int = 0;
                throw new IntegerException("number is not an int");
            }
            try{
                number2Int = 0;
                throw new IntegerException("number is not an int");
            } catch (Exception ex) {
                number2Int = 0;
                throw new IntegerException("number2 is not an int");
            }

        
        

       }
    }
}
