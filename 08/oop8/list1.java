import java.util.ArrayList;
import java.util.List;

public class list1 {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "たろう";
        names[1] = "じろう";
        names[2] = "さぶろう";

//        for (String name: names) {
//            System.out.println(name);
//        }

        List<String> nameList = new ArrayList<>();
        nameList.add("たろう");
        nameList.add("じろう");
        nameList.add("さぶろう");
        nameList.add("さllぶろう");

        for (String name: nameList) {
            System.out.println(name);
        }
    }
}