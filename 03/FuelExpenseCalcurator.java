import java.security.KeyStore;
import java.util.Scanner;

public class FuelExpenseCalcurator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double fuelEfficiency = 10.0;
        String str="";
        Car car = new Car();
        car.fuelEfficiency = fuelEfficiency;
        System.out.printf("燃費効率:%.2f[km/L]\n", fuelEfficiency);

        while (true){
            System.out.print("走行距離:");
            str = in.nextLine();
            if (str.equals("end")){
                System.out.println("終了");
                break;
            }
            else {
                car.run(Double.parseDouble(str));
                car.printInfo();
            }
        }
    }
}
