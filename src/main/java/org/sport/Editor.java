package org.sport;

public class Editor {
    private final String DNI;
    private String name;
    private static double salary = 1500;

    public Editor(String DNI, String name){
        this.DNI = DNI;
        this.name = name;
    }

    public String getDNI() {
        return DNI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static double getSalary() {
        return salary;
    }

    public static void setSalary(double salary) {
        Editor.salary = salary;
    }
}
