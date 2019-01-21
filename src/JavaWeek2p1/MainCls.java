package JavaWeek2p1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainCls {
    public static void main(String[] args) {
        boxAndAuto(3);
        Scanner scan = new Scanner(System.in);

        boolean askForInputAgain=false;
        double radius;
        do{
            try{
                 askForInputAgain=false;
                System.out.println("give me a radius of a circle and ill give you it's area!");
                radius = scan.nextDouble();
            }catch(InputMismatchException e){
                System.out.println("thats not a number silly, try again!");
                radius=1;
                askForInputAgain=true;
                scan.next();
            }
        }while(askForInputAgain);


        Circle circle = new Circle(radius);
        System.out.println("the area of your circle based on radius " + radius + " is approximately:" + (int) (circle.calculateArea() * 100) / 100.0);
    }
    public static void boxAndAuto(int i){
        Integer hexer=Integer.parseInt("FF",16);
        System.out.println(hexer);


    }
}
