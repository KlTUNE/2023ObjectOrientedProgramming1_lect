public class FizzBuzz {
    public static void main(String[] args) {
        for (int count = 1; count <= 100; count++) {
            if (count%15 == 0){
                System.out.println("FizzBuzz");
            } else if (count%3 == 0) {
                System.out.println("Fiz");
            } else if (count%5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(count);
            }
        }
    }
}
