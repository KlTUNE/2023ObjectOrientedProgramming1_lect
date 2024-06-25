package jp.ac.ait.k22121;

import jp.ac.ait.oop1.section09.Grade;
import jp.ac.ait.oop1.section09.IStudent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentsSorter student_sorter = new StudentsSorter();
        List<Student> students = new ArrayList<>();

        students.add(new Student("K22001","一郎", new ArrayList<>(Arrays.asList(
                        new Grade("プログラミング1",3,'A'),
                        new Grade("プログラミング2",3,'A'),
                        new Grade("物理",2,'S'),
                        new Grade("数学",2,'A'),
                        new Grade("英語A",1,'Q'),
                        new Grade("英語B",1,'C')
        ))));
        students.add(new Student("k22002","二郎", new ArrayList<>(Arrays.asList(
                new Grade("プログラミング1",3,'S'),
                new Grade("プログラミング2",3,'Q'),
                new Grade("物理",2,'A'),
                new Grade("数学",2,'B'),
                new Grade("英語A",1,'C'),
                new Grade("英語B",1,'F')
        ))));
        students.add(new Student("k22003","三郎", new ArrayList<>(Arrays.asList(
                new Grade("プログラミング1",3,'S'),
                new Grade("プログラミング2",3,'S'),
                new Grade("物理",2,'S'),
                new Grade("数学",2,'S'),
                new Grade("英語A",1,'B'),
                new Grade("英語B",1,'B')
        ))));
        students.add(new Student("k22004","四郎", new ArrayList<>(Arrays.asList(
                new Grade("プログラミング1",3,'B'),
                new Grade("プログラミング2",3,'B'),
                new Grade("物理",2,'F'),
                new Grade("数学",2,'F'),
                new Grade("英語A",1,'B'),
                new Grade("英語B",1,'B')
        ))));

        List<IStudent> istudents = new ArrayList<>(students);
        student_sorter.setStudents(istudents);

        for (Student student : students){
            System.out.println(student.getStudentId() + ":" + student.getName());
            System.out.println("---getGradesSortByRatingDsc()---");
            System.out.println(student.getGradesSortByRatingDsc());
            System.out.println("---getGradesFilterByRating('A')---");
            System.out.println(student.getGradesFilterByRating('A'));
            System.out.println("---getGradesFilterByCreditsEarned()---");
            System.out.println(student.getGradesFilterByCreditsEarned());
            System.out.println("---getTotalCreditsEarned()---");
            System.out.println(student.getTotalCreditsEarned());
        }
        System.out.println("---getStudents()---");
        System.out.println(student_sorter.getStudents());
        System.out.println("---sortByTotalCreditsEarnedAsc()---");
        System.out.println(student_sorter.sortByTotalCreditsEarnedAsc());
        System.out.println("---sortByTotalCreditsEarnedDsc()---");
        System.out.println(student_sorter.sortByTotalCreditsEarnedDsc());
    }
}