//create a diamond whose width (in columns) and height (in rows) are dictated by user input.
import java.util.Scanner;
public class Assignment2 {

//Ask User to provide the amount of rows in the diamond
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rows? ");
        int rows = sc.nextInt();

        // Top part of the diamond
        for (int i = 0; i < (rows/2); i++){
            for (int j = 0; j < (rows - 1) - i; j++){
                System.out.print("");
            }

            for (int j = 0; j < i; j++){
                System.out.print("*");
            }

            for (int j = 0; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        }
}
