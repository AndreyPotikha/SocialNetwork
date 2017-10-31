package fecebook.vertex.service;

import fecebook.vertex.util.CourseType;

import java.util.Scanner;

public class CourseService {

    public static void main(String[] args) {


        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter course");
        final String line = scanner.nextLine();
        switch (line) {
            case CourseType.START:
                System.out.println(1);
                break;
            case CourseType.OOP:
                System.out.println(2);
                break;
            case CourseType.PROFESSIONAL:
                System.out.println(3);
                break;
            default:
                System.out.println(-1);
                break;
        }
        scanner.close();

    }
}
