package jp.ac.ait.k22121;

import jp.ac.ait.oop1.section09.Grade;
import jp.ac.ait.oop1.section09.IStudent;
import jp.ac.ait.oop1.section09.StudentBase;

import java.util.*;

public class Student extends StudentBase implements IStudent {
    public Student(String studentId, String name, List<Grade> grades){
        setStudentId(studentId);
        setName(name);
        setGrades(grades);
    }
    @Override
    public List<Grade> getGrades() {
        return super.getGrades();
    }
    @Override
    public void setGrades(List<Grade> grades) {
        super.setGrades(grades);
    }

    @Override
    public List<Grade> getGradesSortByRatingDsc() {
        List<Grade> data = new ArrayList<>(this.getGrades());

        Collections.sort(data, (o1, o2) -> {
            if (MyRatingToNum(o2.getMyRating()) == MyRatingToNum(o1.getMyRating())) {
                // 同じ値の場合は、名前の昇順でソート
                return o1.getSubject().compareTo(o2.getSubject());
            } else {
                // 違う値の場合は通常通り降順でソート
                return MyRatingToNum(o2.getMyRating()) - MyRatingToNum(o1.getMyRating());
                // return o2.getValue2().compareTo(o1.getValue2());  // こちらでもOKです
            }

        });
        return data;
    }
     public int MyRatingToNum(char str) {
         if (String.valueOf(str).equals("S")) { return 5; }
         else if (String.valueOf(str).equals("A")) { return 4; }
         else if (String.valueOf(str).equals("B")) { return 3; }
         else if (String.valueOf(str).equals("C")) { return 2; }
         else if (String.valueOf(str).equals("F")) { return 1; }
         else {return 0;}
     }

    @Override
    public List<Grade> getGradesFilterByRating(char rating) {
        List<Grade> data = new ArrayList<>();
        for (Grade g : getGrades()){
            if(String.valueOf(g.getMyRating()).equals(String.valueOf(rating))){
                data.add(g);
            }
        }
        return data;
    }
    @Override
    public List<Grade> getGradesFilterByCreditsEarned() {
        List<Grade> data = new ArrayList<>();
        for (Grade g : getGrades()){
            if(!String.valueOf(g.getMyRating()).equals("F") && !String.valueOf(g.getMyRating()).equals("Q")){
                data.add(g);
            }
        }
        return data;
    }
    @Override
    public int getTotalCreditsEarned() {
        int total = 0;
        for (Grade g : getGrades()){
            if(!String.valueOf(g.getMyRating()).equals("F") && !String.valueOf(g.getMyRating()).equals("Q")){
                total += g.getCredit();
            }
        }
        return total;
    }
}
