package org.geeks;

@FunctionalInterface
public interface FunctionalInterfaceExample2 {

    public int sum(int a, int b);
    default int multiply(int a,int b){
        return a*b;
    }
}
