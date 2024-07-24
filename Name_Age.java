import java.util.Scanner;
public class Name_Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name = scanner.nextLine();
        System.out.println("Enter your Age:");
        int age = scanner.nextInt();
        System.out.println("Your  Name is: "  + name);
        System.out.println("Your  Age is: "  + age);


    }
}
