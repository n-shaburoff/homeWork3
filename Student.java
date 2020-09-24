package com.progKiev;

public class Student extends Person{
    private int student_number;

    public Student(String name, String surname, Gender gender, int student_number) {
        super(name, surname, gender);
        this.student_number = student_number;
    }

    public Student() {
        super();
    }

    public double getStudent_number() {
        return student_number;
    }

    public void setStudent_number(int student_number) {
        this.student_number = student_number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_number='" + student_number + '\'' +
                '}' + super.toString();
    }
}
