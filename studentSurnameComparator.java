package com.progKiev;

import java.util.Comparator;

public class studentSurnameComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if(o1 != null && o2==null){
            return 1;
        }
        if(o1 == null && o2 != null){
            return -1;
        }
        if(o1 == null && o2 == null){
            return 0;
        }

        Student a = (Student) o1;
        Student b = (Student) o2;

        String surname1 = a.getSurname();
        String surname2 = b.getSurname();

        if(surname1.compareTo(surname2)>0){
            return 1;
        }
        if(surname1.compareTo(surname2)<0){
            return -1;
        }

        return 0;
    }

}
