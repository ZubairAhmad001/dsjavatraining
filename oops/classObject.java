package oops;

import java.util.Scanner;

public class classObject {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        Trainer trainer = new Trainer();
        trainer.trainerName = " pawan sharma";
        trainer.trainerTechnology = "JAVA";

        System.out.println("Trainer  Name Is : " + trainer.trainerName + " Technology Is : " + trainer.trainerTechnology);

        Student stu= new Student();
        System.out.print("Write student name: ");
        stu.studentName = sc.nextLine();
        stu.studentEnrollTechnology =sc.nextLine();
        System.out.println("Student Name Is : " + stu.studentName + " Enrolled Technology In :" );


    }
}

class Trainer {
    String trainerName;
    String trainerTechnology;

}

class Student {
    String studentName;
    String studentEnrollTechnology;
}