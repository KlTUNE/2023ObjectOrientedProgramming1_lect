package jp.ac.ait.k22121;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NonUniqueElements implements IKadai07_4{
    @Override
    public void convert(List<Integer> targetList){
        List<Integer> temp_list = new ArrayList<>();
        Integer temp;

        for (int i=0;i<targetList.size();i++){
            temp = targetList.get(i);
            for (int j=0;j<targetList.size();j++){
                if (targetList.get(j).equals(temp) && i != j) {
                    temp_list.add(temp);
                    break;
                }
            }
        }
        targetList.clear();
        targetList.addAll(temp_list);
    }

    public static void main(String[] args) {
        NonUniqueElements app = new NonUniqueElements();
        var non = new ArrayList<Integer>();

        non.addAll(Arrays.asList(1, 2, 3, 1, 3));
        app.convert(non);
        System.out.println(non);
        non.clear();

        non.addAll(Arrays.asList(1, 2, 3, 4, 5));
        app.convert(non);
        System.out.println(non);
        non.clear();

        non.addAll(Arrays.asList(5, 5, 5, 5, 5));
        app.convert(non);
        System.out.println(non);
        non.clear();

        non.addAll(Arrays.asList(10, 9, 10, 10, 9, 8));
        app.convert(non);
        System.out.println(non);
        non.clear();
    }
}
