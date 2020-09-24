package com.progKiev;

public class MyException extends Exception{
    @Override
    public String getMessage() {
        return "В группе нет мест!";
    }
}
