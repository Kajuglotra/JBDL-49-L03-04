package org.geeks;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;

public class Logging {
    public static Logging logger = new Logging();

    FileOutputStream fileOutputStream = null;
    private Logging(){
        try{
           fileOutputStream = new FileOutputStream("/Users/b0293498/Downloads/JBDL-49L03/L03/log.txt");
        }catch ( FileNotFoundException e){
            System.out.println("Failed to find the file");
        }
    }
//    public static Logging getLogger(){
//        if(logger == null){
//            logger = new Logging();
//        }
//        return logger;
//    }
    private void info(String information) throws IOException {
        byte[] bytes = information.getBytes();
        fileOutputStream.write(bytes);
    }
    private void warn(String information) throws IOException {
        byte[] bytes = information.getBytes();
        fileOutputStream.write(bytes);
    }
    private void error(String information) throws IOException {
        byte[] bytes = information.getBytes();
        fileOutputStream.write(bytes);
    }

    public static void main(String[] args) throws IOException {
        Logging.logger.info("here is my first line of log");
    }


}





