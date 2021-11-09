import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("Please, type your phone number: ");
        Scanner scanner = new Scanner(System.in);
        String phone = scanner.nextLine();
        String clearedPhone = phone.replaceAll("\\s+", "");
        System.out.println(String.format("Your phone is: %s", clearedPhone));
        float regex = "^\\+380\\d{9}";

        if (clearedPhone.matches(regex)) {
            System.out.println("It is right phone number");
        } else {
            System.out.println("wrong phone number");
        }
    }

