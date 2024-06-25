package jp.ac.ait.k22121;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class UniqueString implements IKadai07_3{
    @Override
    public List<String> getUniqueList(List<String> targetList) {
        List<String> uni = new ArrayList<>();
        String temp;

        for (int i=0;i<targetList.size();i++){
            temp = targetList.get(i);
            for (int j=0;j<targetList.size();j++){
                if (targetList.get(j).equals(temp) && i != j){
                    break;
                }
                else if (j+1 == targetList.size()){
                    uni.add(temp);
                }
            }
        }

        return uni;
    }

    public static void main(String[] args) {
        UniqueString app = new UniqueString();
        List<String> uni = new ArrayList<>();

        uni.addAll(Arrays.asList("A", "B", "B", "B", "C"));
        System.out.println(app.getUniqueList(uni));
        uni.clear();

        uni.addAll(Arrays.asList("A", "A", "A", "A", "A"));
        System.out.println(app.getUniqueList(uni));
        uni.clear();

        uni.addAll(Arrays.asList("A", "B", "C", "D", "E"));
        System.out.println(app.getUniqueList(uni));
        uni.clear();
    }
}
