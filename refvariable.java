import java.time.LocalDate;

public class refvariable {
    public static void main(String args[]){
        String name= new String("code");
        System.out.println(name.toUpperCase());
        LocalDate now= LocalDate.now();
        System.out.println(now.getDayOfMonth());
    }
}
