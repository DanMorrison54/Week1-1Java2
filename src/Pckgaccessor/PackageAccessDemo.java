package Pckgaccessor;

import JavaWeek1_2.Lecture1_2;

import java.util.Random;

public class PackageAccessDemo {
    public static void main(String[] args) {
        Lecture1_2 lecture = new Lecture1_2(new java.util.Random().nextInt(1000 - 500 + 1) + 500);
        lecture.display();
        System.out.println(" this one comes from a constructor with a parameter");
        Lecture1_2 lec = new Lecture1_2();
        lec.display();
        System.out.println(" this one comes from a no parameter constructor");

    }

}

