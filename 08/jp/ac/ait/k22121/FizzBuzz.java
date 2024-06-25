package jp.ac.ait.k22121;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz implements IKadai07_2{
    @Override
    public List<String> getConverted(List<Integer> targetList){
        List<String > fb = new ArrayList<>();

        for (int i=0;i<targetList.size();i++){
            if (targetList.get(i)%15 == 0){
                fb.add("FizzBuzz");
            }
            else if(targetList.get(i)%3 == 0){
                fb.add("Fizz");
            }
            else if (targetList.get(i)%5 == 0){
                fb.add("Buzz");
            }
            else {
                fb.add(Integer.valueOf(targetList.get(i)).toString());
            }
        }

        return fb;
    }

    public static void main(String[] args) {
        FizzBuzz app = new FizzBuzz();
        List<Integer> fb = new ArrayList<>();

        fb.addAll(Arrays.asList(1,2,3,4,5));
        System.out.println(app.getConverted(fb));
        fb.clear();

        fb.addAll(Arrays.asList(1,2,4));
        System.out.println(app.getConverted(fb));
        fb.clear();

        fb.addAll(Arrays.asList(12,13,14,15,16));
        System.out.println(app.getConverted(fb));
        fb.clear();

        fb.addAll(Arrays.asList(3,30,300));
        System.out.println(app.getConverted(fb));
        fb.clear();

        System.out.println(app.getConverted(fb));
    }
}
