package com.corejava;

class Parent {
    Parent() {
        System.out.println("Parent class default constructor");
    }

    Parent(String msg) {
        System.out.println("Parent class parameterized constructor: " + msg);
    }
}

class Child extends Parent {

    Child() {
        super();   // calling Parent default constructor
        System.out.println("Child class default constructor");
    }

    Child(String name) {
        super("Hello from Parent"); // calling Parent parameterized constructor
        System.out.println("Child class parameterized constructor: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        
        Child c1 = new Child();
        System.out.println("-----------------------");
        Child c2 = new Child("Java");
    }
}
