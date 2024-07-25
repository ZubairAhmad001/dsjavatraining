import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter The number:");
        int num = scanner.nextInt();
                //int number = 10;
        String evenOdd = (num % 2 == 0) ? "even" : "odd";
        System.out.println(num + " is " + evenOdd);


                /*Even/Odd Check (using bitwise AND)
                String evenOrOdd = (num & 1) == 0 ? "Even" : "Odd";
                System.out.println(num + " is " + evenOrOdd);

                // Sum Calculation (using ternary operator)
                int sum = (num == 1) ? 1 : num + ((num - 1) * (num));
                System.out.println("Sum of 1 to " + num + " is " + sum);
                */



    }
}
