import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int number = (int) (java.lang.Math.random()*101);

        Scanner input = new Scanner (System.in);
        System.out.println("Guess a magic number between 0 to 100");

        int guess = -1;
        while(guess!=number) {
            System.out.println("\nEnter your number:");
            guess = input.nextInt();

            if(guess == number) {
                System.out.println("Yes the number is" + number);
            }else if(guess>number) {
                System.out.println("Your guess is too high");
            }else {
                System.out.println("Your guess is too low");


            }
        }
    }
}
