package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name =  null;
        while(name == null){
            name = sc.next();
        }
        p.setName(name);
        System.out.println("Person is " + p);


    }
}
