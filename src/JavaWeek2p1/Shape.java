package JavaWeek2p1;

import java.util.Scanner;

public class Shape{
     String color;
     public Shape(){
         color="red";
     }
     public static void main(String[]args){
         Square square=new Square(5,3);
         Ellipse ellipse=new Ellipse(4);
         boolean repeat;
Scanner scan=new Scanner(System.in);

             do {
                 repeat=false;
                 try {
                     System.out.println("input a color");
                     ellipse.setColor(scan.nextLine());

                 } catch (IllegalArgumentException e) {
                     e.printStackTrace();
                     repeat = true;
                 }
                 System.out.println(repeat);
             }while(repeat);

         ellipse.setRadius(4);
         square.setLength(4);
         square.setWidth(4);
         square.setColor("blue");
         System.out.println(square);
       System.out.println(ellipse);
     }
    public Shape(String color){
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) throws IllegalArgumentException {
            if(color.length()!=0&&color!=null)this.color=color;
            else
             throw new IllegalArgumentException("error empty or null inputs are invalid try again");



    }
}
class Ellipse extends Shape{

    private int radius;
    Ellipse(int radius){

        this.radius=radius;

    }



    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    @Override
    public String toString() {
        return"Shape: circle "+ "Radius: "+radius+" Color: "+color;
    }

}
class Square extends Shape{
    private int length;
    private int width;
    Square(int length, int width){
        this.length=length;
        this.width=width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Shape: square "+ "Length: "+length + " width: "+width+" color " +color;
    }
}

