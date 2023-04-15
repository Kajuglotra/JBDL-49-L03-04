package org.geeks;

public class StreamMain {

    public static void main(String[] args) {
        FunctionInterfaceExample functionInterfaceExample = new FunctionInterfaceExample() {
            @Override
            public void abstractMethod() {
                System.out.println("i am inside abstract method body");
            }
        };

//        () => always represent one method
        //lambda exp
        FunctionInterfaceExample f2 = () -> System.out.println("I am inside abstract method from lambda exp");
        functionInterfaceExample.abstractMethod();

        FunctionalInterfaceExample2 f3 = (int x, int y) ->  {
            System.out.println("jhgfd");
            return x+y;
        };
        f3.sum(2,3);
        f2.abstractMethod();
    }
    
}



//