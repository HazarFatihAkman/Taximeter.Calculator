import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double km_price = 2.20, min_fee = 20, start_fee = 10, km, fee;

        boolean exit = false;
        Scanner sc = new Scanner(System.in);

        while (!exit) {
            System.out.print("| How long km you will go? : ");
            km = sc.nextDouble();
            fee = start_fee + km * km_price;
            if (fee < 20) {
                fee = min_fee;
            }
            System.out.println("| Taxi fee : " + fee + "Tl");

            System.out.print("| Exit (Y/N) : ");
            exit = Objects.equals(sc.next(), "Y");
            System.out.println("---------");
        }
        sc.close();
    }
}
