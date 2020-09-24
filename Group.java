package com.progKiev;

public class Group {
    private String name;
    private Student[] students;
    private int capacity=10;
    private int numberOfStudents;

    public Group(String name) {
        students = new Student[capacity];
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


    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void addStudents(Student newStudent) throws MyException{
        if(numberOfStudents < capacity){
            students[numberOfStudents++] = newStudent;
        }
        else {
            throw new MyException();
        }
    }

    public void removeStudent(Student student) {
        for(int i=0; i<students.length; i++) {
            if(students[i].equals(student)) {
                students[i] = null;
                --numberOfStudents;
                break;
            }
        }
    }


    public Student searchStudent(String surname){
        Student search = null;
        for(Student student: students){
            if(student != null && student.getSurname().toLowerCase().equals(surname.toLowerCase())){
                search = student;
                break;
            }
        }
        return search;
    }

    @Override
    public String toString() {
        for(int i = 0;i<numberOfStudents;i++){
            if(students[i] != null){
                System.out.println(students[i].getSurname());
            }else {
                continue;
            }

        }
        String s = "\nGroup name:" + name + "\nNumber of student:" + numberOfStudents;
        return s;
    }
}



