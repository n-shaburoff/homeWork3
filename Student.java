package com.progKiev;

public class Student extends Person{
    private int studentNumber;
    private String group;

    public Student(String name, String surname,int age, Gender gender, int studentNumber, String group) {
        super(name, surname, age, gender);
        this.studentNumber = studentNumber;
        this.group = group;
    }

    public Student() {
        super();
    }

    public double getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_number='" + studentNumber + '\'' +
                '}' + super.toString();
    }
}
