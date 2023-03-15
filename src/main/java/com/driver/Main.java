package com.driver;

public class Main {
    static class A{
        String meth(){
            return "Invoking method from class A";
        }
    }

    static class B extends A{
        String meth(){
            return "Method is overridden in Extendend class B";
        }
    }

    public static void main(String[] args) {
     A objA = new A();
        System.out.println(objA.meth());

     B objB = new B();
     System.out.println(objB.meth());
     //before overriding output : Invoking method from class A


    }
  
}
