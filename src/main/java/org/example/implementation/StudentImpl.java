package org.example.implementation;

import org.example.Main;
import org.example.method.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentImpl{

    private static Map<Integer, Student> studentMap = new HashMap<>();
    private static Scanner scanner =  new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
    do {
        System.out.println("1. Add Student");
        System.out.println("2. Remove Student By Id");
        System.out.println("3. View All Student");
        System.out.println("4. View Student by Id");
        System.out.println("5. View Student by Name");
        System.out.println("6. Exit");
        System.out.println("Please Enter the number:");
        choice = scanner.nextInt();

        switch (choice) {
            case 1 -> addStudent();
            case 2 -> removeStudent();
            case 3 -> viewAllStudent();
            case 4 -> viewStudentById();
            case 5 -> viewStudentByName();
            case 6 -> System.out.println("Exiting....");
            default ->  System.out.println("Invalid choice.");


        }
        }
    while(choice!=6);
    }

    private static void addStudent() {
        System.out.println("Enter Student Id:");
        int id = scanner.nextInt();
        System.out.println("Enter Student Name:");
        String name = scanner.next();
        System.out.println("Enter Student Course:");
        String course = scanner.next();
        Student student = new Student(id, name, course);

        studentMap.put(id, student);
        System.out.println("Student added successfully.");
    }

    private static void removeStudent() {
        System.out.println("Enter Student Id to remove:");
        int id = scanner.nextInt();

        if (studentMap.remove(id) != null) {
            System.out.println("Student removed successfully.");
        }
        else {
            System.out.println("Student not found.");
        }

    }

    private static void viewAllStudent() {
        if (studentMap.isEmpty()) {
            System.out.println("Student list is empty.");
            return;
        }
        else {
            for (Student student : studentMap.values()) {
                System.out.println(student);
            }
        }
    }

    private static void viewStudentById() {
        System.out.println("Enter Student Id to view:");
        int id = scanner.nextInt();
        Student student = studentMap.get(id);
        if (student != null) {
            System.out.println(student);
        }
        else {
            System.out.println("Student not found.");
        }
    }

    private static void viewStudentByName() {
        System.out.println("Enter Student Name:");
        String name = scanner.next();

        boolean found = false;
        for(Student student : studentMap.values()){
            if(student.getName().equalsIgnoreCase(name)){
                System.out.println(student);
                found = true;
            }
        }

        if(!found){
            System.out.println("Student not found.");
        }
    }
}
