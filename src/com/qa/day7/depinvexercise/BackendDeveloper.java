package com.qa.day7.depinvexercise;

public class BackendDeveloper implements Developer {
    @Override
    public void develop() {
        writeJava();
    }

    public void writeJava() {
        System.out.println("C# is just Microsoft Java anyway.");
    }

}