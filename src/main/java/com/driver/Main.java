package com.driver;

public class Main {

    public static void main(String[] args) {
     A objA = new A();

     B objB = new B();
     System.out.println(objB.meth());
     //before overriding output : Invoking method from class A


    }
  
}
class A{
    String meth(){
        return "Invoking method from class A";
    }
}

class B extends A{
    String meth(){
        return "Method is overridden in Extendend class B";
    }
}