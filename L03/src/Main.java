import org.geeks.CustomException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        System.out.println("Hello world!");
        try {
            String str = "abc";
            int num = Integer.parseInt(str);
            System.out.println(num);
            int a = 2 / 0;
//            System.exit(0);
        } catch (NullPointerException numberFormatException) {
            System.out.println("i am in null pointer exception block");
        } catch (NumberFormatException numberFormatException) {
//            System.exit(1);
            System.out.println("i am in catch block");
        } catch (ArithmeticException e) {

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("i am in finally block");
        }

        CustomException customException = new CustomException();
        try{
            customException.validAge(19);
        }catch (Exception e){

        }

        System.out.println("out of exceptions");
        try {
            FileInputStream stream = new FileInputStream("/Downloads/temp.txt");
            stream.read();
        }catch (Exception e){

        }
        try (CustomException customException1 = new CustomException()){
            customException1.validAge(1);
        }catch (Exception e){
            System.out.println("hey!! i am in catch block");
        }
//        Scanner scanner = new Scanner("");
//        scanner.next();
    }
}

//checked exception -> compiler known
//unchecked exception -> compiler is not sure about any exception coming


//finally{
//    // one resource to close
////    closing our resources;
//        }