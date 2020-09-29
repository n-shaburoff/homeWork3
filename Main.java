package com.progKiev;

public class Main {

    public static void main(String[] args) {

        Group group = new Group("DO-3");
        Student st1 = new Student("Vasya", "Antonov",22,Gender.MALE, 1234, "DO-3");
        Student st2 = new Student("Petya", "Ptushkin",16,Gender.MALE, 1234, "DO-3");
        Student st3 = new Student("Anton", "Sidorov",15, Gender.MALE, 1234, "DO-3");
        try {
            group.addStudents(st1);
            group.addStudents(st2);
            group.addStudents(st3);
            //group.addNewStudentKeyboard();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        group.sortByAge();
        System.out.println(group);
        for (Student student: group.mobilize()){
            System.out.println(student.getSurname());
        }
    }
}
