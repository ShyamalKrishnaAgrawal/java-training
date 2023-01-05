import java.time.LocalDate;
import java.util.Scanner;

public class scanner1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Name = ?");

        String un=scanner.nextLine();
        System.out.println("Hello "+un);

        System.out.println("How old are you");
        int age=scanner.nextInt();
        int year = LocalDate.now().minusYears(age).getYear();
        System.out.println("born in " + year);
    }    
}
