/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_concepts_and_data_structures;

/**
 *
 * @author tapas
 */

class Student_Static {
    private String name;
    private int rollNo;
    static String universityName = "Northeastern University";
    
    public Student_Static(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public static void changeUniversityName(String newName) {
        universityName = newName;
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", University: " + universityName);
    }
}

class DriverCode{
    public static void main(String[] args) {
        Student_Static student1 = new Student_Static("S1", 1);
        Student_Static student2 = new Student_Static("S2", 2);
        
        student1.displayStudentInfo();
        student2.displayStudentInfo();
        Student_Static.changeUniversityName("U of T");
//        
//        student1.displayStudentInfo();
//        student2.displayStudentInfo();
    }
}

