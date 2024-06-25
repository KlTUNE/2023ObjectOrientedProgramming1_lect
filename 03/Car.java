public class Car {
    double fuelEfficiency = 0, totalMileage = 0, expendedFuel = 0;
    double run(double mileage){
        totalMileage += mileage;
        expendedFuel += mileage / fuelEfficiency;

        return  expendedFuel;
    }
    void printInfo(){
        System.out.printf("「走行距離:%.2fkm 消費燃料:%.2fL」\n", totalMileage, expendedFuel);
    }
}
