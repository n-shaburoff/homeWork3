package com.progKiev;

public class Main {

    public static void main(String[] args) {
	    Person person = new Person("Tom", "White", Gender.MALE);
	    //System.out.println(person);

		Student[] studList = new Student[8];
		for(int i=0;i<studList.length;i++){
			studList[i] = new Student("name"+i,"surname"+i,Gender.MALE, 123+i);
		}

		/*for(Student student: studList){
			System.out.println(student);
		}*/


		Group DO = new Group("DO-3");
		try {
			for (int i = 0; i < studList.length; i++) {
				DO.addStudents(studList[i]);
			}
		}catch (MyException e){
			System.out.println(e.getMessage());
		}



		System.out.println(DO);
		System.out.println();
		DO.removeStudent(126);
		System.out.println(DO);

		System.out.println(DO.searchStudent("surname5"));

    }
}
