package jp.ac.ait.k22121;

import jp.ac.ait.oop1.section09.Grade;
import jp.ac.ait.oop1.section09.IStudent;
import jp.ac.ait.oop1.section09.IStudentsSorter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentsSorter implements IStudentsSorter {
    List<IStudent> students = new ArrayList<>();
    @Override
    public List<IStudent> getStudents() {
        return students;
    }
    @Override
    public void setStudents(List<IStudent> students) {
        this.students = students;
    }
    @Override
    public List<IStudent> sortByTotalCreditsEarnedAsc() {
        List<IStudent> data = students;

        Collections.sort(data, (o1, o2) -> o1.getTotalCreditsEarned() - o2.getTotalCreditsEarned() );

        return data;
    }
    @Override
    public List<IStudent> sortByTotalCreditsEarnedDsc() {
        List<IStudent> data = students;

        Collections.sort(data, (o1, o2) -> o2.getTotalCreditsEarned() - o1.getTotalCreditsEarned() );

        return data;
    }
}
