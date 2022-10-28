import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = myScanner.nextInt();

        // write your code here to print the appropriate message(s)
        // described below
        if (num <= 0){
            System.out.println("That's not a positive number");
        }
        if ((num%2 != 0)&&(num > 0)) {
            if (num % 5 == 0) {
                System.out.println(num + " is divisible by 5");
            }
            if (num % 7 == 0) {
                System.out.println(num + " is divisible by 7");
            }
            if ((num % 7 != 0) && (num % 5 != 0)) {
                System.out.println(num + " is not divisible by 5 or 7");
            }
        }
        if((num%2 == 0)&&(num > 0)){
           if ((double)num/1000 > 1){
               System.out.println("Big even Number");
           }
           else if ((double)num/100 > 1){
               System.out.println("Medium even Number");
           }
           else {
               System.out.println("Small even Number");
           }
        }
    }
}
