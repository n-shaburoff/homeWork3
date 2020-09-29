package com.progKiev;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Group implements recruitingOffice{
    private String name;
    private Student[] students = new Student[10];

    public Group() {
        this.name = "unknown";
    }

    public Group(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudents() {
        return students;
    }


    public void addStudents(Student newStudent) throws MyException{
        if (newStudent == null){
            throw new IllegalArgumentException("Null student");
        }
        for (int i=0; i < students.length; i++) {
            if(students[i] == null){
                students[i] = newStudent;
                return;
            }
        }
        throw new MyException();

    }

    public boolean removeStudent(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getStudentNumber() == id) {
                students[i] = null;
                return true;
            }
        }
            return false;
    }

        public Student searchStudent (String surname){
            Student search = null;
            for (Student student : students) {
                if (student != null && student.getSurname().toLowerCase().equals(surname.toLowerCase())) {
                    search = student;
                    break;
                }
            }
            return search;
        }


        public void sortBySurname(){
            Arrays.sort(students, new studentSurnameComparator());
        }

        public void sortByAge(){
            Arrays.sort(students, new ageComparator());
        }

        public void addNewStudentKeyboard() throws MyException{
            Scanner input = new Scanner(System.in);
            Student newSt = new Student();
            System.out.println("Enter name of student: ");
            newSt.setName(input.next());
            System.out.println("Enter surname of student: ");
            newSt.setSurname(input.next());
            System.out.println("Enter age of student: ");
            newSt.setAge(input.nextInt());
            System.out.println("Enter gender of student");
            if(input.next().toLowerCase() == "male"){
                newSt.setGender(Gender.MALE);
            }else{
                newSt.setGender(Gender.FEMALE);
            }
            System.out.println("Enter group name of student: ");
            newSt.setGroup(input.next());

            addStudents(newSt);

        }

    @Override
    public String toString() {
        for(int i = 0;i<students.length;i++){
            if(students[i] != null){
                System.out.println(students[i].getSurname());
            }else {
                continue;
            }

        }
        String s = "\nGroup name:" + name;
        return s;
    }

    @Override
    public Student[] mobilize() {
        Student[] valid;
        int k = 0;
        for (Student st: students){
            if(st == null) continue;
            if(st.getGender() == Gender.MALE && st.getAge() >= 18) k++;
        }
        valid = new Student[k];
        for (int i = 0; i < students.length; i++){
            int j = 0;
            if(students[i] == null) continue;
            if(students[i].getGender() == Gender.MALE && students[i].getAge() >= 18){
                valid[j] = students[i];
                j++;
            }
        }
        return valid;
    }
}



