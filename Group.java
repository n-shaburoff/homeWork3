package com.progKiev;

public class Group {
    private String name;
    private Student[] students;
    private int capacity=10;

    public Group() {
        this.name = "unknown";
    }

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


    public void addStudents(Student newStudent) throws MyException{
        if (newStudent == null){
            throw new IllegalArgumentException("Null student");
        }
        for (int i=0; i < students.length; i++) {
            if(students[i] == null){
                newStudent.setGroup(this.name);
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
}



