package week7cs12;

import java.util.Scanner;

public class Week7cs12 {
    public static void main(String[] args){
        //task 1:
        int choice, num1, num2;
        Scanner keyboard = new Scanner(System.in);
          do
          {
          System.out.println("Enter a number: ");
          num1 = keyboard.nextInt();
          System.out.println("Enter another number: ");
          num2 = keyboard.nextInt();
          System.out.println("Their sum is " + (num1 + num2));
          System.out.println("Do you want to do this again? ");
          choice = keyboard.nextInt();
          } while (choice == 1);
        //task 2:
        for (int count = 1; count <= 10; count++)
            System.out.print(count + ", ");
    }
}
