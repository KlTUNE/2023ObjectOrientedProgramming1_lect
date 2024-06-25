package jp.ac.ait.k22121;
import java.util.ArrayList;
import java.util.List;

public class Fibonacci implements IKadai07_1{
    @Override
    public List<Integer> get(int max_value){
        List<Integer> fibo = new ArrayList<>();
        int temp = 0;;

        if (max_value < 0) return fibo;
        fibo.add(0);
        if (max_value == 0) return fibo;
        fibo.add(1);

        for (int i=0;i<max_value;i++){
            temp = fibo.get(i) + fibo.get(i+1);
            if (temp > max_value) break;
            fibo.add(temp);
        }
        return  fibo;
    }

    public static void main(String[] args) {
        Fibonacci app = new Fibonacci();

        System.out.println(app.get(0));
        System.out.println(app.get(1));
        System.out.println(app.get(10000));

        System.out.println(app.get(-10000));
    }
}
