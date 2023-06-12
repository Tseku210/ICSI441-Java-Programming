package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Student {
    private String name;
    private String group;
    private double ses;

    public Student(String name, String group, double ses) {
        this.name = name;
        this.group = group;
        this.ses = ses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getSes() {
        return ses;
    }

    public void setSes(double ses) {
        this.ses = ses;
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John", "A", 3.2));
        students.add(new Student("Mary", "B", 4.0));
        students.add(new Student("David", "A", 3.8));
        students.add(new Student("Jane", "B", 3.5));
        students.add(new Student("Mark", "C", 3.7));
        students.add(new Student("Peter", "A", 4.0));
        students.add(new Student("Lisa", "C", 3.4));
        students.add(new Student("Tom", "B", 3.6));
        students.add(new Student("Sarah", "C", 3.9));
        students.add(new Student("Mike", "A", 3.3));

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int cmp = o1.getGroup().compareTo(o2.getGroup());
                if (cmp != 0) {
                    return cmp;
                } else {
                    return Double.compare(o1.getSes(), o2.getSes());
                }
            }
        });

        boolean found = false;
        for (Student student: students) {
            if (student.getSes() > 3.5) {
                System.out.println(student.getName() + " - " + student.getGroup());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Сурагч олдсонгүй");
        }
    }
}
