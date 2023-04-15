package org.geeks;

import java.io.Closeable;
import java.io.IOException;

public class CustomException extends Exception implements Closeable {


    public void validAge(int age) throws CustomException{
        if(age > 18){
            System.out.println("Valid age");
        }else{
            throw new RuntimeException("Not a valid age");
        }
    }

    @Override
    public void close() throws IOException {
        System.out.println("I am in close function");
        //log

    }
}

//Throws-> to tell anyone this func is throwing exception

